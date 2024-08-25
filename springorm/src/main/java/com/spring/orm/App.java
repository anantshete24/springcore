package com.spring.orm;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/orm/oconfig.xml");
       StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
       /*
       Student student= new Student(1221,"Kim","Mohali");
       int r=studentDao.insert(student);
       System.out.println("record updated"+r);
       */
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       boolean go=true;
       while(go)
       {
       System.out.println("Press 1 for add new Student");
       System.out.println("Press 2 for display all Students");
       System.out.println("Press 3 for get detail of single Student");
       System.out.println("Press 4 for delete Student");
       System.out.println("Press 5 for update Student");
       System.out.println("Press 6 for exit");
       
       try {
    	  int input= Integer.parseInt(br.readLine());
    	  
    	  switch(input)
    	  {
    	  		case 1: 
    	  			break;
    		  	
    	  		case 2:
    	  			break;
    	  		
    	  		case 3:
    	  			break;
    	  		
    	  		case 4:
    	  			break;
    	  		
    	  		
    	  		case 5:
    	  			break;
    	  		
    	  		case 6:
    	  			go=false;
    	  			break;
    	  		
    		  
    	  }
    	  
       }
       catch(Exception e)
       {
    	   System.out.println("Invalid input try with another one");
    	   System.out.println(e.getMessage());
       }
       }
       
       System.out.println("Thank you for using application");
       
    }
}
