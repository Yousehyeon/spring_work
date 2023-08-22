package solution_main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Camera;
import di_p.HandPhone;

public class Hamburger_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/hamburger.xml");

		
		Hamburger_main hs1 = context.getBean("hs1",Hamburger_main.class);
		System.out.println(hs1);
		
	}

}
