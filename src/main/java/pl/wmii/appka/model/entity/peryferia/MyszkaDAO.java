package pl.wmii.appka.model.entity.peryferia;

import pl.wmii.appka.model.dto.MyszkaDTO;

import javax.persistence.*;

/**
 * Created by Damian on 03.12.2016.
 */

@Entity
@Table(name = "myszka", schema = "konfigurator")
public class MyszkaDAO {

  public MyszkaDAO() {}

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String rodzaj;
  private int iloscPrzyciskow;
  private int iloscRolek;
  private String kolor;
  private int dpi;
  private String urlMiniaturki;
  private String typPeryferi;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRodzaj() {
    return rodzaj;
  }

  public void setRodzaj(String rodzaj) {
    this.rodzaj = rodzaj;
  }

  public int getIloscPrzyciskow() {
    return iloscPrzyciskow;
  }

  public void setIloscPrzyciskow(int iloscPrzyciskow) {
    this.iloscPrzyciskow = iloscPrzyciskow;
  }

  public int getIloscRolek() {
    return iloscRolek;
  }

  public void setIloscRolek(int iloscRolek) {
    this.iloscRolek = iloscRolek;
  }

  public String getKolor() {
    return kolor;
  }

  public void setKolor(String kolor) {
    this.kolor = kolor;
  }

  public int getDpi() {
    return dpi;
  }

  public void setDpi(int dpi) {
    this.dpi = dpi;
  }

  public String getUrlMiniaturki() {
    return urlMiniaturki;
  }

  public void setUrlMiniaturki(String urlMiniaturki) {
    this.urlMiniaturki = urlMiniaturki;
  }

  public String getTypPeryferi() {
    return typPeryferi;
  }

  public void setTypPeryferi(String typPeryferi) {
    this.typPeryferi = typPeryferi;
  }

  public MyszkaDTO podajDTO() {
    return null;
  }
}
