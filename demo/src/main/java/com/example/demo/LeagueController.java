package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import com.model.Team;


@Controller
public class LeagueController {

	@GetMapping("/leaguehomepage")
	public String league(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		// League league = new League();

		// get player info
		// Team a_team = new Team();
		// a_team.setTeam_name("Liverpool");

		// Team b_team = new Team();
		// b_team.setTeam_name("Chelsea");

		// Team c_team = new Team();
		// c_team.setTeam_name("Arsenal");

		// Team d_team = new Team();
		// d_team.setTeam_name("Man City");

		// ArrayList<Team> teams = new ArrayList<Team>();

		// teams.add(a_team);


		model.addAttribute("teams", "test");
		return "league";
	}

}