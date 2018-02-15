package by.gsu.pms;

public class TripExpenses {
		
	private static final int RATE = 600; 
	private String employeeName;
	private int transportationExpenses;
	private int numberOfDays;


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public int getTransportationExpenses() {
		return transportationExpenses;
	}


	public void setTransportationExpenses(int transportationExpenses) {
		this.transportationExpenses = transportationExpenses;
	}


	public int getNumberOfDays() {
		return numberOfDays;
	}


	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public TripExpenses() {
		super();
	
	}


	public TripExpenses(String employeeName, int transportationExpenses,
			int numberOfDays) {
		super();
		this.employeeName = employeeName;
		this.transportationExpenses = transportationExpenses;
		this.numberOfDays = numberOfDays;
	}
	
	
	public int getTotal(){
		return transportationExpenses + RATE*numberOfDays;
	}
	
	public void show(){
		System.out.println(
				"rate = " + CurrensyConverter.convert(RATE, 100, 2) +
				"\naccount = " + employeeName + 
				"\ntransport = " + CurrensyConverter.convert(transportationExpenses, 100, 2) +
				"\ndays = " + numberOfDays + 
				"\ntotal = " + CurrensyConverter.convert(getTotal(), 100, 2) + "\n"
		);
	}


	public String toString() {
		return CurrensyConverter.convert(RATE, 100, 2) + ";" + employeeName + ";" + CurrensyConverter.convert(transportationExpenses, 100, 2) + ";" + numberOfDays + ";" + CurrensyConverter.convert(getTotal(), 100, 2);
	}
	
}

