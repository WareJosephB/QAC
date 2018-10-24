package com.qa.businessrules;

public interface filmservices {

	String getAllFilms();

	String addFilm(String account);

	String deleteFilm(Long id);
	
	String getFilm(Long id);

}