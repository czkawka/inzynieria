package pl.wmii.interfejs.client.application.porownywanie;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class PorowanjMainView extends ViewWithUiHandlers<PorownajMainUiHandler> implements PorownajMainPresenter.MyView {

	interface Binder extends UiBinder<Widget, PorowanjMainView> {
	}

	@Inject
	public PorowanjMainView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
