package pl.wmii.interfejs.client.application.formularze.kartagraficzna;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import pl.wmii.interfejs.client.application.ApplicationPresenter;
import pl.wmii.interfejs.client.place.NameTokens;

public class DodajKarteGraficznaPresenter extends Presenter<DodajKarteGraficznaPresenter.MyView, DodajKarteGraficznaPresenter.MyProxy>
		implements DodajKartaGraficznaUiHandlers {
	public interface MyView extends View, HasUiHandlers<DodajKartaGraficznaUiHandlers> {
	}
	
	@ProxyStandard
	@NameToken(NameTokens.DODAJ_KARTA_GRAFICZNA)
	public interface MyProxy extends ProxyPlace<DodajKarteGraficznaPresenter> {
	}
	
	@Inject
	public DodajKarteGraficznaPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
		getView().setUiHandlers(this);
	}
	
}
