package pl.wmii.interfejs.client.application.formularze.dodajzestaw;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class DodajZestawView extends ViewWithUiHandlers<DodajZestawUiHandlers> implements DodajZestawPresenter.MyView {
	interface Binder extends UiBinder<Widget, DodajZestawView> {
	}

	@Inject
	public DodajZestawView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
