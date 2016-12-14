package pl.wmii.appka.service.utils;

import java.io.Serializable;
import java.util.List;

public class WynikWraper <T extends  BaseDTO > implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<T> wyniki;
	private int ilosc;
	
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

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
}
