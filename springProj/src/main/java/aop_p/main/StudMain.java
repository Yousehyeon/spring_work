package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.model.GreenStud;
import aop_p.model.RedStud;
import aop_p.model.StudRes;
import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class StudMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/stud.xml");
		
		//JoSuk jsk = context.getBean("joSuk",JoSuk.class);
		//GreenStud gs = new GreenStud();
		
		StudRes studRes = context.getBean("studRes", StudRes.class);
		GreenStud gs = context.getBean("greenStud", GreenStud.class);
		//RedStud rs = context.getBean("redStud", RedStud.class);
		gs.setJum(98,37);
		gs.setJum(12,78,77,97);
		gs.setJum(38,97);
		gs.setJum(58,34,56,87);
		gs.setJum(78,77);
		gs.setJum(98,37,88);
		gs.setJum(58,87);
		gs.setJum(38,97,72);
		
		//rs.setJum(98,37);
		System.out.println("---------------");
		studRes.ppp();

		
	}

}
