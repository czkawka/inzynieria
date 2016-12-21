package pl.wmii.interfejs.client.application.formularze.kartagraficzna;

import com.google.gwt.uibinder.client.UiBinder;
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

}
