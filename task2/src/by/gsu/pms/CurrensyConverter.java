package by.gsu.pms;

import java.math.BigDecimal;

public class CurrensyConverter {
	
	public static BigDecimal convert(int amount, int devider, int scale) {
		BigDecimal currensy = new BigDecimal(amount);
		BigDecimal devideIndex = new BigDecimal(devider);
		currensy = currensy.divide(devideIndex);
		currensy.setScale(scale);
		return currensy;
	}
}
