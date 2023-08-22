package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.FoodShop;

public class Food_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/bab.xml","di_xml/bab2.xml");
		
		FoodShop fs = context.getBean("fs",FoodShop.class);
		
		System.out.println("아침메뉴 : " + fs.order_bf() + fs.order_bf1());
		System.out.println("점심메뉴 : " + fs.order_lc() + fs.order_lc1());
		System.out.println("저녁메뉴 : " + fs.order_di() + fs.order_di1());
	}

}
