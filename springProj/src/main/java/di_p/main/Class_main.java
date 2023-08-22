package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/class.xml");
		
		System.out.println(context.getBean("red"));
		System.out.println(context.getBean("red1"));
		System.out.println(context.getBean("blue"));
		System.out.println(context.getBean("blue1"));
		System.out.println(context.getBean("yellow"));
		System.out.println(context.getBean("yellow1"));
		
		
	}

}
