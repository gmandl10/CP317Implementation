package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Player {
@Column
private Team teamName;
@Column
private int jersey_num;
@Column
private int gamesPlayed;
@Column
private int goals; 
@Column
private int assists;
@Column
private String firstName;
@Column 
private String lastname;
@Column
@Id
private int id;
public Team getTeamName() {
	return teamName;
}
public void setTeamName(Team teamName) {
	this.teamName = teamName;
}
public int getJersey_num() {
	return jersey_num;
}
public void setJersey_num(int jersey_num) {
	this.jersey_num = jersey_num;
}
public int getGamesPlayed() {
	return gamesPlayed;
}
public void setGamesPlayed(int gamesPlayed) {
	this.gamesPlayed = gamesPlayed;
}
public int getGoals() {
	return goals;
}
public void setGoals(int goals) {
	this.goals = goals;
}
public int getAssists() {
	return assists;
}
public void setAssists(int assists) {
	this.assists = assists;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
