package pl.wmii.interfejs.client.application.pomoc;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class PomocView extends ViewWithUiHandlers<PomocUiHandlers> implements PomocPresenter.MyView {

	public interface Binder extends UiBinder<Widget, PomocView> {
	}

	@Inject
	public PomocView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	
}
