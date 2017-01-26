package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.ObudowaDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */
@Entity
@Table(name = "obudowa", schema = "konfigurator")
public class ObudowaDAO extends BazowyPodzespol {

  private String dodatkoweCechy;
  private String kolor;
  private String rozmiaryPlyt;
  private String slotyRozszerzen;
  private int typ;
  private int wnekiDvd;
  private int wnekHdd;
  private String wymiary;
  private String zlacza;


  public String getDodatkoweCechy() {
    return dodatkoweCechy;
  }

  public void setDodatkoweCechy(String dodatkoweCechy) {
    this.dodatkoweCechy = dodatkoweCechy;
  }

  public String getKolor() {
    return kolor;
  }

  public void setKolor(String kolor) {
    this.kolor = kolor;
  }

  public String getSlotyRozszerzen() {
    return slotyRozszerzen;
  }

  public void setSlotyRozszerzen(String slotyRozszerzen) {
    this.slotyRozszerzen = slotyRozszerzen;
  }

  public String getRozmiaryPlyt() {
    return rozmiaryPlyt;
  }

  public void setRozmiaryPlyt(String rozmiaryPlyt) {
    this.rozmiaryPlyt = rozmiaryPlyt;
  }

  public int getTyp() {
    return typ;
  }

  public void setTyp(int typ) {
    this.typ = typ;
  }

  public int getWnekiDvd() {
    return wnekiDvd;
  }

  public void setWnekiDvd(int wnekiDvd) {
    this.wnekiDvd = wnekiDvd;
  }

  public int getWnekHdd() {
    return wnekHdd;
  }

  public void setWnekHdd(int wnekHdd) {
    this.wnekHdd = wnekHdd;
  }

  public String getWymiary() {
    return wymiary;
  }

  public void setWymiary(String wymiary) {
    this.wymiary = wymiary;
  }

  public String getZlacza() {
    return zlacza;
  }

  public void setZlacza(String zlacza) {
    this.zlacza = zlacza;
  }

  public ObudowaDTO podajDTO() {
    return null;
  }
}
