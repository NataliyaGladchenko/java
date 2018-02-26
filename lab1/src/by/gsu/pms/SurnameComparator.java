package by.gsu.pms;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Drugstore> {

	@Override
	public int compare(Drugstore dr1, Drugstore dr2) {
		
		return dr1.getSurname().compareTo(dr2.getSurname());
	}

}
