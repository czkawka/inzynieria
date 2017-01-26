package pl.wmii.interfejs.client.application.model;

/**
 * Created by Damian on 14.12.2016.
 */
public class KartaDzwiekowaDTO extends BazowyPodzespolDTO{
  /**
	 * 
	 */
	private static final long serialVersionUID = 3633513591964779806L;
private String interfejs;
  private String prubkowanie;
  private int czestotliwosc;
  private String zlacza;

  public String getInterfejs() {
    return interfejs;
  }

  public void setInterfejs(String interfejs) {
    this.interfejs = interfejs;
  }

  public String getPrubkowanie() {
    return prubkowanie;
  }

  public void setPrubkowanie(String prubkowanie) {
    this.prubkowanie = prubkowanie;
  }

  public int getCzestotliwosc() {
    return czestotliwosc;
  }

  public void setCzestotliwosc(int czestotliwosc) {
    this.czestotliwosc = czestotliwosc;
  }

  public String getZlacza() {
    return zlacza;
  }

  public void setZlacza(String zlacza) {
    this.zlacza = zlacza;
  }
}
