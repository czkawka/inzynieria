package pl.wmii.interfejs.client.application.error;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import pl.wmii.interfejs.client.application.ApplicationPresenter;
import pl.wmii.interfejs.client.application.utlis.logger.AppLogger;
import pl.wmii.interfejs.client.place.NameTokens;

public class ErrorPresenter extends Presenter<ErrorPresenter.MyView, ErrorPresenter.MyProxy>
	implements ErrorUiHandler {

	public interface MyView extends View, HasUiHandlers<ErrorUiHandler>{
	}
	
	@ProxyStandard
	@NameToken(NameTokens.ERROR_PLACE)
	public interface MyProxy extends ProxyPlace<ErrorPresenter> {
	}
	
	@Inject
	public ErrorPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
		getView().setUiHandlers(this);
	}
	
	
	@Override
	protected void onReveal() {
		super.onReveal();
		AppLogger.debug("Witam");
		
	}
	
}
