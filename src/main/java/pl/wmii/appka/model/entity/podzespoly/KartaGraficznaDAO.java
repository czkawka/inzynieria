package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.KartaGraficznaDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */

@Entity
@Table(name = "kartaGraficzna", schema = "konfigurator")
public class KartaGraficznaDAO {

  public KartaGraficznaDAO() {}

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String rodzinaProduktów;
  private String nazwa;
  private int taktowanieRdzenia;
  private String rodzajPamieci;
  private int szynaPamieci;
  private String maxRozdzielczosc;
  private String zlacze;
  private String zlaczeZewnetrzne;
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

  public String getRodzinaProduktów() {
    return rodzinaProduktów;
  }

  public void setRodzinaProduktów(String rodzinaProduktów) {
    this.rodzinaProduktów = rodzinaProduktów;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
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

  public KartaGraficznaDTO podajDTO() {
    return null;
  }
}
