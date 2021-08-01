package rza.myLibrary.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rza.myLibrary.business.abstracts.CategoryService;
import rza.myLibrary.core.utilities.results.DataResult;
import rza.myLibrary.core.utilities.results.Result;
import rza.myLibrary.core.utilities.results.SuccessDataResult;
import rza.myLibrary.core.utilities.results.SuccessResult;
import rza.myLibrary.dataAccess.abstracts.CategoryDao;
import rza.myLibrary.entities.concretes.Category;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;

    @Autowired
    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public Result add(Category category) {
        this.categoryDao.save(category);
        return new SuccessResult("Kategori başarıyla eklendi");
    }

    @Override
    public DataResult<List<Category>> getAll() {
        return new SuccessDataResult<List<Category>>(this.categoryDao.findAll(),"Veriler getirildi");
    }
}
