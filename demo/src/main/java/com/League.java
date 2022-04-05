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
