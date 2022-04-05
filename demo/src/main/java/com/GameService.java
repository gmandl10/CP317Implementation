package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Game;
import com.GameRepository;

@Service
public class GameService {
@Autowired
GameRepository gameRepository;

//getting all game records
public List<Game> getAllGame(){
	List<Game> games = new ArrayList<Game>();
	gameRepository.findAll().forEach(game -> games.add(game));
	return games;
}
//getting a specific record
public Game getGameById(int id)
{
	return gameRepository.findById(id).get();
}
public void saveOrUpdate(Game game) {
	gameRepository.save(game);
}
//deleting a specific record
public void delete(int id) {
	gameRepository.deleteById(id);
}
}



