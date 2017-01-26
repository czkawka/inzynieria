package pl.wmii.interfejs.client.application.model;

/**
 * Created by Damian on 14.12.2016.
 */
public class KartaGraficznaDTO extends BazowyPodzespolDTO{
  /**
	 * 
	 */
	private static final long serialVersionUID = 6930953315666823655L;
private String rodzinaProduktów;
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
}
