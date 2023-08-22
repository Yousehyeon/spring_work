package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import anno_p.com.WorkStation;

@Configuration
public class Coffee {
	
	@Bean
	CoffeeBean cb() {
		return new CoffeeBean("콜란데");
	}
	@Bean
	CoffeePrice cp(){
		return new CoffeePrice(3000);
	}
	@Bean
	CoffeeBean cb1() {
		return new CoffeeBean("좋은원두");
	}
	@Bean
	CoffeePrice cp1(){
		return new CoffeePrice(3500);
	}
	@Bean
	CoffeeBean cb2() {
		return new CoffeeBean("나쁜원두");
	}
	@Bean
	CoffeePrice cp2(){
		return new CoffeePrice(4500);
	}

	
	@Bean
	CoffeeStation cs() {
		return new CoffeeStation("아메리카노", cb(), cp());
	}
	@Bean
	CoffeeStation cs1() {
		return new CoffeeStation("카페라떼", cb1(), cp1());
	}
	@Bean
	CoffeeStation cs2() {
		return new CoffeeStation("카라멜마끼야또", cb2(), cp2());
	}

	
}



class CoffeeBean{
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public CoffeeBean(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "CoffeeBean [name=" + name + "]";
	}
	
	
	
	

	
	
}



class CoffeePrice{
	int price = 3000;


	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CoffeePrice [price=" + price + "]";
	}
	public CoffeePrice(int price) {
		super();
		this.price = price;
	}
	
	
	
	
}


