package com.training.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.Employee;

/**
 * Hello world!
 *
 */
public class Example_0_App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory =    new ClassPathXmlApplicationContext("application.xml"); 

		Employee student = (Employee) factory.getBean("empBean");
		student.setName("welcome");
		System.out.println(student);
	
	
    }
}
