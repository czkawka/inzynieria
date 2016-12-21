package pl.wmii.interfejs.client.application.formularze.zarejestrujsie;

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

public class ZarejestrujPresenter extends Presenter<ZarejestrujPresenter.MyView, ZarejestrujPresenter.MyProxy> implements ZarejestrujUiHandlers {
  public interface MyView extends View, HasUiHandlers<ZarejestrujUiHandlers> {
  }

  @ProxyStandard
  @NameToken(NameTokens.REGISTER)
  public interface MyProxy extends ProxyPlace<ZarejestrujPresenter> {
  }

  @Inject
  public ZarejestrujPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
    super(eventBus,view, proxy, ApplicationPresenter.SLOT_MAIN);
  }

}
