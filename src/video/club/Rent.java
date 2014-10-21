package video.club;
import java.util.Date;

public class Rent {

	private Date rentalDate;
	private Date returnDate = null;
	private Video video;

	public Rent(Video video) {
		this.setDate(new Date());
		this.setVideo(video);
	}

	public Date getRentalDate() {
		return rentalDate;
	}

	public void setDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
		video.setRent(true);
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String toString() {
		String retour = (this.getRentalDate().equals(null) ? "Non retourné à ce jour"
				: "Retourné le: " + this.getReturnDate());
		return "\n\nLocation:\nVideo: " + this.getVideo().getName()
				+ "\nDate de location: " + this.getRentalDate()
				+ "\nRetour de location: " + retour;
	}

}
