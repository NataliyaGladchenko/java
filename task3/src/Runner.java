import java.util.Arrays;

import by.gsu.pms.CurrensyConverter;
import by.gsu.pms.Purchase;
import by.gsu.pms.WeekDays;

public class Runner {

	public static void main(String[] args) {
		Purchase[] purchases = { 
				new Purchase(2, WeekDays.MONDAY), 
				new Purchase(4, WeekDays.TUESDAY),
				new Purchase(0, WeekDays.THUSDAY),
				new Purchase(3, WeekDays.MONDAY),
				new Purchase(3, WeekDays.FRIDAY)
		};
		showPurchases(purchases);
		
		
		int totalCost = 0;
		int totalCostOnMonday = 0;
		WeekDays dayWithMaxCost = null;
		int maxCost = purchases[0].getCost();
		 
		for (Purchase purchase : purchases) {
			totalCost = totalCost + purchase.getCost();
			if (purchase.getWeekDay().equals(WeekDays.MONDAY)) {
				totalCostOnMonday += purchase.getCost();
			}
			if (maxCost < purchase.getCost()) {
				maxCost = purchase.getCost();
				dayWithMaxCost = purchase.getWeekDay();
			}
		}
		
		System.out.println("Mean cost = " + CurrensyConverter.convert(totalCost/purchases.length, 100, 2) + "\nTotatl cost on Monday = "
		+ CurrensyConverter.convert(totalCostOnMonday, 100, 2) + "\nThe day with maximum cost = " + dayWithMaxCost);
		
		Arrays.sort(purchases);
		
		showPurchases(purchases);
	}

	private static void showPurchases(Purchase[] purchases) {
		System.out.println(Purchase.NAME + "\n" + "Price = " + CurrensyConverter.convert(Purchase.PRICE, 100, 2));
		for (Purchase purchase : purchases) {
			System.out.println(purchase);
		}
	}
	
	
	
	
}
