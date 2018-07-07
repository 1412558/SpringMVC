package service;


import util.GenericService;
import entities.Student;

public class StudentServiceImpl extends GenericService<Student> implements
		StudentService {
	@Override
	protected Class<Student> getEntityType() {
		return Student.class;
	}

	// viết lại các phướng thức truy vấn db
}
