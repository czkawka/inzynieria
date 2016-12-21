package pl.wmii.interfejs.client.application.formularze;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class FormularzView extends ViewWithUiHandlers<FormularzUiHandlers> implements FormularzPresenter.MyView {

	interface Binder extends UiBinder<Widget, FormularzView> {
	}
	
	@Inject
	FormularzView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
