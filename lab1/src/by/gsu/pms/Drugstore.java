package by.gsu.pms;



public class Drugstore {
	
	
	private String surname;
	private boolean license;
	private int profit;
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public boolean isLicense() {
		return license;
	}
	public void setLicense(boolean license) {
		this.license = license;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public Drugstore() {
		super();
	}
	public Drugstore(String surname, boolean license, int profit) {
		super();
		this.surname = surname;
		this.license = license;
		this.profit = profit;
	}
	
	public Drugstore(String surname, int profit) {
		super();
		this.surname = surname;
		this.profit = profit;
	}
	
	@Override
	public String toString() {
		return surname + ";" + license + ";" + profit/100 + "." + profit/10%10 + profit%10 ;
	}
	
	


	



	
}
