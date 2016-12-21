package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.KartaSieciowaDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */

@Entity
@Table(name = "kartaSieciowa", schema = "konfigurator")
public class KartaSieciowaDAO {

  public KartaSieciowaDAO() {}

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private int architekrura;
  private int zlaczeZewnetrzne;
  private int zlacze;
  private String obslugiwaneProtokoly;
  private String obslugiwaneSystemy;
  private Boolean wakeOnLan;
  private String producent;
  private String cechyDodatkowe;
  private String typPodzespolu;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getArchitekrura() {
    return architekrura;
  }

  public void setArchitekrura(int architekrura) {
    this.architekrura = architekrura;
  }

  public int getZlaczeZewnetrzne() {
    return zlaczeZewnetrzne;
  }

  public void setZlaczeZewnetrzne(int zlaczeZewnetrzne) {
    this.zlaczeZewnetrzne = zlaczeZewnetrzne;
  }

  public int getZlacze() {
    return zlacze;
  }

  public void setZlacze(int zlacze) {
    this.zlacze = zlacze;
  }

  public String getObslugiwaneProtokoly() {
    return obslugiwaneProtokoly;
  }

  public void setObslugiwaneProtokoly(String obslugiwaneProtokoly) {
    this.obslugiwaneProtokoly = obslugiwaneProtokoly;
  }

  public String getObslugiwaneSystemy() {
    return obslugiwaneSystemy;
  }

  public void setObslugiwaneSystemy(String obslugiwaneSystemy) {
    this.obslugiwaneSystemy = obslugiwaneSystemy;
  }

  public Boolean getWakeOnLan() {
    return wakeOnLan;
  }

  public void setWakeOnLan(Boolean wakeOnLan) {
    this.wakeOnLan = wakeOnLan;
  }

  public String getProducent() {
    return producent;
  }

  public void setProducent(String producent) {
    this.producent = producent;
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

  public KartaSieciowaDTO podajDTO() {
    return null;
  }
}
