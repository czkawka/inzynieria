package pl.wmii.appka.model.dto;

import java.io.Serializable;

public class UserDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String login;
	private String haslo;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getHaslo() {
		return haslo;
	}
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
