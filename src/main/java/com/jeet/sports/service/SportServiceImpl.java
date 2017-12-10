package com.jeet.sports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeet.sports.dao.SportDao;
import com.jeet.sports.model.Sport;

@Service
public class SportServiceImpl implements SportService {

	@Autowired
	SportDao dao;

	@Transactional(readOnly = false)
	public String saveSport(Sport sport) {
		return dao.saveSport(sport);
	}

	@Transactional(readOnly = false)
	public void deleteSport(String sportId) {
		dao.deleteSport(sportId);
	}

	@Transactional(readOnly = false)
	public void updateSport(Sport sport) {
		dao.updateSport(sport);
	}

	public Sport getSportById(String sportId) {
		return dao.getSportById(sportId);
	}

	public List<Sport> getAllSports() {
		return dao.getAllSports();
	}

}
