package com.ddoplanner.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ddoplanner.enhancement.Enhancement;
import com.ddoplanner.tree.BlankTree;
import com.ddoplanner.tree.ClassTree;
import com.ddoplanner.tree.EnhancementTree;
import com.ddoplanner.tree.RacialTree;

/**
 * @author Duke-H-
 * 
 *         Defines a DDO Character
 *         Race, Level, Class progression, TODO:Feats, TODO:Stats
 */
public class DDOCharacter {

	public DDOCharacter() {};
	
	public static void init(){
		classProgression = new ArrayList<Integer>(); //the exact order classes were taken in.
		pointsSpent = 0;
		characterRace = new String("human");
		alignment = new String("lawful good");
		racialTree = new RacialTree();
		takenPrestigeTrees = new ArrayList<ClassTree>(Arrays.asList(new BlankTree(), new BlankTree(), new BlankTree(), new BlankTree(), new BlankTree(), new BlankTree()));
		takenClasses = new ArrayList<Integer>();
		prestigeToClassMap = new HashMap<String, Integer>(){
	        {
	            put("kensai", 7);
	            put("stalwart", 7);
	            put("kotc", 8);
	            put("sacred", 8);
	        }
	    };
	};
	
	public static String getRace() {
		return characterRace;
	};
	
	public static int getNumberOfClasses() {
		return takenClasses.size();
	};

	public static List<Integer> getTakenClasses() {
		return takenClasses;
	};

	public static List<Integer> getClassProgression() {
		return classProgression;
	};

	public static boolean classTaken(int id) {
		for (int classID : takenClasses) {
			if (classID == id)
				return true;
		}
		return false;
	}

	public static void setClassProgression(ArrayList<Integer> cs) {
		classProgression = cs;
	}

	public static void addClassProgression(int i) {
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

	public static void addTakenClass(int i) {
		// Cap to 3
		if (takenClasses.size() < 3)
			takenClasses.add(i);
	}

	public static boolean pointAvailible(){
		if(pointsSpent < 80)
			return true;
		else
			return false;
	}
	public static void pointsSpent(String prestige, int ap){
		pointsSpent += ap;
		
		//update the trees points spent
		for(ClassTree ct : takenPrestigeTrees){
			if(ct.getPrestige().equalsIgnoreCase(prestige))
				ct.spendAp(ap);
		}

		if(prestige.equalsIgnoreCase(characterRace))
			racialTree.spendAp(ap);
	}
	
	public static void pointsRemoved(String prestige, int ap){
		pointsSpent -= ap;
		//update the trees points spent
		for(ClassTree ct : takenPrestigeTrees){
			if(ct.getPrestige().equalsIgnoreCase(prestige))
				ct.removeAp(ap);
		}

		if(prestige.equalsIgnoreCase(characterRace))
			racialTree.removeAp(ap);
	}
	
	public static void setRace(String race) {
		characterRace = race;
		racialTree = new RacialTree();
		return;
	}

	public static void setAlignment(String a) {
		alignment = a;
	}

	public static List<ClassTree> getTakenTrees() {
		return takenPrestigeTrees;
	}

	public static int getTreePointsSpent(String prestige){
		for(ClassTree ct : takenPrestigeTrees){
			if(ct.getPrestige().equalsIgnoreCase(prestige))
				return ct.spentAp();
		}

		if(prestige.equalsIgnoreCase(characterRace))
			return racialTree.spentAp();
		
		return 0;//default
	}
	
	public static int getEnhancementPointsSpent(String prestige, int id){
		for(ClassTree ct : takenPrestigeTrees){
			if(ct.getPrestige().equalsIgnoreCase(prestige))
				return ct.getEnhancement(id).pointsSpent();
		}

		if(prestige.equalsIgnoreCase(characterRace))
			return racialTree.getEnhancement(id).pointsSpent();
		
		return 0;//default
	}
	
	public static List<Enhancement> getEnhancements(String prestige, List<Integer> requiredList){
		
		List<Enhancement> el = new ArrayList<Enhancement>();
		
		for(ClassTree ct : takenPrestigeTrees){
			if(ct.getPrestige().equalsIgnoreCase(prestige)){
				for (int i : requiredList){
					el.add(ct.getEnhancement(i));
				}
			}
		}
		
		//check racial tree
		if(prestige.equalsIgnoreCase(characterRace)){
			//fetch all enhancement ids and match them to the required ids
			for (int i : requiredList){
				el.add(racialTree.getEnhancement(i));
			}
		}
		return el;
	};
	
	public static boolean hasEnhancements(String prestige, List<Integer> requiredList, int tier){
		
		List<Enhancement> el = new ArrayList<Enhancement>();
		
		//check prestige trees
		ClassTree ct = (ClassTree) getTree(prestige);
		
		List<Integer> integerList = new ArrayList<Integer>();
		//fetch all enhancement ids and match them to the required ids
		
		for (int i : requiredList){
			el.add(ct.getEnhancement(i));
		}
		
		for (int n = 0; n < el.size(); n++){
			integerList.add(el.get(n).getId());
		}	

		if(!integerList.containsAll(requiredList))//if not all enhancements are there, fail
			return false;
		
		integerList.clear();
		for (int n = 0; n < el.size(); n++){
			integerList.add(el.get(n).getTiersTaken());//get the tiers taken per required enhancement
		}					
		
		return true; //all requirements passed
	}
	
	public static int hasClassLevels(String prestige){
		if(prestige.equalsIgnoreCase(characterRace))//for safety
			return classProgression.size();
		
		int classId = prestigeToClassMap.get(prestige);
		int classLevels = Collections.frequency(classProgression, classId);
		
		return classLevels;
	}
	
	public static EnhancementTree getTree(String prestige){
		for(ClassTree ct : takenPrestigeTrees){
			if(ct.getPrestige().equalsIgnoreCase(prestige)){
				return ct;
			}
		}
		
		return racialTree; //if none of the class trees matched, just return the racial tree
	}
	
	public static void addPrestigeTree(String prestige) {
		if(takenPrestigeTrees.size() < 6) //only 6 trees allowed
			takenPrestigeTrees.add(new ClassTree(prestige));
	}
	
	public static void setTakenTree(int index, ClassTree tree) {
		takenPrestigeTrees.add(index, tree);
	}

	public static void reset(){
		classProgression.clear();
		takenPrestigeTrees.clear();
		characterRace = "";
		alignment = "";
		takenClasses.clear();
		pointsSpent = 0;
		
	};
	
	public static void resetTrees(){
		takenPrestigeTrees.clear();
		pointsSpent = 0;
	}
	
	private static List<Integer> classProgression;// = new ArrayList<Integer>(); //the exact order classes were taken in.
	private static String characterRace;// = new String("");
	private static String alignment;// = new String("");
	private static RacialTree racialTree;// = new RacialTree();
	private static List<ClassTree> takenPrestigeTrees;// = new ArrayList<ClassTree>(Arrays.asList(new BlankTree(), new BlankTree(), new BlankTree(), new BlankTree(), new BlankTree(), new BlankTree()));
	
	/*Taken Classes: 	0==None, 1==Artificer, 2==Barbarian, 3==Bard, 
						4==Cleric, 5==Druid, 6==FavoredSoul, 7==Fighter, 
						8==Paladin, 9==Ranger, 10==Rogue, 11==Sorceror, 12==Wizard */
	private static List<Integer> takenClasses;// = new ArrayList<Integer>();
	
	public static Map<String, Integer> prestigeToClassMap;/* = new HashMap<String, Integer>(){
        {
            put("kensai", 7);
            put("stalwart", 7);
        }
    };*/
	
	private static int pointsSpent;// = 0;

}
