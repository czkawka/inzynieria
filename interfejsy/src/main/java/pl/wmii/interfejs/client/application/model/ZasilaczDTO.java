package pl.wmii.interfejs.client.application.model;

import java.io.Serializable;

/**
 * Created by Damian on 14.12.2016.
 */
public class ZasilaczDTO extends BazowyPodzespolDTO {
  /**
	 * 
	 */
	private static final long serialVersionUID = 8620865005284910874L;
private String wymiary;
  private int moc;

  public String getWymiary() {
    return wymiary;
  }

  public void setWymiary(String wymiary) {
    this.wymiary = wymiary;
  }

  public int getMoc() {
    return moc;
  }

  public void setMoc(int moc) {
    this.moc = moc;
  }
}
