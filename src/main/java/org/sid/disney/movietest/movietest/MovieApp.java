package org.sid.disney.movietest.movietest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sid.disney.movietest.model.Movie;
import org.sid.disney.movietest.services.MovieServices;

@Path("moviesapp")
public class MovieApp {

	MovieServices Service = new MovieServices();
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Movie> allMovies() {		
		return Service.getAllMovies();
	}
	
	
	@GET
	@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public String getMovie(@PathParam("id") int id) {
		Movie movie = Service.getMovie(id);
		return "Movie name = "+movie.getName()+ "\nTarget Audience = " + movie.getTargetAudience() + "\nStatus = "+movie.getStatus();
	}
	
	@GET
	@Path("/status/{status}")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Movie> specificStatusMovies(@PathParam("status") int status) {
		return Service.getMoviesOfSpecificStatus(status);
	}
	
	@GET
	@Path("/toptenmovies")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getTopTenMovies() {
		return Service.getTopTenMovies();
	}
	
}
