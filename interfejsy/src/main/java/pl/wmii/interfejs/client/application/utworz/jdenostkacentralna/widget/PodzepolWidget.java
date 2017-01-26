package pl.wmii.interfejs.client.application.utworz.jdenostkacentralna.widget;

import java.util.List;

import org.gwtbootstrap3.client.ui.Heading;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent.Handler;
import com.google.gwt.view.client.SingleSelectionModel;

import pl.wmii.interfejs.client.application.model.BazowyPodzespolDTO;
import pl.wmii.interfejs.client.application.utlis.logger.AppLogger;
import pl.wmii.interfejs.client.application.utworz.jdenostkacentralna.widget.wybieracz.PodzespolCell;

public class PodzepolWidget<T extends BazowyPodzespolDTO> extends Composite {

	private static PodzepolWidgetUiBinder uiBinder = GWT.create(PodzepolWidgetUiBinder.class);

	interface PodzepolWidgetUiBinder extends UiBinder<Widget, PodzepolWidget> {
	}
	
	public PodzepolWidget() {
		setMaxSize(1);
		utworzCellLista();
		initWidget(uiBinder.createAndBindUi(this));
	}

	private int maxSize;
	private String caption;
	ListDataProvider<T> provider = new ListDataProvider<>();
	SingleSelectionModel<T> selectionModel = new SingleSelectionModel<>();
	
	@UiField(provided = true)
	CellList<T> listaWybranych;
	
	@UiField
	Heading naglowek;

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
		naglowek.setText(caption);
	}


	public int getMaxSize() {
		return maxSize;
	}
	
	public void dodajElement(BazowyPodzespolDTO bazowyPodzespolDTO) {
		AppLogger.debug("gowno");
		List<T> lista = provider.getList();
		if(lista.size() >= maxSize) return;
		lista.add((T) bazowyPodzespolDTO);
		provider.refresh();
	}
	
	public List<T> podajWybraneElementy() {
		return provider.getList();
	}


	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	private void utworzCellLista() {
		PodzespolCell<T> cell = new PodzespolCell<T>();
		listaWybranych = new CellList<T>(cell);
		provider.addDataDisplay(listaWybranych);
		listaWybranych.setSelectionModel(selectionModel);
		selectionModel.addSelectionChangeHandler(new Handler() {
			
			@Override
			public void onSelectionChange(SelectionChangeEvent event) {
				provider.getList().remove(selectionModel.getSelectedObject());
				provider.refresh();
				
			}
		});
	}
	
	
}
