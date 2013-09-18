package com.ddoplanner.tree;

import com.ddoplanner.client.DDOCharacter;
import com.ddoplanner.enhancement.EnhancementFactory;


public class RacialTree extends EnhancementTree{
	
	public RacialTree(){
		super();
		treeContainer.addStyleName("racialTree");
		treeContainer.addStyleName(DDOCharacter.getRace() + "Tree");
		
		//loop here to style tree and core differently
		this.enhancements = EnhancementFactory.build(DDOCharacter.getRace());
		for (int i = 0; i <= 24; i++){
			treeContainer.add(this.enhancements.get(i));
		}
		
		for(int i = 25; i <= 30; i++){
			this.enhancements.get(i).setStyleName("core");
			treeContainer.add(this.enhancements.get(i));
		}
		
		treeContainer.add(pointsSpent);
	}
}
