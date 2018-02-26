package by.gsu.pms;

import java.util.Comparator;

public class ProfitComparator implements Comparator<Drugstore> {

	@Override
	public int compare(Drugstore dr1, Drugstore dr2) {
		
		return dr1.getProfit() - dr2.getProfit();
	}

}
