package by.gsu.pms;

import java.lang.String;

public class Purchase extends Commodity {
	
	private int purchaseUnits;

	public int getPurchaseUnits() {
		return purchaseUnits;
	}

	public void setPurchaseUnits(int purchaseUnits) {
		this.purchaseUnits = purchaseUnits;
	}

	public Purchase() {
		super();
	}

	public Purchase(String name, int price, int purchaseUnits) {
		super(name, price);
		this.purchaseUnits = purchaseUnits;
	}
	
	public int getCost() {
		return purchaseUnits * getPrice();
	}

	@Override
	public String toString() {
		return getName() + ";" + CurrensyConverter.convert(getPrice(), 2) + ";" + purchaseUnits + ";" + CurrensyConverter.convert(getCost(), 2);
	}
	
	
}
