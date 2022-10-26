package kodlama.io.Business;

import java.util.List;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;

	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers)
	{
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	
	public void add(Instructor instructor)
	{
		instructorDao.addInstructor(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}
	
	public List<Instructor> getAllInstructors(){
		return null;
	}
}
