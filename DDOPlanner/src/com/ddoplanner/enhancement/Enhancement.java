package com.ddoplanner.enhancement;

import java.util.ArrayList;
import java.util.List;

import com.ddoplanner.client.DDOCharacter;
import com.google.gwt.user.client.ui.Widget;

public abstract class Enhancement extends Widget{

	public String getTitle(){ return title; };
	public abstract boolean EnhancementAllowed(DDOCharacter c);
	
	private String title = new String();
	private int id;
	private int requireApSpentGlobal = 0;
	private int requireApSpentTree = 0;
	private List<String> requireAllOf = new ArrayList<String>();
	private List<String> requireAnyOf = new ArrayList<String>();
}
