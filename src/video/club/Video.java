package video.club;
public class Video {

	private String name;
	private boolean isRent;

	public Video(String name) {
		this.setName(name);
		this.setRent(false);
		VideoClub.addVideo(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}

	@Override
	public String toString() {
		return "\n\nVideo:\nTitre: " + this.getName() + "\nLouée?: " + isRent();
	}

}
