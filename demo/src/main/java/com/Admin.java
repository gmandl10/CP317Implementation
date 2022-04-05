package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
public class Admin extends User{
@Column
private League league;

public League getLeague() {
	return league;
}

public void setLeague(League league) {
	this.league = league;
}
}
