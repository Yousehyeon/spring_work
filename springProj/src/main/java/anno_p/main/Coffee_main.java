package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Coffee_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/coffee.xml");
		
		
		System.out.println(context.getBean("cs"));
		System.out.println(context.getBean("cs1"));
		System.out.println(context.getBean("cs2"));

		
		context.close();
		
	}
}
