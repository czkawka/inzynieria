package pl.wmii.interfejs.client.application.menu;

import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.Window;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import pl.wmii.interfejs.client.application.ApplicationPresenter;
import pl.wmii.interfejs.client.place.NameTokens;

/**
 * Created by Damian on 18.12.2016.
 */
public class MenuPresenter extends Presenter<MenuPresenter.MyView, MenuPresenter.Proxy> implements MenuUiHandlers {

	PlaceManager placeManager;

	private static final GeneratorMenu menu = new GeneratorMenu();

	private final ListDataProvider<ElementMenuDane> dataProvider = new ListDataProvider<>();

	@Override
	public void onSelectMenuItem(ElementMenuDane elementMenu) {
		PlaceRequest request = new PlaceRequest.Builder().nameToken(elementMenu.getPlace()).build();
		placeManager.revealPlace(request);
	}

	public interface MyView extends View, HasUiHandlers<MenuUiHandlers> {
		CellList<ElementMenuDane> podajCellListe();
		
		SingleSelectionModel<ElementMenuDane> podajSelectionModel();

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
		
	}
	

	
	@Override
	protected void onBind() {
		super.onBind();
		dodajMenuDoDataProvider();

	}

	protected void dodajMenuDoDataProvider() {
		dataProvider.setList(menu.podajListeElementow());
		dataProvider.addDataDisplay(getView().podajCellListe());
	}

}
