package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.ChlodzenieProcesoraDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */
@Entity
@Table(name = "chlodzenieProcesora", schema = "konfigurator")
public class ChlodzenieProcesoraDAO extends BazowyPodzespol {

  public ChlodzenieProcesoraDAO() {}

  private String obslugiwaneGniazda;
  private String obslugiwaneProcesory;
  private String wymiary;

  public String getWymiary() {
    return wymiary;
  }

  public void setWymiary(String wymiary) {
    this.wymiary = wymiary;
  }

  public String getObslugiwaneProcesory() {
    return obslugiwaneProcesory;
  }

  public void setObslugiwaneProcesory(String obslugiwaneProcesory) {
    this.obslugiwaneProcesory = obslugiwaneProcesory;
  }

  public String getObslugiwaneGniazda() {
    return obslugiwaneGniazda;
  }

  public void setObslugiwaneGniazda(String obslugiwaneGniazda) {
    this.obslugiwaneGniazda = obslugiwaneGniazda;
  }

  public ChlodzenieProcesoraDTO podajDTO() {
    ChlodzenieProcesoraDTO dto = new ChlodzenieProcesoraDTO();

    return dto;
  }
}
