package pl.wmii.interfejs.client.application.error;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import pl.wmii.interfejs.client.place.NameTokens;

public class ErrorPresenter extends Presenter<ErrorPresenter.MyView, ErrorPresenter.MyProxy>{

	public interface MyView extends View {
	}
	
	@ProxyStandard
	@NameToken(NameTokens.ERROR_PLACE)
	public
	interface MyProxy extends ProxyPlace<ErrorPresenter> {
	}
	
	@Inject
	public ErrorPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy);
	}
	
}
