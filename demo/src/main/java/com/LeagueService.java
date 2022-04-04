package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.model.League;
import com.javatpoint.repository.LeagueRepository;

@Service
public class LeagueService {
@Autowired
LeagueRepository leagueRepository;

//getting all league records
public List<League> getAllLeague(){
	List<League> leagues = new ArrayList<League>();
	leagueRepository.findAll().forEach(league -> leagues.add(league));
	return leagues;
}
//getting a specific record
public League getLeagueById(int id)
{
	return leagueRepository.findById(id).get();
}
public void saveOrUpdate(League league) {
	leagueRepository.save(league);
}
//deleting a specific record
public void delete(int id) {
	leagueRepository.deleteById(id);
}
}



