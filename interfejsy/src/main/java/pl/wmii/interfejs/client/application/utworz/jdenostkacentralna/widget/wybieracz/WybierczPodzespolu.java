package pl.wmii.interfejs.client.application.utworz.jdenostkacentralna.widget.wybieracz;

import java.util.ArrayList;
import java.util.List;

import org.gwtbootstrap3.client.ui.Input;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent.Handler;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.HandlerRegistration;

import pl.wmii.interfejs.client.application.model.BazowyPodzespolDTO;
import pl.wmii.interfejs.client.application.utlis.logger.AppLogger;

public class WybierczPodzespolu<T extends BazowyPodzespolDTO> extends Composite {
	
	private static WybierczPodzespoluBinder uiBinder = GWT.create(WybierczPodzespoluBinder.class);

	interface WybierczPodzespoluBinder extends UiBinder<Widget, WybierczPodzespolu> {
	}

	@Inject
	public WybierczPodzespolu() {
		utworzCellListe();
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	private ListDataProvider<T> provider;
	private SingleSelectionModel<T> singelSelectionModel = new SingleSelectionModel<>();
	
	
	@UiField
	Input termInput;
	
	@UiField(provided = true)
	CellList<T> listaPodzespolow;
	
	protected void utworzCellListe() {
		PodzespolCell<T> cell = new PodzespolCell<>();
		listaPodzespolow = new CellList<T>(cell);
		listaPodzespolow.setSelectionModel(singelSelectionModel);
		provider = new ListDataProvider<>();
		provider.setList(new ArrayList<T>());
		provider.addDataDisplay(listaPodzespolow);
	}
	
	public void setData(List<T> data) {
		AppLogger.debug("tyle" + data.size());
		provider.setList(data);
		provider.refresh();
	}
	
	public T getSelectedItem() {
		return singelSelectionModel.getSelectedObject();
	}
	
	public void addHandler(Handler handler) {
		singelSelectionModel.addSelectionChangeHandler(handler);
	}
	

}
