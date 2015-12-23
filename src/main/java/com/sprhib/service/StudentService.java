package com.sprhib.service;

import java.util.List;

import com.sprhib.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public Student getStudent(int id);
	public void deleteStudent(int id);
	public List<Student> getStudents();

}
