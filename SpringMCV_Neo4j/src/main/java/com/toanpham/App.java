package com.toanpham;

import java.util.Collection;

import com.toanpham.Service.StudentServiceImpl;
import com.toanpham.entities.Student;

public class App {

	public static void main(String[] args) {
		// Session session =
		// Neo4jSessionFactory.getInstance().getNeo4jSession();
		// session.save(st);
		StudentServiceImpl Studentservice = new StudentServiceImpl();

		Student st1 = new Student("kuga1");
		Studentservice.createOrUpdate(st1);

		Student st2 = new Student("kuga2");
		Studentservice.createOrUpdate(st2);

		Collection<Student> listStudent = Studentservice.findAll();
		
		for (Student stu : listStudent) {
			//stu.setName("phạm quốc toàn");
			//Studentservice.createOrUpdate(stu);
			System.out.println(stu.getName());
		}
//		Studentservice.delete(28);
//		Student st =  Studentservice.find(28);
//		System.out.println(st.toString());
	}

}
