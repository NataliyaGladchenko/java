import by.gsu.pms.CurrensyConverter;
import by.gsu.pms.Purchase;

public class Runner1 {

	public static void main(String[] args) {
		Purchase[] purchases = { new Purchase("book", 70000, 5), new Purchase("book", 70000, 12),
				new Purchase("book3", 65000, 4), new Purchase("book4", 95000, 3)};

		for (Purchase purchase : purchases) {
			System.out.println(purchase);;
		}
		
		purchases[1].setPrice(25000);
		purchases[1].setName("magazine");
		
		System.out.println("\nCost of the second purchase = " + CurrensyConverter.convert(purchases[purchases.length - 1].getCost(), 2) + "\n");
		
		for (Purchase purchase : purchases) {
			System.out.println(purchase);
		}
		
		Purchase purchase1 = purchases[2];
		purchases[2] = purchases[3];
		purchases[3] = purchase1;
		System.out.println("\n");
		for (Purchase purchase : purchases) {
			System.out.println(purchase);
		}
	}
}