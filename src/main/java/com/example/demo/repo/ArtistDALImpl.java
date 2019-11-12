package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Artist;

@Repository
public class ArtistDALImpl implements ArtistDAL {

	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public void create(Artist a) {
		mongo.insert(a);
		
	}

	@Override
	public List<Artist> findAll() {
		
		return mongo.findAll(Artist.class);
	}

	@Override
	public Artist findById(String id) {
	
		Query q = new Query();
		q.addCriteria(Criteria.where("id").is(id));
		return mongo.find(q, Artist.class).get(0);
	}

	@Override
	public void deleteArtist(String artistName) {
		Query q = new Query();
		q.addCriteria(Criteria.where(artistName).is(artistName));
		mongo.findAndRemove(q,Artist.class);
		
	}

}
