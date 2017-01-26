package pl.wmii.interfejs.client.application.model;

import java.io.Serializable;

/**
 * Created by Damian on 25.01.2017.
 */
public abstract class BazowyPodzespolDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5629104021717232913L;
	private Long id;
	private String producent;
	private String typPodzespolu;
	private String cechyDodatkowe;
	private String urlMiniaturki;
	private String nazwa;

	public String getCechyDodatkowe() {
		return cechyDodatkowe;
	}

	public void setCechyDodatkowe(String cechyDodatkowe) {
		this.cechyDodatkowe = cechyDodatkowe;
	}

	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public String getTypPodzespolu() {
		return typPodzespolu;
	}

	public void setTypPodzespolu(String typPodzespolu) {
		this.typPodzespolu = typPodzespolu;
	}

	public String getUrlMiniaturki() {
		return urlMiniaturki;
	}

	public void setUrlMiniaturki(String urlMiniaturki) {
		this.urlMiniaturki = urlMiniaturki;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
}
