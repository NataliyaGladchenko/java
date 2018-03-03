
import by.gsu.pms.CurrensyConverter;
import by.gsu.pms.Purchase;

public class Runner2 {

	public static void main(String[] args) {
		Purchase purchase = new Purchase("magazine", 15000, 5);
		
		System.out.println(purchase);
		
		purchase.setPurchaseUnits(3);
		
		System.out.println("\nTotal cost = " + CurrensyConverter.convert(purchase.getCost(), 2));

	}

}
