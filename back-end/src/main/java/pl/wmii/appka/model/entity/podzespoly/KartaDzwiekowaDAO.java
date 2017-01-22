package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.KartaDzwiekowaDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */

@Entity
@Table(name = "kartaDzwiekowa", schema = "konfigurator")
public class KartaDzwiekowaDAO extends BazowyPodzespol {

  public KartaDzwiekowaDAO() {}

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

  public KartaDzwiekowaDTO podajDTO() {
    return null;
  }
}
