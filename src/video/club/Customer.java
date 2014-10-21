package video.club;
import java.util.Collection;
import java.util.HashSet;

public class Customer {

	private String name;
	private Collection<Purchase> purchaseList = new HashSet<Purchase>();

	public Customer(String name) {
		this.setName(name);
		VideoClub.addCustomer(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Purchase> getPurchaseList() {
		return purchaseList;
	}

	public void setPurchaseList(Collection<Purchase> purchaseList) {
		this.purchaseList = purchaseList;
	}

	public void buyVideo(Video video) {
		Purchase purchased = new Purchase(video);
		purchased.setVideo(video);
		this.getPurchaseList().add(purchased);
		VideoClub.removeVideo(video);
	}

	public String toString() {
		return "\n\nClient:\nNom: " + this.getName() + "\nListe d'achats: "
				+ this.getPurchaseList();
	}
}
