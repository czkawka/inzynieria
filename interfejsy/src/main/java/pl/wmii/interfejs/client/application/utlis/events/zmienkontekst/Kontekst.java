package pl.wmii.interfejs.client.application.utlis.events.zmienkontekst;

import pl.wmii.interfejs.client.place.Konteksty;

public class Kontekst {
	private Konteksty kontekst;
	
	public Kontekst(Konteksty kontekst) {
		this.kontekst = kontekst;
	}

	public Konteksty getKontekst() {
		return kontekst;
	}

	public void setKontekst(Konteksty kontekst) {
		this.kontekst = kontekst;
	}
	
	
}
