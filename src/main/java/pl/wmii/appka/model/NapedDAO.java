package pl.wmii.appka.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class NapedDAO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;

	
	private int rodzaj;
	private String producent;
	private int urlMiniaturki;
	private String cechyDodatkowe;
	private String typPodzespolu;
	
	public NapedDAO() {
	}
	
	public NapedDAO(int rodzaj, String producent, int urlMiniaturki,
			String cechyDodatkowe, String typPozespolu) {
		this.setRodzaj(rodzaj);
		this.setProducent(producent);
		this.setUrlMiniaturki(urlMiniaturki);
		this.setCechyDodatkowe(cechyDodatkowe);
		this.setTypPodzespolu(typPozespolu);
	}

	public int getRodzaj() {
		return rodzaj;
	}

	public void setRodzaj(int rodzaj) {
		this.rodzaj = rodzaj;
	}

	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public int getUrlMiniaturki() {
		return urlMiniaturki;
	}

	public void setUrlMiniaturki(int urlMiniaturki) {
		this.urlMiniaturki = urlMiniaturki;
	}

	public String getCechyDodatkowe() {
		return cechyDodatkowe;
	}

	public void setCechyDodatkowe(String cechyDodatkowe) {
		this.cechyDodatkowe = cechyDodatkowe;
	}

	public String getTypPodzespolu() {
		return typPodzespolu;
	}

	public void setTypPodzespolu(String typPodzespolu) {
		this.typPodzespolu = typPodzespolu;
	}
}
