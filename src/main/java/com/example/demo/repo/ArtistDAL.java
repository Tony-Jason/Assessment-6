package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Artist;

public interface ArtistDAL {

	void create(Artist a);
	
	List<Artist> findAll();
	
	Artist findById(String id);
	
	void deleteArtist(String artistName);
	
	
	
     
	
}
