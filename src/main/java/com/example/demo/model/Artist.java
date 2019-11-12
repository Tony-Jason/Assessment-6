package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "artists")
public class Artist {

	@Id
	private String id;
	
	private String artistName;
	
	private String gender;
	
	private String genre;
	
	@DBRef
	List<Album> albums;

	public Artist() {
		// TODO Auto-generated constructor stub
	}

	public Artist(String id, String artistName, String gender, String genre, List<Album> albums) {
		super();
		this.id = id;
		this.artistName = artistName;
		this.gender = gender;
		this.genre = genre;
		this.albums = albums;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	
	
	
}
