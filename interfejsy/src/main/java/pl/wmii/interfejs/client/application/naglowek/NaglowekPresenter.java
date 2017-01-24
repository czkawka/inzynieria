package pl.wmii.interfejs.client.application.naglowek;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import pl.wmii.interfejs.client.application.utlis.events.zmienkontekst.AppEvent;
import pl.wmii.interfejs.client.application.utlis.events.zmienkontekst.Kontekst;
import pl.wmii.interfejs.client.place.Konteksty;
import pl.wmii.interfejs.client.place.NameTokens;

public class NaglowekPresenter extends Presenter<NaglowekPresenter.MyView, NaglowekPresenter.MyProxy>
		implements NaglowekUiHandlers {
	public interface MyView extends View, HasUiHandlers<NaglowekUiHandlers> {
	}

	@ProxyStandard
	@NameToken(NameTokens.HEADER)
	public interface MyProxy extends ProxyPlace<NaglowekPresenter> {
	}

	@Inject
	NaglowekPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy);
		getView().setUiHandlers(this);
	}
	
	@Override
	protected void onReveal() {
		super.onReveal();
		fireEvent(new AppEvent(new Kontekst(Konteksty.KONTEKST_STRONA_DOMOWA)));
	}

}
