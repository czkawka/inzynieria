package pl.wmii.interfejs.client.application.menu;


import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.RootPresenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import pl.wmii.interfejs.client.application.ApplicationPresenter;
import pl.wmii.interfejs.client.place.NameTokens;

import java.util.ArrayList;
import java.util.List;

import org.gwtbootstrap3.client.ui.Icon;
import org.gwtbootstrap3.client.ui.constants.IconType;

/**
 * Created by Damian on 18.12.2016.
 */
public class MenuPresenter extends Presenter<MenuPresenter.MyView, MenuPresenter.Proxy> implements MenuUiHandlers {

  PlaceManager placeManager;

  @Override
  public void onSelectMenuItem(ElementMenu elementMenu) {
	  PlaceRequest request = new PlaceRequest.Builder().nameToken(elementMenu.getPlace()).build();
	  placeManager.revealPlace(request);
  }

  public interface MyView extends View, HasUiHandlers<MenuUiHandlers> {
    CellList<ElementMenu> podajCellListe();
  }

  @ProxyStandard
  @NameToken(NameTokens.MAIN_MENU)
  public interface Proxy extends ProxyPlace<MenuPresenter> {
  }

  @Inject
  public MenuPresenter(EventBus eventBus, MyView view, Proxy proxy, PlaceManager placeManager) {
    super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
    getView().setUiHandlers(this);

    this.placeManager = placeManager;
  }

  @Override
  protected void onReveal() {
    getView().podajCellListe().setRowData(0, utworzMenu());
  }

  protected List<ElementMenu> utworzMenu() {
    List<ElementMenu> list = new ArrayList<ElementMenu>();

    list.add(new ElementMenu(IconType.HOME,NameTokens.HOME,"Home","Home"));
    list.add(new ElementMenu(IconType.PLUS,NameTokens.FORM,"Dodaj Zestaw","Dodaj Zestaw"));
    list.add(new ElementMenu(IconType.PLUS,NameTokens.DODAJ_KARTA_GRAFICZNA,"Dodaj Podzespol","Dodaj Podzespol"));
    list.add(new ElementMenu(IconType.QUESTION_CIRCLE,NameTokens.HELP,"Pomoc","Pomoc"));
    
    return list;
  }
}
