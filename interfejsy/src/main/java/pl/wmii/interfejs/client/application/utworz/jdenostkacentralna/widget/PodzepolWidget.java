package pl.wmii.interfejs.client.application.utworz.jdenostkacentralna.widget;

import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.Heading;
import org.gwtbootstrap3.client.ui.Image;
import org.gwtbootstrap3.client.ui.html.Paragraph;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class PodzepolWidget extends Composite {

	private static PodzepolWidgetUiBinder uiBinder = GWT.create(PodzepolWidgetUiBinder.class);

	interface PodzepolWidgetUiBinder extends UiBinder<Widget, PodzepolWidget> {
	}
	
	public PodzepolWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public PodzepolWidget(Podzespol podzespol) {
		this.setPodzespol(podzespol);
		initWidget(uiBinder.createAndBindUi(this));
		ustawWidget();
	}
	
	private Podzespol podzespol;
	
	@UiField
	Heading naglowek;
	
	@UiField
	Paragraph opis;
	
	@UiField
	Button usunButton;
	
	@UiField
	Button szczegolyButton;
	
	@UiField
	Image obrazek;
	
	private void ustawWidget() {
		ustawUrlObrazka();
		ustawNaglowek();
		ustawOpis();
	}

	private void ustawOpis() {
		
		opis.setText(podzespol.getOpis());
	}

	private void ustawNaglowek() {
		
		naglowek.setText(podzespol.getTyp() + ": " + podzespol.getNazwa());
	}

	private void ustawUrlObrazka() {
		obrazek.setUrl(podzespol.getObrazekUrl());
	}

	public Podzespol getPodzespol() {
		return podzespol;
	}

	public void setPodzespol(Podzespol podzespol) {
		this.podzespol = podzespol;
		ustawWidget();
	}
	
	
	
}
