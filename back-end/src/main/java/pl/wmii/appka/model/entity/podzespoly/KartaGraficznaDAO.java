package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.KartaGraficznaDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */

@Entity
@Table(name = "kartaGraficzna", schema = "konfigurator")
public class KartaGraficznaDAO extends BazowyPodzespol {

  public KartaGraficznaDAO() {}

  private String rodzinaProduktów;
  private String nazwa;
  private int taktowanieRdzenia;
  private String rodzajPamieci;
  private int szynaPamieci;
  private String maxRozdzielczosc;
  private String zlacze;
  private String zlaczeZewnetrzne;

  public String getRodzinaProduktów() {
    return rodzinaProduktów;
  }

  public void setRodzinaProduktów(String rodzinaProduktów) {
    this.rodzinaProduktów = rodzinaProduktów;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public int getTaktowanieRdzenia() {
    return taktowanieRdzenia;
  }

  public void setTaktowanieRdzenia(int taktowanieRdzenia) {
    this.taktowanieRdzenia = taktowanieRdzenia;
  }

  public String getRodzajPamieci() {
    return rodzajPamieci;
  }

  public void setRodzajPamieci(String rodzajPamieci) {
    this.rodzajPamieci = rodzajPamieci;
  }

  public int getSzynaPamieci() {
    return szynaPamieci;
  }

  public void setSzynaPamieci(int szynaPamieci) {
    this.szynaPamieci = szynaPamieci;
  }

  public String getMaxRozdzielczosc() {
    return maxRozdzielczosc;
  }

  public void setMaxRozdzielczosc(String maxRozdzielczosc) {
    this.maxRozdzielczosc = maxRozdzielczosc;
  }

  public String getZlacze() {
    return zlacze;
  }

  public void setZlacze(String zlacze) {
    this.zlacze = zlacze;
  }

  public String getZlaczeZewnetrzne() {
    return zlaczeZewnetrzne;
  }

  public void setZlaczeZewnetrzne(String zlaczeZewnetrzne) {
    this.zlaczeZewnetrzne = zlaczeZewnetrzne;
  }

  public KartaGraficznaDTO podajDTO() {
    return null;
  }
}
