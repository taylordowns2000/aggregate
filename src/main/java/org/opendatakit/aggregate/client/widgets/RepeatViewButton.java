package org.opendatakit.aggregate.client.widgets;

import org.opendatakit.aggregate.client.popups.RepeatPopup;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.PopupPanel;

public class RepeatViewButton extends AButtonBase implements ClickHandler {
  private String url;

  public RepeatViewButton(String url) {
    super("View");
    this.url = url;
    addClickHandler(this);
  }

  @Override
  public void onClick(ClickEvent event) {
    super.onClick(event);
    
    final PopupPanel popup = new RepeatPopup(url);
    popup.setPopupPositionAndShow(new PopupPanel.PositionCallback() {
      @Override
      public void setPosition(int offsetWidth, int offsetHeight) {
        int left = ((Window.getClientWidth() - offsetWidth) / 2);
        int top = ((Window.getClientHeight() - offsetHeight) / 2);
        popup.setPopupPosition(left, top);
      }
    });
  }
}