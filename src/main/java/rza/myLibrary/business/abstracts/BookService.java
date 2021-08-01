package rza.myLibrary.business.abstracts;

import rza.myLibrary.core.utilities.results.DataResult;
import rza.myLibrary.core.utilities.results.Result;
import rza.myLibrary.entities.concretes.Book;

import java.util.List;

public interface BookService {
    Result add(Book book);
    DataResult<List<Book>> getAll();
    DataResult<Book> getByBookName(String bookName);
    DataResult<Book> getByBookNameAndCategory(String bookName,int categoryId);
    DataResult<List<Book>> getByBookNameOrCategory(String bookName,int categoryId);
    DataResult<List<Book>> getByCategoryIdIn(List<Integer> categories);
    DataResult<List<Book>> getByBookNameContains(String bookName);
    DataResult<List<Book>> getByProductNameStartsWith(String productName);
}
