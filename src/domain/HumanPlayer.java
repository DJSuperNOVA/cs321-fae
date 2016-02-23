package domain;
import java.util.*;
public class HumanPlayer extends FAECharacter
{
	/*
	 * The HumanPlayer is the player's character in the game.
	 * It's parent class is the FAECharacter as it shares common attributes.
	 * 
	 * The HumanPlayer has its own attributes additional from what it inherited from FAECharacter such as:
	 * Name					: The player's identity. It will also be the name of its save file.
	 * Class (battleClass)	: The player's specialty in fighting. It can either be Swordsman or Mage.
	 * Experience Pts. (XP)	: The value of how much/how well the player has been playing.
	 * Money or Gold (Au)	: The money earned by the player from gameplay. It can be used to buy items.
	 * Wins					: The number of battles won by the player.
	 * Losses				: The number of battles lost and forfeited by the player.
	 * Bosses Defeated		: The number of bosses defeated by the player. The number of unlocked areas
	 * 	(bossWins)				for the player depends here.
	 * Boss Keys			: The value earned that can be used to battle and defeat the next boss to unlock
	 * 							a new area. It is usually dropped by defeated mobs after battle.
	 * Inventory			: The list of items carried by the player.
	 * 
	 * Aside from base stats and def stats, HumanPlayers have Plus Stats--stat bonuses from stat enhancers
	 * bought by the player in the Shop. Base Stat + Plus Stat = Def Stat.
	 */
	
	private String battleClass;
	private double xp, au;
	private int wins, losses, bossWins, bossKeys;
	private double plusHP, plusSP, plusATK, plusDEF, plusSPC, plusAGI, plusCRT;
	private ArrayList<GameItem> inventory;
	
	//GETTERS AND SETTERS
	public String getBattleClass() {
		return battleClass;
	}
	public void setBattleClass(String battleClass) {
		this.battleClass = battleClass;
	}
	public double getXP() {
		return xp;
	}
	public void setXP(double xp) {
		this.xp = xp;
	}
	public double getAu() {
		return au;
	}
	public void setAu(double au) {
		this.au = au;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getBossWins() {
		return bossWins;
	}
	public void setBossWins(int bossWins) {
		this.bossWins = bossWins;
	}
	public int getBossKeys() {
		return bossKeys;
	}
	public void setBossKeys(int bossKeys) {
		this.bossKeys = bossKeys;
	}
	public ArrayList<GameItem> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<GameItem> inventory) {
		this.inventory = inventory;
	}
	public double getPlusHP() {
		return plusHP;
	}
	public void setPlusHP(double plusHP) {
		this.plusHP = plusHP;
	}
	public double getPlusSP() {
		return plusSP;
	}
	public void setPlusSP(double plusSP) {
		this.plusSP = plusSP;
	}
	public double getPlusATK() {
		return plusATK;
	}
	public void setPlusATK(double plusATK) {
		this.plusATK = plusATK;
	}
	public double getPlusDEF() {
		return plusDEF;
	}
	public void setPlusDEF(double plusDEF) {
		this.plusDEF = plusDEF;
	}
	public double getPlusSPC() {
		return plusSPC;
	}
	public void setPlusSPC(double plusSPC) {
		this.plusSPC = plusSPC;
	}
	public double getPlusAGI() {
		return plusAGI;
	}
	public void setPlusAGI(double plusAGI) {
		this.plusAGI = plusAGI;
	}
	public double getPlusCRT() {
		return plusCRT;
	}
	public void setPlusCRT(double plusCRT) {
		this.plusCRT = plusCRT;
	}
}