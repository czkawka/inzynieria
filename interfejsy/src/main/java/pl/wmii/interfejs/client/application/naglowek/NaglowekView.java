package pl.wmii.interfejs.client.application.naglowek;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import javax.inject.Inject;




public class NaglowekView extends ViewWithUiHandlers<NaglowekUiHandlers> implements NaglowekPresenter.MyView {

  interface Binder extends UiBinder<Widget, NaglowekView> {
  }
  
  
  

  @Inject
  NaglowekView(Binder uiBinder) {
    initWidget(uiBinder.createAndBindUi(this));
  }
}
