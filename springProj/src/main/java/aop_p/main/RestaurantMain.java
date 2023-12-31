package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.JoSuk;
import aop_p.webToon.Restaurant;

public class RestaurantMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/restaurant.xml");
		
		Restaurant re= context.getBean("restaurant",Restaurant.class);
		System.out.println(re);
		System.out.println("-------------------------");
	}

}
