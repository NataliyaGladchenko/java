package by.gsu.pms;
import java.lang.String;
public class DiscountPricePurchase extends AbstractPurchase {
	private int discountPrice;

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public DiscountPricePurchase() {
		super();
	}

	public DiscountPricePurchase(int purchaseUnits, Commodity commodity, int discountPrice) {
		super(purchaseUnits, commodity);
		this.discountPrice = discountPrice;
	}


	@Override
	public int getCost() {
		return (getCommodity().getPrice()-discountPrice)*getPurchaseUnits();
	}

	@Override
	public String toString() {
		return super.toString() + ";"+ CurrensyConverter.convert(getDiscountPrice(), 10000, 2)+ ";" + CurrensyConverter.convert(getCost(), 10000, 2);
	}

	
}
