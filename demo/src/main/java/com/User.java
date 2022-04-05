package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
@Column
private String firstName;
@Column
private String lastName;
@Column
private String email;
@Column
@Id
private int id;
@Column
private String password;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
