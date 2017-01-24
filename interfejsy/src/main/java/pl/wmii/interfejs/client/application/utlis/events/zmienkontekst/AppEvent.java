package pl.wmii.interfejs.client.application.utlis.events.zmienkontekst;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class AppEvent extends GwtEvent<AppEvent.AppEventZmienKontekst> {

	public interface AppEventZmienKontekst extends EventHandler {
		void onUstawKonetkst(AppEvent event);
	}

	public static final Type<AppEventZmienKontekst> TYPE = new Type<>();
	private final Kontekst dane;

	public AppEvent(Kontekst data) {
		this.dane = data;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<AppEventZmienKontekst> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(AppEventZmienKontekst handler) {
		handler.onUstawKonetkst(this);
	}

	public Kontekst getDane() {
		return dane;
	}

}
