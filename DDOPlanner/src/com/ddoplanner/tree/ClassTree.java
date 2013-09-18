package com.ddoplanner.tree;

import com.ddoplanner.enhancement.EnhancementFactory;

public class ClassTree extends EnhancementTree{
	
	public ClassTree(){
		super();
	}
	
	public ClassTree(String prestige){
		super();
		this.prestige = prestige;
		treeContainer.addStyleName(prestige + "Tree");
		treeContainer.addStyleName("classTree");
		
		//loop here to style tree and core differently
		this.enhancements = EnhancementFactory.build(prestige);
		for (int i = 0; i <= 24; i++){
			treeContainer.add(this.enhancements.get(i));
		}
		
		for(int i = 25; i <= 30; i++){
			this.enhancements.get(i).setStyleName("core");
			treeContainer.add(this.enhancements.get(i));
		}
		
		treeContainer.add(pointsSpent);
	}

	public String getPrestige(){return prestige;};
	protected String prestige = "";
}
