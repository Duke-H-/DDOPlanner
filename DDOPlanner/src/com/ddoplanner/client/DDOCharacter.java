package com.ddoplanner.client;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Duke-H-
 * 
 *         Defines a DDO Character
 * 
 *         Race Level Class progression TODO:Feats TODO:Stats
 */
public class DDOCharacter {

	public DDOCharacter() {
	};

	public String getCharacterRace() {
		return characterRace;
	};

	public int getNumberOfClasses() {
		return takenClasses.size();
	};

	public List<Integer> getTakenClasses() {
		return takenClasses;
	};

	public List<Integer> getClassProgression() {
		return classProgression;
	};

	public boolean classTaken(int id) {
		for (int classID : takenClasses) {
			if (classID == id)
				return true;
		}
		return false;
	}

	public void setClassProgression(ArrayList<Integer> cs) {
		classProgression = cs;
	}

	public void addClassProgression(int i) {
		// Cap levels to 20
		if (classProgression.size() < 20) {
			// if class not taken, and not at the 3 class limit
			// add it to our unique class list
			if (!classTaken(i))
				addTakenClass(i);

			if (classTaken(i))
				classProgression.add(i);

		}
	}

	public void addTakenClass(int i) {
		// Cap to 3
		if (takenClasses.size() < 3)
			takenClasses.add(i);
	}

	public void setRace(String race) {
		characterRace = race;
	}

	public void setAlignment(String a) {
		alignment = a;
	}

	private List<Integer> classProgression = new ArrayList<Integer>();
	private String characterRace = new String("");
	private String alignment = new String("");
	private List<Integer> takenClasses = new ArrayList<Integer>();

}
