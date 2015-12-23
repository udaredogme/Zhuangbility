package com.sprhib.dao;

import java.util.List;

import com.sprhib.model.Student;

public interface StudentDAO {
	
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public Student getStudent(int id);
	public void deleteStudent(int id);
	public List<Student> getStudents();

}
