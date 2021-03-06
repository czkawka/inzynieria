package pl.wmii.appka.model.entity.peryferia;

import pl.wmii.appka.model.dto.KlawiaturaDTO;

import javax.persistence.*;

/**
 * Created by Damian on 03.12.2016.
 */
@Entity
@Table(name = "klawiatura", schema = "konfigurator")
public class KlawiaturaDAO extends BazowePeryferia {

  public KlawiaturaDAO() {}

  private String zlacze;
  private int iloscKlawiszy;
  private String kolor;
  private String rodzaj;
  private String rodzajPeryferi;

  public String getZlacze() {
    return zlacze;
  }

  public void setZlacze(String zlacze) {
    this.zlacze = zlacze;
  }

  public int getIloscKlawiszy() {
    return iloscKlawiszy;
  }

  public void setIloscKlawiszy(int iloscKlawiszy) {
    this.iloscKlawiszy = iloscKlawiszy;
  }

  public String getKolor() {
    return kolor;
  }

  public void setKolor(String kolor) {
    this.kolor = kolor;
  }

  public String getRodzajPeryferi() {
    return rodzajPeryferi;
  }

  public void setRodzajPeryferi(String rodzajPeryferi) {
    this.rodzajPeryferi = rodzajPeryferi;
  }

  public String getRodzaj() {
    return rodzaj;
  }

  public void setRodzaj(String rodzaj) {
    this.rodzaj = rodzaj;
  }

  public KlawiaturaDTO podajDTO() {
    return null;
  }
}
