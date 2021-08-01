package rza.myLibrary.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rza.myLibrary.business.abstracts.BookService;
import rza.myLibrary.core.utilities.results.DataResult;
import rza.myLibrary.core.utilities.results.Result;
import rza.myLibrary.core.utilities.results.SuccessDataResult;
import rza.myLibrary.core.utilities.results.SuccessResult;
import rza.myLibrary.dataAccess.abstracts.BookDao;
import rza.myLibrary.entities.concretes.Book;

import java.util.List;

@Service
public class BookManager implements BookService {

    private BookDao bookDao;

    @Autowired
    public BookManager(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Result add(Book book) {
        this.bookDao.save(book);
        return new SuccessResult("Yeni kitap eklendi");
    }

    @Override
    public DataResult<List<Book>> getAll() {

        return new SuccessDataResult<List<Book>>(this.bookDao.findAll(),"Kitaplar listelendi");
    }

    @Override
    public DataResult<Book> getByBookName(String bookName) {
        return new SuccessDataResult<Book>(this.bookDao.getByBookName(bookName),"Veriler listelendi");
    }

    @Override
    public DataResult<Book> getByBookNameAndCategory(String bookName, int categoryId) {
        return new SuccessDataResult<Book>(this.bookDao.getByBookNameAndCategory(bookName,categoryId),"Veriler listelendi");
    }

    @Override
    public DataResult<List<Book>> getByBookNameOrCategory(String bookName, int categoryId) {
        return new SuccessDataResult<List<Book>>(this.bookDao.getByBookNameOrCategory(bookName,categoryId),"Veriler listelendi");
    }

    @Override
    public DataResult<List<Book>> getByCategoryIdIn(List<Integer> categories) {
        return new SuccessDataResult<List<Book>>(this.bookDao.getByCategoryIdIn(categories),"Veriler listelendi");
    }

    @Override
    public DataResult<List<Book>> getByBookNameContains(String bookName) {
        return new SuccessDataResult<List<Book>>(this.bookDao.getByBookNameContains(bookName),"Veriler listelendi");
    }

    @Override
    public DataResult<List<Book>> getByProductNameStartsWith(String bookName) {
        return new SuccessDataResult<List<Book>>(this.bookDao.getByProductNameStartsWith(bookName),"Veriler listelendi");
    }
}
