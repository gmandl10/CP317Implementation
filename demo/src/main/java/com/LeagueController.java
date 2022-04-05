package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.League;
import com.LeagueService;

@RestController
public class LeagueController {

@Autowired
LeagueService leagueservice;

@GetMapping("/League")
private List<League> getAllLeague()
{
	return leagueservice.getAllLeague();
}
@GetMapping("/League/{id}")
private League getLeague(@PathVariable("id")int id) {
	return leagueservice.getLeagueById(id);
}
@DeleteMapping("/League/{id}")
private void deleteLeague(@PathVariable("id") int id) {
	leagueservice.delete(id);
}

//creating post mapping that post the student detail to the database
@PostMapping("/league")
private int saveLeague(@RequestBody League league) {
	leagueservice.saveOrUpdate(league);
	return league.getId();
}

}
