package managers;
import domain.*;
import java.text.DecimalFormat;
import java.util.Random;
public class BattleManager 
{
	private HumanPlayer player;
	private MobMonster mobMonster;
	private BossMonster bossMonster;
	private StatsManager statsManager;
	private boolean isMobBattle;
	
	private double playerResist, opponentResist, inflictedDamage;
	private String battleEvent;
	private DecimalFormat d0;
	private Random dice;
	
	/*
	 * The BattleManager is the one who handle processes happening on the battle.
	 * The displays and grabbing of input will come from BattleUI.
	 * 
	 * NOTE: Game Items (especially Spell Card Items) may alter the battle in which it will
	 * break the convention in the usual role-playing games, which Fight Against Evil will
	 * take advantage of, such as the HPs and SPs of both players beyond their defStats.
	 * 
	 * About Spell cards and battle item effects:
	 * While Spell cards can be a great advantage for the player in battle,
	 * it can also add risk to the player to commit suicide when using Game Items,
	 * as some items (yes, specially Spell Cards) can also inflict damage to the player.  
	 */

	public BattleManager(HumanPlayer player, boolean isMobBattle, int opponentID, int area)
	{
		this.player = player;
		this.isMobBattle = isMobBattle;
		dice = new Random();
		statsManager = new StatsManager();
		int diceResult = dice.nextInt(statsManager.getMaxMobLevel(area)-statsManager.getMinMobLevel(area))+statsManager.getMinMobLevel(area)+1;
		initiatePlayerToBattle();
		initiateOpponentToBattle(opponentID, diceResult);
		d0 = new DecimalFormat("####");
		setBattleEvent(new String(""));
	}

	private void initiatePlayerToBattle()
	{
		/*
		 * So what happens here is that the current battle stats will be refreshed
		 * before match. The current HP and SP stays the same.
		 */
		player.setCurrentATK(player.getDefATK());
		player.setCurrentDEF(player.getDefDEF());
		player.setCurrentSPC(player.getDefSPC());
		player.setCurrentAGI(player.getDefAGI());
		player.setCurrentCRT(player.getDefCRT());
		playerResist = 0.0;
	}

	private void initiateOpponentToBattle(int opponentID, int diceResult) 
	{
		if(isMobBattle)
		{
			mobMonster = statsManager.getMobMonster(opponentID, diceResult);
			mobMonster.setDefHP(mobMonster.getBaseHP() + (mobMonster.getBaseHP()*0.18)*mobMonster.getLevel());
			mobMonster.setDefSP(mobMonster.getBaseSP() + (mobMonster.getBaseSP()*0.18)*mobMonster.getLevel());
			mobMonster.setDefATK(mobMonster.getBaseATK() + (mobMonster.getBaseATK()*0.18)*mobMonster.getLevel());
			mobMonster.setDefDEF(mobMonster.getBaseDEF() + (mobMonster.getBaseDEF()*0.18)*mobMonster.getLevel());
			mobMonster.setDefSPC(mobMonster.getBaseSPC() + (mobMonster.getBaseSPC()*0.18)*mobMonster.getLevel());
			mobMonster.setDefAGI(mobMonster.getBaseAGI() + (mobMonster.getBaseAGI()*0.18)*mobMonster.getLevel());
			mobMonster.setDefCRT(mobMonster.getBaseCRT() + (mobMonster.getBaseCRT()*0.18)*mobMonster.getLevel());
			mobMonster.setCurrentHP(mobMonster.getDefHP());
			mobMonster.setCurrentSP(mobMonster.getDefSP());
			mobMonster.setCurrentATK(mobMonster.getDefATK());
			mobMonster.setCurrentDEF(mobMonster.getDefDEF());
			mobMonster.setCurrentSPC(mobMonster.getDefSPC());
			mobMonster.setCurrentAGI(mobMonster.getDefAGI());
			mobMonster.setCurrentCRT(mobMonster.getDefCRT());
			mobMonster.setDefXPYield(mobMonster.getBaseXPYield() + (mobMonster.getBaseXPYield()*0.095)*(mobMonster.getLevel()*0.75));
			mobMonster.setDefAuYield(mobMonster.getBaseAuYield() + (mobMonster.getBaseAuYield()*0.095)*(mobMonster.getLevel()*0.65));
		}
		else
		{
			bossMonster = statsManager.getBossMonster(opponentID);
			bossMonster.setDefHP(bossMonster.getBaseHP() + (bossMonster.getBaseHP()*0.18)*(bossMonster.getLevel()*0.05));
			bossMonster.setDefSP(bossMonster.getBaseSP() + (bossMonster.getBaseSP()*0.18)*(bossMonster.getLevel()*0.05));
			bossMonster.setDefATK(bossMonster.getBaseATK() + (bossMonster.getBaseATK()*0.18)*(bossMonster.getLevel()*0.05));
			bossMonster.setDefDEF(bossMonster.getBaseDEF() + (bossMonster.getBaseDEF()*0.18)*(bossMonster.getLevel()*0.05));
			bossMonster.setDefSPC(bossMonster.getBaseSPC() + (bossMonster.getBaseSPC()*0.18)*(bossMonster.getLevel()*0.05));
			bossMonster.setDefAGI(bossMonster.getBaseAGI() + (bossMonster.getBaseAGI()*0.18)*(bossMonster.getLevel()*0.05));
			bossMonster.setDefCRT(bossMonster.getBaseCRT() + (bossMonster.getBaseCRT()*0.18)*(bossMonster.getLevel()*0.05));
			bossMonster.setCurrentHP(bossMonster.getDefHP());
			bossMonster.setCurrentSP(bossMonster.getDefHP());
			bossMonster.setCurrentATK(bossMonster.getDefATK());
			bossMonster.setCurrentDEF(bossMonster.getDefDEF());
			bossMonster.setCurrentSPC(bossMonster.getDefSPC());
			bossMonster.setCurrentAGI(bossMonster.getDefAGI());
			bossMonster.setCurrentCRT(bossMonster.getDefCRT());
			bossMonster.setNowSecondWind(false);
		}
		opponentResist = 0.0;
	}

	public int getBattleStatus()
	{
		/* Battle Status:
		 * 0 = Player HP and Opponent HP still not drained.
		 * 1 = Mob Opponent Defeated
		 * 2 = Boss Opponent in Normal Mode Defeated
		 * 3 = Boss Opponent in Second Wind Defeated
		 * 4 = Player Defeated
		 * 5 = Player Fled
		 * 6 = Mob Fled 
		 */
		int battleStatus = -1;
		if(isMobBattle)
		{
			if((player.getCurrentHP() > 0) && (mobMonster.getCurrentHP() > 0))
			battleStatus = 0;
			else if((player.getCurrentHP() > 0) && (mobMonster.getCurrentHP() <= 0))
				battleStatus = 1;
			else battleStatus = 4;
		}
		else
		{
			if((player.getCurrentHP() > 0) && (bossMonster.getCurrentHP() > 0))
				battleStatus = 0;
			else if((player.getCurrentHP() > 0) && (bossMonster.getCurrentHP() <= 0) && !bossMonster.isNowSecondWind())
				battleStatus = 2;
			else if((player.getCurrentHP() > 0) && (bossMonster.getCurrentHP() <= 0) && bossMonster.isNowSecondWind())
				battleStatus = 3;
			else battleStatus = 4;
		}
		return battleStatus;
	}

	public void playerAttackToMob()
	{
		double damage = 0.0, minATK = player.getCurrentATK()/3;
		damage = minATK + player.getCurrentATK()*player.rollDoubleDice();
		if(player.rollDoubleDice() > 0.95)
			damage += player.getCurrentCRT()/2;
		battleEvent += player.getName() + " attacked " + mobMonster.getName() + "!\n";
		inflictHPDamageToMobMonster(damage);
	}

	public void playerDefend()
	{
		playerResist = player.getCurrentDEF()/2;
		battleEvent += player.getName() + " defended, awaiting for the opponent's attack.\n";
	}

	public void playerUseSkillToMob(int skillNum)
	{
		double damage = 0.0, minSPC = player.getCurrentATK()/3;
		if(skillNum == 0)
			damage = minSPC + player.getCurrentSPC()*player.rollDoubleDice();
		else if(skillNum == 1)
			damage = minSPC*1.5 + player.getCurrentSPC()*player.rollDoubleDice();
		else if(skillNum == 2)
			damage = player.getCurrentSPC()*4 + player.getCurrentSPC()*player.rollDoubleDice();
		if(player.rollDoubleDice() > 0.95)
			damage += player.getCurrentCRT()/2;
		battleEvent += player.getName() + " used " + player.getSkillSet().get(skillNum).getSkillName() + " on "
				+ mobMonster.getName() + "!\n";
		inflictHPDamageToMobMonster(damage);
		player.setCurrentHP(player.getCurrentHP()-player.getSkillSet().get(skillNum).getSkillHPCost());
		player.setCurrentSP(player.getCurrentSP()-player.getSkillSet().get(skillNum).getSkillSPCost());
		battleEvent += player.getName() + " consumed " + d0.format(player.getSkillSet().get(skillNum).getSkillSPCost()) 
				+ " SP and took " + d0.format(player.getSkillSet().get(skillNum).getSkillHPCost()) + " damage.\n";
	}

	public void playerHeal()
	{
		double healValue = 0.0;
		if(player.getBattleClass().equals("Swordsman"))
			healValue = player.getDefHP()*0.25;
		else
			healValue = player.getDefHP()*0.3;
		battleEvent += player.getName() + " used Healing Spell and regained " + d0.format(healValue) + " HP.\n";
		if(player.getCurrentHP() + healValue >= player.getDefHP())
			player.setCurrentHP(player.getDefHP());
		else player.setCurrentHP(player.getCurrentHP()+healValue);
		player.setCurrentSP(player.getCurrentSP()-2);
	}

	public void mobAttack()
	{
		double damage = 0.0, minATK = mobMonster.getCurrentATK()/2;
		damage = minATK + mobMonster.getCurrentATK()*mobMonster.rollDoubleDice();
		if(mobMonster.rollDoubleDice() > 0.9)
			damage += mobMonster.getCurrentCRT()/2;
		battleEvent += "The " + mobMonster.getName() + " attacked " + player.getName() + "!\n";
		inflictHPDamageToPlayer(damage);
	}

	public void mobDefend()
	{
		opponentResist = mobMonster.getCurrentDEF()/2;
		battleEvent += "The " + mobMonster.getName() + " defended, waiting for your next move.\n";
	}

	public void mobUseSkill()
	{
		double damage = 0.0, minSPC = mobMonster.getCurrentSPC()/2;
		damage = minSPC + mobMonster.getCurrentSPC()*mobMonster.rollDoubleDice();
		if(mobMonster.rollDoubleDice() > 0.9)
			damage += mobMonster.getCurrentCRT()/2;
		battleEvent += "The " + mobMonster.getName() + " used " + mobMonster.getSkill().getSkillName() + " on "
				+ player.getName() + "!\n";
		inflictHPDamageToPlayer(damage);
	}
	
	public void bossAttack()
	{
		double damage = 0.0, minATK = bossMonster.getCurrentATK()/2;
		damage = minATK + bossMonster.getCurrentATK()*bossMonster.rollDoubleDice()/2;
		if(bossMonster.rollDoubleDice() > 0.9)
			damage += bossMonster.getCurrentCRT()/2;
		inflictHPDamageToPlayer(damage);
	}

	public void bossDefend()
	{
		opponentResist = bossMonster.getCurrentDEF()/2;
	}

	public void bossUseSkill()
	{
		double damage = 0.0, minSPC = bossMonster.getCurrentSPC()/2;
		damage = minSPC + bossMonster.getCurrentATK()*bossMonster.rollDoubleDice()/2;
		if(bossMonster.rollDoubleDice() > 0.9)
			damage += bossMonster.getCurrentCRT()/2;
		inflictHPDamageToPlayer(damage);
	}
	
	public void bossHeal()
	{
		double healValue = 0.0;
		healValue = bossMonster.getDefHP()*0.05;
		//YES THIS IS INTENTIONAL HAHAHAHA
		//The boss can regain HP beyond its Default HP to have that
		//actual "boss" feel. (and also to troll the player :D )
		bossMonster.setCurrentHP(bossMonster.getCurrentHP()+healValue);
		bossMonster.setCurrentSP(bossMonster.getCurrentSP()-2);
	}
	
	public void inflictHPDamageToPlayer(double damage)
	{
		inflictedDamage = damage-playerResist;
		if(inflictedDamage > 0) //negative damage is not allowed... that's why
		{
			if(inflictedDamage < player.getCurrentHP())
				player.setCurrentHP(player.getCurrentHP()-inflictedDamage);
			else
				player.setCurrentHP(0);
			battleEvent += player.getName() + " took " + d0.format(inflictedDamage) + " damage!\n";
		}
		else
			battleEvent += player.getName() + " fully resisted the attack!\n";
		playerResist = 0.0; //resets the resistance from damage
	}
	public void inflictSPDamageToPlayer(double damage)
	{
		player.setCurrentSP(player.getCurrentSP()-damage);
		if(damage > 0)
			battleEvent += player.getName() + "'s SP got drained!\n";
		else battleEvent += player.getName() + "'s SP replenished!\n";
	}
	public void inflictATKDamageToPlayer(double damage)
	{
		player.setCurrentATK(player.getCurrentATK()-damage);
		if(damage > 0)
			battleEvent += player.getName() + "'s Attack fell!\n";
		else battleEvent += player.getName() + "'s Attack rose!\n";
	}
	public void inflictDEFDamageToPlayer(double damage)
	{
		player.setCurrentDEF(player.getCurrentDEF()-damage);
		if(damage > 0)
			battleEvent += player.getName() + "'s Defense fell!\n";
		else battleEvent += player.getName() + "'s Defense rose!\n";
	}
	public void inflictSPCDamageToPlayer(double damage)
	{
		player.setCurrentSPC(player.getCurrentSPC()-damage);
		if(damage > 0)
			battleEvent += player.getName() + "'s Special fell!\n";
		else battleEvent += player.getName() + "'s Special rose!\n";
	}
	public void inflictAGIDamageToPlayer(double damage)
	{
		player.setCurrentAGI(player.getCurrentAGI()-damage);
		if(damage > 0)
			battleEvent += player.getName() + "'s Agility fell!\n";
		else battleEvent += player.getName() + "'s Agility rose!\n";
	}
	public void inflictCRTDamageToPlayer(double damage)
	{
		player.setCurrentCRT(player.getCurrentCRT()-damage);
		if(damage > 0)
			battleEvent += player.getName() + "'s Critical fell!\n";
		else battleEvent += player.getName() + "'s Critical rose!\n";
	}

	public void inflictHPDamageToMobMonster(double damage)
	{
		inflictedDamage = damage-opponentResist;
		if(inflictedDamage > 0) //negative damage is not allowed... that's why
		{
			if(inflictedDamage < mobMonster.getCurrentHP())
				mobMonster.setCurrentHP(mobMonster.getCurrentHP()-inflictedDamage);
			else
				mobMonster.setCurrentHP(0);
			battleEvent += "The " + mobMonster.getName() + " took " + d0.format(inflictedDamage) + " damage!\n";
		}
		else
			battleEvent += "The " + mobMonster.getName() + " fully resisted the attack!\n";
		opponentResist = 0.0; //resets the resistance from damage
	}
	public void inflictSPDamageToMobMonster(double damage)
	{
		mobMonster.setCurrentSP(mobMonster.getCurrentSP()-damage);
		if(damage > 0)
			battleEvent += mobMonster.getName() + "'s SP got drained!\n";
		else battleEvent += mobMonster.getName() + "'s SP replenished!\n";
	}
	public void inflictATKDamageToMobMonster(double damage)
	{
		mobMonster.setCurrentATK(mobMonster.getCurrentATK()-damage);
		if(damage > 0)
			battleEvent += mobMonster.getName() + "'s Attack fell!\n";
		else battleEvent += mobMonster.getName() + "'s Attack rose!\n";
	}
	public void inflictDEFDamageToMobMonster(double damage)
	{
		mobMonster.setCurrentDEF(mobMonster.getCurrentDEF()-damage);
		if(damage > 0)
			battleEvent += mobMonster.getName() + "'s Defense fell!\n";
		else battleEvent += mobMonster.getName() + "'s Defense rose!\n";
	}
	public void inflictSPCDamageToMobMonster(double damage)
	{
		mobMonster.setCurrentSPC(mobMonster.getCurrentSPC()-damage);
		if(damage > 0)
			battleEvent += mobMonster.getName() + "'s Special fell!\n";
		else battleEvent += mobMonster.getName() + "'s Special rose!\n";
	}
	public void inflictAGIDamageToMobMonster(double damage)
	{
		mobMonster.setCurrentAGI(mobMonster.getCurrentAGI()-damage);
		if(damage > 0)
			battleEvent += mobMonster.getName() + "'s Agility fell!\n";
		else battleEvent += mobMonster.getName() + "'s Agility rose!\n";
	}
	public void inflictCRTDamageToMobMonster(double damage)
	{
		mobMonster.setCurrentCRT(mobMonster.getCurrentCRT()-damage);
		if(damage > 0)
			battleEvent += mobMonster.getName() + "'s Critical fell!\n";
		else battleEvent += mobMonster.getName() + "'s Critical rose!\n";
	}
	
	public void inflictHPDamageToBossMonster(double damage)
	{
		inflictedDamage = damage-opponentResist;
		if(inflictedDamage > 0) //negative damage is not allowed... that's why
		{
			if(inflictedDamage < bossMonster.getCurrentHP())
				bossMonster.setCurrentHP(bossMonster.getCurrentHP()-inflictedDamage);
			else
				bossMonster.setCurrentHP(0);
			battleEvent += bossMonster.getName() + " took " + d0.format(inflictedDamage) + " damage!\n";
		}
		else
			battleEvent += bossMonster.getName() + " fully resisted the attack!\n";
		opponentResist = 0.0; //resets the resistance from damage
	}
	public void inflictSPDamageToBossMonster(double damage)
	{
		bossMonster.setCurrentSP(bossMonster.getCurrentSP()-damage);
		if(damage > 0)
			battleEvent += bossMonster.getName() + "'s SP got drained!\n";
		else battleEvent += bossMonster.getName() + "'s SP replenished!\n";
	}
	public void inflictATKDamageToBossMonster(double damage)
	{
		bossMonster.setCurrentATK(bossMonster.getCurrentATK()-damage);
		if(damage > 0)
			battleEvent += bossMonster.getName() + "'s Attack fell!\n";
		else battleEvent += bossMonster.getName() + "'s Attack rose!\n";
	}
	public void inflictDEFDamageToBossMonster(double damage)
	{
		bossMonster.setCurrentDEF(bossMonster.getCurrentDEF()-damage);
		if(damage > 0)
			battleEvent += bossMonster.getName() + "'s Defense fell!\n";
		else battleEvent += bossMonster.getName() + "'s Defense rose!\n";
	}
	public void inflictSPCDamageToBossMonster(double damage)
	{
		bossMonster.setCurrentSPC(bossMonster.getCurrentSPC()-damage);
		if(damage > 0)
			battleEvent += bossMonster.getName() + "'s Special fell!\n";
		else battleEvent += bossMonster.getName() + "'s Special rose!\n";
	}
	public void inflictAGIDamageToBossMonster(double damage)
	{
		bossMonster.setCurrentAGI(bossMonster.getCurrentAGI()-damage);
		if(damage > 0)
			battleEvent += bossMonster.getName() + "'s Agility fell!\n";
		else battleEvent += bossMonster.getName() + "'s Agility rose!\n";
	}
	public void inflictCRTDamageToBossMonster(double damage)
	{
		bossMonster.setCurrentCRT(bossMonster.getCurrentCRT()-damage);
		if(damage > 0)
			battleEvent += bossMonster.getName() + "'s Critical fell!\n";
		else battleEvent += bossMonster.getName() + "'s Critical rose!\n";
	}
	
	public String rollOpponentMove()
	{
		String toReturn = new String();
		double diceResult = 0.0;
		/* Opponent Move:
		 * A = Attack
		 * D = Defend
		 * S = Use Skill
		 * H = Heal
		 * F = Flee
		 */
		if(isMobBattle)
		{
			diceResult = mobMonster.rollDoubleDice();
			if(diceResult < mobMonster.getChanceAttack())
				toReturn = new String("A");
			else if(diceResult < mobMonster.getChanceAttack()+mobMonster.getChanceDefend())
				toReturn = new String("D");
			else if(diceResult < mobMonster.getChanceAttack()+mobMonster.getChanceDefend()+mobMonster.getChanceSkill())
				toReturn = new String("S");
			else toReturn = new String("F");
		}
		else
		{
			if(!bossMonster.isNowSecondWind())
			{
				if(diceResult < bossMonster.getChanceAttack())
					toReturn = new String("A");
				else if(diceResult < bossMonster.getChanceAttack()+bossMonster.getChanceDefend())
					toReturn = new String("D");
				else if(diceResult < bossMonster.getChanceAttack()+bossMonster.getChanceDefend()+bossMonster.getChanceSkill())
					toReturn = new String("S");
				else toReturn = new String("H");
			}
			else
			{
				if(diceResult < bossMonster.getChanceAttackWind2())
					toReturn = new String("A");
				else if(diceResult < bossMonster.getChanceAttackWind2()+bossMonster.getChanceDefendWind2())
					toReturn = new String("D");
				else toReturn = new String("S");
			}
		}
		return toReturn;
	}

	public HumanPlayer getPlayer() {
		return player;
	}

	public void setPlayer(HumanPlayer player) {
		this.player = player;
	}

	public MobMonster getMobMonster() {
		return mobMonster;
	}

	public void setMobMonster(MobMonster mobMonster) {
		this.mobMonster = mobMonster;
	}

	public BossMonster getBossMonster() {
		return bossMonster;
	}

	public void setBossMonster(BossMonster bossMonster) {
		this.bossMonster = bossMonster;
	}

	public boolean isMobBattle() {
		return isMobBattle;
	}

	public void setMobBattle(boolean isMobBattle) {
		this.isMobBattle = isMobBattle;
	}
	public double getInflictedDamage()
	{
		return inflictedDamage;
	}

	public String getBattleEvent() {
		return battleEvent;
	}

	public void setBattleEvent(String battleEvent) {
		this.battleEvent = battleEvent;
	}
	
	public void resetBattleEvent()
	{
		battleEvent = new String("");
	}
}