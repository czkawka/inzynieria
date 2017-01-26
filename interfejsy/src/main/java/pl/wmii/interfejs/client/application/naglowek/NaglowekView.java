package pl.wmii.interfejs.client.application.naglowek;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import javax.inject.Inject;

import org.gwtbootstrap3.client.ui.AnchorListItem;
import org.gwtbootstrap3.client.ui.NavbarBrand;




public class NaglowekView extends ViewWithUiHandlers<NaglowekUiHandlers> implements NaglowekPresenter.MyView {

  interface Binder extends UiBinder<Widget, NaglowekView> {
  }
  
  @Inject
  NaglowekView(Binder uiBinder) {
    initWidget(uiBinder.createAndBindUi(this));
  }
  
  @UiField
  AnchorListItem utworzPc;
  
  @UiField
  AnchorListItem pomocButton;

  @UiField
  AnchorListItem dodajZestawButton;

  @UiField
  AnchorListItem porownajButton;
  
  @UiField
  NavbarBrand home;
  
  
  @UiHandler("home")
  public void onGoToHomeClick(ClickEvent e) {
	  getUiHandlers().onGoToHome();
  }
  
  
  @UiHandler("utworzPc")
  public void onUtworzPcClick(ClickEvent e) {
	  getUiHandlers().onUtworzPc();
  }
  
  @UiHandler("pomocButton") 
  public void onPomocClick(ClickEvent e) {
	  getUiHandlers().onGoToPomoc();
  }
  
  @UiHandler("dodajZestawButton")
  public void onUtworzZestawClick(ClickEvent e) {
	  getUiHandlers().onUtworzZestaw();
  }
  
  @UiHandler("porownajButton")
  public void onPorownajButtonClick(ClickEvent e) {
	  getUiHandlers().onPorownaj();
  }
  
}
