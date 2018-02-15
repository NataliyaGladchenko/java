package by.gsu.pms;

public class Purchase implements Comparable<Purchase> {
	public static final String NAME = "Milk";
	public static final int PRICE = 103;
	private int purchaseUnits;
	private WeekDays weekDay;
	
	

	public Purchase(int purchaseUnits, WeekDays weekDay) {
		super();
		this.purchaseUnits = purchaseUnits;
		this.weekDay = weekDay;
	}


	public Purchase() {
		super();
	}

	
	public int getPurchaseUnits() {
		return purchaseUnits;
	}

	public void setPurchaseUnits(int purchaseUnits) {
		this.purchaseUnits = purchaseUnits;
	}

	public WeekDays getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(WeekDays weekDay) {
		this.weekDay = weekDay;
	}

	public int getCost() {
		return PRICE * purchaseUnits;
	}

	@Override
	public String toString() {
		return  purchaseUnits + ";" + weekDay + ";" + CurrensyConverter.convert(getCost(), 100, 2);
	}

	@Override
	public int compareTo(Purchase purchase) {
		return purchaseUnits - purchase.purchaseUnits;
	}
	
	
}
