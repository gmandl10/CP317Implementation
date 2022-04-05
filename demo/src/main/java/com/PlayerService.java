package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Player;
import com.PlayerRepository;

@Service
public class PlayerService {
@Autowired
PlayerRepository playerRepository;

//getting all player records
public List<Player> getAllPlayer(){
	List<Player> players = new ArrayList<Player>();
	playerRepository.findAll().forEach(player -> players.add(player));
	return players;
}
//getting a specific record
public Player getPlayerById(int id)
{
	return playerRepository.findById(id).get();
}
public void saveOrUpdate(Player player) {
	playerRepository.save(player);
}
//deleting a specific record
public void delete(int id) {
	playerRepository.deleteById(id);
}
}



