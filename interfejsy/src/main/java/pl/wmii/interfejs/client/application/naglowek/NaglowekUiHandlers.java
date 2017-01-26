package pl.wmii.interfejs.client.application.naglowek;

import com.gwtplatform.mvp.client.UiHandlers;

import pl.wmii.interfejs.client.place.NameTokens;

interface NaglowekUiHandlers extends UiHandlers {
	void onUtworzPc();
	void onGoToHome();
	void onGoToPomoc();
	void onUtworzZestaw();
	void onPorownaj();
}
