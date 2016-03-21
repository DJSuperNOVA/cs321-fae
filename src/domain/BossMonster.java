package domain;
import java.util.Random;

public class BossMonster extends FAECharacter 
{
	/*
	 * BossMonsters are the primary opponents of HumanPlayer. Unlike mobs, they have the ability to
	 * heal, has pre-defined stats, and may have a "Second Wind". A BossMonster's Second Wind phase will
	 * cause it to increase all its pre-defined stats (except HP and SP) by 25%, while remaining its HP unknown
	 * to the player (thus displaying ??? to its HP and SP). Here are it's attributes:
	 * 
	 * bossID				: Unlike MobMonsters, the bosses are battled by the player in a fixed order
	 * 							for it determines the player's current progress in the entire game.
	 * 							But the value of bossNumber is used for indexing the boss' queue.
	 * chanceAttack			: The odds of attacking in battle.
	 * chanceAttackWind2	: The odds of attacking on its second wind.
	 * chanceDefend			: The odds of defending in battle.
	 * chanceDefendWind2	: The odds of defending on its second wind.
	 * chanceSkill			: The odds of using its skill in battle.
	 * chanceSkillWind2		: The odds of using its skill on its second wind.
	 * chanceHeal			: The odds of healing its HP in battle. To be fair, bosses don't heal in second wind.
	 * defXPYield			: The definite value of XP the player will receive when defeating this boss.
	 * defAuYield			: The definite value of Au the player will receive when defeating this boss.
	 * secondWindHP			: After the player depletes the BossMonster's HP, the match is not over yet!
	 * and secondWindSP			The boss will become more aggressive and will have its HP and SP renewed, 
	 * 							this time unknown to the player. Bosses 1, 2, 3, 4, 5, 6, 7, and 15
	 * 							only have this attribute.
	 * 							Basically, this will be added to the boss' currentHP and the isNowSecondWind will
	 * 							be set to true to display its HP and SP as ???. Since bosses 8 to 14 are rematches
	 * 							of bosses 1 to 7, their HP and SP, they are initially set to 1 to the quick state of
	 * 							Second Wind. (Yup, HP and SP are displayed as ???.)
	 * isNowSecondWind		: The indicator if the BossMonster is now in Second Wind Phase. If true,
	 * 							the values in chanceAttackWind2, chanceDefendWind2, chanceSkillWind2 will be used
	 * 							and its defATK, defDEF, defPOW, defSPD, and defLUK will be increased by 25%.
	 * missionBossKeys		: The number of keys the player should have to battle the boss.
	 * missionWins			: The number of mob wins the player should have to battle the boss.
	 * dice					: The pseudo-random number generator.
	 */
	
	private int bossID;
	private double chanceAttack, chanceDefend, chanceSkill, chanceHeal;
	private double chanceAttackWind2, chanceDefendWind2, chanceSkillWind2;
	private double defXPYield, defAuYield, secondWindHP, secondWindSP;
	private boolean isNowSecondWind;
	private Skill skill;
	private Random dice;
	
	//GETTERS AND SETTERS
	public int getBossID() {
		return bossID;
	}
	public void setBossID(int bossID) {
		this.bossID = bossID;
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
	public double getChanceHeal() {
		return chanceHeal;
	}
	public void setChanceHeal(double chanceHeal) {
		this.chanceHeal = chanceHeal;
	}
	public double getChanceAttackWind2() {
		return chanceAttackWind2;
	}
	public void setChanceAttackWind2(double chanceAttackWind2) {
		this.chanceAttackWind2 = chanceAttackWind2;
	}
	public double getChanceDefendWind2() {
		return chanceDefendWind2;
	}
	public void setChanceDefendWind2(double chanceDefendWind2) {
		this.chanceDefendWind2 = chanceDefendWind2;
	}
	public double getChanceSkillWind2() {
		return chanceSkillWind2;
	}
	public void setChanceSkillWind2(double chanceSkillWind2) {
		this.chanceSkillWind2 = chanceSkillWind2;
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
	public double getSecondWindHP() {
		return secondWindHP;
	}
	public void setSecondWindHP(double secondWindHP) {
		this.secondWindHP = secondWindHP;
	}
	public double getSecondWindSP() {
		return secondWindSP;
	}
	public void setSecondWindSP(double secondWindSP) {
		this.secondWindSP = secondWindSP;
	}
	public boolean isNowSecondWind() {
		return isNowSecondWind;
	}
	public void setNowSecondWind(boolean isNowSecondWind) {
		this.isNowSecondWind = isNowSecondWind;
	}
	public Random getDice() {
		return dice;
	}
	public void setDice(Random dice) {
		this.dice = dice;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	public double rollDoubleDice()
	{
		return dice.nextDouble();
	}
}
