package domain;

public class MobMonster extends FAECharacter
{
	/*
	 * MobMonsters are the opponents of HumanPlayer. It is also the child class of FAECharacter.
	 * They execute their moves (as an AI) through the use of Pseudo-random Number Generation.
	 * But in order to make them seemingly develop unique behaviors, there will be values assigned
	 * which will be the odds on what move/attack the AI will use. Other than things inherited 
	 * from FAECharacter, MobMonsters also have their own attributes and behaviors such as the following:
	 * 
	 * mobID				: The serial number of the monster.
	 * firstArea			: The monster's first area where they can be found.
	 * chanceAttack			: The odds of attacking in battle. Values range from 0 to 1 inclusive.
	 * chanceDefend			: The odds of defending in battle. Values range from 0 to 1 inclusive.
	 * chanceSkill			: The odds of using its skill in battle. Values range from 0 to 1 inclusive.
	 * chanceFlee			: The odds of fleeing from battle. Values range from 0 to 1 inclusive.
	 * chanceBossKeyDrop	: The odds of dropping a Boss Key after battle. Values range from 0 to 1 inclusive.
	 * baseXPYield			: The base value of XP that the player will receive when defeating this monster.
	 * baseAuYield			: The base value of Au that the player will receive when defeating this monster.
	 * defXPYield			: The actual value of XP that the player will receive when defeating this monster.
	 * defAuYield			: The actual value of Au that the player will receive when defeating this monster. 
	 * dice					: The pseudo-random number generator.
	 */
	
	private int mobID, firstArea;
	private double chanceAttack, chanceDefend, chanceSkill, chanceFlee, chanceBossKeyDrop;
	private double baseXPYield, baseAuYield, defXPYield, defAuYield;
	private Skill skill;
	
	public MobMonster()
	{
		skill = new Skill();
	}
	
	//GETTERS AND SETTERS
	public int getMobID() {
		return mobID;
	}
	public void setMobID(int mobID) {
		this.mobID = mobID;
	}
	public int getFirstArea() {
		return firstArea;
	}
	public void setFirstArea(int firstArea) {
		this.firstArea = firstArea;
	}
	public double getChanceAttack() {
		return chanceAttack;
	}
	public void setChanceAttack(double chanceAttack) {
		this.chanceAttack = chanceAttack;
	}
	public double getChanceDefend() {
		return chanceDefend;
	}
	public void setChanceDefend(double chanceDefend) {
		this.chanceDefend = chanceDefend;
	}
	public double getChanceSkill() {
		return chanceSkill;
	}
	public void setChanceSkill(double chanceSkill) {
		this.chanceSkill = chanceSkill;
	}
	public double getChanceFlee() {
		return chanceFlee;
	}
	public void setChanceFlee(double chanceFlee) {
		this.chanceFlee = chanceFlee;
	}
	public double getChanceBossKeyDrop() {
		return chanceBossKeyDrop;
	}
	public void setChanceBossKeyDrop(double chanceBossKeyDrop) {
		this.chanceBossKeyDrop = chanceBossKeyDrop;
	}
	public double getBaseXPYield() {
		return baseXPYield;
	}
	public void setBaseXPYield(double baseXPYield) {
		this.baseXPYield = baseXPYield;
	}
	public double getBaseAuYield() {
		return baseAuYield;
	}
	public void setBaseAuYield(double baseAuYield) {
		this.baseAuYield = baseAuYield;
	}
	public double getDefXPYield() {
		return defXPYield;
	}
	public void setDefXPYield(double defXPYield) {
		this.defXPYield = defXPYield;
	}
	public double getDefAuYield() {
		return defAuYield;
	}
	public void setDefAuYield(double defAuYield) {
		this.defAuYield = defAuYield;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
}
