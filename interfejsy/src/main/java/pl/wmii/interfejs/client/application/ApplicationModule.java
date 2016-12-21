package pl.wmii.interfejs.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import pl.wmii.interfejs.client.application.formularze.FormularzPresenter;
import pl.wmii.interfejs.client.application.formularze.FormularzView;
import pl.wmii.interfejs.client.application.formularze.dodajzestaw.DodajZestawPresenter;
import pl.wmii.interfejs.client.application.formularze.dodajzestaw.DodajZestawView;
import pl.wmii.interfejs.client.application.formularze.kartagraficzna.DodajKartaGraficznaView;
import pl.wmii.interfejs.client.application.formularze.kartagraficzna.DodajKarteGraficznaPresenter;
import pl.wmii.interfejs.client.application.formularze.zarejestrujsie.ZarejestruView;
import pl.wmii.interfejs.client.application.formularze.zarejestrujsie.ZarejestrujPresenter;
import pl.wmii.interfejs.client.application.home.HomePresenter;
import pl.wmii.interfejs.client.application.home.HomeView;
import pl.wmii.interfejs.client.application.menu.MenuPresenter;
import pl.wmii.interfejs.client.application.menu.MenuView;
import pl.wmii.interfejs.client.application.naglowek.NaglowekPresenter;
import pl.wmii.interfejs.client.application.naglowek.NaglowekView;
import pl.wmii.interfejs.client.application.pomoc.PomocPresenter;
import pl.wmii.interfejs.client.application.pomoc.PomocView;
import pl.wmii.interfejs.client.application.raporty.kartagraficzna.WyszukajKartaGraficznaPresenter;
import pl.wmii.interfejs.client.application.raporty.kartagraficzna.WyszukajKartaGraficznaView;

public class ApplicationModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		/*
		 * LAYOUT
		 */
		bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
				ApplicationPresenter.MyProxy.class);
		bindPresenter(MenuPresenter.class, MenuPresenter.MyView.class, MenuView.class, MenuPresenter.Proxy.class);
		bindPresenter(NaglowekPresenter.class, NaglowekPresenter.MyView.class, NaglowekView.class,
				NaglowekPresenter.MyProxy.class);

		bindPresenter(HomePresenter.class, HomePresenter.MyView.class, HomeView.class, HomePresenter.MyProxy.class);
		/*
		 * FORMULARZE
		 */
		bindPresenter(FormularzPresenter.class, FormularzPresenter.MyView.class, FormularzView.class,
				FormularzPresenter.MyProxy.class);
		bindPresenter(PomocPresenter.class, PomocPresenter.MyView.class, PomocView.class, PomocPresenter.MyProxy.class);
		bindPresenter(DodajKarteGraficznaPresenter.class, DodajKarteGraficznaPresenter.MyView.class,
				DodajKartaGraficznaView.class, DodajKarteGraficznaPresenter.MyProxy.class);
		bindPresenter(DodajZestawPresenter.class, DodajZestawPresenter.MyView.class, DodajZestawView.class,
				DodajZestawPresenter.MyProxy.class);
		bindPresenter(ZarejestrujPresenter.class, ZarejestrujPresenter.MyView.class, ZarejestruView.class,
				ZarejestrujPresenter.MyProxy.class);

		/*
		 * RAPORTY
		 */

		bindPresenter(WyszukajKartaGraficznaPresenter.class, WyszukajKartaGraficznaPresenter.MyView.class,
				WyszukajKartaGraficznaView.class, WyszukajKartaGraficznaPresenter.MyProxy.class);
	}

}
