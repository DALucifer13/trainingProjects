package main;

public class Ending {
	
	Progress pg = new Progress();
	
	public String Loot(){
		String visit = "Visited Atlantis";
		String guns = "";
		if(pg.getGuns() == 1) {
			guns = "A gun";
		}
		else if(pg.getGuns() > 1) {
			guns = "A gun and " + (pg.getGuns() - 1) + " extra ammo";
		}
		else {
			guns = "no guns";
		}
		String treasure = pg.getTreasure() + " chests of treasure";
		String ruins = "";
		if(pg.getAncientRuins() == 1) {
			ruins = pg.getAncientRuins() + " Ancient Ruin";	
			}
		else {
			ruins = pg.getAncientRuins() + " Ancient Ruins";		
			}
		String tech = "";
		if(pg.getFutureTech() == 1) {
			tech = pg.getFutureTech() + " piece of Future Technology";
			}
		else {
			tech = pg.getFutureTech() + " pieces of Future Technology";		
			}
		String weapons = "";
		if(pg.getWeapons() == 1) {
			weapons = pg.getWeapons() + " weapons stash";
			}
		else {
			weapons = pg.getWeapons() + " weapons stashes";;		
			}
		String keys = "";
		if(pg.getKeys() == 1) {
			keys = "Found your keys";
			}
		if(pg.getKeys() == 0) {
			keys = "Lost your keys";
			}
		else {
			keys = "Found your keys plus " + pg.getKeys() + " spares";		
			}
		String list = "";
		if(pg.getList() == 1) {
			keys = "Found THE Evil Overlord List";
			}
		if(pg.getList() == 0) {
			keys = "Lost THE Evil Overlord List";
			}
		else {
			keys = "Found THE Evil Overlord List plus " + pg.getList() + " copies";		
			}
			String loot = "You left with " + guns + ", " + treasure + ",\n" 
			+ tech + ", " +  weapons + ", " + keys + ", " + list + "\nyou " + visit + " and " + ruins;
			return loot;
		}
		
		
		
		
		public String LostLoot(){
			String visit = "visited Atlantis";
			String guns = "";
			if(pg.getGuns() == 1) {
				guns = "A gun";
			}
			else if(pg.getGuns() > 1) {
				guns = "A gun and " + (pg.getGuns() - 1) + " extra ammo";
			}
			else {
				guns = "no guns";
			}
			String treasure = pg.getTreasure() + " chests of treasure";
			String ruins = "";
			if(pg.getAncientRuins() == 1) {
				ruins = pg.getAncientRuins() + " Ancient Ruin";	
				}
			else {
				ruins = pg.getAncientRuins() + " Ancient Ruins";		
				}
			String tech = "";
			if(pg.getFutureTech() == 1) {
				tech = pg.getFutureTech() + " piece of Future Technology";
				}
			else {
				tech = pg.getFutureTech() + " pieces of Future Technology";		
				}
			String weapons = "";
			if(pg.getWeapons() == 1) {
				weapons = pg.getWeapons() + " weapons stash";
				}
			else {
				weapons = pg.getWeapons() + " weapons stashes";;		
				}
			String keys = "";
			if(pg.getKeys() == 1) {
				keys = "Found your keys";
				}
			if(pg.getKeys() == 0) {
				keys = "Lost your keys";
				}
			else {
				keys = "Found your keys plus " + pg.getKeys() + " spares";		
				}
			String list = "";
			if(pg.getList() == 1) {
				keys = "Found THE Evil Overlord List";
				}
			if(pg.getList() == 0) {
				keys = "Lost THE Evil Overlord List";
				}
			else {
				keys = "Found THE Evil Overlord List plus " + pg.getList() + " copies";		
				}
				String loot = "You would have left with " + guns + ", " + treasure + ",\n" 
				+ tech + ", " +  weapons + ", " + keys + ", " + list + "\nyou " + visit + " and " + ruins;
				return loot;
			}
}
