package pl.wmii.interfejs.client.application.home;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

import pl.wmii.interfejs.client.application.model.ZestawyDTO;


public class HomeView extends ViewWithUiHandlers<HomeUiHandlers> implements HomePresenter.MyView {

	interface Binder extends UiBinder<Widget, HomeView> {}

	@Inject
	HomeView(Binder uiBinder) {
		utworzZestawyLista();
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField(provided = true)
	CellList<ZestawyDTO> zestawyLista;
	
	protected void utworzZestawyLista() {
		
		ZestawCell cell = new ZestawCell();
		SingleSelectionModel<ZestawyDTO> selectionModel = new SingleSelectionModel<>();
		zestawyLista = new CellList<ZestawyDTO>(cell);
		zestawyLista.setSelectionModel(selectionModel);
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
			
			@Override
			public void onSelectionChange(SelectionChangeEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
	}


}
