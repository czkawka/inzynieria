package pl.wmii.interfejs.client.place;

public enum Konteksty {
	KONTEKST_DODAJ_KARTA_GRAFIKI(NameTokens.DODAJ_KARTA_GRAFICZNA, "Dodaj karta grafiki"),
	KONTEKST_STRONA_DOMOWA(NameTokens.HOME, "Strona domowa"),
	KONTEKST_UTWORZ_PC(NameTokens.UTWORZ_PC, "Stworz Pc"),
	KONTEKST_UTWORZ_ZESTAW(NameTokens.DODAJ_ZESTAW, "Dodaj zestaw"),
	KONTEKST_POROWNAJ_MAIN(NameTokens.POROWANJ_ZESTAWY_MAIN, "Porówanj podzespoły"),
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
