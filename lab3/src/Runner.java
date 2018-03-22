import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = null;

		try {
			scanner = new Scanner(new FileReader("src\\in.txt"));

			String[] text = scanner.nextLine().split("\\. ");
			
			for (int i = 0; i < text.length; i++) {
				String[] words = text[i].split(" ");
				String temp = words[words.length-1];
				words[words.length-1] = words[0];
				words[0] = temp;
				for (String string : words) {
					System.out.print(string + " ");
				}
				System.out.print(".\n");
			}
		
			
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
		} finally {
			if (scanner != null) {
				scanner.close();
			}

		}

	}
}