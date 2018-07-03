package Service;

import InitDB.*;
import Interface.StudentService;
import Model.Student;
import kuga.dao.*;

public class StudentServiceImpl extends GenericService<Student> implements StudentService {
	@Override
	protected Class<Student> getEntityType() {
		return Student.class;
	}
}
