package pl.wmii.appka.model.entity.podzespoly;

import pl.wmii.appka.model.dto.PlytaGlownaDTO;

import javax.persistence.*;

/**
 * Created by Damian on 14.12.2016.
 */

@Entity
@Table(name = "plyta_glowna", schema = "konfigurator")
public class PlytaGlownaDAO extends BazowyPodzespol {


  public PlytaGlownaDTO podajDTO() {
    return null;
  }
}
