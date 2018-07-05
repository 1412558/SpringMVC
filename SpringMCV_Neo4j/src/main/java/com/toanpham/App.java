package com.toanpham;

import java.util.Collection;

import com.toanpham.Service.StudentServiceImpl;
import com.toanpham.entities.Course;
import com.toanpham.entities.Student;

public class App {

	public static void main(String[] args) {
		// Create few courses
        Course oop = new Course();
        oop.setName("Object Oriented Programming");
        oop.setCredits(2.0f);

        Course algo = new Course();
        algo.setName("Advanced Algorithm");
        algo.setCredits(3.0f);

        Course db = new Course();
        db.setName("Database Internals");
        db.setCredits(3.0f);

		StudentServiceImpl Studentservice = new StudentServiceImpl();

		Student st1 = new Student("kuga1");
		Studentservice.createOrUpdate(st1);

		Collection<Student> listStudent = Studentservice.findAll();
		
		st1.getCourses().add(db);
		
		for (Student stu : listStudent) {
			//stu.setName("phạm quốc toàn");
			stu.getCourses().add(oop);
			Studentservice.createOrUpdate(stu);
			System.out.println(stu.getName());
		}
//		Studentservice.delete(28);
//		Student st =  Studentservice.find(28);
//		System.out.println(st.toString());
	}

}
