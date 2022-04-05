package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Team;
import com.TeamRepository;

@Service
public class TeamService {
@Autowired
TeamRepository teamRepository;

//getting all team records
public List<Team> getAllTeam(){
	List<Team> teams = new ArrayList<Team>();
	teamRepository.findAll().forEach(team -> teams.add(team));
	return teams;
}
//getting a specific record
public Team getTeamById(int id)
{
	return teamRepository.findById(id).get();
}
public void saveOrUpdate(Team team) {
	teamRepository.save(team);
}
//deleting a specific record
public void delete(int id) {
	teamRepository.deleteById(id);
}
}



