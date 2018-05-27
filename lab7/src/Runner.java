import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import by.gsu.pms.ThreadGenerator;

public class Runner {
	public static void main(String[] args) {
		
		try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter the thread number: ");
			int size = Integer.parseInt(in.readLine());
			System.out.println("Enter the last value: ");
			int lastValue = Integer.parseInt(in.readLine());
			
			ThreadGenerator generator = new ThreadGenerator(size, lastValue);
			generator.execute();
			
			System.out.println("The final result: " + generator.getResult());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}