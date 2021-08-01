package rza.myLibrary.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rza.myLibrary.entities.concretes.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category,Integer> {
}
