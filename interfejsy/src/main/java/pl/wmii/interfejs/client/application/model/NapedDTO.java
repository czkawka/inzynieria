package pl.wmii.interfejs.client.application.model;

/**
 * Created by Damian on 25.01.2017.
 */
public class NapedDTO extends BazowyPodzespolDTO {
  /**
	 * 
	 */
	private static final long serialVersionUID = 9150867667229549504L;
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
