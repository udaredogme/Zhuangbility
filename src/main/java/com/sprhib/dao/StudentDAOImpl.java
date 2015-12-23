package com.sprhib.dao;

import java.util.List;

import com.sprhib.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	public void addStudent(Student student)
	{
		getCurrentSession().save(student);
	}

	public void updateStudent(Student student)
	{
		Student studentToUpdate = getStudent(student.getId());
		studentToUpdate.setName(student.getName());
		studentToUpdate.setStuID(student.getStuID());
		studentToUpdate.setCollege(student.getCollege());
		studentToUpdate.setSpeclity(student.getSpeclity());
		studentToUpdate.setGender(student.getGender());
	}

	public Student getStudent(int id)
	{
		Student student = (Student) getCurrentSession().get(Student.class,id);
		return student;
	}

	public void deleteStudent(int id)
	{
		Student student = getStudent(id);
		if(student != null)
		{
			getCurrentSession().delete(student);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Student> getStudents()
	{
		return getCurrentSession().createQuery("from Student").list();
	}



}

