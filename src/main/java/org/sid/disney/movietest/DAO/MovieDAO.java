package org.sid.disney.movietest.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sid.disney.movietest.model.Movie;

public class MovieDAO {

	private static Map<Integer, Movie> movies = new HashMap<Integer, Movie>();
	
		public MovieDAO() { 

			movies.put(1, new Movie(1,"old dogs","GA",2));
			movies.put(2, new Movie(2,"Enchanted","GA",0));
			movies.put(3, new Movie(3,"BOLT","GA",1));
			movies.put(4, new Movie(4,"CHRONICLES OF NARNIA: PRINCE CASPIAN","GA",2));
			movies.put(5, new Movie(5,"BEDTIME STORIES","GA",2));
			movies.put(6, new Movie(6,"CONFESSIONS OF A SHOPAHOLIC","GA",2));
			movies.put(7, new Movie(7,"WALLE ","GA",1));
			movies.put(8, new Movie(8,"HIGH SCHOOL MUSICAL 3:SENIOR YEAR","GA",2));
			movies.put(9, new Movie(9,"COLLEGE ROAD TRIP","GA",2));
			movies.put(10, new Movie(10,"SWING VOTE","GA",2));
			movies.put(11, new Movie(11,"BEVERLY HILLS CHIHUAHUA","GA",2));
			movies.put(12, new Movie(12,"MIRACLE AT ST. ANNA","GA",2));
			movies.put(13, new Movie(13,"MORNING LIGHT","GA",2));
			movies.put(14, new Movie(14,"STEP UP 2 THE STREETS","GA",1));
			movies.put(15, new Movie(15,"CALENDAR GIRLS","GA",2));
			movies.put(16, new Movie(16,"UP","GA",2));
			movies.put(17, new Movie(17,"RACE TO WITCH MOUNTAIN","GA",2));
			movies.put(18, new Movie(18,"PRINCE OF PERSIA: THE SANDS OF TIME","GA",1));
			movies.put(19, new Movie(19,"CRIMSON WING, THE","GA",1));
			movies.put(20, new Movie(20,"PROPOSAL, THE","GA",2));
			movies.put(21, new Movie(21,"BRIDESHEAD REVISITED","GA",2));
			movies.put(22, new Movie(22,"G-FORCE","GA",2));
			movies.put(23, new Movie(23,"DISNEY'S A CHRISTMAS CAROL","GA",1));
			movies.put(24, new Movie(24,"PRINCESS AND THE FROG, THE","GA",1));
			movies.put(25, new Movie(25,"TOY STORY 2","GA",2));
			movies.put(26, new Movie(26,"TOY STORY 1","GA",2));
			movies.put(27, new Movie(27,"TOY STORY 3","GA",2));
			movies.put(28, new Movie(28,"HANNAH MONTANA MOVIE, THE ","GA",1));
			movies.put(29, new Movie(29,"SURROGATES","GA",1));
			movies.put(30, new Movie(30,"ANNAPOLIS","GA",2));

	}

	public void putMovie(Movie newMovie) {
		movies.put(movies.size()+1, newMovie);
	}
	
	public Movie getMovie(int id) {
		return movies.get(id);
	}
	
	public List<Movie> getTopTenMovies(){
		List<Movie> topTenMovies = new ArrayList<Movie>();
		for(int i=1;i<=10;i++) {
			topTenMovies.add(movies.get(i));
		}
		return topTenMovies;
	}

	public List<Movie> getMoviesOfSpecificStatus(int status){
		List<Movie> moviesOfSpecificStatus = new ArrayList<Movie>();
		for(int i=1;i<=movies.size();i++) {
			if(movies.get(i).getStatus()==status)
				moviesOfSpecificStatus.add(movies.get(i));
		}
		return moviesOfSpecificStatus;
	}
	
	public List<Movie> getAllMovies() {
		return new ArrayList<Movie>(movies.values());
	}	
}
