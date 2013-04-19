package com.ddoplanner.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * @author Duke-H-
 *
 * @
 */
public class CharacterCreator {

	private DDOCharacter character = new DDOCharacter();
	List<Image> selectClassImageList = new ArrayList<Image>(); // use this list to manipulate the visible classes
	
	//Some layout panels
	Panel characterCreation = new FlowPanel();
	Panel selectAttributesContainer = new FlowPanel();
	Panel selectClassContainer = new FlowPanel();
	Panel selectedClasses = new FlowPanel();

	public DDOCharacter generate() {

		RootPanel.get().add(characterCreation);
		characterCreation.add(selectAttributesContainer);
		characterCreation.add(selectClassContainer);
		characterCreation.add(selectedClasses);

		characterCreation.setStylePrimaryName("characterCreation");
		selectAttributesContainer.setStylePrimaryName("selectAttributesContainer");
		selectClassContainer.addStyleName("selectClassContainer");
		selectedClasses.addStyleName("selectedClasses");
		
		generateRace();
		generateAlignment();
		generateClassLevels();
		generateReset();

		// Process done, submit the character and load the tree view
		Button submitCharacter = new Button("Load enhancement trees");
		submitCharacter.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// hide char generation
				// load trees
			}
		});
		characterCreation.add(submitCharacter);

		return character;
	}

	public void generateRace() {
		final ListBox selectRace = new ListBox();
		selectRace.addItem("Select Race");
		selectRace.addItem("Drow Elf");
		selectRace.addItem("Dwarf");
		selectRace.addItem("Elf");
		selectRace.addItem("Halfling");
		selectRace.addItem("Half Elf");
		selectRace.addItem("Half Orc");
		selectRace.addItem("Human");
		selectRace.addItem("Warforged");
		selectRace.setVisibleItemCount(1);
		selectAttributesContainer.add(selectRace);

		selectRace.addChangeHandler(new ChangeHandler() {
			public void onChange(
					com.google.gwt.event.dom.client.ChangeEvent event) {
				int index = selectRace.getSelectedIndex();
				if (index > 0)
					character.setRace(selectRace.getValue(index));
			}
		});
	}

	public void generateAlignment() {
		final ListBox selectAlignment = new ListBox();
		selectAlignment.addItem("Select Alignment");
		selectAlignment.addItem("Lawful Good");
		selectAlignment.addItem("Neutral Good");
		selectAlignment.addItem("ChaoticGood");
		selectAlignment.addItem("Lawful Neutral");
		selectAlignment.addItem("True Neutral");
		selectAlignment.addItem("Chaotic Neutral");
		selectAlignment.setVisibleItemCount(1);
		selectAttributesContainer.add(selectAlignment);

		selectAlignment.addChangeHandler(new ChangeHandler() {
			public void onChange(
					com.google.gwt.event.dom.client.ChangeEvent event) {
				int index = selectAlignment.getSelectedIndex();
				if (index > 0)
					character.setAlignment(selectAlignment.getValue(index));
			}
		});
	}

	public void generateClassLevels() {
		final HorizontalPanel selectClassLevels = new HorizontalPanel();
		final Image artificerSelect = new Image("images/classes/artificer.png");
		final Image barbarianSelect = new Image("images/classes/barbarian.png");
		final Image bardSelect = new Image("images/classes/bard.png");
		final Image clericSelect = new Image("images/classes/cleric.png");
		final Image druidSelect = new Image("images/classes/druid.png");
		final Image favoredsoulSelect = new Image("images/classes/favoredsoul.png");
		final Image fighterSelect = new Image("images/classes/fighter.png");
		final Image monkSelect = new Image("images/classes/monk.png");
		final Image paladinSelect = new Image("images/classes/paladin.png");
		final Image rangerSelect = new Image("images/classes/ranger.png");
		final Image rogueSelect = new Image("images/classes/rogue.png");
		final Image sorcererSelect = new Image("images/classes/sorcerer.png");
		final Image wizardSelect = new Image("images/classes/wizard.png");

		selectClassImageList.add(artificerSelect);
		selectClassImageList.add(barbarianSelect);
		selectClassImageList.add(bardSelect);
		selectClassImageList.add(clericSelect);
		selectClassImageList.add(druidSelect);
		selectClassImageList.add(favoredsoulSelect);
		selectClassImageList.add(fighterSelect);
		selectClassImageList.add(monkSelect);
		selectClassImageList.add(paladinSelect);
		selectClassImageList.add(rangerSelect);
		selectClassImageList.add(rogueSelect);
		selectClassImageList.add(sorcererSelect);
		selectClassImageList.add(wizardSelect);

		// Add the selected classes to the class list
		class ClassSelectHandler implements MouseDownHandler {
			public void onMouseDown(MouseDownEvent event) {
				// find the selected class id
				Widget sender = (Widget) event.getSource();

				if (sender == artificerSelect) {
					takeClass(1);
				} else if (sender == barbarianSelect) {
					takeClass(2);
				} else if (sender == bardSelect) {
					takeClass(3);
				} else if (sender == clericSelect) {
					takeClass(4);
				} else if (sender == druidSelect) {
					takeClass(5);
				} else if (sender == favoredsoulSelect) {
					takeClass(6);
				} else if (sender == fighterSelect) {
					takeClass(7);
				} else if (sender == monkSelect) {
					takeClass(8);
				} else if (sender == paladinSelect) {
					takeClass(9);
				} else if (sender == rangerSelect) {
					takeClass(10);
				} else if (sender == rogueSelect) {
					takeClass(11);
				} else if (sender == sorcererSelect) {
					takeClass(12);
				} else if (sender == wizardSelect) {
					takeClass(13);
				}
			}
		}

		MouseDownHandler classSelectHandler = new ClassSelectHandler();
		for (Image img : selectClassImageList) {
			img.addMouseDownHandler(classSelectHandler);
			selectClassLevels.add(img);
		}

		selectClassContainer.add(selectClassLevels);
	}

	public void generateReset() {
		Button resetCharacter = new Button("Reset class progression");
		resetCharacter.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				character = new DDOCharacter();
				refreshClassList();
				refreshTakenClassList();

			}
		});
		characterCreation.add(resetCharacter);
	}

	private void takeClass(int classID) {
		// must not have 20 levels already
		if (character.getClassProgression().size() < 20) {
			character.addClassProgression(classID);
			refreshClassList();
			refreshTakenClassList();
		}
	}

	private void refreshClassList() {
		selectClassContainer.clear();
		
		// first show all classes
		for (Image img : selectClassImageList) {
			selectClassContainer.add(img);
		}

		// then set visibility of classbuttons depending on classes taken
		int i = 1;
		if (character.getTakenClasses().size() >= 3) {
			
			selectClassContainer.clear();
			
			for (Image img : selectClassImageList) {
				if(character.classTaken(i)){
					selectClassContainer.add(img);
				}
				else{
					//making this a new image also gets rid of the handler for adding classes
					selectClassContainer.add(new Image("images/general/forbidden50x50black.png"));
				}
					
				++i;
			}
		}
	}

	private void refreshTakenClassList() {
		selectedClasses.clear();
		for (int classTaken : character.getClassProgression()) {
			if (classTaken == 1)
				selectedClasses.add(new Image("images/classes/artificer.png"));
			else if (classTaken == 2)
				selectedClasses.add(new Image("images/classes/barbarian.png"));
			else if (classTaken == 3)
				selectedClasses.add(new Image("images/classes/bard.png"));
			else if (classTaken == 4)
				selectedClasses.add(new Image("images/classes/cleric.png"));
			else if (classTaken == 5)
				selectedClasses.add(new Image("images/classes/druid.png"));
			else if (classTaken == 6)
				selectedClasses.add(new Image("images/classes/favoredsoul.png"));
			else if (classTaken == 7)
				selectedClasses.add(new Image("images/classes/fighter.png"));
			else if (classTaken == 8)
				selectedClasses.add(new Image("images/classes/monk.png"));
			else if (classTaken == 9)
				selectedClasses.add(new Image("images/classes/paladin.png"));
			else if (classTaken == 10)
				selectedClasses.add(new Image("images/classes/ranger.png"));
			else if (classTaken == 11)
				selectedClasses.add(new Image("images/classes/rogue.png"));
			else if (classTaken == 12)
				selectedClasses.add(new Image("images/classes/sorcerer.png"));
			else if (classTaken == 13)
				selectedClasses.add(new Image("images/classes/wizard.png"));
		}
	}

}
