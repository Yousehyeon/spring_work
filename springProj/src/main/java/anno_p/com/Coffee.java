package anno_p.com;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
@Component
public class Coffee{
	@Resource
	Americano ac;
	@Resource
	CafeLattes cl;
	@Resource
	Caramel cr;
	@Override
	public String toString() {
		return "커피 [커피종류=" + ac + ", 커피종류=" + cl + ", 커피종류=" + cr + "]";
	}

	
}
@Component
class Americano{
	String bean = "콜란데";
	String water = "수돗물";
	int price = 2000;
	@Override
	public String toString() {
		return "아메리카노 [bean=" + bean + ", water=" + water + ", price=" + price + "]";
	}
	
}
@Component
class CafeLattes{
	String bean = "아라비카",water = "삼다수",milk = "서울우유";
	int price = 2500;
	@Override
	public String toString() {
		return "카페라떼 [bean=" + bean + ", water=" + water + ", milk=" + milk + ", price=" + price + "]";
	}
	
}
@Component
class Caramel{
	String bean = "로부스타",water = "아이시스",caramel="카라멜시럽";
	int price = 4000;
	@Override
	public String toString() {
		return "카라멜마끼야또 [bean=" + bean + ", water=" + water + ", caramel=" + caramel + ", price=" + price + "]";
	}
	
}