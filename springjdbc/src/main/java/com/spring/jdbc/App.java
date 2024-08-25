package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        
        /*
         
         //insert
        Student student = new Student();
        student.setId(2131);
        student.setName("Kom");
        student.setCity("Beijing");
        
        int result=studentDao.insert(student);
        System.out.println("Student added"+result);
             //update
        Student student= new Student();
        student.setId(555);
        student.setName("Jk");
        student.setCity("Dubai");
        
        
        //delete
        int result=studentDao.delete(222);
        System.out.println(result);
        */  
        
       Student student= studentDao.getStudent(555);
       System.out.println(student);
      List<Student>students= studentDao.getAllStudents();
      for(Student s:students)
      {
    	  System.out.println(s);
      }
        
 }
}
