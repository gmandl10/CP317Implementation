package com;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Game {
@Column
private Team team1;
@Column
private Team team2;
@Column
@Id
private int id;
@Column
private LocalTime time;
@Column 
private String location;
@Column
private Date date;
@Column
private String result; // assume team 1 vs team 2 so W 2-0 means team 1 won 2 points and team 2 loss
public Team getTeam1() {
	return team1;
}
public void setTeam1(Team team1) {
	this.team1 = team1;
}
public Team getTeam2() {
	return team2;
}
public void setTeam2(Team team2) {
	this.team2 = team2;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalTime getTime() {
	return time;
}
public void setTime(LocalTime time) {
	this.time = time;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
}
