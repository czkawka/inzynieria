package pl.wmii.interfejs.client.application.menu;

import org.gwtbootstrap3.client.ui.constants.IconType;

/**
 * Created by Damian on 18.12.2016.
 */
public class ElementMenuDane {

  public ElementMenuDane(IconType icon, String place, String label, String description) {
    this.icon = icon;
    this.place = place;
    this.description = description;
    this.label = label;
  }

  private IconType icon;
  private String place;
  private String label;
  private String description;

  public IconType getIcon() {
    return icon;
  }

  public void setIcon(IconType icon) {
    this.icon = icon;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLabel() {
	return label;
  }

  public void setLabel(String label) {
	this.label = label;
  }
}
