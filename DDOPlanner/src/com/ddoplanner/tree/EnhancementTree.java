package com.ddoplanner.tree;


import com.ddoplanner.client.DDOCharacter;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public abstract class EnhancementTree extends Widget {
	
	public EnhancementTree(){
		
		getTree().setStyleName("treeContainer");
		tree.setStyleName("tree");
		
	};
		
	/**
	 * @return the treeContainer
	 */
	public FlowPanel getTree() {
		return treeContainer;
	}

	/**
	 * @param treeContainer the treeContainer to set
	 */
	public void setTree(FlowPanel treeContainer) {
		this.treeContainer = treeContainer;
	}


	public abstract boolean TreeAllowed(DDOCharacter c);
	
	private FlowPanel treeContainer;
	private FlexTable tree;
	
	
}