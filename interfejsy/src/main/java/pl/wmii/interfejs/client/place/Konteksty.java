package pl.wmii.interfejs.client.place;

public enum Konteksty {
	KONTEKST_DODAJ_KARTA_GRAFIKI(NameTokens.DODAJ_KARTA_GRAFICZNA, "Dodaj karta grafiki"),
	KONTEKST_STRONA_DOMOWA(NameTokens.HOME, "Strona domowa"),
	KONTEKST_POMOC(NameTokens.HELP, "Pomoc");
	
	
	private Konteksty(String nameToken, String tytulKontekstu) {
		this.nameToken = nameToken;
		this.tytulKontekstu = tytulKontekstu;
	}
	
	private String nameToken;
	private String tytulKontekstu;
	
	public String getNameToken() {
		return nameToken;
	}
	
	public String getTytulKontekstu() {
		return tytulKontekstu;
	}
}
