import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import by.gsu.exception.DeserializationException;
import by.gsu.helpers.Serializator;
import by.gsu.pms.Drugstore;

public class Runner {

	public static void main(String[] args) {
		final String FILE_NAME = "src\\in.txt";
		
		try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Array size: ");
			int size = Integer.parseInt(in.readLine());
			Drugstore[] inDrugstores = new Drugstore[size];
			
			for (int i = 0; i < size; i++) {
				String[] values = in.readLine().split(";");
				String surname = values[0];
				int profit = Integer.parseInt(values[1]);
				
				if (size == 3) {
					boolean additives = Boolean.parseBoolean(values[2]);
					inDrugstores[i] = new Drugstore(surname, additives, profit);
				} else {
					inDrugstores[i] = new Drugstore(surname, profit);
				}
			}
			System.out.println("\nInput array: ");
			printArray(inDrugstores);
			Serializator.serialize(inDrugstores, FILE_NAME);
			
			Drugstore[] outDrugstores = Serializator.deserialize(FILE_NAME);
			System.out.println("\nOutput array: ");
			printArray(outDrugstores);
		} catch (IOException | DeserializationException e) {
			e.printStackTrace();
		}
	}
	
	private static <T> void printArray(T[] array) {
		for (T value : array) {
			System.out.println(value);
		}
	}
}
