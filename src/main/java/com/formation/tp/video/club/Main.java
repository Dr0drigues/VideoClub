package com.formation.tp.video.club;

public class Main {
	public static void main(String[] args) {
		VideoClub videoClub = new VideoClub();

		Client john = new Client("John", videoClub);
		Client patty = new Client("Patty", videoClub);

		Subscriber paul = new Subscriber("Paul", videoClub);

		Video starwars1 = new Video("Star Wars 1");
		Video starwars4 = new Video("Star Wars 4");

		videoClub.addVideo(starwars1);
		videoClub.addVideo(new Video("Star Wars 1"));
		videoClub.addVideo(new Video("Star Wars 2"));
		videoClub.addVideo(new Video("Star Wars 3"));
		videoClub.addVideo(starwars4);
		videoClub.addVideo(new Video("Star Wars 5"));
		videoClub.addVideo(new Video("Star Wars 6"));

		System.out.println("number of videos : "
				+ videoClub.getCatalog().size());

		john.buyVideo(starwars4);

		System.out.println("number of videos after john's purchase : "
				+ videoClub.getCatalog().size());
		System.out.println("number of john's videos : "
				+ john.getPurchases().size());

		paul.rentVideo(starwars1);

		System.out.println("paul's rentals : " + paul.getRentals().size());
		System.out.println("star wars rented status : " + starwars1.isRent());

		paul.returnVideo(starwars1);

		System.out.println("paul's rentals : " + paul.getRentals().size());
		System.out.println("star wars rented status : " + starwars1.isRent());

		System.out.println("number of videos : "
				+ videoClub.getCatalog().size());

	}
}
