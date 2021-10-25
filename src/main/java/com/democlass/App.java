package com.democlass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		EmployeeBean employee =(EmployeeBean) context.getBean("employee");
		System.out.println(employee.getDepartmentBean());
	}

}
 