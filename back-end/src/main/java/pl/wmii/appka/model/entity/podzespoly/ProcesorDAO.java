package pl.wmii.appka.model.entity.podzespoly;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */

@Entity
@Table(name = "procesor", schema = "konfigurator")
public class ProcesorDAO extends BazowyPodzespol {

  private int cache;
  private String socket;
  private Boolean igpu;
  private String kod;
  private int liczbaRdzeni;
  private int liczbaWatkow;
  private String obslugiwaneTechnologie;
  private String obslugaiwaneTypyRam;
  private Float taktowanie;
  private Float taktowanieTurbo;
  private int tdp;

  public int getCache() {
    return cache;
  }

  public void setCache(int cache) {
    this.cache = cache;
  }

  public String getSocket() {
    return socket;
  }

  public void setSocket(String socket) {
    this.socket = socket;
  }

  public Boolean getIgpu() {
    return igpu;
  }

  public void setIgpu(Boolean igpu) {
    this.igpu = igpu;
  }

  public String getKod() {
    return kod;
  }

  public void setKod(String kod) {
    this.kod = kod;
  }

  public int getLiczbaRdzeni() {
    return liczbaRdzeni;
  }

  public void setLiczbaRdzeni(int liczbaRdzeni) {
    this.liczbaRdzeni = liczbaRdzeni;
  }

  public int getLiczbaWatkow() {
    return liczbaWatkow;
  }

  public void setLiczbaWatkow(int liczbaWatkow) {
    this.liczbaWatkow = liczbaWatkow;
  }

  public String getObslugiwaneTechnologie() {
    return obslugiwaneTechnologie;
  }

  public void setObslugiwaneTechnologie(String obslugiwaneTechnologie) {
    this.obslugiwaneTechnologie = obslugiwaneTechnologie;
  }

  public String getObslugaiwaneTypyRam() {
    return obslugaiwaneTypyRam;
  }

  public void setObslugaiwaneTypyRam(String obslugaiwaneTypyRam) {
    this.obslugaiwaneTypyRam = obslugaiwaneTypyRam;
  }

  public Float getTaktowanie() {
    return taktowanie;
  }

  public void setTaktowanie(Float taktowanie) {
    this.taktowanie = taktowanie;
  }

  public Float getTaktowanieTurbo() {
    return taktowanieTurbo;
  }

  public void setTaktowanieTurbo(Float taktowanieTurbo) {
    this.taktowanieTurbo = taktowanieTurbo;
  }

  public int getTdp() {
    return tdp;
  }

  public void setTdp(int tdp) {
    this.tdp = tdp;
  }

  public ProcesorDAO podajDTO() {
    return null;
  }
}
