package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.NapedDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */
@Entity
@Table(name = "naped", schema = "konfigurator")
public class NapedDAO extends BazowyPodzespol {

  private String zlacze;
  private String rodzaj;

  public String getZlacze() {
    return zlacze;
  }

  public void setZlacze(String zlacze) {
    this.zlacze = zlacze;
  }

  public String getRodzaj() {
    return rodzaj;
  }

  public void setRodzaj(String rodzaj) {
    this.rodzaj = rodzaj;
  }

  public NapedDTO podajDTO() {
    return null;
  }
}
