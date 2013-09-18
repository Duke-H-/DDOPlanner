package com.ddoplanner.enhancement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public final class EnhancementData {
	
	/**
	 * 
	 * @param prestige The prestige class as a string
	 * @param id Enhancement ID
	 * @return Information related to enhancement specified
	 */
	public static List<Integer> getPrestigeData(String prestige, int id){
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		if(prestige.equals("kensai")){
			l.add(kensaiMaxEnhancementTier.get(id));
			l.add(kensaiCostPerTier.get(id));
			l.add(prestigeNeedSpent.get(id));
			l.add(prestigeNeedClassLevel.get(id));
		}
		else if(prestige.equals("stalwart")){
			l.add(stalwartMaxEnhancementTier.get(id));
			l.add(stalwartCostPerTier.get(id));
			l.add(prestigeNeedSpent.get(id));
			l.add(prestigeNeedClassLevel.get(id));
		}
		else if(prestige.equals("human")){
			l.add(humanMaxEnhancementTier.get(id));
			l.add(raceNeedSpent.get(id));
			l.add(raceNeedLevel.get(id));
		}
		
		
		return l;
	}
	
	/*
	 * Lists that determine 
	 * MaxSpent - Maximum possible investment in an enhancement
	 * 	0 means disabled
	 * 	position 0 should always be disabled since it is not used.
	 * NeedSpent - Points needed in tree to unlock
	 */
	private static List<Integer> kensaiMaxEnhancementTier 	= new ArrayList<Integer>(Arrays.asList(0,1,1,1,1,0,3,1,0,0,1,3,1,3,3,1,3,1,3,3,3,3,1,1,3,3,1,1,1,1,1,1));
	private static List<Integer> kensaiCostPerTier			= new ArrayList<Integer>(Arrays.asList(0,1,1,1,1,0,2,2,0,0,2,2,2,2,1,2,2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1));
	
	private static List<Integer> stalwartMaxEnhancementTier = new ArrayList<Integer>(Arrays.asList(0,3,3,3,3,0,3,1,3,3,1,0,3,3,3,1,3,3,3,3,3,3,3,3,3,3,1,1,1,1,1,1));
	private static List<Integer> stalwartCostPerTier		= new ArrayList<Integer>(Arrays.asList(0,1,1,1,2,0,1,1,1,2,2,0,1,1,1,2,1,1,2,1,1,1,1,2,1,1,1,1,1,1,1,1));
	
	private static List<Integer> humanMaxEnhancementTier 	= new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,3,1,1,1,1,3,1,1,1,3,3,0,3,3,3,3,1,3,1,1,1,1,1,0));
	
	
	private static List<Integer> prestigeNeedSpent 		= new ArrayList<Integer>(Arrays.asList(0,30,30,30,30,30,20,20,20,20,20,10,10,10,10,10,5,5,5,5,5,1,1,1,1,1,0,5,10,15,20,30,40));
	private static List<Integer> prestigeNeedClassLevel	= new ArrayList<Integer>(Arrays.asList(0,5,5,5,5,5,4,4,4,4,4,3,3,3,3,3,2,2,2,2,2,1,1,1,1,1,1,3,6,12,15,18,20));
	
	
	
	//For now there are only racial enhancements up to tier4, blanking out tier5 with 0
	//Only racial core enhancements have a level requirement
	private static List<Integer> raceNeedSpent	= new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,15,15,15,15,15,10,10,10,10,10,5,5,5,5,5,1,1,1,1,1,0,0,0,0,0,0));
	private static List<Integer> raceNeedLevel 	= new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,4,8,16,0));
}
