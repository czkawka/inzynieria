package pl.wmii.interfejs.client.application.raporty.kartagraficzna;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import pl.wmii.interfejs.client.application.model.KartaGraficznaDTO;

public class WyszukajKartaGraficznaView extends ViewWithUiHandlers<WyszukajKartaGraficznaUiHandlers>
		implements WyszukajKartaGraficznaPresenter.MyView {

	interface Binder extends UiBinder<Widget, WyszukajKartaGraficznaView> {
	}

	@Inject
	public WyszukajKartaGraficznaView(Binder uiBinder) {
		utworzTabelke();
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField(provided = true)
	CellTable<KartaGraficznaDTO> tabelka;
	
	public void utworzTabelke() {
		tabelka = new CellTable<>();
		
		utworzKolumny();
	}
	
	private void utworzKolumny() {
		tabelka.addColumn(rodzinaProduktowColumn(),"Rodzina produktów");
		tabelka.addColumn(nazwaColumn(),"Nazwa");
		tabelka.addColumn(producentColumn(),"Producent");
		tabelka.addColumn(szynaColumn(),"Szyna pamięci");
		tabelka.addColumn(taktowanieRdzeniaColumn(),"Taktowanie Rdzenia");
		tabelka.addColumn(rodzajPamieci(),"Rodzaj Pamieci");
	}
	
	TextColumn<KartaGraficznaDTO> rodzinaProduktowColumn() {
		return new TextColumn<KartaGraficznaDTO>() {

			@Override
			public String getValue(KartaGraficznaDTO object) {
				return notNull(object.getRodzinaProduktów());
			}
		};
	}
	
	TextColumn<KartaGraficznaDTO> nazwaColumn() {
		return new TextColumn<KartaGraficznaDTO>() {

			@Override
			public String getValue(KartaGraficznaDTO object) {
				return notNull(object.getNazwa());
			}
		};
	}
	
	TextColumn<KartaGraficznaDTO> szynaColumn() {
		return new TextColumn<KartaGraficznaDTO>() {
			
			@Override
			public String getValue(KartaGraficznaDTO object) {
				return object.getSzynaPamieci() + "";
			}
		};
	}
	
	TextColumn<KartaGraficznaDTO> taktowanieRdzeniaColumn() {
		return new TextColumn<KartaGraficznaDTO>() {

			@Override
			public String getValue(KartaGraficznaDTO object) {
				return object.getTaktowanieRdzenia() + "Ghz";
			}
		};
	}
	
	TextColumn<KartaGraficznaDTO> rodzajPamieci() {
		return new TextColumn<KartaGraficznaDTO>() {
			
			@Override
			public String getValue(KartaGraficznaDTO object) {
				return notNull(object.getRodzajPamieci());
			}
		};
	}
	
	TextColumn<KartaGraficznaDTO> producentColumn() {
		return new TextColumn<KartaGraficznaDTO>() {

			@Override
			public String getValue(KartaGraficznaDTO object) {
				return notNull(object.getProducent());
			}
		};
	}
	
	public String notNull(String napis) {
		return napis == null ? "" : napis;
	}

	@Override
	public CellTable<KartaGraficznaDTO> podajCellTable() {
		return tabelka;
	}

	
	

}
