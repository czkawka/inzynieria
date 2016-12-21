package pl.wmii.interfejs.client.application;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.presenter.slots.NestedSlot;
import com.gwtplatform.mvp.client.presenter.slots.PermanentSlot;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.Proxy;

import pl.wmii.interfejs.client.application.menu.MenuPresenter;
import pl.wmii.interfejs.client.application.naglowek.NaglowekPresenter;

public class ApplicationPresenter extends Presenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy> implements ApplicationUiHandlers {
	
    interface MyView extends View, HasUiHandlers<ApplicationUiHandlers> {
    }

    @ProxyStandard
    interface MyProxy extends Proxy<ApplicationPresenter> {
    }
    
    PlaceManager placeManager;

    public static final NestedSlot SLOT_MAIN = new NestedSlot();
    public static final PermanentSlot<NaglowekPresenter> SLOT_HEADER = new PermanentSlot<>();
    public static final PermanentSlot<MenuPresenter> SLOT_MENU = new PermanentSlot<>();
    
    MenuPresenter menuPresenter;
    NaglowekPresenter naglowekPresenter;

    @Inject
    ApplicationPresenter(
            EventBus eventBus,
            MyView view,
            MyProxy proxy,
            PlaceManager placeManager,
            MenuPresenter menuPresenter,
            NaglowekPresenter naglowekPresenter) {
        super(eventBus, view, proxy, RevealType.Root);
        
        this.menuPresenter = menuPresenter;
        this.naglowekPresenter = naglowekPresenter;
        this.placeManager = placeManager;
        
        getView().setUiHandlers(this);
    }
  
    @Override
    protected void onBind() {
    	super.onBind();
    	setInSlot(SLOT_MENU, menuPresenter);
    	setInSlot(SLOT_HEADER, naglowekPresenter);
    }
    
}