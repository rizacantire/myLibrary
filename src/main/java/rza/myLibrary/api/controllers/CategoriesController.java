package rza.myLibrary.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rza.myLibrary.business.abstracts.CategoryService;
import rza.myLibrary.core.utilities.results.DataResult;
import rza.myLibrary.core.utilities.results.Result;
import rza.myLibrary.entities.concretes.Category;

import java.lang.invoke.CallSite;
import java.util.List;

@RestController
@RequestMapping("api/categories/")
public class CategoriesController {

    private CategoryService categoryService;

    @Autowired
    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("add")
    public Result add(@RequestBody Category category){
        return this.categoryService.add(category);
    }

    @GetMapping("get")
    public DataResult<List<Category>> getAll(){
        return this.categoryService.getAll();
    }
}

