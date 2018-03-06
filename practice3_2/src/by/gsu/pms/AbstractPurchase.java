package by.gsu.pms;

public abstract class AbstractPurchase {
	private int purchaseUnits;
	private Commodity commodity;

	public int getPurchaseUnits() {
		return purchaseUnits;
	}

	public void setPurchaseUnits(int purchaseUnits) {
		this.purchaseUnits = purchaseUnits;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public AbstractPurchase(int purchaseUnits, Commodity commodity) {
		super();
		this.purchaseUnits = purchaseUnits;
		this.commodity = commodity;
	}

	public AbstractPurchase() {
		super();
	}

	public abstract int getCost();

	@Override
	public String toString() {
		return commodity + ";" + purchaseUnits;
	}
	
	

}
