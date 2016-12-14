package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.KartaDzwiekowaDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */

@Entity
@Table(name = "kartaDzwiekowa", schema = "konfigurator")
public class KartaDzwiekowaDAO {

  public KartaDzwiekowaDAO() {}

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String interfejs;
  private String prubkowanie;
  private int czestotliwosc;
  private String zlacza;
  private String producent;
  private String urlMiniaturki;
  private String cechyDodatkowe;
  private String typPodzespolu;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  public String getProducent() {
    return producent;
  }

  public void setProducent(String producent) {
    this.producent = producent;
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

  public KartaDzwiekowaDTO podajDTO() {
    return null;
  }
}
