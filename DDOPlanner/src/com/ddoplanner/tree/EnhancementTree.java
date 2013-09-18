package com.ddoplanner.tree;

import java.util.ArrayList;
import java.util.List;

import com.ddoplanner.enhancement.Enhancement;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public abstract class EnhancementTree extends Widget {
	
	public EnhancementTree(){
		spentAp = 0;
		treeContainer = new FlowPanel();
		enhancements = new ArrayList<Enhancement>(31);
		pointsSpent = new Label("0 AP Spent");
		pointsSpent.addStyleName("pointsSpentTree");
	};
		
	public FlowPanel getTree() {
		return treeContainer;
	}

	public int spentAp(){return spentAp;};
	public void spendAp(int ap){
		spentAp += ap;
		updatePointsSpent();
	};
	public void removeAp(int ap){
		spentAp -= ap;
		updatePointsSpent();
	};
	
	public Enhancement getEnhancement(int id){
			return enhancements.get(id-1); //subtract 1 to get the correct index for id
	}
	
	public void setEnhancement(int id, Enhancement e){
		enhancements.set(id-1, e); //subtract 1 to get the correct index for id
	}
	
	public List<Enhancement> getEnhancementList(){
		return enhancements;
	}
	
	private void updatePointsSpent(){
		pointsSpent.setText(Integer.toString(spentAp) + " AP Spent");
		return;
	}
	
	public int getPointsSpent(){ return spentAp;};
	
	protected FlowPanel treeContainer;
	protected Label pointsSpent;
	protected List<Enhancement> enhancements;
	protected int spentAp;
}