package pl.wmii.appka.service.rest.utils;

import java.io.Serializable;
import java.util.List;

public class WynikWraper <T extends List<?> > implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private T wyniki;
	
	public WynikWraper(T wyniki) {
		this.setWyniki(wyniki);
	}

	public T getWyniki() {
		return wyniki;
	}

	public void setWyniki(T wyniki) {
		this.wyniki = wyniki;
	}
	
}
