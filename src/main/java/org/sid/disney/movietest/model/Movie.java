package org.sid.disney.movietest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {

	private int id;
	private String name;
	private String targetAudience;
	private int status;
	
	public Movie() {
	}
	
	public Movie(int id, String name, String targetAudience, int status) {
		this.id = id;
		this.name = name;
		this.targetAudience = targetAudience;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
