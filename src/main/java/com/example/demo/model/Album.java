package com.example.demo.model;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "albums")
public class Album {
	
	@Id
	private String id;
	
	private String albumName;
	

	
	@DBRef
	List<Track> tracks;

	public Album() {
		// TODO Auto-generated constructor stub
	}

	public Album(String id, String albumName, List<Track> tracks) {
		super();
		this.id = id;
		this.albumName = albumName;
	
		this.tracks = tracks;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}


	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
	
	

}
