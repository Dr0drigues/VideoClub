package com.formation.tp.video.club;

public class Video {
	private final String name;
	private boolean isRent;

	public Video(String name) {
		super();
		this.name = name;
		this.isRent = false;
	}

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}

	public String getName() {
		return name;
	}

}
