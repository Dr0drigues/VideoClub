package video.club;
import java.util.Date;

public class Purchase {

	private Date date;
	private Video video;

	public Purchase(Video video) {
		this.setDate(new Date());
		this.setVideo(video);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public String toString() {
		return "\n\nAchat:\nVidéo: " + this.getVideo().getName()
				+ "\nDate d'achat: " + this.getDate();
	}

}
