package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Album;

@Repository
public class AlbumDALImpl implements AlbumDAL {

	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public void create(Album a) {
	mongo.insert(a);
		
	}

	@Override
	public List<Album> findAll() {

		return mongo.findAll(Album.class);
	}

	@Override
	public Album findById(String id) {
		Query q = new Query();
		q.addCriteria(Criteria.where("id").is(id));
		return mongo.find(q, Album.class).get(0);
	}

	@Override
	public void delete(String albumName) {
		Query q = new Query();
		q.addCriteria(Criteria.where("albumName").is(albumName));
		mongo.findAndRemove(q, Album.class);
		
	}

}
