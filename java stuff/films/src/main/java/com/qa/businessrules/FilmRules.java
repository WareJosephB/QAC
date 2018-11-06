package com.qa.businessrules;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.filmDBrepo;

public class FilmRules implements filmservices {

	@Inject
	private filmDBrepo repo;

	

	public String getAllFilms() {
		return repo.getAllFilms();

	}

	public String addFilm(String film) {
		if (film.contains("Harry Potter")){
			return "{\"message\": \"Sorry but all films in the Harry Potter series are banned\"}\"";
		}
		if (film.toLowerCase().contains("romantic comedy")) {
			return "{\"message\": \"Romantic Comedies are banned -Management\"}\""; 
		}
		if (film.contains("\"age_rating\":\"U\"")||film.contains("\"age_rating\":\"U\"")) {
			return "{\"message\": \"Watch a real film, you big baby\"}\"";
		}
		return repo.addFilm(film);
	}

	public String deleteFilm(Long id) {
		return repo.deleteFilm(id);
	}
	
	public String getFilm(Long id) {
		return repo.getFilm(id);
	}
}
