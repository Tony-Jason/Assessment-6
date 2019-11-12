package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Album;

public interface AlbumDAL {

	void create(Album a);
	
	List<Album> findAll();
	
	Album findById(String id);
	
	void delete(String albumName);
}
