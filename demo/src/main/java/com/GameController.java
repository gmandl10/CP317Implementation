package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Game;
import com.GameService;

@RestController
public class GameController {

@Autowired
GameService gameservice;

@GetMapping("/Game")
private List<Game> getAllGame()
{
	return gameservice.getAllGame();
}
@GetMapping("/Game/{id}")
private Game getGame(@PathVariable("id")int id) {
	return gameservice.getGameById(id);
}
@DeleteMapping("/Game/{id}")
private void deleteGame(@PathVariable("id") int id) {
	gameservice.delete(id);
}

@PostMapping("/Game")
private int saveGame(@RequestBody Game game) {
	gameservice.saveOrUpdate(game);
	return game.getId();
}

}
