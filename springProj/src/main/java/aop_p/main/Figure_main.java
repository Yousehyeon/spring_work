package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.Figure;

public class Figure_main {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/figure.xml");
		
		Figure fi = context.getBean(Figure.class);
		System.out.println(fi.circle(7));
		System.out.println("---------------");
		System.out.println(fi.rectangle(5, 10));
		System.out.println("---------------");
		System.out.println(fi.triangle(4, 4, 10));
		System.out.println("---------------");
		

	}

}
