package com.formation.tp.video.club;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

public class Subscriber extends Client {
	private Collection<Rent> rentals = new HashSet<>();

	public Subscriber(String name, VideoClub videoClub) {
		super(name, videoClub);
	}

	public Collection<Rent> getRentals() {
		return Collections.unmodifiableCollection(rentals);
	}

	public void rentVideo(Video video) {
		if (video.isRent()) {
			throw new IllegalStateException("video is already rent");
		}

		video.setRent(true);
		rentals.add(new Rent(video));
	}

	public void returnVideo(Video video) {
		for (Rent rental : rentals) {
			if (rental.getPurchasedVideo().equals(video)
					&& rental.getReturnDate() == null) {
				rental.setReturnDate(new Date());
				video.setRent(false);
			}
		}
	}
}
