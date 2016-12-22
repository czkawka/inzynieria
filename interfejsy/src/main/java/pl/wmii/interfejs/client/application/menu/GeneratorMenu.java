package pl.wmii.interfejs.client.application.menu;

import java.util.ArrayList;
import java.util.List;

import org.gwtbootstrap3.client.ui.constants.IconType;

import pl.wmii.interfejs.client.place.NameTokens;

public class GeneratorMenu {
	private List<ElementMenu> pozycje;

	public GeneratorMenu() {
		this.pozycje = new ArrayList<>();
		
		pozycje.add(new ElementMenu(IconType.HOME, NameTokens.HOME, "Home", "Strona domowa."));
//		pozycje.add(new ElementMenu(IconType.PLUS, NameTokens.DODAJ_KARTA_GRAFICZNA, "Formularze",
//				"Dodawanie karty grficznej."));
//		pozycje.add(new ElementMenu(IconType.SEARCH , NameTokens.WYSZUKAJ_KARTY_GRAFICZNE, "Wyszukaj: karty graficzne",
//				"Wyszukuje karty graficzne"));
		pozycje.add(new ElementMenu(IconType.SEARCH , NameTokens.FORM, "Porownywanie podzespolow",
				"Porównuje dwa wybrane pozespoły"));
		pozycje.add(new ElementMenu(IconType.QUESTION_CIRCLE, NameTokens.HELP, "Pomoc", "Intrukcje użytkownia."));
		
		
//		pozycje.add(new ElementMenu(IconType.HOME, NameTokens.HOME, "Home", "Strona domowa."));
//		pozycje.add(new ElementMenu(IconType.PLUS, NameTokens.DODAJ_KARTA_GRAFICZNA, "Dodaj karte graficzną",
//				"Dodawanie karty grficznej."));
//		pozycje.add(new ElementMenu(IconType.PHOTO , NameTokens.WYSZUKAJ_KARTY_GRAFICZNE, "Wyszukaj karty graficzne",
//				"Wyszukuje karty graficzne"));
//		pozycje.add(new ElementMenu(IconType.QUESTION_CIRCLE, NameTokens.HELP, "Pomoc", "Intrukcje użytkownia."));
		
	}

	public List<ElementMenu> getPozycje() {
		return pozycje;
	}

	public void setPozycje(List<ElementMenu> pozycje) {
		this.pozycje = pozycje;
	}

}
