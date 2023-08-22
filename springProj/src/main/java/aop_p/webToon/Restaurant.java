package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	String menu = "찌개";
	int price = 6000;
	
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Restaurant [menu=" + menu + ", price=" + price + "]";
	}

	
	
}
