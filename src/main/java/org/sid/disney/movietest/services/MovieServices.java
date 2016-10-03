package org.sid.disney.movietest.services;

import java.util.List;

import org.sid.disney.movietest.DAO.MovieDAO;
import org.sid.disney.movietest.model.Movie;

public class MovieServices {

	public MovieServices() {
	}
	
	public List<Movie> getAllMovies() {
		MovieDAO movies = new MovieDAO();
		return movies.getAllMovies();
	}
	
	public Movie getMovie(int id) {
		MovieDAO movies = new MovieDAO();
		return movies.getMovie(id);
	}
	
	public List<Movie> getTopTenMovies(){
		MovieDAO movies = new MovieDAO();
		return movies.getTopTenMovies();
	}
	
	public List<Movie> getMoviesOfSpecificStatus(int status){
		MovieDAO movies = new MovieDAO();
		return movies.getMoviesOfSpecificStatus(status);
	}
}
