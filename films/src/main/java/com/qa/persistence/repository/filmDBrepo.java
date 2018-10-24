package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Film;
//import com.qa.business.service.AccountService;
import com.qa.util.JSONUtil;
import com.qa.util.JSONUtil;

public class filmDBrepo implements DBrepo {
	
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String getAllFilms() {
		Query query = manager.createQuery("SELECT a from Film a");
		Collection<Film> films = (Collection<Film>) query.getResultList();
		return util.getJSONForObject(films);
	}

	public String getFilm(Long id) {
		Film film = findFilm(id);
		return (String) util.getJSONForObject(film);
		
	}
	
	@Transactional (REQUIRED)
	public String addFilm(String film) {
		Film aFilm = util.getObjectForJSON(film, Film.class);
		manager.persist(aFilm);
		return "{\"message\": \"film has been sucessfully added\"}";
	}

	
	@Transactional (REQUIRED)
	public String deleteFilm(Long id) {
		Film film = findFilm(id);
		if (film != null) {
			manager.remove(film);
		}
		return "{\"message\": \"film sucessfully deleted\"}";
	}
	
	private Film findFilm(Long id) {
		return manager.find(Film.class, id);
	}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	public void setUtil(JSONUtil util) {
		this.util = util;
	}

	
	
	
	
	

}
