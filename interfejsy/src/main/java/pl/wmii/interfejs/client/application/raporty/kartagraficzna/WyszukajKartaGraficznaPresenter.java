package pl.wmii.interfejs.client.application.raporty.kartagraficzna;

import java.util.ArrayList;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.view.client.ListDataProvider;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import pl.wmii.interfejs.client.application.ApplicationPresenter;
import pl.wmii.interfejs.client.application.model.KartaGraficznaDTO;
import pl.wmii.interfejs.client.place.NameTokens;

public class WyszukajKartaGraficznaPresenter
		extends Presenter<WyszukajKartaGraficznaPresenter.MyView, WyszukajKartaGraficznaPresenter.MyProxy>
		implements WyszukajKartaGraficznaUiHandlers {
	public interface MyView extends View, HasUiHandlers<WyszukajKartaGraficznaUiHandlers> {
		CellTable<KartaGraficznaDTO> podajCellTable();
	}
	
	ListDataProvider<KartaGraficznaDTO> dataProvider;

	@ProxyStandard
	@NameToken(NameTokens.WYSZUKAJ_KARTY_GRAFICZNE)
	public interface MyProxy extends ProxyPlace<WyszukajKartaGraficznaPresenter> {
	}

	@Inject
	public WyszukajKartaGraficznaPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
		getView().setUiHandlers(this);
	}
	
	@Override
	protected void onBind() {
		// TODO Auto-generated method stub
		super.onBind();
		utworzListy();
	}
	
	public void utworzListy() {
		dataProvider = new ListDataProvider<>();
	}
	
	@Override
	protected void onReveal() {
		super.onReveal();
		
		dataProvider.getList().add(new KartaGraficznaDTO());
		dataProvider.getList().add(new KartaGraficznaDTO());
		dataProvider.getList().add(new KartaGraficznaDTO());
		dataProvider.getList().add(new KartaGraficznaDTO());
		dataProvider.addDataDisplay(getView().podajCellTable());
	}

}
