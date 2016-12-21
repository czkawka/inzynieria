package pl.wmii.interfejs.client.application.pomoc;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rest.client.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import pl.wmii.interfejs.client.application.ApplicationPresenter;
import pl.wmii.interfejs.client.place.NameTokens;

public class PomocPresenter extends Presenter<PomocPresenter.MyView, PomocPresenter.MyProxy> implements PomocUiHandlers{
	public interface MyView extends View, HasUiHandlers<PomocUiHandlers> {
	}

	@ProxyStandard
	@NameToken(NameTokens.HELP)
	public interface MyProxy extends ProxyPlace<PomocPresenter> {
	}
	
	//public RestDispatch dispatch;
	
	@Inject
	public PomocPresenter(EventBus eventBus, MyView view, MyProxy proxy/*, RestDispatch dispatch*/) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
		//this.dispatch = dispatch;
	}
	
	
	
	@Override
	protected void onReveal() {
		super.onReveal();
		
		
	}
}
