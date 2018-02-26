import java.util.Arrays;


import by.gsu.pms.Drugstore;
import by.gsu.pms.ProfitComparator;
import by.gsu.pms.SurnameComparator;

public class Runner {

	public static void main(String[] args) {
		Drugstore[] drugstores = { new Drugstore("Jhonson", false, 17410), new Drugstore("Brown", true, 19852),
				new Drugstore("Humphry", 15671), new Drugstore("Wolderf", false, 18426),
				new Drugstore("Bass", true, 16456), new Drugstore("Rhouts", 21478),
				new Drugstore("Archibald", true, 12365), new Drugstore("Lourens", true, 14785),
				new Drugstore("Kempbel", false, 16541), new Drugstore("Poormen", true, 11236) };

		int totalProfit = 0;
		int quantity = 0;
		for (Drugstore drugstore : drugstores) {
			System.out.println(drugstore);
			totalProfit = totalProfit + drugstore.getProfit();
			if (drugstore.isLicense() == false) {
				quantity++;
			}
		}

		System.out.println("\nTotal profit  = " + totalProfit / 100 + "." + totalProfit / 10 % 10 + totalProfit % 10
				+ "\nQuantity drugstores without license = " + quantity);

		Arrays.sort(drugstores, new ProfitComparator());
		System.out.println("\nSorted by profit\n");
		for (Drugstore drugstore : drugstores) {
			System.out.println(drugstore);
		};
		
		System.out.println("\nSorted by surname\n");
		Arrays.sort(drugstores, new SurnameComparator());
		
		for (Drugstore drugstore : drugstores) {
			System.out.println(drugstore);
		};
	}

}
