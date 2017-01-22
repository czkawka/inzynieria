package pl.wmii.appka.model.entity.peryferia;

import pl.wmii.appka.model.entity.BaseEntity;

import javax.persistence.MappedSuperclass;

/**
 * Created by Damian on 17.01.2017.
 */
@MappedSuperclass
public abstract class BazowePeryferia extends BaseEntity {

  private String typPeryferii;
  private String urlMiniaturki;
  private String producent;

  public String getTypPeryferii() {
    return typPeryferii;
  }

  public void setTypPeryferii(String typPeryferii) {
    this.typPeryferii = typPeryferii;
  }

  public String getUrlMiniaturki() {
    return urlMiniaturki;
  }

  public void setUrlMiniaturki(String urlMiniaturki) {
    this.urlMiniaturki = urlMiniaturki;
  }

  public String getProducent() {
    return producent;
  }

  public void setProducent(String producent) {
    this.producent = producent;
  }
}
