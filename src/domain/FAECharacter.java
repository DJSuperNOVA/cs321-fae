package domain;

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
	 * Special (POW)		: The attack power in executing its special attack (Skill).
	 * Speed (SPD)			: The level of how fast it can execute a move.
	 * Luck (LUK)			: The odds of getting a critical hit when attacking.
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
	private int baseHP, baseSP, baseATK, baseDEF, basePOW, baseSPD, baseLUK;
	private double defHP, defSP, defATK, defDEF, defPOW, defSPD, defLUK;
	private double currentHP, currentSP, currentATK, currentDEF, currentPOW, currentSPD, currentLUK;
	private int level;
	private Skill skill;
	
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
	public int getBasePOW() {
		return basePOW;
	}
	public void setBasePOW(int basePOW) {
		this.basePOW = basePOW;
	}
	public int getBaseSPD() {
		return baseSPD;
	}
	public void setBaseSPD(int baseSPD) {
		this.baseSPD = baseSPD;
	}
	public int getBaseLUK() {
		return baseLUK;
	}
	public void setBaseLUK(int baseLUK) {
		this.baseLUK = baseLUK;
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
	public double getDefPOW() {
		return defPOW;
	}
	public void setDefPOW(double defPOW) {
		this.defPOW = defPOW;
	}
	public double getDefSPD() {
		return defSPD;
	}
	public void setDefSPD(double defSPD) {
		this.defSPD = defSPD;
	}
	public double getDefLUK() {
		return defLUK;
	}
	public void setDefLUK(double defLUK) {
		this.defLUK = defLUK;
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
	public double getCurrentPOW() {
		return currentPOW;
	}
	public void setCurrentPOW(double currentPOW) {
		this.currentPOW = currentPOW;
	}
	public double getCurrentSPD() {
		return currentSPD;
	}
	public void setCurrentSPD(double currentSPD) {
		this.currentSPD = currentSPD;
	}
	public double getCurrentLUK() {
		return currentLUK;
	}
	public void setCurrentLUK(double currentLUK) {
		this.currentLUK = currentLUK;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
}