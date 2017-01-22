package pl.wmii.interfejs.client.application.home;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

import pl.wmii.interfejs.client.application.model.ZestawyDTO;

public class ZestawCell extends AbstractCell<ZestawyDTO> {

	@Override
	public void render(com.google.gwt.cell.client.Cell.Context context, ZestawyDTO value, SafeHtmlBuilder sb) {
		sb.appendHtmlConstant("<div class=\"zestaw-cell\">");
		sb.appendHtmlConstant("<span>" + value.getNazwa()  + "</span>");
		sb.appendHtmlConstant("</div>");
	}

}
