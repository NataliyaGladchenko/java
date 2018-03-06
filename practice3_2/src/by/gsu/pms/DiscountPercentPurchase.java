package by.gsu.pms;
import java.lang.String;
public class DiscountPercentPurchase extends AbstractPurchase{
	private double percent;

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public DiscountPercentPurchase() {
		super();
	}

	public DiscountPercentPurchase(int purchaseUnits, Commodity commodity, double percent) {
		super(purchaseUnits, commodity);
		this.percent = percent;
	}

	@Override
	public int getCost() {
		return (int) (getCommodity().getPrice()*(percent/100))*getPurchaseUnits();
	}

	@Override
	public String toString() {
		return super.toString() + ";" + percent + ";" + CurrensyConverter.convert(getCost(), 10000, 2);
	}


	
	
}
