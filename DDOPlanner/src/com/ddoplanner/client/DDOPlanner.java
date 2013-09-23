package com.ddoplanner.client;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
				DDOCharacter.resetTrees();
				loadTrees();
			}
		});
		buttonContainer.add(clearTrees);
		
		appContainer.add(LogHandler.getLogPanel());
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
	
	/*
	 * Helper function that iterates through a map and gets keys by value
	 * Using this to fetch the prestige classes for each character class.
	 */
	private static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
	     Set<T> keys = new HashSet<T>();
	     for (Entry<T, E> entry : map.entrySet()) {
	         if (value.equals(entry.getValue())) {
	             keys.add(entry.getKey());
	         }
	     }
	     return keys;
	}
	
	/*
	 * Load the list with buttons which the user uses to select a prestige class
	 */
	protected void loadPrestigeList(){
		//print all prestige buttons
		prestigeContainer.clear();
		
		for(int classId : DDOCharacter.getTakenClasses()){//loop over all possible prestige classes
			if(DDOCharacter.prestigeToClassMap.containsValue(classId)){ //check to see if there is any valid
				Set<String> prestigeSet = getKeysByValue(DDOCharacter.prestigeToClassMap, classId);//fetch those who match our classes
				for(String prestige : prestigeSet){
					new PrestigeTitle(prestige, prestigeContainer); //add them to the ui
				}
			}	
		}
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
	}
	
	public static void updateRacialTree(){
		RacialTree rt = (RacialTree) DDOCharacter.getTree(DDOCharacter.getRace());
		racialTreeContainer.clear();
		racialTreeContainer.add(rt.getTree());
	}
	
	protected static void clearClassTrees(){
		classTreeContainer.clear();
		classTreeContainer.setCellSpacing(0);
		
		//Load a spacer row
		classTreeContainer.setWidget(0, 1, new Label(""));
		classTreeContainer.getFlexCellFormatter().addStyleName(0, 1, "spacer-top");
		
		//spacer row
		classTreeContainer.setWidget(2, 1, new Label(""));
		classTreeContainer.getFlexCellFormatter().addStyleName(2, 1, "spacer-mid");
		
		//spacer row
		classTreeContainer.setWidget(4, 1, new Label(""));
		classTreeContainer.getFlexCellFormatter().addStyleName(4, 1, "spacer-bot");
	}
	
	protected void clearTrees(){
		classTreeContainer.clear();
		racialTreeContainer.clear();
	}
}

