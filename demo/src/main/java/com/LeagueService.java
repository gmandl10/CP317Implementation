package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.League;
<<<<<<< HEAD
import com.repository.LeagueRepository;
=======
import com.LeagueRepository;
>>>>>>> e3a3f8d5f8af758a28237b3c65385709d6139df7

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



