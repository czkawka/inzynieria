package pl.wmii.interfejs.client.application.model;

/**
 * Created by Damian on 14.12.2016.
 */
public class DyskTwardyDTO extends BazowyPodzespolDTO{
  /**
	 * 
	 */
	private static final long serialVersionUID = -3088350388345691952L;
private String rodzaj;
  private int pojemnosc;
  private String interfejs;
  private int szybkoscOdczytu;
  private int szybkoscZapisu;
  private String format;

  public String getRodzaj() {
    return rodzaj;
  }

  public void setRodzaj(String rodzaj) {
    this.rodzaj = rodzaj;
  }

  public int getPojemnosc() {
    return pojemnosc;
  }

  public void setPojemnosc(int pojemnosc) {
    this.pojemnosc = pojemnosc;
  }

  public String getInterfejs() {
    return interfejs;
  }

  public void setInterfejs(String interfejs) {
    this.interfejs = interfejs;
  }

  public int getSzybkoscOdczytu() {
    return szybkoscOdczytu;
  }

  public void setSzybkoscOdczytu(int szybkoscOdczytu) {
    this.szybkoscOdczytu = szybkoscOdczytu;
  }

  public int getSzybkoscZapisu() {
    return szybkoscZapisu;
  }

  public void setSzybkoscZapisu(int szybkoscZapisu) {
    this.szybkoscZapisu = szybkoscZapisu;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }
}
