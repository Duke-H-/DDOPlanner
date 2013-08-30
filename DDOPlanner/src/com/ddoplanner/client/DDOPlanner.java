package com.ddoplanner.client;

import com.ddoplanner.tree.RacialTree;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DDOPlanner implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	Panel appContainer = new AbsolutePanel();
	Panel characterCreator = new FlowPanel();
	Panel buttonContainer = new HorizontalPanel();
	Panel multipleTreeContainer = new FlowPanel();
	
	DDOCharacter character = new DDOCharacter();
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		initializePanels();
		
		CharacterCreator cc = new CharacterCreator(characterCreator);
		character = cc.generate();
		
		
		//Add tables here.

		
	}
	
	
	protected void initializePanels(){
		RootPanel.get().add(appContainer);
		appContainer.addStyleName("appContainer");
		appContainer.add(new Label("foo"));
		
		characterCreator.addStyleName("characterCreator");
		appContainer.add(characterCreator);
		
		buttonContainer.addStyleName("buttonContainer");
		appContainer.add(buttonContainer);
		
		multipleTreeContainer.addStyleName("multipleTreeContainer");
		appContainer.add(multipleTreeContainer);
		
		final Button toggleCharacter = new Button("Hide Character");
		toggleCharacter.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if(characterCreator.isVisible()){
					characterCreator.setVisible(false);
					toggleCharacter.setText("Show Character");
				}
				else{
					characterCreator.setVisible(true);
					toggleCharacter.setText("Hide Character");
				}
			}
		});
		buttonContainer.add(toggleCharacter);
		
		appContainer.add(new Label("bar"));
	}
	
	protected void loadTrees(DDOCharacter c){
		multipleTreeContainer.add(new RacialTree().getTree());
		//Load all availible trees for the classes selected with priority to the main class
		//Restrict tree windows to cap (6+racial)
		
		
	}
}

