package pl.wmii.interfejs.client.application.porownywanie;

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

public class PorownajMainPresenter extends Presenter<PorownajMainPresenter.MyView, PorownajMainPresenter.MyProxy> 
implements PorownajMainUiHandler {
	public interface MyView extends View, HasUiHandlers<PorownajMainUiHandler>{}
	
	@ProxyStandard
	@NameToken(NameTokens.POROWANJ_ZESTAWY_MAIN)
	public interface MyProxy extends ProxyPlace<PorownajMainPresenter> {}
	
	@Inject
	public PorownajMainPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
	}
}
