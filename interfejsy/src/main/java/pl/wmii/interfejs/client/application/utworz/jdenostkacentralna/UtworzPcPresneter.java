package pl.wmii.interfejs.client.application.utworz.jdenostkacentralna;

import org.gwtbootstrap3.client.ui.NavTabs;

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

public class UtworzPcPresneter extends Presenter<UtworzPcPresneter.MyView, UtworzPcPresneter.MyProxy> implements UtworzPcUiHandlers {
	
	public interface MyView extends View, HasUiHandlers<UtworzPcUiHandlers>{
	}
	
	@ProxyStandard
	@NameToken(NameTokens.UTWORZ_PC)
	public interface MyProxy extends ProxyPlace<UtworzPcPresneter> {
	}
	
	@Inject
	public UtworzPcPresneter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
		getView().setUiHandlers(this);
	}
	

}
