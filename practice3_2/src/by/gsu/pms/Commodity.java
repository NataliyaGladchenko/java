package by.gsu.pms;
import java.lang.String;
public class Commodity {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Commodity() {
		super();
	}
	public Commodity(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + ";" + CurrensyConverter.convert(price, 10000, 2);
	}
	
	
}
