package com.spring.orm.dao;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {


	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student student)
	{
		int i=(Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	public Student getStudent(int studentId)
	{
		Student student =this.hibernateTemplate.get(Student.class, studentId);	
		return student;
	}
	
	public List<Student> getAllStudents()
	{
		List<Student>students=this.hibernateTemplate.loadAll(Student.class);
		return students;
		
	}
	public void deleteStudent(int studentId)
	{
		Student student=this.hibernateTemplate.get(Student.class,studentId);
		this.hibernateTemplate.delete(student);
	}
	public void updateStudent(Student student) 
	{
		this.hibernateTemplate.update(student);
		
	}
}
