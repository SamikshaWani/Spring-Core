package com.samiksha.Testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samiksha.bean.Employee;

public class Test {

	public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("Config.xml");
	Employee emp=(Employee) con.getBean("e1");
	emp.work();
	

	}

}
