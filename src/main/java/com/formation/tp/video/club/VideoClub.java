package com.formation.tp.video.club;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class VideoClub {
	private final Collection<Video> catalog = new HashSet<>();
	private final Collection<Client> clients = new HashSet<>();

	public void removeVideo(Video video) {
		catalog.remove(video);
	}

	public void addVideo(Video video) {
		catalog.add(video);
	}

	public Collection<Video> getCatalog() {
		return Collections.unmodifiableCollection(catalog);
	}

	public Collection<Client> getClients() {
		return Collections.unmodifiableCollection(clients);
	}

	public void addClient(Client client) {
		clients.add(client);
	}

}
