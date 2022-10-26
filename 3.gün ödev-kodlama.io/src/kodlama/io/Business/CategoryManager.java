package kodlama.io.Business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryManager {


	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers)
	{
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	
	public void add(Category category) throws Exception
	{
		for (Category c : categoryDao.getAllCategories()) {
			if(c.getCategoryName() == category.getCategoryName())
			{
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}
		
		categoryDao.addCategory(category);
	
		for (Logger logger : loggers) 
		{
			logger.log(category.getCategoryName());
		}
		
	}
	
}
	
	
	
