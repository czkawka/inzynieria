package pl.wmii.interfejs.client.application.home;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;


public class HomeView extends ViewWithUiHandlers<HomeUiHandlers> implements HomePresenter.MyView {

	interface Binder extends UiBinder<Widget, HomeView> {}

	@Inject
	HomeView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
