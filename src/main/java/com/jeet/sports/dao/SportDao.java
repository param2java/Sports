package com.jeet.sports.dao;

import java.util.List;

import com.jeet.sports.model.Sport;

public interface SportDao {

	String saveSport(Sport sport);
	void deleteSport(String sportId);
	void updateSport(Sport sport);
	Sport getSportById (String sportId);
	List<Sport> getAllSports();
}
