package video.club;

import java.util.Collection;
import java.util.HashSet;

public class VideoClub {
	static Collection<Video> catalog = new HashSet<Video>();
	static Collection<Customer> customers = new HashSet<Customer>();

	public VideoClub() {
	}

	static Collection<Video> getCatalog() {
		return catalog;
	}

	static Collection<Customer> getCustomers() {
		return customers;
	}

	static void addCustomer(Customer client) {
		customers.add(client);
	}

	static void addVideo(Video video) {
		catalog.add(video);
	}

	static void removeVideo(Video video) {
		catalog.remove(video);
	}

	static void removeCustomer(Customer customer) {
		catalog.remove(customer);
	}

	public String toString() {
		return "\n\nVidéo Club:\nCatalogue de vidéos: "
				+ VideoClub.getCatalog() + "\n\nListe de clients/abonnés: "
				+ VideoClub.getCustomers();
	}

	public static void main(String[] args) {
		VideoClub videoFutur = new VideoClub();

		Video roiLion = new Video("Le Roi Lion");
		Video pocahantas = new Video("Pocahantas");
		Video aladdin = new Video("Aladdin");

		Customer cust1 = new Customer("Rocco Sifreddi");
		Customer cust2 = new Customer("George Washington");
		Customer subs1 = new Subscriber("Michel Drucker");

		cust1.buyVideo(aladdin);
		cust2.buyVideo(pocahantas);
		((Subscriber) subs1).rentVideo(roiLion);
		((Subscriber) subs1).returnVideo(roiLion);

		System.out.println(videoFutur);
	}
}
