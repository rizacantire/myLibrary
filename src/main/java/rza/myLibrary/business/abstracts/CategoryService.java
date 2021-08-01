package rza.myLibrary.business.abstracts;

import rza.myLibrary.core.utilities.results.DataResult;
import rza.myLibrary.core.utilities.results.Result;
import rza.myLibrary.entities.concretes.Category;

import java.util.List;

public interface CategoryService {
    Result add(Category category);

    DataResult<List<Category>> getAll();
}
