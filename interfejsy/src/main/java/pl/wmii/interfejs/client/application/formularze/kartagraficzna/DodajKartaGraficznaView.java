package pl.wmii.interfejs.client.application.formularze.kartagraficzna;

import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.Form;
import org.gwtbootstrap3.client.ui.FormGroup;
import org.gwtbootstrap3.client.ui.Input;
import org.gwtbootstrap3.client.ui.ListBox;
import org.gwtbootstrap3.client.ui.TextArea;
import org.gwtbootstrap3.client.ui.TextBox;
import org.gwtbootstrap3.client.ui.constants.InputType;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class DodajKartaGraficznaView extends ViewWithUiHandlers<DodajKartaGraficznaUiHandlers> implements DodajKarteGraficznaPresenter.MyView {

	public interface Binder extends UiBinder<Widget, DodajKartaGraficznaView>{
		
	}
	
	@Inject
	public DodajKartaGraficznaView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	
	@UiField
	Form form;
	
	
	@UiField
	FormGroup rodzinaGroup;
	@UiField
	Input rodzinaProduktu;
	
	@UiField
	FormGroup nazwaGroup;
	@UiField
	Input nazwa;
	
	
	@UiField
	FormGroup taktowanieRdzeniaGroup;
	@UiField
	Input taktowanieRdzenia;
	
	@UiField
	FormGroup rodzajPamieciGroup;
	@UiField
	ListBox rodzajPamieci;
	
	@UiField
	FormGroup taktowaniePamieciGroup;
	@UiField
	Input taktowaniePamieci;
	
	@UiField
	FormGroup szynaGroup;
	@UiField
	Input szynaPamieci;
	
	@UiField
	FormGroup maxResGroup;
	@UiField
	Input maxRes;
	
	@UiField
	FormGroup zlaczeZewGroup;
	@UiField
	ListBox zlaczeZew;
	
	@UiField
	FormGroup producentGroup;
	@UiField
	Input producent;
	
	@UiField
	FormGroup dodatkiGroup;
	@UiField
	TextArea dodatki;	
	
	@UiField
	Button zapiszButton;
	
	@UiHandler("zapiszButton")
	public void onZapiszButtonClick(ClickEvent e) {
		
	}
	

}
