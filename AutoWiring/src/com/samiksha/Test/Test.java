package com.samiksha.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samiksha.bean.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("Config1.xml");
		Employee emp=(Employee) con.getBean("e1");
		emp.work();
		
	
	}

}
