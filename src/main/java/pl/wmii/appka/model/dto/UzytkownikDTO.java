package pl.wmii.appka.model.dto;


/**
 * Created by Damian on 05.12.2016.
 */
public class UzytkownikDTO extends BaseDTO {

  private Long idUzytkownika;
  private String login;
  private String imiona;
  private String nazwisko;


  public Long getIdUzytkownika() {
    return idUzytkownika;
  }

  public void setIdUzytkownika(Long idUzytkownika) {
    this.idUzytkownika = idUzytkownika;
  }

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
}
