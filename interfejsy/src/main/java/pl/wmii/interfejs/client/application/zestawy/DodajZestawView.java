package pl.wmii.interfejs.client.application.zestawy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

/**
 * Created by Damian on 18.12.2016.
 */
public class DodajZestawView {
  interface DodajZestawViewUiBinder extends UiBinder<DivElement, DodajZestawView> {
  }

  private static DodajZestawViewUiBinder ourUiBinder = GWT.create(DodajZestawViewUiBinder.class);

  public DodajZestawView() {
    DivElement rootElement = ourUiBinder.createAndBindUi(this);
  }
}