package pl.wmii.interfejs.client.application.menu;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

/**
 * Created by Damian on 18.12.2016.
 */
public class MenuCell extends AbstractCell<ElementMenuDane> {

  public MenuCell() {}


  @Override
  public void render(Context context, ElementMenuDane elementMenu, SafeHtmlBuilder safeHtmlBuilder) {
    if ( elementMenu == null ) {
      return;
    }
    
    String icon = "<i class=\"fa "+ elementMenu.getIcon().getCssName() +"\" aria-hidden=\"true\"></i>";

    
    safeHtmlBuilder.appendHtmlConstant("<div class='menuCell clearfix' title=\"" + elementMenu.getDescription() +"\"><div class='icon'>" + 
    icon + "</div>"
    + "<div class='content'><span>" + elementMenu.getLabel() + "</span></div></div>");
  }
}
