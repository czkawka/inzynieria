package pl.wmii.interfejs.client.application.utworz.jdenostkacentralna.widget.wybieracz;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.dom.client.BrowserEvents;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiRenderer;
import com.google.inject.Inject;

import pl.wmii.interfejs.client.application.model.BazowyPodzespolDTO;
import pl.wmii.interfejs.client.application.utworz.jdenostkacentralna.widget.Podzespol;

public class PodzespolCell<T extends BazowyPodzespolDTO> extends AbstractCell<T> {

	@Override
	public void render(com.google.gwt.cell.client.Cell.Context context, T value, SafeHtmlBuilder sb) {
		String url = value.getUrlMiniaturki() == null ? "" : value.getUrlMiniaturki();
		String nazwa = value.getNazwa() == null ? "" : value.getNazwa().toString();
		String typ = value.getTypPodzespolu() == null ? "" : value.getTypPodzespolu();
		String producent = value.getProducent() == null ? "" : value.getProducent();
		
		
		sb.appendHtmlConstant("<div style='margin: 5px' class='clearfix' >");
		sb.appendHtmlConstant("<div style='float: left; margin-right: 8px;'>");
		sb.appendHtmlConstant("<img src='" + url + "' style='width:32px; height: 32px;'>");
		sb.appendHtmlConstant("</div>");
		sb.appendHtmlConstant("<div style=''>");
		sb.appendHtmlConstant("<span>" + nazwa + " </span>, ");
		sb.appendHtmlConstant("<span>" + typ + " </span>,");
		sb.appendHtmlConstant("<span>Producent: " + producent + " </span>");
		sb.appendHtmlConstant("</div>");
		sb.appendHtmlConstant("</div>");
	}

}
