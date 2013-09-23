package com.ddoplanner.tree;

import com.ddoplanner.client.DDOCharacter;
import com.ddoplanner.client.DDOPlanner;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Panel;

public class PrestigeTitle extends Image{
	
	public PrestigeTitle(final String prestige, Panel prestigeContainer){
		String url = "/images/trees/title/" + prestige + "_title.png";
		super.setUrl(url);
		super.setStyleName("prestigeTitle");
		
		ClickHandler clickHandler = new ClickHandler(){
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				PrestigeTitle source = (PrestigeTitle) event.getSource();
				DDOCharacter.addPrestigeTree(prestige);
				DDOPlanner.updateClassTrees();
			}
		};
		this.addClickHandler(clickHandler);
		
		prestigeContainer.add(this);
	}
}
