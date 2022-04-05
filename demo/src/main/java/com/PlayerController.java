package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Player;
import com.PlayerService;



@RestController
public class PlayerController {

@Autowired
PlayerService playerservice;

@GetMapping("/Player")
private List<Player> getAllPlayer()
{
	return playerservice.getAllPlayer();
}
@GetMapping("/Player/{id}")
private Player getPlayer(@PathVariable("id")int id) {
	return playerservice.getPlayerById(id);
}

@DeleteMapping("/Player/{id}")
private void deletePlayer(@PathVariable("id") int id) {
	playerservice.delete(id);
}

@PostMapping("/Player")
private int savePlayer(@RequestBody Player player) {
	playerservice.saveOrUpdate(player);
	return player.getId();
}

}
