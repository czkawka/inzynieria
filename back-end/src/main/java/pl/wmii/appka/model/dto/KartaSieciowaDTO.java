package pl.wmii.appka.model.dto;

/**
 * Created by Damian on 14.12.2016.
 */
public class KartaSieciowaDTO extends BazowyPodzespolDTO{
  private int architekrura;
  private int zlaczeZewnetrzne;
  private int zlacze;
  private String obslugiwaneProtokoly;
  private String obslugiwaneSystemy;
  private Boolean wakeOnLan;
  private String producent;
  private String cechyDodatkowe;
  private String typPodzespolu;

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

  @Override
  public String getProducent() {
    return producent;
  }

  @Override
  public void setProducent(String producent) {
    this.producent = producent;
  }

  @Override
  public String getCechyDodatkowe() {
    return cechyDodatkowe;
  }

  @Override
  public void setCechyDodatkowe(String cechyDodatkowe) {
    this.cechyDodatkowe = cechyDodatkowe;
  }

  @Override
  public String getTypPodzespolu() {
    return typPodzespolu;
  }

  @Override
  public void setTypPodzespolu(String typPodzespolu) {
    this.typPodzespolu = typPodzespolu;
  }
}
