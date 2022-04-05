package com;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table
public class Team {
@Column
private String team_name;
@Column
@Id
private int id; 
@Column
private List<Game> games;
@Column
private User manager;
@Column
private League league;
@Column
private List<Player> players;
@Column
private int wins;
@Column
private int losses;
@Column
private int draws;
public String getTeam_name() {
	return team_name;
}
public void setTeam_name(String team_name) {
	this.team_name = team_name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<Game> getGames() {
	return games;
}
public void setGames(List<Game> games) {
	this.games = games;
}
public User getManager() {
	return manager;
}
public void setManager(User manager) {
	this.manager = manager;
}
public League getLeague() {
	return league;
}
public void setLeague(League league) {
	this.league = league;
}
public List<Player> getPlayers() {
	return players;
}
public void setPlayers(List<Player> players) {
	this.players = players;
}
public int getWins() {
	return wins;
}
public void setWins(int wins) {
	this.wins = wins;
}
public int getLosses() {
	return losses;
}
public void setLosses(int losses) {
	this.losses = losses;
}
public int getDraws() {
	return draws;
}
public void setDraws(int draws) {
	this.draws = draws;
}
}
