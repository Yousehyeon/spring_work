package di_p.main;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Student;

public class Student_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/student.xml");
		
		Student std = context.getBean("std",Student.class);
		System.out.println(std);
		Student std1 = context.getBean("std1",Student.class);
		System.out.println(std1);

		
	}

}
