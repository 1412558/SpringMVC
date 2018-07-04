package com.toanpham.Service;

import com.toanpham.DB.*;
import com.toanpham.Interface.StudentService;
import com.toanpham.Model.Student;

public class StudentServiceImpl extends GenericService<Student> implements StudentService {
	@Override
	protected Class<Student> getEntityType() {
		return Student.class;
	}
}
