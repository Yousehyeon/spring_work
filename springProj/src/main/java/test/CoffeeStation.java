package test;

public class CoffeeStation {
	String name;
	
	CoffeeBean cfb;
	CoffeePrice cfp;
	
	
	


	public CoffeeStation(String name, CoffeeBean cfb, CoffeePrice cfp) {
		super();
		this.name = name;
		this.cfb = cfb;
		this.cfp = cfp;
	}





	@Override
	public String toString() {
		return "CoffeStation [name=" + name + ", cfb=" + cfb + ", cfp=" + cfp + "]";
	}
	
	
	
}
