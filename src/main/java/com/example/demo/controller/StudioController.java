package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Album;
import com.example.demo.model.Artist;
import com.example.demo.model.Track;
import com.example.demo.repo.AlbumDAL;
import com.example.demo.repo.ArtistDAL;
import com.example.demo.repo.TrackDAL;

@RestController
public class StudioController {

	@Autowired
	private ArtistDAL artistRepo;
	
	@Autowired
	private AlbumDAL albumRepo;
	
	@Autowired
	private TrackDAL trackRepo;
	
	@PostMapping("/artists")
	public void create(@RequestBody Artist a) {
		artistRepo.create(a);
	}
	
	@PostMapping("/albums")
	public void createAlbum(@RequestBody Album a) {
		albumRepo.create(a);
	}
	
	@PostMapping("/tracks")
	public void createTrack(@RequestBody Track t) {
		trackRepo.create(t);
	}
	
	@GetMapping("/artists")
	public List<Artist> findAll(){
		return artistRepo.findAll();
	}
	
	@GetMapping("/albums")
	public List<Album> findAllAlbums(){
		return albumRepo.findAll();
	}
	
	@GetMapping("/tracks")
	public List<Track> findAllTracks(){
		return trackRepo.findAll();
	}
	
	
	
}
