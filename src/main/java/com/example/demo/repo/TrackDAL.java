package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Track;

public interface TrackDAL {

	void create(Track t);
	
	List<Track> findAll();
	
	void delete(String trackName);
	 
}
