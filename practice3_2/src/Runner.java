import by.gsu.pms.AbstractPurchase;
import by.gsu.pms.Commodity;
import by.gsu.pms.CurrensyConverter;
import by.gsu.pms.DiscountPercentPurchase;
import by.gsu.pms.DiscountPricePurchase;

public class Runner {

	public static void main(String[] args) {
		AbstractPurchase[] purchases = { new DiscountPricePurchase(5, new Commodity("pineapple", 47900), 5000),
				new DiscountPricePurchase(3, new Commodity("apple", 21800), 4000),
				new DiscountPricePurchase(2, new Commodity("pine", 850000), 12000),
				new DiscountPercentPurchase(4, new Commodity("lime", 89900), 19),
				new DiscountPercentPurchase(6, new Commodity("mango", 52700), 12),
				new DiscountPercentPurchase(1, new Commodity("papaya", 109900), 21)

		};

		int totalCost = 0;

		for (AbstractPurchase abstractPurchase : purchases) {
			System.out.println(abstractPurchase);
			totalCost = totalCost + abstractPurchase.getCost();

		}

		System.out.println("\nTotal cost = " + CurrensyConverter.convert(totalCost, 10000, 2));
		
		
	}
}