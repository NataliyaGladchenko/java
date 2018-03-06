package by.gsu.pms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrensyConverter {
public static final int BYN=100;
public static String convert(int coins,int div,int intenegrity){
	BigDecimal initial = new BigDecimal(coins);
	BigDecimal rubs=initial.divide(new BigDecimal(div));
	BigDecimal result=rubs.setScale(intenegrity, RoundingMode.HALF_UP);
	return result.toString();
}
public static String convert(int coins){
	return convert(coins,BYN,2);
}
}
