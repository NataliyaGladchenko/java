import java.util.Arrays;

import by.gsu.pms.entities.Tracks;
import by.gsu.pms.enums.Styles;

public class Runner {

	public static void main(String[] args) {
		Tracks[] tracks = { new Tracks(Styles.CLASSICAL, "Antonio Vivaldi - Storm", "03:43"),
				new Tracks(Styles.JAZZ, "Sade - Flow", "04:34"),
				new Tracks(Styles.ROCK, "You Me At Six - Stay With Me", "03:15"),
				new Tracks(Styles.CLASSICAL, "Antonio Vivaldi - Winter", "03:33"),
				new Tracks(Styles.ELECTRONIC, "Elliphant - Best People", "03:42"),
				new Tracks(Styles.ELECTRONIC, "Camila Cabello ft.Young Thug - Havana", "03:36"),
				new Tracks(Styles.CLASSICAL, "Antonio Vivaldi - Presto", "02:51"),
				new Tracks(Styles.ELECTRONIC, "Randall ft.NateMonoxide - Winter", "03:40"),
				new Tracks(Styles.JAZZ, "Ken Colyer - Streamline Train", "03:03"),
				new Tracks(Styles.ROCK, "Asian Kung-Fu Generation - Blood Circulator", "03:43"),
				new Tracks(Styles.JAZZ, "Hugh Coltman - Civvy Street", "04:34"),
				new Tracks(Styles.ROCK, "Bring Me The Horizon - Drown", "03:42")

		};

		Arrays.sort(tracks);

		String total = "00:00";
		for (Tracks tracks2 : tracks) {
			System.out.println(tracks2);
			total = totalDuration(total, tracks2.getDuration());

		}

		System.out.println("\nTotal duration of all tracks = " + total);
	}

	private static String totalDuration(String str1, String str2) {

		int s1 = Integer.parseInt(str1.split(":")[0]) + Integer.parseInt(str2.split(":")[0]);
		int s2 = Integer.parseInt(str1.split(":")[1]) + Integer.parseInt(str2.split(":")[1]);
		if (s2 > 59) {
			s1 += s2 / 60;
			s2 = s2 % 60;
		}
		return String.valueOf(s1) + ":" + String.valueOf(s2);
	}

}
