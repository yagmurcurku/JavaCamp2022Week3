package kodlama.io.dataAccess;

import java.util.ArrayList;

import kodlama.io.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	ArrayList<Category> categoryArrayList = new ArrayList<>();
	
	@Override
	public void addCategory(Category category) {
		System.out.println(category.getCategoryName() + " --> JDBC ile veritabanına eklendi.");
		categoryArrayList.add(category);
	}

	@Override
	public ArrayList<Category> getAllCategories() {
		return categoryArrayList;
	}

}
