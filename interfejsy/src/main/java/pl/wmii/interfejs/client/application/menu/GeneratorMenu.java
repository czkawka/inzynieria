package pl.wmii.interfejs.client.application.menu;

import java.util.ArrayList;
import java.util.List;

import org.gwtbootstrap3.client.ui.constants.IconType;

import pl.wmii.interfejs.client.place.NameTokens;

public class GeneratorMenu {
	private List<ElementMenuDane> pozycje;

	public GeneratorMenu() {
		this.pozycje = new ArrayList<>();
		utworzPozycje();
	}

	public List<ElementMenuDane> podajListeElementow() {
		return pozycje;
	}
	
	private void utworzPozycje() {
		pozycje.add(new ElementMenuDane(IconType.HOME, NameTokens.HELP, "Giatra siema", "opis"));
		pozycje.add(new ElementMenuDane(IconType.HOME, NameTokens.ERROR_PLACE, "Giatra siema", "opis"));
		pozycje.add(new ElementMenuDane(IconType.HOME, NameTokens.ERROR_PLACE, "Giatra siema", "opis"));
		pozycje.add(new ElementMenuDane(IconType.HOME, NameTokens.ERROR_PLACE, "Giatra siema", "opis"));
		pozycje.add(new ElementMenuDane(IconType.HOME, NameTokens.ERROR_PLACE, "Giatra siema", "opis"));
	}

}
