package com.mms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mms.model.Movie;

@Repository
public interface MovieDAO extends CrudRepository<Movie, Integer> {

}
