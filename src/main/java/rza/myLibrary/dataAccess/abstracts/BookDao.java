package rza.myLibrary.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rza.myLibrary.entities.concretes.Book;

import java.util.List;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
    Book getByBookName(String bookName);
    //Book getByBookNameAndCategory(String bookName,int categoryId);
    // List<Book> getByBookNameOrCategory(String bookName,int categoryId);
    // List<Book> getByCategoryIdIn(List<Integer> categories);
    // List<Book> getByBookNameContains(String bookName);
    // List<Book> getByProductNameStartsWith(String productName);

}
