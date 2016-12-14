package pl.wmii.appka.model.entity;

import pl.wmii.appka.model.dto.UzytkownikDTO;

import javax.persistence.*;

/**
 * Created by Damian on 03.12.2016.
 */

@Entity
@Table(name = "konfigurator.uzytkownik")
public class UzytkownikDAO {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idUzytkownika")
  private int idUzytkownika;

  @Column(name = "login")
  private String login;

  @Column(name = "imiona")
  private String imiona;

  @Column(name = "nazwisko")
  private String nazwisko;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getImiona() {
    return imiona;
  }

  public void setImiona(String imiona) {
    this.imiona = imiona;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public int getIdUzytkownika() { return idUzytkownika; }

  public UzytkownikDTO podajDTO() {
    UzytkownikDTO dto = new UzytkownikDTO();
    dto.setIdUzytkownika(idUzytkownika);
    dto.setImiona(imiona);
    dto.setLogin(login);
    dto.setNazwisko(nazwisko);
    return dto;
  }
}
