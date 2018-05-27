package by.gsu.pms;

public class ThreadGenerator {
	private int threadsNumber;
	private int lastValue;
	private CalculatorThread[] threads;
	
	public ThreadGenerator(int threadsNumber, int lastValue) {
		this.threadsNumber = threadsNumber;
		this.lastValue = lastValue;
		generateThreads();
	}

	private void generateThreads() {
		int delimeter = (int) Math.ceil(lastValue / threadsNumber);
		threads = new CalculatorThread[delimeter];
		for (int i = 0; i < delimeter; i++) {
			String name = "Thread ¹" + (i + 1);
			int firstValue = (threadsNumber * i) + 1;
			int lastValue = threadsNumber * (i + 1);
			
			threads[i] = new CalculatorThread(name, firstValue, lastValue);
		}
	}
	
	public void execute() {
		for (CalculatorThread calculatorThread : threads) {
			calculatorThread.run();
		}
	}
	
	public long getResult() {
		long result = 0;
		
		for (CalculatorThread calculatorThread : threads) {
			result += calculatorThread.getResult();
		}
		
		return result;
	}
}
