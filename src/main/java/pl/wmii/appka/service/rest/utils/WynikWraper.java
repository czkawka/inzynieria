package pl.wmii.appka.service.rest.utils;

import java.io.Serializable;
import java.util.List;

public class WynikWraper <T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<T> wyniki;
	
	public WynikWraper(List<T> wyniki) {
		super();
		this.setWyniki(wyniki);
	}

	public List<T> getWyniki() {
		return wyniki;
	}

	public void setWyniki(List<T> wyniki) {
		this.wyniki = wyniki;
	}
	
}
