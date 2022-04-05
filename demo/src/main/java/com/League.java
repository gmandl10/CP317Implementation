package com;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class League {
@Id
@Column
private int id;
@Column
private String league_name;
@Column
private String sport;
@Column
private String location;
@Column
private String team_name;
@Column
private List<Team> teams;
@Column
private List<Game> games;
@Column
private Admin convenor;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTeam_name() {
	return team_name;
}
public void setTeam_name(String team_name) {
	this.team_name = team_name;
}

public void setLeague_name(String league_name) {
	this.league_name = league_name;
}
public String getLeague_name() {
	return this.league_name;
}
public void setSport(String sport) {
	this.sport = sport;
}
public String getSport() {
	return this.sport;
}
public void setLocation(String location) {
	this.location = location;
}
public String getLocation() {
	return this.location;
}
public List<Team> getTeams() {
	return teams;
}
public void setTeams(List<Team> teams) {
	this.teams = teams;
}
public List<Game> getGames() {
	return games;
}
public void setGames(List<Game> games) {
	this.games = games;
}
public User getConvenor() {
	return convenor;
}
public void setConvenor(Admin convenor) {
	this.convenor = convenor;
}
}
