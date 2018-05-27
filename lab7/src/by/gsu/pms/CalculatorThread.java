package by.gsu.pms;

import java.math.BigInteger;

public class CalculatorThread extends Thread {

	private String name;
	private int firstValue;
	private int lastValue;
	private long result = 1;
	
	
	public CalculatorThread(String name, int firstValue, int lastValue) {
		this.name = name;
		this.firstValue = firstValue;
		this.lastValue = lastValue;
	}

	@Override
	public void run() {
		System.out.println(name + " is running...");
		for (int i = firstValue; i <= lastValue; i++) {
			if (isPrimeValue(i)) {
				result *= i;
			}
		}
		System.out.println(name + " is finished, the result = " + result);
	}
	
	public long getResult() {
		return result;
	}
	
	private boolean isPrimeValue(int n) {
		boolean flag = false;
		Integer value = n;
		BigInteger bigInteger = BigInteger.valueOf(value);
		flag = bigInteger.isProbablePrime((int) Math.log(value));
		
		return flag;
	}

	@Override
	public String toString() {
		return "CalculatorThread [name=" + name + ", firstValue=" + firstValue + ", lastValue=" + lastValue
				+ ", result=" + result + "]";
	}

	
}
