package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.businessrules.FilmRules;

@Path("/film")
public class FilmEndpoint {

	@Inject
	private FilmRules service;

	@Path("/getAllFilms")
	@GET
	@Produces({ "application/json" })
	public String getAllFilms() {
		return service.getAllFilms();
	}

	@Path("/addFilm")
	@POST
	@Produces({ "application/json" })
	public String addFilm(String Film) {
		return service.addFilm(Film);
	}

	@Path("/deleteFilm/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteFilm(@PathParam("id") Long id) {
		return service.deleteFilm(id);
	}

	public void setService(FilmRules service) {
		this.service = service;
	}

	@Path("/getFilm/{id}")
	@POST
	@Produces({ "application/json" })
	public String getFilm(@PathParam("id") Long id) {
		return service.getFilm(id);

	}
}
