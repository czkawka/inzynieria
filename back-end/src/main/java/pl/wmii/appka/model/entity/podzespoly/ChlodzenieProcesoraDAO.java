package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.ChlodzenieProcesoraDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */
@Entity
@Table(name = "chlodzenieProcesora", schema = "konfigurator")
public class ChlodzenieProcesoraDAO {

  public ChlodzenieProcesoraDAO() {}

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String obslugiwaneGniazda;
  private String obslugiwaneProcesory;
  private String wymiary;
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

  public String getWymiary() {
    return wymiary;
  }

  public void setWymiary(String wymiary) {
    this.wymiary = wymiary;
  }

  public String getObslugiwaneProcesory() {
    return obslugiwaneProcesory;
  }

  public void setObslugiwaneProcesory(String obslugiwaneProcesory) {
    this.obslugiwaneProcesory = obslugiwaneProcesory;
  }

  public String getObslugiwaneGniazda() {
    return obslugiwaneGniazda;
  }

  public void setObslugiwaneGniazda(String obslugiwaneGniazda) {
    this.obslugiwaneGniazda = obslugiwaneGniazda;
  }

  public ChlodzenieProcesoraDTO podajDTO() {
    return null;
  }
}
