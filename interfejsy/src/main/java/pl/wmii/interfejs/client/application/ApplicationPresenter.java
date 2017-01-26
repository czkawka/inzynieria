package pl.wmii.interfejs.client.application;

import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rest.client.RestCallback;
import com.gwtplatform.dispatch.rest.client.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.presenter.slots.PermanentSlot;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import pl.wmii.interfejs.client.application.formularze.Walidacja;
import pl.wmii.interfejs.client.application.naglowek.NaglowekPresenter;
import pl.wmii.interfejs.client.application.utlis.events.zmienkontekst.AppEvent;
import pl.wmii.interfejs.client.application.utlis.logger.AppLogger;
import pl.wmii.interfejs.client.place.NameTokens;
import pl.wmii.interfejs.client.rest.DaneService;

public class ApplicationPresenter extends Presenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy> implements ApplicationUiHandlers {
	
    interface MyView extends View, HasUiHandlers<ApplicationUiHandlers> {
    	void ustawTytulKontekstu(String tytul);
    }

    @ProxyStandard
    @NameToken(NameTokens.ROOT)
    interface MyProxy extends ProxyPlace<ApplicationPresenter> {
    }
    
    PlaceManager placeManager;

    public static final NestedSlot SLOT_MAIN = new NestedSlot();
    public static final PermanentSlot<NaglowekPresenter> SLOT_HEADER = new PermanentSlot<>();
    
    NaglowekPresenter naglowekPresenter;
    RestDispatch dispatcher;
    DaneService daneSerwis;

    @Inject
    ApplicationPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy,
            PlaceManager placeManager,
            RestDispatch dispatcher,
            DaneService daneSerwis,
            NaglowekPresenter naglowekPresenter) {
        super(eventBus, view, proxy, RevealType.Root);
        this.dispatcher = dispatcher;
        this.daneSerwis = daneSerwis;
        this.naglowekPresenter = naglowekPresenter;
        this.placeManager = placeManager;
        
        getView().setUiHandlers(this);
    }
  
    @Override
    protected void onBind() {
    	super.onBind();
    	
    	getEventBus().addHandler(AppEvent.TYPE, new AppEvent.AppEventZmienKontekst() {
			
			@Override
			public void onUstawKonetkst(AppEvent event) {
				AppLogger.debug("onUstawKonetkst " + event.getDane().getKontekst().getNameToken());
				ustawPresenterNaSlot(event.getDane().getKontekst().getNameToken().toString());
				getView().ustawTytulKontekstu(event.getDane().getKontekst().getTytulKontekstu().toString());
			}
		});
    	
    	setInSlot(SLOT_HEADER, naglowekPresenter);
    }
    
    @Override
    protected void onReveal() {
    	super.onReveal();
    	//testujPolaczenieDoServera();
    }
    
    private void testujPolaczenieDoServera() {
    	dispatcher.execute(daneSerwis.connectionTest(), new RestCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				AppLogger.error("Nie udalo sie polaczyc do servera");
			}
			
			@Override
			public void onSuccess(String result) {
				AppLogger.debug("Udalo sie polaczyc do servera" + result);
			}

			@Override
			public void setResponse(Response response) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
    public void prepareFromRequest(PlaceRequest request) {
    	super.prepareFromRequest(request);
    	if(czyTokenRootOrazBrakParametrow(request)) {
    		ustawPresenterNaSlot(NameTokens.UTWORZ_PC);
    		getView().ustawTytulKontekstu("Home");
    	}
    }
    
    private boolean czyTokenRootOrazBrakParametrow(PlaceRequest request) {
    	return request.getNameToken().equals(NameTokens.ROOT) && 
    			(request.getParameterNames().size() == 0);
    }
    
    private void ustawPresenterNaSlot(String nameToken) {
    	PlaceRequest request = new PlaceRequest
    			.Builder()
    			.nameToken(nameToken)
    			.build();
    	placeManager.revealPlace(request);
    }
    
}