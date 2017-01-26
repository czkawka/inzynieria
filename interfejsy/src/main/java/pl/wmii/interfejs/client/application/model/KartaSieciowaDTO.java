package pl.wmii.interfejs.client.application.model;

/**
 * Created by Damian on 14.12.2016.
 */
public class KartaSieciowaDTO extends BazowyPodzespolDTO{
  /**
	 * 
	 */
	private static final long serialVersionUID = 233144788279394103L;
private int architekrura;
  private int zlaczeZewnetrzne;
  private int zlacze;
  private String obslugiwaneProtokoly;
  private String obslugiwaneSystemy;
  private Boolean wakeOnLan;

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

}
