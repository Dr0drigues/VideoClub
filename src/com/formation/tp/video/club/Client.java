package com.formation.tp.video.club;

import java.util.Collection;
import java.util.HashSet;

public class Client {
	private final String name;
	private final Collection<Purchase> purchases = new HashSet<>();
	private final VideoClub videoClub;

	public Client(String name, VideoClub videoClub) {
		super();
		this.name = name;
		this.videoClub = videoClub;
	}

	public String getName() {
		return name;
	}

	public Collection<Purchase> getPurchases() {
		return purchases;
	}

	public void buyVideo(Video video) {
		if (videoClub.getCatalog().contains(video)) {
			videoClub.removeVideo(video);
			purchases.add(new Purchase(video));
		}
	}
}
