package com.sprhib.service;

import java.util.List;

import com.sprhib.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhib.dao.StudentDAO;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public void addStudent(Student student) {
		studentDAO.addStudent(student);
	}

	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
	}

	public Student getStudent(int id) {
		return studentDAO.getStudent(id);
	}

	public void deleteStudent(int id) {
		studentDAO.deleteStudent(id);
	}

	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}

}
