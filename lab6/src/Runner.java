import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import by.gsu.pms.Schedule;
import by.gsu.pms.WeekDays;

public class Runner {

	public static void main(String[] args) {
		List<Schedule> schedules = new ArrayList<>();
		final String FILE_NAME = "src//in.txt";
		try (Scanner scanner = new Scanner(new FileReader(FILE_NAME))) {
			while (scanner.hasNext()) {
				String[] string = scanner.nextLine().split(";");
				String subject = string[0];
				String teacher = string[1];
				String course = string[2];
				int numberOfLectures = Integer.parseInt(string[3]);
				int numberOfPractices = Integer.parseInt(string[4]);
				WeekDays weekDay = WeekDays.valueOf(string[5].toUpperCase());
				String date = string[6];
				Schedule schedule = new Schedule(subject, teacher, course, numberOfLectures, numberOfPractices, weekDay,
						date);
				schedules.add(schedule);
			}
			showCollection(schedules);
			Collections.sort(schedules);
			System.out.println();
			showCollection(schedules);
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
		}
	}

	private static <T> void showCollection(List<T> collection) {
		for (T value : collection) {
			System.out.println(value);
		}
	}
}
