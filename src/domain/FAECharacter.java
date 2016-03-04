package domain;

import java.util.ArrayList;

public abstract class FAECharacter 
{
	/*
	 * FAECharacters are the essential objects in Fight Against Evil. These are the ones
	 * being controlled and battled by the player.
	 * The player's character, a mob monster, or a boss monster are under this class.
	 * 
	 * FAECharacters have the common attributes/stats such as the following:
	 * Name					: The FAECharacter's name. (duh). For the player, it will be the name of
	 * 							the save file.
	 * Hit Points (HP)		: The vitality level for battle.
	 * Skill Points (SP)	: The energy available for executing skills in battle.
	 * Attack (ATK)			: The attack power in executing normal attacks.
	 * Defense (DEF)		: The level of endurance from the opponent's attacks.
	 * Special (SPC)		: The attack power in executing its special attack (Skill).
	 * Agility (AGI)		: The level of how fast it can execute a move.
	 * Critical (CRT)		: The odds of getting a critical hit when attacking.
	 * 
	 * These stats are derived into three kinds:
	 * Base Stats (base)	: The constant/raw value of the stats of each character. This is retrieved
	 * 							via StatsManager on the managers package.
	 * Default (def)		: The default value of stats in battle/full recovery.
	 * Current (current)	: The current value of the stats including changes made during battle.
	 * 
	 * Other FAECharacter attributes are:
	 * Level				: For players, every level-up increases their base stats.
	 * 							As for mobs, this is a multiplier on a formula for their default stats.
	 * 							No effect for bosses. Only for display.
	 * Skill				: The special attack.
	 */
	
	private String name;
	private int baseHP, baseSP, baseATK, baseDEF, baseSPC, baseAGI, baseCRT;
	private double defHP, defSP, defATK, defDEF, defSPC, defAGI, defCRT;
	private double currentHP, currentSP, currentATK, currentDEF, currentSPC, currentAGI, currentCRT;
	private int level;
	private ArrayList<Skill> skillSet;
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBaseHP() {
		return baseHP;
	}
	public void setBaseHP(int baseHP) {
		this.baseHP = baseHP;
	}
	public int getBaseSP() {
		return baseSP;
	}
	public void setBaseSP(int baseSP) {
		this.baseSP = baseSP;
	}
	public int getBaseATK() {
		return baseATK;
	}
	public void setBaseATK(int baseATK) {
		this.baseATK = baseATK;
	}
	public int getBaseDEF() {
		return baseDEF;
	}
	public void setBaseDEF(int baseDEF) {
		this.baseDEF = baseDEF;
	}
	public double getDefHP() {
		return defHP;
	}
	public void setDefHP(double defHP) {
		this.defHP = defHP;
	}
	public double getDefSP() {
		return defSP;
	}
	public void setDefSP(double defSP) {
		this.defSP = defSP;
	}
	public double getDefATK() {
		return defATK;
	}
	public void setDefATK(double defATK) {
		this.defATK = defATK;
	}
	public double getDefDEF() {
		return defDEF;
	}
	public void setDefDEF(double defDEF) {
		this.defDEF = defDEF;
	}
	public double getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(double currentHP) {
		this.currentHP = currentHP;
	}
	public double getCurrentSP() {
		return currentSP;
	}
	public void setCurrentSP(double currentSP) {
		this.currentSP = currentSP;
	}
	public double getCurrentATK() {
		return currentATK;
	}
	public void setCurrentATK(double currentATK) {
		this.currentATK = currentATK;
	}
	public double getCurrentDEF() {
		return currentDEF;
	}
	public void setCurrentDEF(double currentDEF) {
		this.currentDEF = currentDEF;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getBaseSPC() {
		return baseSPC;
	}
	public void setBaseSPC(int baseSPC) {
		this.baseSPC = baseSPC;
	}
	public int getBaseAGI() {
		return baseAGI;
	}
	public void setBaseAGI(int baseAGI) {
		this.baseAGI = baseAGI;
	}
	public int getBaseCRT() {
		return baseCRT;
	}
	public void setBaseCRT(int baseCRT) {
		this.baseCRT = baseCRT;
	}
	public double getDefSPC() {
		return defSPC;
	}
	public void setDefSPC(double defSPC) {
		this.defSPC = defSPC;
	}
	public double getDefAGI() {
		return defAGI;
	}
	public void setDefAGI(double defAGI) {
		this.defAGI = defAGI;
	}
	public double getDefCRT() {
		return defCRT;
	}
	public void setDefCRT(double defCRT) {
		this.defCRT = defCRT;
	}
	public double getCurrentSPC() {
		return currentSPC;
	}
	public void setCurrentSPC(double currentSPC) {
		this.currentSPC = currentSPC;
	}
	public double getCurrentAGI() {
		return currentAGI;
	}
	public void setCurrentAGI(double currentAGI) {
		this.currentAGI = currentAGI;
	}
	public double getCurrentCRT() {
		return currentCRT;
	}
	public void setCurrentCRT(double currentCRT) {
		this.currentCRT = currentCRT;
	}
	public ArrayList<Skill> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(ArrayList<Skill> skillSet) {
		this.skillSet = skillSet;
	}
}