package di_p;

public class FoodShop {
	public breakfast order_bf() {
		System.out.println("order_am 실행");
		return new breakfast("토스트",1400);
	}
	public lunch order_lc() {
		System.out.println("order_lc 실행");
		return new lunch("짜장면",6000);
	}

	public dinner order_di() {
		System.out.println("order_di 실행");
		return new dinner("삼겹살",9000);
	}
	public breakfast order_bf1() {
		System.out.println("order_am 실행");
		return new breakfast("토스트",1400);
	}
	public lunch order_lc1() {
		System.out.println("order_lc 실행");
		return new lunch("짜장면",6000);
	}
	
	public dinner order_di1() {
		System.out.println("order_di 실행");
		return new dinner("삼겹살",9000);
	}
	
}

