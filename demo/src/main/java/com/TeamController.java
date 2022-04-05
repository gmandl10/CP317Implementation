package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Team;
import com.TeamService;

@RestController
public class TeamController {

@Autowired
TeamService teamservice;

@GetMapping("/Team")
private List<Team> getAllTeam()
{
	return teamservice.getAllTeam();
}
@GetMapping("/Team/{id}")
private Team getTeam(@PathVariable("id")int id) {
	return teamservice.getTeamById(id);
}
@DeleteMapping("/Team/{id}")
private void deleteTeam(@PathVariable("id") int id) {
	teamservice.delete(id);
}
@PostMapping("/Team")
private int saveTeam(@RequestBody Team team) {
	teamservice.saveOrUpdate(team);
	return team.getId();
}

}
