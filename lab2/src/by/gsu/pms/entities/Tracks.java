package by.gsu.pms.entities;

import by.gsu.pms.enums.Styles;

public class Tracks implements Comparable<Tracks> {

	private Styles style;
	private String name;
	private String duration;

	public Styles getStyle() {
		return style;
	}

	public void setStyle(Styles style) {
		this.style = style;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Tracks() {
		super();
	}

	public Tracks(Styles style, String name, String duration) {
		super();
		this.style = style;
		this.name = name;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return name + ";" + style + ";" + duration;
	}

	@Override
	public int compareTo(Tracks track) {
		return style.compareTo(track.getStyle());
	}

}
