package by.gsu.pms;

public class Schedule implements Comparable<Schedule>{
	private String subject;
	private String teacher;
	private String course;
	private int numberOfLectures;
	private int numberOfPractices;
	private WeekDays weekDay;
	private String date;

	public Schedule() {
		super();
	}

	public Schedule(String subject, String teacher, String course, int numberOfLectures, int mumberOfPractices,
			WeekDays weekDay, String date) {
		super();
		this.subject = subject;
		this.teacher = teacher;
		this.course = course;
		this.numberOfLectures = numberOfLectures;
		this.numberOfPractices = mumberOfPractices;
		this.weekDay = weekDay;
		this.date = date;
	}

	public String getSubject() {
		return subject;
	}

	public String getTeacher() {
		return teacher;
	}

	public String getCourse() {
		return course;
	}

	public int getNumberOfLectures() {
		return numberOfLectures;
	}

	public int getMumberOfPractices() {
		return numberOfPractices;
	}

	public WeekDays getWeekDay() {
		return weekDay;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return subject + ";" + teacher + ";" + course + ";" + numberOfLectures + ";" + numberOfPractices + ";" + weekDay + ";" + date;
	}

	@Override
	public int compareTo(Schedule schedule) {
		return subject.compareTo(schedule.getSubject());
	}
	
	

}