package main;

import java.util.Random;

public class Message {

	Random rand = new Random();
	Progress pg = new Progress();
	
	
	public String GetMessage(){
		
		String message = "";
		int messageop = rand.nextInt(13);
		switch(messageop) {
		case 0:  
			if (pg.getSpade() > 0) {
				message = "You Found Buried Treasure";
				pg.setSpade(pg.getSpade() - 1);
			}
			else if (pg.getSpade() == 0) {
				message = "You Found Buried Treasure, but your spade broke after use";
				pg.setSpade(pg.getSpade() - 1);
			}
			else{
				message = "You Found Buried Treasure, but have no spade to dig it up";
			};
		break;
		case 1: if (pg.getGuns() > 0) {
			message = "You found ammo for your gun!!!";
		}
		else {
			message = "You found a Gun!!!";
		}
			pg.setGuns(pg.getGuns() + 1);
		break;
		case 2: message = "You found Ancient Ruins!!!";
			pg.setAncientRuins(pg.getAncientRuins() + 1);
		break;
		case 3: message = "You found Futuristic Technology!!!";
			pg.setFutureTech(pg.getFutureTech() + 1);
		break;
		case 4: message = "You found a Weapons Stash!!!";
			pg.setWeapons(pg.getWeapons() + 1);
			pg.setGuns(pg.getGuns() + 1);
		break;
		case 5: if(pg.getKeys() > 0) {
			message = "You found Your Spare Keys!!!";
		}
		else {
			message = "You found Your Keys!!!";
		}
			pg.setKeys(pg.getKeys() + 1);
		break;
		case 6: if(pg.getList() > 0){
			message = "You found a copy of The Evil Overlord List!!!";
		}
		else {
			message = "You found The True Evil Overlord List!!!";
		}
			pg.setList(pg.getList() + 1);
		break;
		case 7: 
			if (pg.getBombEscape() > 0) {
				message = "You survived a bomb";
				pg.setBombEscape(pg.getBombEscape() - 1);
			}
			else if (pg.getBombEscape() == 1){
				message = "You survived a bomb, but your bomb disposal tools broke after use";
				pg.setBombEscape(pg.getBombEscape() - 1);
			}
			else{
				message = "You found a Bomb. oh cra*BOOM*";
			};
		break;
		case 8: if(pg.getAtlantis() == 0) {
			message = "You found Atlantis!!!";
			pg.setAtlantis(pg.getAtlantis() + 1);
		}
		else {
			GetMessage();
		}
		break;
		case 9: message = "You found a Transdimensional Portal!!!";
		break;
		case 10: message = "You found an already looted area, oh crap";
		break;
		case 11: message = "You found an spade";
			pg.setSpade(pg.getSpade() + 3);;
		break;
		case 12: message = "You found  bomb disposal kit";
			pg.setBombEscape(pg.getBombEscape() + 1);
		break;
		}
		
		return message;
	}
	
}
