package com.mms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.dao.MovieDAO;
import com.mms.model.Movie;

@RestController
public class MovieController {

	@Autowired
	MovieDAO movieDAO;
	
	@RequestMapping("/saveMovie")
	public String saveMovie() {
		Movie movie = new Movie(101,"Avatar", "Da Vinci", 50000);
		movieDAO.save(movie);
		return "Saved the movie details";
	}
	
}
