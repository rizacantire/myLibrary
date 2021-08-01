package rza.myLibrary.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rza.myLibrary.business.abstracts.BookService;
import rza.myLibrary.core.utilities.results.DataResult;
import rza.myLibrary.core.utilities.results.Result;
import rza.myLibrary.entities.concretes.Book;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("api/books/")
public class BooksController {

    private BookService bookService;

    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("getall")
    public DataResult<List<Book>> getAll(){

        return this.bookService.getAll();
    }

    @PostMapping("add")
    public Result add(@RequestBody Book book){
        return this.bookService.add(book);
    }

    @GetMapping("getByBookName")
    public DataResult<Book> getByBookName(@RequestParam String bookName){
        return this.bookService.getByBookName(bookName);
    }
}
