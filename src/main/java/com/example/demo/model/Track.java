package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tracks")
public class Track {
	
	@Id
	private String id;
	
	private String trackName;
	
	
	List<String> artists;

	public Track() {
		// TODO Auto-generated constructor stub
	}

	public Track(String id, String trackName, List<String> artists) {
		super();
		this.id = id;
		this.trackName = trackName;
		this.artists = artists;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public List<String> getArtists() {
		return artists;
	}

	public void setArtists(List<String> artists) {
		this.artists = artists;
	}
	
	
	
	

}
