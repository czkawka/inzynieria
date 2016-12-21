package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.ZasilaczDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */

@Entity
@Table(name = "zasilacz", schema = "konfigurator")
public class ZasilaczDAO {

  public ZasilaczDAO(){}

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  private String wymiary;

  private int moc;

  private String producnet;

  private String urlMiniaturki;

  private String cechyDodatkowe;

  private String typPodzespolu;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  public String getUrlMiniaturki() {
    return urlMiniaturki;
  }

  public void setUrlMiniaturki(String urlMiniaturki) {
    this.urlMiniaturki = urlMiniaturki;
  }

  public String getCechyDodatkowe() {
    return cechyDodatkowe;
  }

  public void setCechyDodatkowe(String cechyDodatkowe) {
    this.cechyDodatkowe = cechyDodatkowe;
  }

  public String getTypPodzespolu() {
    return typPodzespolu;
  }

  public void setTypPodzespolu(String typPodzespolu) {
    this.typPodzespolu = typPodzespolu;
  }

  public ZasilaczDTO podajDTO() {
    return null;
  }
}
