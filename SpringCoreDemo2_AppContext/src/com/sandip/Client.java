package com.sandip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		
//		The difference between the BeanFactory and ApplicationContext : In case of BeanFactory object is created when 
//		it is getting requested through getBean(). But in case of ApplicationContext object is created even though it is 
//		not getting requested.
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		Employee e1 = (Employee)context.getBean("emp1");
		//Employee e2 = context.getBean("emp2",Employee.class);
		
		System.out.println("Employee 1 details : "+e1);
		//System.out.println("Employee 2 details : "+e2);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}

}
