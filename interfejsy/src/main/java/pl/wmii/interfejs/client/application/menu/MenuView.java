package pl.wmii.interfejs.client.application.menu;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

/**
 * Created by Damian on 18.12.2016.
 */
public class MenuView extends ViewWithUiHandlers<MenuUiHandlers> implements MenuPresenter.MyView {

  @Override
  public CellList<ElementMenu> podajCellListe() {
    return menuList;
  }

  interface Binder extends UiBinder<Widget, MenuView> {}

  @Inject
  public MenuView(Binder uiBinder) {
    initMenu();
    initWidget(uiBinder.createAndBindUi(this));
  }
  
  SingleSelectionModel<ElementMenu> singleSelectionModel;

  @UiField(provided = true)
  CellList<ElementMenu> menuList;



  protected void initMenu() {
    MenuCell cell = new MenuCell();
    singleSelectionModel = new SingleSelectionModel<ElementMenu>();
    singleSelectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
      @Override
      public void onSelectionChange(SelectionChangeEvent selectionChangeEvent) {
        getUiHandlers().onSelectMenuItem(singleSelectionModel.getSelectedObject());
      }
    });

    menuList = new CellList<ElementMenu>(cell);
    menuList.setSelectionModel(singleSelectionModel);
    menuList.setWidth("100%");

  }



@Override
public SingleSelectionModel<ElementMenu> podajSelectionModel() {
	// TODO Auto-generated method stub
	return singleSelectionModel;
}


}
