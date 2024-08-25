package com.sprincore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/sprincore/lifecycle/liconfig.xml");
		Samosa s1=(Samosa)context.getBean("samosa");
		System.out.println(s1);
		//registering shutdown hook
		context.registerShutdownHook();
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		Pepsi p1=(Pepsi)context.getBean("pep");
		System.out.println(p1);

		System.out.println("+++++++++++++++++++++++++++++");

		System.out.println("price");
		Example ex=(Example)context.getBean("example");
		System.out.println(ex);
}

}
