package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.PamiecRamDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */
@Entity
@Table(name = "pamiecRam", schema = "konfigurator")
public class PamiecRamDAO {

  public PamiecRamDAO() {}

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String rodzaj;
  private int predkosc;
  private int pojemnosc;
  private String opoznienie;
  private Double napiecie;
  private String producent;
  private String urlMiniaturki;
  private String cechyDodatkowe;
  private String typPodzespolu;

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

  public int getPredkosc() {
    return predkosc;
  }

  public void setPredkosc(int predkosc) {
    this.predkosc = predkosc;
  }

  public int getPojemnosc() {
    return pojemnosc;
  }

  public void setPojemnosc(int pojemnosc) {
    this.pojemnosc = pojemnosc;
  }

  public String getOpoznienie() {
    return opoznienie;
  }

  public void setOpoznienie(String opoznienie) {
    this.opoznienie = opoznienie;
  }

  public Double getNapiecie() {
    return napiecie;
  }

  public void setNapiecie(Double napiecie) {
    this.napiecie = napiecie;
  }

  public String getProducent() {
    return producent;
  }

  public void setProducent(String producent) {
    this.producent = producent;
  }

  public String getUrlMiniaturki() {
    return urlMiniaturki;
  }

  public void setUrlMiniaturki(String urlMiniaturki) {
    this.urlMiniaturki = urlMiniaturki;
  }

  public String getCechyDodatkowe() {
    return cechyDodatkowe;
  }

  public void setCechyDodatkowe(String cechyDodatkowe) {
    this.cechyDodatkowe = cechyDodatkowe;
  }

  public String getTypPodzespolu() {
    return typPodzespolu;
  }

  public void setTypPodzespolu(String typPodzespolu) {
    this.typPodzespolu = typPodzespolu;
  }

  public PamiecRamDTO podajDTO() {
    return null;
  }
}
