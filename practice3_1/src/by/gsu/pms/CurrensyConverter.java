package by.gsu.pms;

import java.math.BigDecimal;

public class CurrensyConverter {
	
	public static BigDecimal convert(int amount, int scale) {
		BigDecimal currensy = new BigDecimal(amount);
		BigDecimal devideIndex = new BigDecimal(10000);
		currensy = currensy.divide(devideIndex);
		currensy.setScale(scale);
		return currensy;
	}
}
