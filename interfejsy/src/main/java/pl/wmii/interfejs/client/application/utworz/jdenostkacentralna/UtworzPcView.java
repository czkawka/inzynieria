package pl.wmii.interfejs.client.application.utworz.jdenostkacentralna;

import org.gwtbootstrap3.client.ui.NavTabs;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class UtworzPcView extends ViewWithUiHandlers<UtworzPcUiHandlers> implements UtworzPcPresneter.MyView {
	
	interface Binder extends UiBinder<Widget, UtworzPcView>{
	}
	
	
	@Inject
	public UtworzPcView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	NavTabs tabs = new NavTabs();
	
	public void kupa() {
	}

}
