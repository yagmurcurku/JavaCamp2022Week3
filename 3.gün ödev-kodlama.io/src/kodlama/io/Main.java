package kodlama.io;

import kodlama.io.Business.CategoryManager;
import kodlama.io.Business.CourseManager;
import kodlama.io.Business.InstructorManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.HibernateCategoryDao;
import kodlama.io.dataAccess.HibernateCourseDao;
import kodlama.io.dataAccess.JdbcCategoryDao;
import kodlama.io.dataAccess.JdbcInstructorDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category1 = new Category("Programlama");
		Category category2 = new Category("Programlama");
		
		Instructor instructor1 = new Instructor("Engin", "Demiroğ");
	
		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", 50, instructor1);
		Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", -60, instructor1);
		Course course3 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", 70, instructor1);
		Course course4 = new Course("Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", 80, instructor1);
		Course course5 = new Course("(2020) Yazılım Geliştirici Yetiştirme Kampı - JAVA", 90, instructor1);
		Course course6 = new Course("Programlamaya Giriş İçin Temel Kurs", 100, instructor1);
		Course course7 = new Course("Programlamaya Giriş İçin Temel Kurs", 100, instructor1);
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		//categoryManager.add(category2);     --> Kategori ismi tekrar edemez hatası alınan nokta.
		
		System.out.println("---------------------------------");
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		//courseManager.add(course2);         --> Kursun fiyatı 0'dan küçük olamaz hatası alınan nokta.
		courseManager.add(course6);
		//courseManager.add(course7);         --> Kurs ismi tekrar edemez hatası alınan nokta.
		
		System.out.println("---------------------------------");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
	}
}
