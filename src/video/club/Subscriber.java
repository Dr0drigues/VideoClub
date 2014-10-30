package video.club;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Subscriber extends Customer {
	private Collection<Rent> rentList = new HashSet<Rent>();

	public Subscriber(String name) {
		super(name);
	}

	public Collection<Rent> getRentList() {
		return rentList;
	}

	public void setRentList(Collection<Rent> rentList) {
		this.rentList = rentList;
	}

	public void rentVideo(Video video) {
		Rent rental = new Rent(video);
		this.getRentList().add(rental);
	}

	public void returnVideo(Video video) {
		for (Rent rent : rentList) {
			if (rent.getVideo().equals(video)) {
				rent.setReturnDate(new Date());
				video.setRent(false);
			}
		}
	}

	public String toString() {
		return "\n\nAbonné:\nNom: " + this.getName() + "\nListe de locations: "
				+ this.getRentList();
	}
}
