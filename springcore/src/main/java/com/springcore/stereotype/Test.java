package com.springcore.stereotype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/sconfig.xml");
		Student student =con.getBean("ob", Student.class);
		System.out.println("in student object"+student);
		System.out.println("in student Address"+student.getAddress());

		System.out.println(student.getAddress().getClass().getName());
		System.out.println(student.hashCode());
		
		Student student2 = con.getBean("ob", Student.class);
		System.out.println(student2.hashCode());
		
		Teacher teacher1 =con.getBean("teacher", Teacher.class);
		System.out.println("teacher 1"+teacher1.hashCode());
		Teacher teacher2 =con.getBean("teacher", Teacher.class);
		System.out.println("Teacher 2"+teacher2.hashCode());
			
	}

}
