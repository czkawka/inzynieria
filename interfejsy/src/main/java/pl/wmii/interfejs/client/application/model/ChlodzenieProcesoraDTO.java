package pl.wmii.interfejs.client.application.model;

/**
 * Created by Damian on 14.12.2016.
 */
public class ChlodzenieProcesoraDTO extends BazowyPodzespolDTO {

  /**
	 * 
	 */
	private static final long serialVersionUID = -4212762704263350271L;
private String obslugiwaneGniazda;
  private String obslugiwaneProcesory;
  private String wymiary;

  public String getObslugiwaneGniazda() {
    return obslugiwaneGniazda;
  }

  public void setObslugiwaneGniazda(String obslugiwaneGniazda) {
    this.obslugiwaneGniazda = obslugiwaneGniazda;
  }

  public String getObslugiwaneProcesory() {
    return obslugiwaneProcesory;
  }

  public void setObslugiwaneProcesory(String obslugiwaneProcesory) {
    this.obslugiwaneProcesory = obslugiwaneProcesory;
  }

  public String getWymiary() {
    return wymiary;
  }

  public void setWymiary(String wymiary) {
    this.wymiary = wymiary;
  }
}
