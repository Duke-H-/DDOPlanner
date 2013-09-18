package com.ddoplanner.client;

import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.PopupPanel;

public class MyTooltip extends PopupPanel {
    /**
     * @param html
     *            is to pass tip information.
     */
    public MyTooltip(final HTMLPanel html) {
        super(true);
        setWidget(html);
    }
}
