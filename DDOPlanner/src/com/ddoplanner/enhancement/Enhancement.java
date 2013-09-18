package com.ddoplanner.enhancement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ddoplanner.client.DDOCharacter;
import com.ddoplanner.client.LogHandler;
import com.ddoplanner.client.MyTooltip;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;

/*
 * Represents an enhancement in a prestige class tree
 * Position is left-to-right, top-to-bottom
 * Empty enhancements are allowed but can not be taken, this futureproofs the implementation somewhat.
 * 
*/
public class Enhancement extends Image{

	public Enhancement(final int id, final String prestige, int treeTier, final boolean multipleSelector, final int maxRank, final List<Integer> apPerTier, 
			final int requireApSpent, final int requireClassLevel, final List<Integer> requireAllOf){

		this.id = id;
		this.prestige = prestige;
		this.treeTier = treeTier;
		this.multipleselector = multipleSelector;
		this.enhancementMaxRank = maxRank;
		this.apPerTier = apPerTier;
		this.requireApSpentTree = requireApSpent;
		this.requireClassLevel = requireClassLevel;
		this.requireAllOf = requireAllOf;
		this.tiersTaken = 0;
		String url = "images/trees/" + prestige + "/images/" + prestige + "_" + id + "_0.gif";

		super.setUrl(url);
		super.setStyleName("enhancement");
		
		initHandlers();
	}
	
	
	public Enhancement(final int id, final String prestige){
		this.id = id;
		this.prestige = prestige;
		
		List<Integer> prestigeData = EnhancementData.getPrestigeData(prestige, id);
		this.enhancementMaxRank = prestigeData.get(0);
//		this.apPerTier = prestigeData.get(1);
		this.requireApSpentTree = prestigeData.get(2);
		
		String url = "images/trees/" + prestige + "/images/" + prestige + "_" + id + "_0.gif";
		String tipurl = "images/trees/" + prestige + "/tooltips/" + prestige + "_" + id + ".jpg";

		super.setUrl(url);
		super.setStyleName("enhancement");
		
		initHandlers();
		
	}//end of constructor
	
	
	private void initHandlers(){
		//set up the tooltip
		String tipurl = "images/trees/" + prestige + "/tooltips/" + prestige + "_" + id + ".jpg";
		final HTMLPanel html = new HTMLPanel("");
//        html.getElement().setAttribute("style","padding: 0px;"); // set some style
        html.add(new Image(tipurl));
        final MyTooltip tooltip = new MyTooltip(html);
        tooltip.setWidget(html);
	
		MouseOverHandler overHandler = new MouseOverHandler() {
		    public void onMouseOver(MouseOverEvent event) {
		    	if(enhancementMaxRank > 0){ //only show tooltips for actual enhancements
			        tooltip.setPopupPosition(event.getClientX() + 60,event.getClientY() + 0);
			        tooltip.show();
	//		    	LogHandler.info("ToolTipTime");
		    	}
		    }};
		this.addMouseOverHandler(overHandler);
		
		MouseOutHandler outHandler = new MouseOutHandler(){
			public void onMouseOut(MouseOutEvent event) {
				tooltip.hide();
			}};
		this.addMouseOutHandler(outHandler);
		
		
		MouseDownHandler downHandler = new MouseDownHandler() {
		    public void onMouseDown(MouseDownEvent event) {
//		        Cell cell = flexTable.getCellForEvent(event);
		        int button = event.getNativeEvent().getButton();
		        if (button == NativeEvent.BUTTON_LEFT) {
					Enhancement e = (Enhancement) event.getSource();
					e.takeTier();
		        }

		        if (button == NativeEvent.BUTTON_RIGHT) {
		            event.preventDefault();
					Enhancement e = (Enhancement) event.getSource();
					e.removeTier();
		        }
		    }
		};
		this.addMouseDownHandler(downHandler);
		
	}
	
	
	protected void takeTier(){
		//check how many tiers is taken and take another tier if possible
		if(this.tiersTaken < this.enhancementMaxRank && requirementsMetSpend()){
			if(DDOCharacter.pointAvailible()){
				DDOCharacter.pointsSpent(prestige, apPerTier.get(tiersTaken));
				++this.tiersTaken;
				this.setImage(tiersTaken);
				DDOCharacter.getTree(prestige).setEnhancement(id, this); //force an update
			}
		}
	}
	
	protected void removeTier(){
		//check how many tiers is taken and remove tier if possible
		if(this.tiersTaken > 0 && requirementsMetRemove()){ 
			DDOCharacter.pointsRemoved(prestige, apPerTier.get(tiersTaken-1));
			--this.tiersTaken;
			this.setImage(tiersTaken);
			DDOCharacter.getTree(prestige).setEnhancement(id, this); //force an update
		}
	}
	
	public void setImage(int tier){
		// "/images/trees/prestige/images/kensai_1_1.gif for example
		String url = "/images/trees/" + this.prestige + "/images/" + prestige + "_" + this.id + "_" + tier + ".gif";
		super.setUrl(url);
		LogHandler.info("took a tier of: " + this.id);
		LogHandler.info("current tier: " + this.tiersTaken);
	};
	
	public int pointsSpent(){ return tiersTaken * apPerTier.get(tiersTaken);};
	
	private boolean requirementsMetSpend(){
		
		if(requireApSpentTree > DDOCharacter.getTreePointsSpent(prestige)) //make sure enough points are spent
			return false;
		
		if(requireClassLevel > DDOCharacter.hasClassLevels(prestige)) //x class levels required for most enhancements
			return false;
		
		
		if(requireAllOf.get(0).equals(0)) //no special requirement
			return true;
			
		List<Enhancement> el = DDOCharacter.getEnhancements(prestige, requireAllOf); //fetch the pre req enhancements
		
		for (Enhancement e : el){
			if(e.enhancementMaxRank == 1 && e.tiersTaken == 1 && this.requireAllOf.size() == 1)
				return true; //pre req satisfied, max rank taken, special case where there only is one pre req with max rank 1
			if(e.tiersTaken <= this.tiersTaken)
				return false; //multiple rank case, can not take more ranks then the pre req has
		}

		return true; //if we made it through the checks its ok
	};
	
	private boolean requirementsMetRemove(){
		
		List<Enhancement> el = DDOCharacter.getTree(prestige).getEnhancementList();
		int treePointsSpent = DDOCharacter.getTree(prestige).getPointsSpent();
		int modTreeSpent = treePointsSpent;
		for(Enhancement e : el){
			if(e.requireAllOf.contains(this.id) && e.tiersTaken >= this.tiersTaken)//check to see if this is a pre req for something else
				return false;
			
			//find all enhancements higher in the tree then the one we are trying to remove
			//add their points together and remove it from total tree spent, we then get the amount required
			if(e.tiersTaken > 0 && e.treeTier > this.treeTier){
				for(int i = 0; i < e.tiersTaken;i++){
					modTreeSpent -= e.apPerTier.get(e.tiersTaken-1);
				}
				
				if(modTreeSpent <= e.requireApSpentTree)//make sure we didnt remove too many points fromthe tree
					return false;
			}
		}
		
		return true;//all checks passed
	}
		
	
	public int getId(){return id;};
	public int getTiersTaken(){return tiersTaken;};
	
	public int id = 0; //id for the enhancement, per tree left-to-right, top-to-bottom
	public int enhancementMaxRank = 1; //1-3 tiers usually
	public int tiersTaken = 0; //default no tiers taken
	public List<Integer> apPerTier = new ArrayList<Integer>(Arrays.asList(1)); //usually 1 or 2;
	public String prestige = ""; //prestige class name i.e. "kensai"
	public int treeTier = 1;

	private boolean multipleselector = false; //usually only single selector
	private int requireApSpentTree = 0; //1 per level in the tree, core takes 5 per level in the core tree
	private int requireClassLevel = 0; //1-5 depending on tier, core 1-20
	private List<Integer> requireAllOf = new ArrayList<Integer>();
//	private List<String> requireAnyOf = new ArrayList<String>();

}
