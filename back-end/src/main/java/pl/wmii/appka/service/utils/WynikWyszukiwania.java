package pl.wmii.appka.service.utils;

import pl.wmii.appka.model.dto.BaseDTO;

import java.io.Serializable;
import java.util.List;

public class WynikWyszukiwania<T extends BaseDTO> implements Serializable {
	
	/**
	 * offset, limit ustawiamy na -1, gdy nie potrzeba
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<T> wyniki;
	private int ilosc;
	private int offset;
	private int limit;
	
	public WynikWyszukiwania(List<T> wyniki) {
		super();
		this.setWyniki(wyniki);
	}

	public WynikWyszukiwania(List<T> wyniki, int ilosc, int offset, int limit) {
		super();
		this.ilosc = ilosc;
		this.wyniki = wyniki;
		this.offset = offset;
		this.limit = limit;
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

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
}
