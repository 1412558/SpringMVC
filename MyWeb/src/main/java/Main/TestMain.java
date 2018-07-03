package Main;

import Model.Student;
import Service.StudentServiceImpl;

public class TestMain {
	public static void main(String[] args) {
		StudentServiceImpl serviceStudent = new StudentServiceImpl();
		Student st1 = new Student("KUGA");
		serviceStudent.createOrUpdate(st1);
	}

}
