package pl.wmii.interfejs.client.application.error;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class ErrorView extends ViewWithUiHandlers<ErrorUiHandler> implements ErrorPresenter.MyView {
	
	interface Binder extends UiBinder<Widget, ErrorView> {
	}

	@Inject
	public ErrorView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
