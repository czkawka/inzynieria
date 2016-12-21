package pl.wmii.appka.service.utils;

import java.util.List;

/**
 * Created by Damian on 16.12.2016.
 */
public class Walidacja {

  public static Boolean czyPuste(String napis) {
    return (napis == null) || (napis == "");
  }

  public static Boolean czyPuste(Object object) {
    return object == null;
  }

  public static Boolean czyPuste(List<?> lista) {
    return (lista.size() == 0) || (lista == null);
  }

}
