package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.DyskTwardyDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */
@Entity
@Table(name = "dyskTwardy", schema = "konfigurator")
public class DyskTwardyDAO {

  public DyskTwardyDAO() {}

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String rodzaj;
  private int pojemnosc;
  private String interfejs;
  private int szybkoscOdczytu;
  private int szybkoscZapisu;
  private String format;
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

  public String getTypPodzespolu() {
    return typPodzespolu;
  }

  public void setTypPodzespolu(String typPodzespolu) {
    this.typPodzespolu = typPodzespolu;
  }

  public String getCechyDodatkowe() {
    return cechyDodatkowe;
  }

  public void setCechyDodatkowe(String cechyDodatkowe) {
    this.cechyDodatkowe = cechyDodatkowe;
  }

  public String getUrlMiniaturki() {
    return urlMiniaturki;
  }

  public void setUrlMiniaturki(String urlMiniaturki) {
    this.urlMiniaturki = urlMiniaturki;
  }

  public String getProducent() {
    return producent;
  }

  public void setProducent(String producent) {
    this.producent = producent;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public int getSzybkoscZapisu() {
    return szybkoscZapisu;
  }

  public void setSzybkoscZapisu(int szybkoscZapisu) {
    this.szybkoscZapisu = szybkoscZapisu;
  }

  public int getSzybkoscOdczytu() {
    return szybkoscOdczytu;
  }

  public void setSzybkoscOdczytu(int szybkoscOdczytu) {
    this.szybkoscOdczytu = szybkoscOdczytu;
  }

  public String getInterfejs() {
    return interfejs;
  }

  public void setInterfejs(String interfejs) {
    this.interfejs = interfejs;
  }

  public int getPojemnosc() {
    return pojemnosc;
  }

  public void setPojemnosc(int pojemnosc) {
    this.pojemnosc = pojemnosc;
  }

  public String getRodzaj() {
    return rodzaj;
  }

  public void setRodzaj(String rodzaj) {
    this.rodzaj = rodzaj;
  }

  public DyskTwardyDTO podajDTO() {
    return null;
  }
}
