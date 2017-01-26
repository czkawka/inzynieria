package pl.wmii.appka.model.entity;

import pl.wmii.appka.model.dto.KartaGraficznaDTO;
import pl.wmii.appka.model.entity.podzespoly.*;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Damian on 03.12.2016.
 */
@Entity
@Table(name = "komputer", schema = "konfigurator")
public class KomputerDAO extends BaseEntity{


  private Set<ChlodzenieProcesoraDAO> chlodzenia = new HashSet<ChlodzenieProcesoraDAO>(0);

  private Set<ObudowaDAO> obudowy;

  private Set<ZasilaczDAO> zasilacze;

  private Set<ProcesorDAO> procesory;

  private Set<PlytaGlownaDAO> plytyGlowne;

  private Set<PamiecRamDAO> pamieciRam;

  private Set<NapedDAO> napedy;

  private Set<KartaSieciowaDAO> siecowe;

  private Set<KartaGraficznaDAO> graficzne;

  private Set<KartaDzwiekowaDAO> dzwiekowe;

  private Set<DyskTwardyDAO> dyskiTwarde;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<ChlodzenieProcesoraDAO> getChlodzenia() {
    return chlodzenia;
  }

  public void setChlodzenia(Set<ChlodzenieProcesoraDAO> chlodzenia) {
    this.chlodzenia = chlodzenia;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<ObudowaDAO> getObudowy() {
    return obudowy;
  }

  public void setObudowy(Set<ObudowaDAO> obudowy) {
    this.obudowy = obudowy;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<ZasilaczDAO> getZasilacze() {
    return zasilacze;
  }

  public void setZasilacze(Set<ZasilaczDAO> zasilacze) {
    this.zasilacze = zasilacze;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<ProcesorDAO> getProcesory() {
    return procesory;
  }

  public void setProcesory(Set<ProcesorDAO> procesory) {
    this.procesory = procesory;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<PlytaGlownaDAO> getPlytyGlowne() {
    return plytyGlowne;
  }

  public void setPlytyGlowne(Set<PlytaGlownaDAO> plytyGlowne) {
    this.plytyGlowne = plytyGlowne;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<PamiecRamDAO> getPamieciRam() {
    return pamieciRam;
  }

  public void setPamieciRam(Set<PamiecRamDAO> pamieciRam) {
    this.pamieciRam = pamieciRam;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<NapedDAO> getNapedy() {
    return napedy;
  }

  public void setNapedy(Set<NapedDAO> napedy) {
    this.napedy = napedy;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<KartaSieciowaDAO> getSiecowe() {
    return siecowe;
  }

  public void setSiecowe(Set<KartaSieciowaDAO> siecowe) {
    this.siecowe = siecowe;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<KartaGraficznaDAO> getGraficzne() {
    return graficzne;
  }

  public void setGraficzne(Set<KartaGraficznaDAO> graficzne) {
    this.graficzne = graficzne;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<KartaDzwiekowaDAO> getDzwiekowe() {
    return dzwiekowe;
  }

  public void setDzwiekowe(Set<KartaDzwiekowaDAO> dzwiekowe) {
    this.dzwiekowe = dzwiekowe;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  public Set<DyskTwardyDAO> getDyskiTwarde() {
    return dyskiTwarde;
  }

  public void setDyskiTwarde(Set<DyskTwardyDAO> dyskiTwarde) {
    this.dyskiTwarde = dyskiTwarde;
  }
}
