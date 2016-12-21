package pl.wmii.interfejs.client.application.formularze;

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

public class FormularzPresenter extends Presenter<FormularzPresenter.MyView, FormularzPresenter.MyProxy> implements FormularzUiHandlers {
	
	public interface MyView extends View, HasUiHandlers<FormularzUiHandlers> {
	}
	
	@ProxyStandard
	@NameToken(NameTokens.FORM)
	public interface MyProxy extends ProxyPlace<FormularzPresenter> {
		
	}
	
	@Inject
	FormularzPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
		
		getView().setUiHandlers(this);
	}

}
