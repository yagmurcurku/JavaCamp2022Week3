package kodlama.io.dataAccess;

import java.util.ArrayList;

import kodlama.io.entities.Instructor;

public interface InstructorDao {

	void addInstructor(Instructor instructor);
	
	ArrayList<Instructor> getAllInstructors();
}
