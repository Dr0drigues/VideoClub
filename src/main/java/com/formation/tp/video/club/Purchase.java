package com.formation.tp.video.club;

import java.util.Date;

public class Purchase {
	private final Date date;
	private final Video video;

	public Purchase(Video video) {
		super();
		this.date = new Date();
		this.video = video;
	}

	public Date getDate() {
		return date;
	}

	public Video getVideo() {
		return video;
	}
}
