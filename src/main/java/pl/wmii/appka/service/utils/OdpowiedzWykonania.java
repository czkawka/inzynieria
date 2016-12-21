package pl.wmii.appka.service.utils;

import java.util.List;

/**
 * Created by Damian on 16.12.2016.
 */
public class OdpowiedzWykonania<T> {

  T obslugiwanyObiekt;
  List<Bledy> bledy;

  public OdpowiedzWykonania(T obslugiwanyObiekt) {
    this.obslugiwanyObiekt = obslugiwanyObiekt;
  }

}
