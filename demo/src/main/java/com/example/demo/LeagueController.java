package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Team;

import java.util.ArrayList;

@Controller
public class LeagueController {

	@GetMapping("/leaguehomepage")
	public String league(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

		// get player info
		Team a_team = new Team();
		a_team.setTeam_name("Liverpool");
		a_team.setWins(5);
		a_team.setLosses(2);

		Team b_team = new Team();
		b_team.setTeam_name("Chelsea");
		b_team.setWins(4);
		b_team.setLosses(3);

		Team c_team = new Team();
		c_team.setTeam_name("Arsenal");
		c_team.setWins(3);
		c_team.setLosses(4);

		Team d_team = new Team();
		d_team.setTeam_name("Man City");
		d_team.setWins(1);
		d_team.setLosses(6);

		ArrayList<Team> teams = new ArrayList<Team>();

		teams.add(a_team);
		teams.add(b_team);
		teams.add(c_team);
		teams.add(d_team);


		model.addAttribute("teams", teams);
		return "league";
	}

}