import by.gsu.pms.CurrensyConverter;
import by.gsu.pms.TripExpenses;

public class Runner {

	public static void main(String[] args) {
		TripExpenses[] tripexpenses = {
				new TripExpenses("Jhon", 457, 5),
				new TripExpenses("Dan", 623, 4),
				null,
				new TripExpenses("Nate", 555, 5),
				new TripExpenses("Blair", 483, 6),
				new TripExpenses("Eric", 475, 3),
				new TripExpenses()
		};
		
		for(TripExpenses tripExpenses: tripexpenses) {
			if (tripExpenses != null) {
				tripExpenses.show();
			}
			
		}
		
		tripexpenses[tripexpenses.length - 1].setTransportationExpenses(256);
		
		System.out.println("Duration = " + (tripexpenses[0].getNumberOfDays() + tripexpenses[1].getNumberOfDays()) + "\n");
		
		int totalSum = 0;
		int maxTotal = tripexpenses[0].getTotal(); 
		TripExpenses maxTotalAccount = new TripExpenses();
		for (TripExpenses tripExpenses: tripexpenses) {
			if (tripExpenses != null) {
				System.out.println(tripExpenses.toString());
				totalSum = totalSum + tripExpenses.getTotal();
				if (maxTotal < tripExpenses.getTotal()) {
					maxTotal = tripExpenses.getTotal();
					maxTotalAccount = tripExpenses;
				}
				
			}
			
		}
		
		System.out.println("\nTotal sum = " + CurrensyConverter.convert(totalSum, 100, 2) + "\n");
		System.out.println(maxTotalAccount);
		
	}
		
	
}
