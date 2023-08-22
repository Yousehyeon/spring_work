package di_p;

public class lunch {
	String menu;
	int price;
	
	public lunch(String menu, int price) {
		super();
		this.menu = menu;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[menu=" + menu + ", price=" + price + "]";
	}
}
