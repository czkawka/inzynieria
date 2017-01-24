package pl.wmii.interfejs.client.application;

import org.gwtbootstrap3.client.ui.Heading;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class ApplicationView extends ViewWithUiHandlers<ApplicationUiHandlers> implements ApplicationPresenter.MyView {

	interface Binder extends UiBinder<Widget,ApplicationView> {
	}

	@UiField(provided = true)
	public final SimplePanel header = new SimplePanel();

	@UiField(provided = true)
	public final ScrollPanel main = new ScrollPanel();
	
	@Inject
	ApplicationView(Binder uiBinder) {
		
		initWidget(uiBinder.createAndBindUi(this));
		
		bindSlot(ApplicationPresenter.SLOT_MAIN, main);
		bindSlot(ApplicationPresenter.SLOT_HEADER, header);
	}
	
	@UiField
	Heading kontekstHeader;

	@Override
	public void ustawTytulKontekstu(String tytul) {
		kontekstHeader.setText(tytul);
	}
	
}
