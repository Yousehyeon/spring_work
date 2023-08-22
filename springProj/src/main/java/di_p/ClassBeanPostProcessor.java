package di_p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ClassBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("MyBeanPostProcessor.BeforeInit 실행 : "+beanName+" => "+ bean);
		
		if(beanName.startsWith("blue")) {
			
			Class cc = (Class)bean;
			
			if(cc.getAvg()>=90) {
				cc.setResult("A");
			}else if(cc.getAvg()>=80 && cc.getAvg()<90) {
				cc.setResult("B");
			}else if(cc.getAvg()>=70 && cc.getAvg()<80) {
				cc.setResult("C");
			}else if(cc.getAvg()>=60 && cc.getAvg()<70) {
				cc.setResult("D");
			}else if(cc.getAvg()>=50 && cc.getAvg()<60) {
				cc.setResult("E");
			}

		}
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("MyBeanPostProcessor.AfterInit 실행 : "+beanName+" => "+ bean);
		Class cc = (Class)bean;
		if(beanName.startsWith("red")) {
			if(cc.getAvg()>=90) {
				cc.setResult("수");
			}else if(cc.getAvg()>=80 && cc.getAvg()<90) {
				cc.setResult("우");
			}else if(cc.getAvg()>=70 && cc.getAvg()<80) {
				cc.setResult("미");
			}else if(cc.getAvg()>=60 && cc.getAvg()<70) {
				cc.setResult("양");
			}else if(cc.getAvg()>=50 && cc.getAvg()<60) {
				cc.setResult("가");
			}

		}
		if(beanName.startsWith("yellow")) {
			if(cc.getAvg()>=90) {
				cc.setResult("1");
			}else if(cc.getAvg()>=80 && cc.getAvg()<90) {
				cc.setResult("2");
			}else if(cc.getAvg()>=70 && cc.getAvg()<80) {
				cc.setResult("3");
			}else if(cc.getAvg()>=60 && cc.getAvg()<70) {
				cc.setResult("4");
			}else if(cc.getAvg()>=50 && cc.getAvg()<60) {
				cc.setResult("5");
			}

		}
		
		
		
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
}
