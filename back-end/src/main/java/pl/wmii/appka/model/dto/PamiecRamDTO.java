package pl.wmii.appka.model.dto;

/**
 * Created by Damian on 14.12.2016.
 */
public class PamiecRamDTO extends BazowyPodzespolDTO {
  private String rodzaj;
  private int predkosc;
  private int pojemnosc;
  private String opoznienie;
  private Double napiecie;

  public String getRodzaj() {
    return rodzaj;
  }

  public void setRodzaj(String rodzaj) {
    this.rodzaj = rodzaj;
  }

  public int getPredkosc() {
    return predkosc;
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
}
