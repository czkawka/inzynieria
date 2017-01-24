package pl.wmii.interfejs.client.application.formularze;

public class Walidacja {
	
	public static Boolean czyNapisPusty(String term) {
		return (term == "") || (term == null);
	}
	
	public static Boolean czyZawieraBialeZnaki(String term) { 
		return false;
	}
	
	public static Boolean nieZawieraWylacznieLiczb(String term) {
		return false;
	}

}
