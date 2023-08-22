package di_p;

public class dinner {
	String menu;
	int price;
	
	public dinner(String menu, int price) {
		super();
		this.menu = menu;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[menu=" + menu + ", price=" + price + "]";
	}
}
