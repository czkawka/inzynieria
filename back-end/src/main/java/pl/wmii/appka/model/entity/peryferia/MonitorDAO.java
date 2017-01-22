package pl.wmii.appka.model.entity.peryferia;

import pl.wmii.appka.model.dto.MonitorDTO;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Damian on 03.12.2016.
 */
@Entity
@Table(name = "monitory", schema = "konfigurator")
public class MonitorDAO extends BazowePeryferia {

  private int czasReakcji;
  private String format;
  private int jasnosc;
  private int katWidzeniaPoziom;
  private int katwidziWidzeniaPion;
  private String liczbaKolorow;
  private String matryca;
  private int poborMocy;
  private Float przekatna;
  private String rozdzielczosc;
  private String zlacza;

  public int getCzasReakcji() {
    return czasReakcji;
  }

  public void setCzasReakcji(int czasReakcji) {
    this.czasReakcji = czasReakcji;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public int getJasnosc() {
    return jasnosc;
  }

  public void setJasnosc(int jasnosc) {
    this.jasnosc = jasnosc;
  }

  public int getKatWidzeniaPoziom() {
    return katWidzeniaPoziom;
  }

  public void setKatWidzeniaPoziom(int katWidzeniaPoziom) {
    this.katWidzeniaPoziom = katWidzeniaPoziom;
  }

  public int getKatwidziWidzeniaPion() {
    return katwidziWidzeniaPion;
  }

  public void setKatwidziWidzeniaPion(int katwidziWidzeniaPion) {
    this.katwidziWidzeniaPion = katwidziWidzeniaPion;
  }

  public String getLiczbaKolorow() {
    return liczbaKolorow;
  }

  public void setLiczbaKolorow(String liczbaKolorow) {
    this.liczbaKolorow = liczbaKolorow;
  }

  public String getMatryca() {
    return matryca;
  }

  public void setMatryca(String matryca) {
    this.matryca = matryca;
  }

  public int getPoborMocy() {
    return poborMocy;
  }

  public void setPoborMocy(int poborMocy) {
    this.poborMocy = poborMocy;
  }

  public Float getPrzekatna() {
    return przekatna;
  }

  public void setPrzekatna(Float przekatna) {
    this.przekatna = przekatna;
  }

  public String getRozdzielczosc() {
    return rozdzielczosc;
  }

  public void setRozdzielczosc(String rozdzielczosc) {
    this.rozdzielczosc = rozdzielczosc;
  }

  public String getZlacza() {
    return zlacza;
  }

  public void setZlacza(String zlacza) {
    this.zlacza = zlacza;
  }

  public MonitorDTO podajDTO() { return null;
  }
}
