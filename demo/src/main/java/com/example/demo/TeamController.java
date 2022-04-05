package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Calendar;

import com.Team;
import com.Player;
import com.Game;

@Controller
public class TeamController {

	@GetMapping("/team")
	//public String team(@RequestParam(name="name", required=true, defaultValue="Team1") String name, Model model) {
	public String team(@RequestParam("leagueid") String l_id, @RequestParam("teamid") String t_id, 
		Model model) {

		// get player info
		Team a_team = new Team();
		a_team.setTeam_name("Liverpool");

		Team b_team = new Team();
		b_team.setTeam_name("Chelsea");

		Team c_team = new Team();
		c_team.setTeam_name("Arsenal");

		Team d_team = new Team();
		d_team.setTeam_name("Man City");

		//setting the data (hard-coded)
		Player a_player = new Player();
		a_player.setFirstName("Jordan");
		a_player.setLastname("Henderson");
		a_player.setJersey_num(14);
		a_player.setGoals(2);
		a_player.setAssists(5);


		Player b_player = new Player();
		b_player.setFirstName("Sadio");
		b_player.setLastname("Mane");
		b_player.setJersey_num(10);
		b_player.setGoals(12);
		b_player.setAssists(1);


		Player c_player = new Player();
		c_player.setFirstName("Mohamed");
		c_player.setLastname("Salah");
		c_player.setJersey_num(11);
		c_player.setGoals(1);
		c_player.setAssists(0);


		//create a list of the players
		ArrayList<Player> players = new ArrayList<Player>();

		players.add(a_player);
		players.add(b_player);
		players.add(c_player);


		//get game info
		Game a_game = new Game();
		Game b_game = new Game();
		Game c_game = new Game();
		Game d_game = new Game();

		Calendar cal = Calendar.getInstance();
		cal.set(2022,3,2,13,0,0);

		a_game.setTeam2(b_team);
		a_game.setDate(cal.getTime());
		a_game.setLocation("Home");
		a_game.setResult("W 2-0");

		cal.set(2022,2,20,16,0,0);
		b_game.setTeam2(c_team);
		b_game.setDate(cal.getTime());
		b_game.setLocation("Away");
		b_game.setResult("W 5-2");

		
		cal.set(2022,2,16,20,30,0);
		c_game.setTeam2(d_team);
		c_game.setDate(cal.getTime());
		c_game.setLocation("Home");
		c_game.setResult("L 1-3");



		ArrayList<Game> games = new ArrayList<Game>();
		games.add(a_game);
		games.add(b_game);
		games.add(c_game);


		model.addAttribute("leagueid",l_id);
		model.addAttribute("teamid",t_id);
		model.addAttribute("teamName",a_team.getTeam_name());
		model.addAttribute("players", players);
		model.addAttribute("games",games);
		return "team";
	}

}
