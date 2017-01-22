package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.ZasilaczDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */

@Entity
@Table(name = "zasilacz", schema = "konfigurator")
public class ZasilaczDAO extends BazowyPodzespol {

  public ZasilaczDAO(){}

  private String wymiary;

  private int moc;

  private String producnet;

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

  public String getProducnet() {
    return producnet;
  }

  public void setProducnet(String producnet) {
    this.producnet = producnet;
  }

  public ZasilaczDTO podajDTO() {
    return null;
  }
}
