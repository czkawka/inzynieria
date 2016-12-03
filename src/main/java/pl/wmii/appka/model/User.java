package pl.wmii.appka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import pl.wmii.appka.model.dto.UserDTO;

@Entity
@Table(name="konfigurator.user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iduser")
	private int idUser;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "haslo")
	private String haslo;
	
	public UserDTO podajDTO() {
		UserDTO dto = new UserDTO();
		dto.setLogin(getLogin());
		dto.setHaslo(getHaslo());
		dto.setId(getIdUser());
		return dto; 
	}
	
	@Override
	public String toString() {
		return getLogin() + getHaslo() + getIdUser();
	}

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

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
}
