package com.qa.persistence.repository;

public interface DBrepo {

	String getAllFilms();
	String addFilm(String film);
	String deleteFilm(Long id);
	String getFilm(Long id);
	
}
