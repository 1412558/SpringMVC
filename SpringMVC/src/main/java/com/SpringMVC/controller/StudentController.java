package com.SpringMVC.controller;

import com.SpringMVC.entities.Student;
import com.SpringMVC.service.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

@Controller
public class StudentController {

	private StudentServiceImpl studentService = new StudentServiceImpl();

	@RequestMapping(value = "/studentList", method = RequestMethod.GET)
	public ModelAndView listStudent(ModelAndView model)throws IOException {
		Collection<Student> listStudent = studentService.findAll();
		model.addObject("listStudent", listStudent);

        model.addObject("name", "phạm quốc toàn");
		model.setViewName("StudentList");
		return model;
	}
//
	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public ModelAndView newStudent(ModelAndView model) {
		Student student = new Student();
		model.addObject("student", student);
		model.setViewName("StudentForm");
		return model;
	}
//
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute("student") Student student) {
//		if (student.getId() == 0) { // if employee id is 0 then creating the
//			// employee other updating the employee
//			studentService.createOrUpdate(student);
//		} else {
//			studentService.createOrUpdate(student);
//		}


		studentService.createOrUpdate(student);
		System.out.println(student.getName());
		System.out.println("++++++++++++            +++++++++++++++++++");
		System.out.println(student.getId());
		System.out.println("++++++++++++++++           ++++++++++++++++++");
		return new ModelAndView("redirect:/studentList");
	}
//
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView deleteStudent(HttpServletRequest request) {
		long idStudent = Long.parseLong(request.getParameter("id"));
		studentService.delete(idStudent);

		//redirect to url get list student
		return new ModelAndView("redirect:/studentList");
	}
//
	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public ModelAndView editStudent(HttpServletRequest request) {
		long idStudent = Long.parseLong(request.getParameter("id"));
		Student student = studentService.find(idStudent);
		ModelAndView model = new ModelAndView("StudentForm");
		model.addObject("student", student);
		return model;
	}
}
