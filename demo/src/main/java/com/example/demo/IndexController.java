package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Calendar;

import com.Team;
import com.Player;
import com.Game;
import com.League;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(Model model) {

		League a_league = new League();
		League b_league = new League();
		League c_league = new League();

		a_league.setLeague_name("League 1");
		b_league.setLeague_name("League 2");
		c_league.setLeague_name("League 3");

		a_league.setSport("Soccer");
		b_league.setSport("Hockey");
		c_league.setSport("Basketball");

		a_league.setLocation("Waterloo, ON");
		b_league.setLocation("Kitchener, ON");
		c_league.setLocation("Cambridge, ON");

		a_league.setId(1);
		b_league.setId(2);
		c_league.setId(3);

		ArrayList<League> leagues = new ArrayList<League>();

		leagues.add(a_league);
		leagues.add(b_league);
		leagues.add(c_league);

		model.addAttribute("leagues",leagues);
		return "index";
	}

}
