package di_p;

import java.util.List;

public class Myphone {
	String name;
	Battery bt;
	Display dp;
	List<PhoneCamera> pc;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setBt(Battery bt) {
		this.bt = bt;
	}


	public void setDp(Display dp) {
		this.dp = dp;
	}


	public void setPcasd(List<PhoneCamera> pc) {
		this.pc = pc;
	}


	@Override
	public String toString() {
		return "Myphone [name=" + name + ", bt=" + bt + ", dp=" + dp + ", pc=" + pc + "]";
	}
	
	
	
	
	
}


class Battery{
	
	String name, percent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPercent() {
		return percent;
	}

	public void setPercent(String percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Battery [name=" + name + ", percent=" + percent + "]";
	}
	
	
	
}


class  Display{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Display [name=" + name + "]";
	}
	
	
	
}


class PhoneCamera{
	String name;
	int num;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "PhoneCamera [name=" + name + "]";
	}
	
	
	
}