package com.jeet.sports.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jeet.sports.model.Sport;

@Repository
public class SportDaoImpl implements SportDao {

	@Autowired
	HibernateTemplate ht;
	
	public String saveSport(Sport sport) {
		return (String) ht.save(sport);
	}

	public void deleteSport(String sportId) {
		ht.delete(new Sport(sportId));
	}

	public void updateSport(Sport sport) {
		ht.update(sport);
	}

	public Sport getSportById(String sportId) {
		return ht.get(Sport.class, sportId);
	}

	public List<Sport> getAllSports() {
		return ht.loadAll(Sport.class);
	}

}
