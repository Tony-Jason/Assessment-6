package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Track;

@Repository
public class TrackDALImpl implements TrackDAL{

	@Autowired
	private MongoTemplate mongo;
	@Override
	public void create(Track t) {
	
		mongo.insert(t);
	}

	@Override
	public List<Track> findAll() {
	
		return mongo.findAll(Track.class);
	}

}
