package com.ddoplanner.client;

import java.util.List;
import java.util.Map;

import com.ddoplanner.tree.ClassTree;
import com.ddoplanner.tree.PrestigeTitle;
import com.ddoplanner.tree.RacialTree;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DDOPlanner implements EntryPoint {
	
	Panel appContainer = new AbsolutePanel();
	Panel characterCreator = new FlowPanel();
	Panel buttonContainer = new HorizontalPanel();
	Panel prestigeContainer = new FlowPanel();
	Panel multipleTreeContainer = new HorizontalPanel();
	static Panel racialTreeContainer = new FlowPanel();
	static FlexTable classTreeContainer = new FlexTable();
		
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		//Set up logging
		LogHandler.init();
		LogHandler.info("onModuleLoad");
		
		DDOCharacter.init();
		
		initializePanels();
		
		CharacterCreator cc = new CharacterCreator(characterCreator);
		cc.generate();
	}
	
	/*	
	 * Set up all the content panels and give them the styles they need.
	 */
	protected void initializePanels(){
		RootPanel.get().add(appContainer);
		appContainer.addStyleName("appContainer");
		
		characterCreator.addStyleName("characterCreator");
		appContainer.add(characterCreator);
		
		buttonContainer.addStyleName("buttonContainer");
		appContainer.add(buttonContainer);
		
		prestigeContainer.addStyleName("prestigeContainer");
		appContainer.add(prestigeContainer);
		
		multipleTreeContainer.addStyleName("multipleTreeContainer");
		appContainer.add(multipleTreeContainer);
		
		racialTreeContainer.addStyleName("racialTreeContainer");
		multipleTreeContainer.add(racialTreeContainer);
		
		classTreeContainer.addStyleName("classTreeContainer");
		multipleTreeContainer.add(classTreeContainer);
		multipleTreeContainer.setVisible(false);
		
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
		
		// Process done, submit the character and load the tree view
		Button submitCharacter = new Button("Load enhancement trees");
		submitCharacter.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				loadTrees();
			}
		});
		buttonContainer.add(submitCharacter);
		
		// Process done, submit the character and load the tree view
		Button clearTrees = new Button("Clear trees");
		clearTrees.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				clearTrees();
			}
		});
		buttonContainer.add(clearTrees);
		
		appContainer.add(LogHandler.getLogPanel());
	}
	
	/*
	 * Load the list with buttons which the user uses to select a prestige class
	 */
	protected void loadPrestigeList(){
		
		//print all prestige buttons
		
		for(Map.Entry<String, Integer> entry : DDOCharacter.prestigeToClassMap.entrySet()){ //loop over all possible prestiges
			if(DDOCharacter.getTakenClasses().contains(entry.getValue())); //fetch those who match our classes
				new PrestigeTitle(entry.getKey(), classTreeContainer); //add them to the ui
		}

		
		PrestigeTitle pt = new PrestigeTitle("mechanic", classTreeContainer);
		
		
		//Prepare the images
		Image prestige1 = new Image("images/trees/title/mechanic_title.png");
		Image prestige2 = new Image("images/trees/title/assassin_title.png");
		Image prestige3 = new Image("images/trees/title/acrobat_title.png");
//		Image prestige4 = new Image
		
		//make clickhandlers

		
		//add clickhandlers
		
		
		//load images into container
//		prestigeContainer.add(prestige1);
//		prestigeContainer.add(prestige2);
//		prestigeContainer.add(prestige3);
		
	}
	
		
	/*
	 * Load all Trees
	 */
	protected void loadTrees(){
		
		/* Load the list with avalible prestige classes*/
		loadPrestigeList();
		
		/* reset the tree display */
		clearTrees();
		multipleTreeContainer.setVisible(true);

		updateRacialTree();
		updateClassTrees();

	}
	
	public static void updateClassTrees(){
		clearClassTrees();
		
		// loop over DDOCharacter.takenPrestigeTrees and show them
		List<ClassTree> ctl = DDOCharacter.getTakenTrees();
		classTreeContainer.setWidget(1, 0, ctl.get(0).getTree());
		classTreeContainer.setWidget(1, 1, ctl.get(1).getTree());
		classTreeContainer.setWidget(1, 2, ctl.get(2).getTree());
		classTreeContainer.setWidget(3, 0, ctl.get(3).getTree());
		classTreeContainer.setWidget(3, 1, ctl.get(4).getTree());
		classTreeContainer.setWidget(3, 2, ctl.get(5).getTree());

		
		//load the first three containers for trees
		ClassTree ct1 = new ClassTree("kensai");
		classTreeContainer.setWidget(1, 0, ct1.getTree());
		DDOCharacter.setTakenTree(0, ct1);
		
		ClassTree ct2 = new ClassTree("stalwart");
		classTreeContainer.setWidget(1, 1, ct2.getTree());
		DDOCharacter.setTakenTree(0, ct2);

	}
	
	public static void updateRacialTree(){
		RacialTree rt = (RacialTree) DDOCharacter.getTree(DDOCharacter.getRace());
		racialTreeContainer.clear();
		racialTreeContainer.add(rt.getTree());
	}
	
//	public static void addTree(int x, int y, PrestigeTitle pt){
//		
//	}
//	
//	public static void addFirstEmptyTree(PrestigeTitle pt){
////		int position = DDOCharacter.getFirstEmptyTree();
//	}
//	
	protected static void clearClassTrees(){
		classTreeContainer.clear();
		classTreeContainer.setCellSpacing(0);
		
		//Load a spacer row
		classTreeContainer.setWidget(0, 1, new Label(""));
		classTreeContainer.getFlexCellFormatter().addStyleName(0, 1, "spacer-top");
		
		//spacer row
		classTreeContainer.setWidget(2, 1, new Label("rowrowroworworowrowor"));
		classTreeContainer.getFlexCellFormatter().addStyleName(2, 1, "spacer-mid");
		
		//spacer row
		classTreeContainer.setWidget(4, 1, new Label("rowrowroworworowrowor"));
		classTreeContainer.getFlexCellFormatter().addStyleName(4, 1, "spacer-bot");
		
	}
	
	protected void clearTrees(){
		classTreeContainer.clear();
		racialTreeContainer.clear();
	}
}

