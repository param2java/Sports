package com.jeet.sports.service;

import java.util.List;

import com.jeet.sports.model.Sport;

public interface SportService {

	String saveSport(Sport sport);
	void deleteSport(String sportId);
	void updateSport(Sport sport);
	Sport getSportById (String sportId);
	List<Sport> getAllSports();
}
