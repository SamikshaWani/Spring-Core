package com.samiksha.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samiksha.Util.Employee;

public class Testing {

	public static void main(String[] args) {
	
		ApplicationContext con=new ClassPathXmlApplicationContext("Config.xml");
		Employee emp=(Employee) con.getBean("a");  //type casting to Employee this will get obj of employee
	    emp.work();   //method called
	}
	

}
