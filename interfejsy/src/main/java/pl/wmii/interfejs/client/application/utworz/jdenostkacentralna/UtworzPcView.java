package pl.wmii.interfejs.client.application.utworz.jdenostkacentralna;

import java.util.ArrayList;
import java.util.List;

import org.gwtbootstrap3.client.ui.Column;
import org.gwtbootstrap3.client.ui.TabListItem;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent.Handler;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import pl.wmii.interfejs.client.application.model.BazowyPodzespolDTO;
import pl.wmii.interfejs.client.application.model.ChlodzenieProcesoraDTO;
import pl.wmii.interfejs.client.application.model.DyskTwardyDTO;
import pl.wmii.interfejs.client.application.model.KartaDzwiekowaDTO;
import pl.wmii.interfejs.client.application.model.KartaGraficznaDTO;
import pl.wmii.interfejs.client.application.model.KartaSieciowaDTO;
import pl.wmii.interfejs.client.application.model.NapedDTO;
import pl.wmii.interfejs.client.application.model.ObudowaDTO;
import pl.wmii.interfejs.client.application.model.PamiecRamDTO;
import pl.wmii.interfejs.client.application.model.PlytaGlownaDTO;
import pl.wmii.interfejs.client.application.model.ProcesorDTO;
import pl.wmii.interfejs.client.application.model.ZasilaczDTO;
import pl.wmii.interfejs.client.application.utlis.logger.AppLogger;
import pl.wmii.interfejs.client.application.utworz.jdenostkacentralna.widget.PodzepolWidget;
import pl.wmii.interfejs.client.application.utworz.jdenostkacentralna.widget.wybieracz.WybierczPodzespolu;

public class UtworzPcView extends ViewWithUiHandlers<UtworzPcUiHandlers> implements UtworzPcPresneter.MyView {

	interface Binder extends UiBinder<Widget, UtworzPcView> {
	}

	@Inject
	public UtworzPcView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Column listContainer;

	@UiField
	TabListItem tab0;
	@UiField
	TabListItem tab1;
	@UiField
	TabListItem tab2;
	@UiField
	TabListItem tab3;
	@UiField
	TabListItem tab4;
	@UiField
	TabListItem tab5;
	@UiField
	TabListItem tab6;
	@UiField
	TabListItem tab7;
	@UiField
	TabListItem tab8;
	@UiField
	TabListItem tab9;
	@UiField
	TabListItem tab10;
	
	@UiField
	PodzepolWidget<ChlodzenieProcesoraDTO> wybraneChlodzenia;
	@UiField
	PodzepolWidget<ProcesorDTO> wybraneProcesory;
	@UiField
	PodzepolWidget<KartaGraficznaDTO> wybraneGpu;
	@UiField
	PodzepolWidget<KartaDzwiekowaDTO> wybraneDzwiekowe;
	@UiField
	PodzepolWidget<KartaSieciowaDTO> wybraneSieciowe;
	@UiField
	PodzepolWidget<NapedDTO> wybraneNapedy;
	@UiField
	PodzepolWidget<PlytaGlownaDTO> wybraneGlowne;
	@UiField
	PodzepolWidget<PamiecRamDTO> wybraneRam;
	@UiField
	PodzepolWidget<DyskTwardyDTO> wybraneTwarde;
	@UiField
	PodzepolWidget<ZasilaczDTO> wybraneZasilacze;
	@UiField
	PodzepolWidget<ObudowaDTO> wybraneobudowy;
	
	private Handler utworzHandler(final WybierczPodzespolu<?> wyb, final PodzepolWidget<?> pod) {
		return new SelectionChangeEvent.Handler() {
			@Override
			public void onSelectionChange(SelectionChangeEvent event) {
				AppLogger.debug("" + wyb.getSelectedItem());
				pod.dodajElement(wyb.getSelectedItem());
			}
		};
	}
	

	@UiHandler("tab0")
	public void tab0Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<ChlodzenieProcesoraDTO> cellList = new WybierczPodzespolu<>();
		cellList.addHandler(utworzHandler(cellList, wybraneChlodzenia));
		getUiHandlers().pobierzChlodzenia(cellList);
		listContainer.add(cellList);
	}
	
	@UiHandler("tab1")
	public void tab1Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<ProcesorDTO> cellList = new WybierczPodzespolu<>();
		cellList.addHandler(utworzHandler(cellList, wybraneProcesory));
		getUiHandlers().pobierzProcesory(cellList);
		listContainer.add(cellList);
	}
	
	@UiHandler("tab2")
	public void tab2Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<KartaGraficznaDTO> cellList = new WybierczPodzespolu<>();
		cellList.addHandler(utworzHandler(cellList, wybraneGpu));
		getUiHandlers().pobierzKartyGraficzne(cellList);
		listContainer.add(cellList);
	}
	
	@UiHandler("tab3")
	public void tab3Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<KartaDzwiekowaDTO> cellList = new WybierczPodzespolu<>();
		cellList.addHandler(utworzHandler(cellList, wybraneDzwiekowe));
		getUiHandlers().pobierzKartyDzwiekowe(cellList);
		listContainer.add(cellList);
	}
	
	@UiHandler("tab4")
	public void tab4Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<KartaSieciowaDTO> cellList = new WybierczPodzespolu<>();
		cellList.addHandler(utworzHandler(cellList, wybraneSieciowe));
		getUiHandlers().pobierzSieciowe(cellList);
		listContainer.add(cellList);
	}
	
	@UiHandler("tab5")
	public void tab5Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<NapedDTO> cellList = new WybierczPodzespolu<>();
		cellList.addHandler(utworzHandler(cellList, wybraneNapedy));
		getUiHandlers().pobierzNapedy(cellList);
		listContainer.add(cellList);
	}
	
	@UiHandler("tab6")
	public void tab6Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<PlytaGlownaDTO> cellList = new WybierczPodzespolu<>();
		cellList.addHandler(utworzHandler(cellList, wybraneGlowne));
		getUiHandlers().pobierzPlytyGlowe(cellList);
		listContainer.add(cellList);
	}
	
	@UiHandler("tab7")
	public void tab7Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<PamiecRamDTO> cellList = new WybierczPodzespolu<>();
		cellList.addHandler(utworzHandler(cellList, wybraneRam));
		getUiHandlers().pobierzRam(cellList);
		listContainer.add(cellList);
	}
	
	@UiHandler("tab8")
	public void tab8Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<DyskTwardyDTO> cellList = new WybierczPodzespolu<>();
		cellList.addHandler(utworzHandler(cellList, wybraneTwarde));
		getUiHandlers().pobierzDyski(cellList);
		listContainer.add(cellList);
	}
	
	@UiHandler("tab9")
	public void tab9Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<ZasilaczDTO> cellList = new WybierczPodzespolu<>();
		cellList.addHandler(utworzHandler(cellList, wybraneZasilacze));
		getUiHandlers().pobierzZasilacze(cellList);
		listContainer.add(cellList);
	}
	
	@UiHandler("tab10")
	public void tab10Click(ClickEvent e) {
		listContainer.clear();
		WybierczPodzespolu<ObudowaDTO> cellList = new WybierczPodzespolu<>();
//		getUiHandlers().pobierzChlodzenia(cellList);
//		listContainer.add(cellList);
	}
	

	@Override
	public void initView() {
		tab0Click(null);
		tab0.setActive(true);
	}

	
}
