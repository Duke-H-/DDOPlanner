package com.ddoplanner.enhancement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class EnhancementFactory {

	public static List<Enhancement> build(String prestige){
		
		if(prestige.equalsIgnoreCase("kensai")){
			return buildKensai();
		}
		else if(prestige.equalsIgnoreCase("stalwart")){
			return buildStalwart();
		}
		else if(prestige.equalsIgnoreCase("kotc")){
			return buildKotc();
		}
		else if(prestige.equalsIgnoreCase("sacred")){
			return buildSacred();
		}
		
		if(prestige.equalsIgnoreCase("human")){
			return buildHuman();
		}
		else if(prestige.equalsIgnoreCase("elf")){
			return buildElf();
		}
		else if(prestige.equalsIgnoreCase("halfling")){
			return buildHalfling();
		}
		
		return el;
	};
	
	private static List<Enhancement> buildKensai(){
			el.clear();
			//					id, prestige, treeTier, multipleSelector, maxRank, 		apPerTier,		requireApSpent, 		 requireAllOf
			el.add(new Enhancement(1, "kensai", 5, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 30, 5, new ArrayList<Integer>(Arrays.asList(6))));
			el.add(new Enhancement(2, "kensai", 5, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 30, 5, new ArrayList<Integer>(Arrays.asList(7))));
			el.add(new Enhancement(3, "kensai", 5, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 30, 5, new ArrayList<Integer>(Arrays.asList(2,4))));
			el.add(new Enhancement(4, "kensai", 5, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 30, 5, new ArrayList<Integer>(Arrays.asList(14))));
			el.add(new Enhancement(5, "kensai", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 30, 5, new ArrayList<Integer>(Arrays.asList(0))));
			
			el.add(new Enhancement(6, "kensai", 4, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 20, 4, new ArrayList<Integer>(Arrays.asList(11))));
			el.add(new Enhancement(7, "kensai", 4, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 	20, 4, new ArrayList<Integer>(Arrays.asList(12))));
			el.add(new Enhancement(8, "kensai", 4, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 	20, 4, new ArrayList<Integer>(Arrays.asList(0))));
			el.add(new Enhancement(9, "kensai", 4, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 	20, 4, new ArrayList<Integer>(Arrays.asList(0))));
			el.add(new Enhancement(10, "kensai", 4, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 	20, 4, new ArrayList<Integer>(Arrays.asList(15))));
			
			el.add(new Enhancement(11, "kensai", 3, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	10, 3, new ArrayList<Integer>(Arrays.asList(0))));
			el.add(new Enhancement(12, "kensai", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 3, new ArrayList<Integer>(Arrays.asList(17))));
			el.add(new Enhancement(13, "kensai", 3, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	10, 3, new ArrayList<Integer>(Arrays.asList(18))));
			el.add(new Enhancement(14, "kensai", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 3, new ArrayList<Integer>(Arrays.asList(19))));
			el.add(new Enhancement(15, "kensai", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 3, new ArrayList<Integer>(Arrays.asList(0))));
			
			el.add(new Enhancement(16, "kensai", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
			el.add(new Enhancement(17, "kensai", 2, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		5, 2, new ArrayList<Integer>(Arrays.asList(22))));
			el.add(new Enhancement(18, "kensai", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
			el.add(new Enhancement(19, "kensai", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 2, new ArrayList<Integer>(Arrays.asList(24))));
			el.add(new Enhancement(20, "kensai", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
			
			el.add(new Enhancement(21, "kensai", 1, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
			el.add(new Enhancement(22, "kensai", 1, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		1, 1, new ArrayList<Integer>(Arrays.asList(26))));
			el.add(new Enhancement(23, "kensai", 1, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		1, 1, new ArrayList<Integer>(Arrays.asList(22,26))));
			el.add(new Enhancement(24, "kensai", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
			el.add(new Enhancement(25, "kensai", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
			
			el.add(new Enhancement(26, "kensai", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 1, 	new ArrayList<Integer>(Arrays.asList(0))));
			el.add(new Enhancement(27, "kensai", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),5, 3, 	new ArrayList<Integer>(Arrays.asList(26))));
			el.add(new Enhancement(28, "kensai", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),10, 6, 	new ArrayList<Integer>(Arrays.asList(27))));
			el.add(new Enhancement(29, "kensai", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),20, 12,	new ArrayList<Integer>(Arrays.asList(28))));
			el.add(new Enhancement(30, "kensai", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),30, 18,	new ArrayList<Integer>(Arrays.asList(29))));
			el.add(new Enhancement(31, "kensai", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),40, 20,	new ArrayList<Integer>(Arrays.asList(30))));
			
			return el;
	};
	
	private static List<Enhancement> buildStalwart(){
		el.clear();
		//					id, prestige, multipleSelector, maxRank, 		apPerTier,		requireApSpent, 		 requireAllOf
		el.add(new Enhancement(1, "stalwart", 5, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	30, 5, new ArrayList<Integer>(Arrays.asList(6))));
		el.add(new Enhancement(2, "stalwart", 5, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	30, 5, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(3, "stalwart", 5, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	30, 5, new ArrayList<Integer>(Arrays.asList(8))));
		el.add(new Enhancement(4, "stalwart", 5, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	30, 5, new ArrayList<Integer>(Arrays.asList(9))));
		el.add(new Enhancement(5, "stalwart", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 		30, 5, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(6, "stalwart", 4, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	20, 4, new ArrayList<Integer>(Arrays.asList(16))));
		el.add(new Enhancement(7, "stalwart", 4, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 		20, 4, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(8, "stalwart", 4, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	20, 4, new ArrayList<Integer>(Arrays.asList(13))));
		el.add(new Enhancement(9, "stalwart", 4, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	20, 4, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(10, "stalwart", 4, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		20, 4, new ArrayList<Integer>(Arrays.asList(15))));
		
		el.add(new Enhancement(11, "stalwart", 3, false, 0, new ArrayList<Integer>(Arrays.asList(0)),	 	10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(12, "stalwart", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 3, new ArrayList<Integer>(Arrays.asList(17))));
		el.add(new Enhancement(13, "stalwart", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(14, "stalwart", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 3, new ArrayList<Integer>(Arrays.asList(19))));
		el.add(new Enhancement(15, "stalwart", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(16, "stalwart", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(17, "stalwart", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)),	5, 2, new ArrayList<Integer>(Arrays.asList(22))));
		el.add(new Enhancement(18, "stalwart", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 2, new ArrayList<Integer>(Arrays.asList(23))));
		el.add(new Enhancement(19, "stalwart", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(20, "stalwart", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(21, "stalwart", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(22, "stalwart", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(23, "stalwart", 1, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(24, "stalwart", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(25, "stalwart", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		
		el.add(new Enhancement(26, "stalwart", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 1, 	new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(27, "stalwart", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),5, 3, 	new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(28, "stalwart", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),10, 6, 	new ArrayList<Integer>(Arrays.asList(27))));
		el.add(new Enhancement(29, "stalwart", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),20, 12,	new ArrayList<Integer>(Arrays.asList(28))));
		el.add(new Enhancement(30, "stalwart", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),30, 18,	new ArrayList<Integer>(Arrays.asList(29))));
		el.add(new Enhancement(31, "stalwart", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),40, 20,	new ArrayList<Integer>(Arrays.asList(30))));
		
		return el;
};
	
	private static List<Enhancement> buildKotc(){
		el.clear();
		//					id, prestige, treeTier, multipleSelector, maxRank, 		apPerTier,		requireApSpent, 		 requireAllOf
		el.add(new Enhancement(1, "kotc", 5, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 30, 5, new ArrayList<Integer>(Arrays.asList(6))));
		el.add(new Enhancement(2, "kotc", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 30, 5, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(3, "kotc", 5, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 30, 5, new ArrayList<Integer>(Arrays.asList(8))));
		el.add(new Enhancement(4, "kotc", 5, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 30, 5, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(5, "kotc", 5, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 30, 5, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(6, "kotc", 4, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 	20, 4, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(7, "kotc", 4, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)),20, 4, new ArrayList<Integer>(Arrays.asList(12))));
		el.add(new Enhancement(8, "kotc", 4, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 	20, 4, new ArrayList<Integer>(Arrays.asList(13))));
		el.add(new Enhancement(9, "kotc", 4, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 	20, 4, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(10, "kotc", 4, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 	20, 4, new ArrayList<Integer>(Arrays.asList(15))));
		
		el.add(new Enhancement(11, "kotc", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(12, "kotc", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(13, "kotc", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)),		10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(14, "kotc", 3, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(15, "kotc", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(16, "kotc", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 2, new ArrayList<Integer>(Arrays.asList(21))));
		el.add(new Enhancement(17, "kotc", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(18, "kotc", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(19, "kotc", 2, false, 2, new ArrayList<Integer>(Arrays.asList(1,1)), 	5, 2, new ArrayList<Integer>(Arrays.asList(24))));
		el.add(new Enhancement(20, "kotc", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(21, "kotc", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(22, "kotc", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(23, "kotc", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(24, "kotc", 1, false, 2, new ArrayList<Integer>(Arrays.asList(1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(25, "kotc", 1, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		
		el.add(new Enhancement(26, "kotc", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 1, 	new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(27, "kotc", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),5, 3, 	new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(28, "kotc", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),10, 6, 	new ArrayList<Integer>(Arrays.asList(27))));
		el.add(new Enhancement(29, "kotc", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),20, 12,	new ArrayList<Integer>(Arrays.asList(28))));
		el.add(new Enhancement(30, "kotc", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),30, 18,	new ArrayList<Integer>(Arrays.asList(29))));
		el.add(new Enhancement(31, "kotc", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),40, 20,	new ArrayList<Integer>(Arrays.asList(30))));
		
		return el;
	};

	private static List<Enhancement> buildSacred(){
		el.clear();
		//					id, prestige, multipleSelector, maxRank, 		apPerTier,		requireApSpent, 		 requireAllOf
		el.add(new Enhancement(1, "sacred", 5, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	30, 5, new ArrayList<Integer>(Arrays.asList(6))));
		el.add(new Enhancement(2, "sacred", 5, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	30, 5, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(3, "sacred", 5, false, 0, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	30, 5, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(4, "sacred", 5, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	30, 5, new ArrayList<Integer>(Arrays.asList(9))));
		el.add(new Enhancement(5, "sacred", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 		30, 5, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(6, "sacred", 4, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	20, 4, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(7, "sacred", 4, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	20, 4, new ArrayList<Integer>(Arrays.asList(12))));
		el.add(new Enhancement(8, "sacred", 4, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 		20, 4, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(9, "sacred", 4, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	20, 4, new ArrayList<Integer>(Arrays.asList(14))));
		el.add(new Enhancement(10, "sacred", 4, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 	20, 4, new ArrayList<Integer>(Arrays.asList(15))));
		
		el.add(new Enhancement(11, "sacred", 3, false, 0, new ArrayList<Integer>(Arrays.asList(0)),	 		10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(12, "sacred", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 3, new ArrayList<Integer>(Arrays.asList(17))));
		el.add(new Enhancement(13, "sacred", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 3, new ArrayList<Integer>(Arrays.asList(18))));
		el.add(new Enhancement(14, "sacred", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(15, "sacred", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 3, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(16, "sacred", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(17, "sacred", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)),		5, 2, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(18, "sacred", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 2, new ArrayList<Integer>(Arrays.asList(23))));
		el.add(new Enhancement(19, "sacred", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 2, new ArrayList<Integer>(Arrays.asList(24))));
		el.add(new Enhancement(20, "sacred", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 2, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(21, "sacred", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(22, "sacred", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(23, "sacred", 1, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(24, "sacred", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(25, "sacred", 1, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	1, 1, new ArrayList<Integer>(Arrays.asList(26))));
		
		el.add(new Enhancement(26, "sacred", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 1, 	new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(27, "sacred", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),5, 3, 	new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(28, "sacred", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),10, 6, 	new ArrayList<Integer>(Arrays.asList(27))));
		el.add(new Enhancement(29, "sacred", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),20, 12,	new ArrayList<Integer>(Arrays.asList(28))));
		el.add(new Enhancement(30, "sacred", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),30, 18,	new ArrayList<Integer>(Arrays.asList(29))));
		el.add(new Enhancement(31, "sacred", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),40, 20,	new ArrayList<Integer>(Arrays.asList(30))));
		
		return el;
	};

	private static List<Enhancement> buildHuman(){
		el.clear();
		//					id, prestige, treeTier, multipleSelector, maxRank, 		apPerTier,	requireApSpent	reqClassLevel	 requireAllOf
		el.add(new Enhancement(1, "human", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(2, "human", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(3, "human", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(4, "human", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(5, "human", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(6, "human", 4, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 		15, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(7, "human", 4, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 		15, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(8, "human", 4, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	15, 0, new ArrayList<Integer>(Arrays.asList(13))));
		el.add(new Enhancement(9, "human", 4, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		15, 0, new ArrayList<Integer>(Arrays.asList(14))));
		el.add(new Enhancement(10, "human", 4, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		15, 0, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(11, "human", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 0, new ArrayList<Integer>(Arrays.asList(16))));
		el.add(new Enhancement(12, "human", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 0, new ArrayList<Integer>(Arrays.asList(17))));
		el.add(new Enhancement(13, "human", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 0, new ArrayList<Integer>(Arrays.asList(18))));
		el.add(new Enhancement(14, "human", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 0, new ArrayList<Integer>(Arrays.asList(24))));
		el.add(new Enhancement(15, "human", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 0, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(16, "human", 2, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		5, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(17, "human", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 0, new ArrayList<Integer>(Arrays.asList(22))));
		el.add(new Enhancement(18, "human", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 0, new ArrayList<Integer>(Arrays.asList(23))));
		el.add(new Enhancement(19, "human", 2, false, 0, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(20, "human", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 0, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(21, "human", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(22, "human", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(23, "human", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(24, "human", 1, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(25, "human", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		
		el.add(new Enhancement(26, "human", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 1, 	new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(27, "human", 0, false, 1, new ArrayList<Integer>(Arrays.asList(2)),0, 2, 	new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(28, "human", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 4, 	new ArrayList<Integer>(Arrays.asList(27))));
		el.add(new Enhancement(29, "human", 0, false, 1, new ArrayList<Integer>(Arrays.asList(2)),0, 8,		new ArrayList<Integer>(Arrays.asList(28))));
		el.add(new Enhancement(30, "human", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 16,	new ArrayList<Integer>(Arrays.asList(29))));
		el.add(new Enhancement(31, "human", 0, false, 0, new ArrayList<Integer>(Arrays.asList(0)),0, 20,	new ArrayList<Integer>(Arrays.asList(30))));//not used
		
		return el;
	};
	
	private static List<Enhancement> buildElf(){
		el.clear();
		//					id, prestige, treeTier, multipleSelector, maxRank, 		apPerTier,	requireApSpent	reqClassLevel	 requireAllOf
		el.add(new Enhancement(1, "elf", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(2, "elf", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(3, "elf", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(4, "elf", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(5, "elf", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(6, "elf", 4, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 	15, 0, new ArrayList<Integer>(Arrays.asList(11))));
		el.add(new Enhancement(7, "elf", 4, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 	15, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(8, "elf", 4, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 	15, 0, new ArrayList<Integer>(Arrays.asList(9))));
		el.add(new Enhancement(9, "elf", 4, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 	15, 0, new ArrayList<Integer>(Arrays.asList(14))));
		el.add(new Enhancement(10, "elf", 4, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 	15, 0, new ArrayList<Integer>(Arrays.asList(9))));
		
		el.add(new Enhancement(11, "elf", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 0, new ArrayList<Integer>(Arrays.asList(16))));
		el.add(new Enhancement(12, "elf", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 0, new ArrayList<Integer>(Arrays.asList(17))));
		el.add(new Enhancement(13, "elf", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 0, new ArrayList<Integer>(Arrays.asList(12))));
		el.add(new Enhancement(14, "elf", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 0, new ArrayList<Integer>(Arrays.asList(19))));
		el.add(new Enhancement(15, "elf", 3, false, 1, new ArrayList<Integer>(Arrays.asList(4)), 		10, 0, new ArrayList<Integer>(Arrays.asList(20))));
		
		el.add(new Enhancement(16, "elf", 2, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		5, 0, new ArrayList<Integer>(Arrays.asList(21))));
		el.add(new Enhancement(17, "elf", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(18, "elf", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 0, new ArrayList<Integer>(Arrays.asList(23))));
		el.add(new Enhancement(19, "elf", 2, false, 1, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 0, new ArrayList<Integer>(Arrays.asList(24))));
		el.add(new Enhancement(20, "elf", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 0, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(21, "elf", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(22, "elf", 1, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 		1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(23, "elf", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(24, "elf", 1, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(25, "elf", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		
		el.add(new Enhancement(26, "elf", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 1, 	new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(27, "elf", 0, false, 1, new ArrayList<Integer>(Arrays.asList(2)),0, 2, 	new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(28, "elf", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 4, 	new ArrayList<Integer>(Arrays.asList(27))));
		el.add(new Enhancement(29, "elf", 0, false, 1, new ArrayList<Integer>(Arrays.asList(2)),0, 8,	new ArrayList<Integer>(Arrays.asList(28))));
		el.add(new Enhancement(30, "elf", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 16,	new ArrayList<Integer>(Arrays.asList(29))));
		el.add(new Enhancement(31, "elf", 0, false, 0, new ArrayList<Integer>(Arrays.asList(0)),0, 20,	new ArrayList<Integer>(Arrays.asList(30))));//not used
		
		return el;
	};

	private static List<Enhancement> buildHalfling(){
		el.clear();//TODO: not done here tiers and max rank and the rest, only name correct
		//					id, prestige, treeTier, multipleSelector, maxRank, 		apPerTier,	requireApSpent	reqClassLevel	 requireAllOf
		el.add(new Enhancement(1, "halfling", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(2, "halfling", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(3, "halfling", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(4, "halfling", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(5, "halfling", 5, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 20, 0, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(6, "halfling", 4, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 	15, 0, new ArrayList<Integer>(Arrays.asList(11))));
		el.add(new Enhancement(7, "halfling", 4, false, 0, new ArrayList<Integer>(Arrays.asList(0)), 	15, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(8, "halfling", 4, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 	15, 0, new ArrayList<Integer>(Arrays.asList(9))));
		el.add(new Enhancement(9, "halfling", 4, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 	15, 0, new ArrayList<Integer>(Arrays.asList(14))));
		el.add(new Enhancement(10, "halfling", 4, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 	15, 0, new ArrayList<Integer>(Arrays.asList(9))));
		
		el.add(new Enhancement(11, "halfling", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 0, new ArrayList<Integer>(Arrays.asList(16))));
		el.add(new Enhancement(12, "halfling", 3, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	10, 0, new ArrayList<Integer>(Arrays.asList(17))));
		el.add(new Enhancement(13, "halfling", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 0, new ArrayList<Integer>(Arrays.asList(12))));
		el.add(new Enhancement(14, "halfling", 3, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		10, 0, new ArrayList<Integer>(Arrays.asList(19))));
		el.add(new Enhancement(15, "halfling", 3, false, 1, new ArrayList<Integer>(Arrays.asList(4)), 		10, 0, new ArrayList<Integer>(Arrays.asList(20))));
		
		el.add(new Enhancement(16, "halfling", 2, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		5, 0, new ArrayList<Integer>(Arrays.asList(21))));
		el.add(new Enhancement(17, "halfling", 2, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	5, 0, new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(18, "halfling", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 0, new ArrayList<Integer>(Arrays.asList(23))));
		el.add(new Enhancement(19, "halfling", 2, false, 1, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 0, new ArrayList<Integer>(Arrays.asList(24))));
		el.add(new Enhancement(20, "halfling", 2, false, 3, new ArrayList<Integer>(Arrays.asList(2,2,2)), 	5, 0, new ArrayList<Integer>(Arrays.asList(0))));
		
		el.add(new Enhancement(21, "halfling", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(22, "halfling", 1, false, 1, new ArrayList<Integer>(Arrays.asList(1)), 		1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(23, "halfling", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(24, "halfling", 1, false, 1, new ArrayList<Integer>(Arrays.asList(2)), 		1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(25, "halfling", 1, false, 3, new ArrayList<Integer>(Arrays.asList(1,1,1)), 	1, 0, new ArrayList<Integer>(Arrays.asList(26))));
		
		el.add(new Enhancement(26, "halfling", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 1, 	new ArrayList<Integer>(Arrays.asList(0))));
		el.add(new Enhancement(27, "halfling", 0, false, 1, new ArrayList<Integer>(Arrays.asList(2)),0, 2, 	new ArrayList<Integer>(Arrays.asList(26))));
		el.add(new Enhancement(28, "halfling", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 4, 	new ArrayList<Integer>(Arrays.asList(27))));
		el.add(new Enhancement(29, "halfling", 0, false, 1, new ArrayList<Integer>(Arrays.asList(2)),0, 8,	new ArrayList<Integer>(Arrays.asList(28))));
		el.add(new Enhancement(30, "halfling", 0, false, 1, new ArrayList<Integer>(Arrays.asList(1)),0, 16,	new ArrayList<Integer>(Arrays.asList(29))));
		el.add(new Enhancement(31, "halfling", 0, false, 0, new ArrayList<Integer>(Arrays.asList(0)),0, 20,	new ArrayList<Integer>(Arrays.asList(30))));//not used
		
		return el;
	};

	
	private static List<Enhancement> el = new ArrayList<Enhancement>();
}
