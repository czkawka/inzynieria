package pl.wmii.appka.model.dto;

/**
 * Created by Damian on 25.01.2017.
 */
public class NapedDTO extends BazowyPodzespolDTO {
  private String zlacze;
  private String rodzaj;

  public String getRodzaj() {
    return rodzaj;
  }

  public void setRodzaj(String rodzaj) {
    this.rodzaj = rodzaj;
  }

  public String getZlacze() {
    return zlacze;
  }

  public void setZlacze(String zlacze) {
    this.zlacze = zlacze;
  }
}
