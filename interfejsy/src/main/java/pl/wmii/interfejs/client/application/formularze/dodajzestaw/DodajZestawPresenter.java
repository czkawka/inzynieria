package pl.wmii.interfejs.client.application.formularze.dodajzestaw;

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

public class DodajZestawPresenter extends Presenter<DodajZestawPresenter.MyView,DodajZestawPresenter.MyProxy>
        implements DodajZestawUiHandlers {
  public interface MyView extends View, HasUiHandlers<DodajZestawUiHandlers> {
  }

  @ProxyStandard
  @NameToken(NameTokens.DODAJ_ZESTAW)
  public interface MyProxy extends ProxyPlace<DodajZestawPresenter> {
  }

  @Inject
  public DodajZestawPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
    super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN);
  }
}
