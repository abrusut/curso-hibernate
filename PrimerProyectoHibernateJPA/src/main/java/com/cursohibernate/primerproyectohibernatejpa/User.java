package com.cursohibernate.primerproyectohibernatejpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int id;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getUserMensagge() {
		return userMensagge;
	}


	public void setUserMensagge(String userMensagge) {
		this.userMensagge = userMensagge;
	}


	private String username;
	
	private String userMensagge;
	
	
	public User() {
		
	}
}
