package com.formation.tp.video.club;

import java.util.Date;

public class Rent {
	private final Video purchasedVideo;
	private final Date rentalDate;
	private Date returnDate;

	public Rent(Video purchasedVideo) {
		super();
		rentalDate = new Date();
		this.purchasedVideo = purchasedVideo;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Date getRentalDate() {
		return rentalDate;
	}

	public Video getPurchasedVideo() {
		return purchasedVideo;
	}

}
