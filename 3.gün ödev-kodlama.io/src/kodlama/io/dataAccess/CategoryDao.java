package kodlama.io.dataAccess;

import java.util.ArrayList;

import kodlama.io.entities.Category;

public interface CategoryDao {

	void addCategory(Category category);
	
	ArrayList<Category> getAllCategories();
}
