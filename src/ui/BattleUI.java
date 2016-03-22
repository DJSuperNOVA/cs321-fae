package ui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.BattleManager;
import managers.ImageManager;
import managers.SystemManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.text.DecimalFormat;

public class BattleUI extends JPanel 
{
	private JLabel l_player, l_enemy, l_playerLvl, l_playerHP, l_enemyLvl, l_playerSP, l_enemyHP,
	l_enemySP, l_bg, l_battleBG;
	private JProgressBar pb_playerHP, pb_playerSP, pb_enemyHP, pb_enemySP;
	private JButton b_skill, b_attack, b_defend, b_item, b_heal, b_flee;
	private JTextArea ta_progress;

	private SystemManager systemManager;
	private ImageManager imageManager;
	private BattleManager battleManager;
	private BattleHandler battleHandler;
	private DecimalFormat d0 = new DecimalFormat("####");
	private String monsterID;
	private Task task;
	private PropertyHandler propertyHandler;
	
	private boolean isBattleOver, isFirstAttack, isPlayerFirst, isTurnOver, isUsingSkill;
	private int totalEnemyDamage, totalPlayerDamage, currentEnemyProgress, currentPlayerProgress, currentSPProgress;
	
	public BattleUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		battleHandler = new BattleHandler();
		imageManager = new ImageManager();

		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		//this
		l_player = new JLabel();
		l_player.setBounds(46, 25, 315, 280);
		add(l_player);
		//this
		l_enemy = new JLabel();
		l_enemy.setBounds(637, 25, 315, 280);
		add(l_enemy);

		l_playerLvl = new JLabel();
		l_playerLvl.setForeground(Color.WHITE);
		l_playerLvl.setFont(new Font("Nyala", Font.PLAIN, 18));
		l_playerLvl.setBounds(32, 332, 200, 26);
		add(l_playerLvl);

		pb_playerHP = new JProgressBar();
		pb_playerHP.setBorder(new EmptyBorder(0, 0, 0, 0));
		pb_playerHP.setBorderPainted(false);
		pb_playerHP.setForeground(Color.WHITE);
		pb_playerHP.setBackground(Color.GREEN);
		pb_playerHP.setFont(new Font("Nyala", Font.PLAIN, 20));
		pb_playerHP.setBounds(169, 366, 244, 14);
		add(pb_playerHP);

		l_playerHP = new JLabel();
		l_playerHP.setForeground(Color.WHITE);
		l_playerHP.setFont(new Font("Nyala", Font.PLAIN, 18));
		l_playerHP.setBounds(32, 366, 127, 14);
		add(l_playerHP);

		pb_playerSP = new JProgressBar();
		pb_playerSP.setBorder(new EmptyBorder(0, 0, 0, 0));
		pb_playerSP.setBorderPainted(false);
		pb_playerSP.setForeground(Color.WHITE);
		pb_playerSP.setFont(new Font("Nyala", Font.PLAIN, 20));
		pb_playerSP.setBackground(Color.BLUE);
		pb_playerSP.setBounds(169, 391, 244, 14);
		add(pb_playerSP);

		l_playerSP = new JLabel();
		l_playerSP.setRequestFocusEnabled(false);
		l_playerSP.setForeground(Color.WHITE);
		l_playerSP.setFont(new Font("Nyala", Font.PLAIN, 18));
		l_playerSP.setBounds(32, 391, 127, 14);
		add(l_playerSP);

		l_enemyLvl = new JLabel();
		l_enemyLvl.setForeground(Color.WHITE);
		l_enemyLvl.setFont(new Font("Nyala", Font.PLAIN, 18));
		l_enemyLvl.setBounds(661, 332, 200, 26);
		add(l_enemyLvl);

		l_enemyHP = new JLabel();
		l_enemyHP.setForeground(Color.WHITE);
		l_enemyHP.setFont(new Font("Nyala", Font.PLAIN, 18));
		l_enemyHP.setBounds(661, 366, 127, 14);
		add(l_enemyHP);

		l_enemySP = new JLabel();
		l_enemySP.setForeground(Color.WHITE);
		l_enemySP.setFont(new Font("Nyala", Font.PLAIN, 18));
		l_enemySP.setBounds(661, 391, 127, 14);
		add(l_enemySP);

		pb_enemyHP = new JProgressBar();
		pb_enemyHP.setBorder(new EmptyBorder(0, 0, 0, 0));
		pb_enemyHP.setBorderPainted(false);
		pb_enemyHP.setForeground(Color.WHITE);
		pb_enemyHP.setFont(new Font("Nyala", Font.PLAIN, 20));
		pb_enemyHP.setBackground(Color.GREEN);
		pb_enemyHP.setBounds(798, 366, 244, 14);
		add(pb_enemyHP);

		pb_enemySP = new JProgressBar();
		pb_enemySP.setBorder(new EmptyBorder(0, 0, 0, 0));
		pb_enemySP.setBorderPainted(false);
		pb_enemySP.setForeground(Color.WHITE);
		pb_enemySP.setFont(new Font("Nyala", Font.PLAIN, 20));
		pb_enemySP.setBackground(Color.BLUE);
		pb_enemySP.setBounds(798, 391, 244, 14);
		add(pb_enemySP);

		b_attack = new JButton();
		b_attack.setActionCommand("ATTACK");
		b_attack.setBorder(null);
		b_attack.setIcon(imageManager.getBattleGraphic("Attack"));
		b_attack.setRolloverIcon(imageManager.getBattleGraphic("Attack_Hover"));
		b_attack.setFocusPainted(false);
		b_attack.setContentAreaFilled(false);
		b_attack.setForeground(Color.WHITE);
		b_attack.setOpaque(false);
		b_attack.setVerticalAlignment(SwingConstants.BOTTOM);
		b_attack.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_attack.setBounds(10, 416, 150, 85);
		add(b_attack);

		b_skill = new JButton();
		b_skill.setActionCommand("USE SKILL");
		b_skill.setBorder(null);
		b_skill.setIcon(imageManager.getBattleGraphic("UseSkill"));
		b_skill.setRolloverIcon(imageManager.getBattleGraphic("UseSkill_Hover"));
		b_skill.setFocusPainted(false);
		b_skill.setContentAreaFilled(false);
		b_skill.setForeground(Color.WHITE);
		b_skill.setOpaque(false);
		b_skill.setVerticalAlignment(SwingConstants.BOTTOM);
		b_skill.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_skill.setBounds(169, 416, 150, 85);
		add(b_skill);

		b_item = new JButton();
		b_item.setActionCommand("INVENTORY");
		b_item.setBorder(null);
		b_item.setIcon(imageManager.getBattleGraphic("Inventory"));
		b_item.setRolloverIcon(imageManager.getBattleGraphic("Inventory_Hover"));
		b_item.setFocusPainted(false);
		b_item.setContentAreaFilled(false);
		b_item.setForeground(Color.WHITE);
		b_item.setOpaque(false);
		b_item.setVisible(false); //temporary
		b_item.setVerticalAlignment(SwingConstants.BOTTOM);
		b_item.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_item.setBounds(328, 416, 150, 85);
		add(b_item);

		b_defend = new JButton();
		b_defend.setActionCommand("DEFEND");
		b_defend.setBorder(null);
		b_defend.setIcon(imageManager.getBattleGraphic("Defend"));
		b_defend.setRolloverIcon(imageManager.getBattleGraphic("Defend_Hover"));
		b_defend.setFocusPainted(false);
		b_defend.setContentAreaFilled(false);
		b_defend.setForeground(Color.WHITE);
		b_defend.setOpaque(false);
		b_defend.setVerticalAlignment(SwingConstants.BOTTOM);
		b_defend.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_defend.setBounds(10, 510, 150, 85);
		add(b_defend);

		b_heal = new JButton();
		b_heal.setActionCommand("HEAL");
		b_heal.setBorder(null);
		b_heal.setIcon(imageManager.getBattleGraphic("Heal"));
		b_heal.setRolloverIcon(imageManager.getBattleGraphic("Heal_Hover"));
		b_heal.setFocusPainted(false);
		b_heal.setContentAreaFilled(false);
		b_heal.setForeground(Color.WHITE);
		b_heal.setOpaque(false);
		b_heal.setVerticalAlignment(SwingConstants.BOTTOM);
		b_heal.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_heal.setBounds(169, 510, 150, 85);
		add(b_heal);

		b_flee = new JButton();
		b_flee.setActionCommand("FLEE");
		b_flee.setBorder(null);
		b_flee.setIcon(imageManager.getBattleGraphic("Flee"));
		b_flee.setRolloverIcon(imageManager.getBattleGraphic("Flee_Hover"));
		b_flee.setFocusPainted(false);
		b_flee.setContentAreaFilled(false);
		b_flee.setForeground(Color.WHITE);
		b_flee.setOpaque(false);
		b_flee.setVerticalAlignment(SwingConstants.BOTTOM);
		b_flee.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_flee.setBounds(328, 510, 150, 85);
		add(b_flee);

		ta_progress = new JTextArea();
		ta_progress.setForeground(Color.WHITE);
		ta_progress.setOpaque(false);
		ta_progress.setEditable(false);
		ta_progress.setHighlighter(null);
		ta_progress.setLineWrap(true);
		ta_progress.setWrapStyleWord(true);
		ta_progress.setFont(new Font("Nyala", Font.PLAIN, 18));
		ta_progress.setBounds(507, 416, 549, 180);
		add(ta_progress);
		
		//TEMPORARY
		l_battleBG = new JLabel();
		l_battleBG.setIcon(imageManager.getBattleBG(1));
		l_battleBG.setBounds(11, 5, 1046, 300);
		add(l_battleBG);

		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getCommonBG());
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);

		b_attack.addActionListener(battleHandler);
		b_defend.addActionListener(battleHandler);
		b_skill.addActionListener(battleHandler);
		b_heal.addActionListener(battleHandler);
		b_flee.addActionListener(battleHandler);
	}

	public void initializeBattleManager()
	{
		battleManager = new BattleManager(systemManager.getHumanPlayer(), true, Integer.parseInt(monsterID.substring(1)) - 1, 1);
		isBattleOver = false;
		l_playerLvl.setText("Lv " + battleManager.getPlayer().getLevel() + " " + battleManager.getPlayer().getName());
		l_playerHP.setText("HP " + d0.format(battleManager.getPlayer().getCurrentHP()) + " / " + d0.format(battleManager.getPlayer().getDefHP()));
		l_playerSP.setText("SP "+ d0.format(battleManager.getPlayer().getCurrentSP()) + " / " + d0.format(battleManager.getPlayer().getDefSP()));

		l_enemyLvl.setText("Lv " + battleManager.getMobMonster().getLevel() + " " + battleManager.getMobMonster().getName());
		l_enemyHP.setText("HP " + d0.format(battleManager.getMobMonster().getCurrentHP()) + " / " + d0.format(battleManager.getMobMonster().getDefHP()));
		l_enemySP.setText("SP "+ d0.format(battleManager.getMobMonster().getCurrentSP()) + " / " + d0.format(battleManager.getMobMonster().getDefSP()));
		ta_progress.setText("A " + battleManager.getMobMonster().getName() + " appeared!\n"
				+ "What will " + battleManager.getPlayer().getName() + " do?");
		b_attack.setVisible(true);
		b_attack.setIcon(imageManager.getBattleButton("Attack", battleManager.getPlayer().getBattleClass()));
		b_attack.setRolloverIcon(imageManager.getBattleButton("Attack", battleManager.getPlayer().getBattleClass()+"_Hover"));
		b_defend.setVisible(true);
		b_skill.setVisible(true);
		b_skill.setIcon(imageManager.getBattleButton("Skill", battleManager.getPlayer().getBattleClass()));
		b_skill.setRolloverIcon(imageManager.getBattleButton("Skill", battleManager.getPlayer().getBattleClass()+"_Hover"));
		b_heal.setVisible(true);
	}

	public void processMonsterID(String monsterID) //this
	{
		this.monsterID = monsterID;

		if(monsterID.charAt(0) == 'm')
		{
			l_enemy.setIcon(imageManager.getBattleMobOpponent(Integer.parseInt(monsterID.substring(1))));
		}
		else
		{
			l_enemy.setIcon(imageManager.getBattleBossOpponent(1));
		}
	}

	public void processPlayerImage(String playerClass) //this
	{
		l_player.setIcon(imageManager.getBattlePlayer(playerClass));
	}

	private class BattleHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			propertyHandler = new PropertyHandler();
			
			String action = e.getActionCommand();
			if(action.equals("FLEE"))
			{
				//can only flee on mob battle and if match is still ongoing
				//can only flee if player AGI >= mob AGI
				//has 70% chance of fleeing successfully
				if(battleManager.getBattleStatus()==0)
				{
					if(battleManager.isMobBattle() &&
							battleManager.getPlayer().getCurrentAGI()>=battleManager.getMobMonster().getCurrentAGI()
							&& battleManager.getPlayer().rollDoubleDice()>=0.7)
						systemManager.showNavigationUI();
					else
					{
						battleManager.setBattleEvent(battleManager.getPlayer().getName() + " failed to escape!\n");
						mobFight("D", battleManager.rollOpponentMove());
					}
				}
				else 
				{
					systemManager.showNavigationUI();
					if(systemManager.getHumanPlayer().getCurrentHP() <= 0)
						systemManager.getNavigationUI().healPlayer();
				}
			}
			else if(action.equals("ATTACK"))
			{
				battleManager.resetBattleEvent();
				if(battleManager.isMobBattle())
					mobFight("A", battleManager.rollOpponentMove());
				else bossFight("A", battleManager.rollOpponentMove());
				
				isTurnOver = false;
				task = new Task();
				task.addPropertyChangeListener(propertyHandler);
				task.execute();
			}
			else if(action.equals("DEFEND"))
			{
				battleManager.resetBattleEvent();
				if(battleManager.isMobBattle())
					mobFight("D", battleManager.rollOpponentMove());
				else bossFight("D", battleManager.rollOpponentMove());
			}
			else if(action.equals("USE SKILL"))
			{
				battleManager.resetBattleEvent();
				//not enough HP/SP will not execute it to not count as a turn.
				//for the opponent however, will count it as a turn, but will fail to execute
				if((battleManager.getPlayer().getSkillSet().get(0).getSkillSPCost()
						<= battleManager.getPlayer().getCurrentSP()) &&
						(battleManager.getPlayer().getSkillSet().get(0).getSkillHPCost() 
								<= battleManager.getPlayer().getCurrentHP()))
				{
					if(battleManager.isMobBattle())
						mobFight("S", battleManager.rollOpponentMove());
					else if (!battleManager.isMobBattle())
						bossFight("S", battleManager.rollOpponentMove());
					
					isTurnOver = false;
					isUsingSkill = true;
					task = new Task();
					task.addPropertyChangeListener(propertyHandler);
					task.execute();
				}
				else ta_progress.setText("Unable to use skill.");
			}
			else if(action.equals("HEAL"))
			{
				battleManager.resetBattleEvent();
				//not enough SP will not execute it to not count as a turn
				//for the boss however, will count it as a turn, but will fail to execute
				//boss cannot heal on second wind
				if(battleManager.getPlayer().getCurrentSP() >= 2)
				{
					if(battleManager.isMobBattle())
						mobFight("H", battleManager.rollOpponentMove());
					else bossFight("H", battleManager.rollOpponentMove());
				}
				else ta_progress.setText("Not enough SP to heal.");
			}

			repaint();
		}
	}
	

	private class PropertyHandler implements PropertyChangeListener
	{
		public void propertyChange(PropertyChangeEvent evt) 
		{
			if(isPlayerFirst)
			{
				if ("progress".equals(evt.getPropertyName())) 
				{
					int progress = (Integer) evt.getNewValue();
					pb_enemyHP.setValue(progress);
				}
			}
			else
			{
				if ("progress".equals(evt.getPropertyName())) 
				{
					int progress = (Integer) evt.getNewValue();
					pb_playerHP.setValue(progress);
					pb_playerSP.setValue(currentSPProgress);
				}
			}
		}
	}
	
	private class Task extends SwingWorker<Void, Void> 
	{
	
		@Override
		public Void doInBackground() 
		{
			int progress;
			int currentSP = (int) (battleManager.getPlayer().getDefSP() - battleManager.getPlayer().getCurrentSP()) * 100;
			
			if(!isFirstAttack)
				if(isPlayerFirst)
					progress = currentEnemyProgress;
				else
					progress = currentPlayerProgress;
			else
			{
				progress = 0;
				isFirstAttack = false;
			}
			
			if(isPlayerFirst)
			{
				totalEnemyDamage += (int) (battleManager.getInflictedPlayerDamage() / battleManager.getMobMonster().getDefHP() * 100);//14 23

				setProgress(0);
				while (currentEnemyProgress <= totalEnemyDamage) 
				{
					// Sleep for up to one second.
					try 
					{
						if(isUsingSkill)
							if(currentSPProgress <= currentSP)
								currentSPProgress++;
						Thread.sleep(15);
					}
					catch (InterruptedException ignore) 
					{
					}
					// Make random progress.
					++currentEnemyProgress;
					setProgress(++progress);
				}
			}
			else
			{
				totalPlayerDamage += (int) (battleManager.getInflictedDamage() / battleManager.getPlayer().getDefHP() * 100);//14 23
				
				setProgress(0);
				while (currentPlayerProgress <= totalPlayerDamage) 
				{
					// Sleep for up to one second.
					try 
					{
						Thread.sleep(15);
					}
					catch (InterruptedException ignore) 
					{
					}
					// Make random progress.
					++currentPlayerProgress;
					setProgress(++progress);
				}
				
			}
			return null;
		}

		/*
		 * Executed in event dispatching thread
		 */
		@Override
		public void done() 
		{
			isUsingSkill = false;
			
			if(isTurnOver)
			{
				ta_progress.setText(battleManager.getBattleEvent());
				return;
			}
			else
				if(isPlayerFirst)
				{
					isTurnOver = true;
					isPlayerFirst = false;
					task = new Task();
					task.addPropertyChangeListener(propertyHandler);
					task.execute();
				}
				else
				{
					isTurnOver = true;
					isPlayerFirst = true;
					task = new Task();
					task.addPropertyChangeListener(propertyHandler);
					task.execute();
				}
		}
	}

	private void mobFight(String playerMove, String opponentMove)
	{
		if(battleManager.getPlayer().getCurrentAGI() >= battleManager.getMobMonster().getCurrentAGI())
		{
			isPlayerFirst = true;
			if(opponentMove.equals("D") || opponentMove.equals("F"))
				mobMovesFirst(playerMove, opponentMove);
			else playerMovesFirstVSMob(playerMove, opponentMove);
		}
		else
		{
			isPlayerFirst = false;
			if(playerMove.equals("D") || playerMove.equals("H"))
				playerMovesFirstVSMob(playerMove, opponentMove);
			else mobMovesFirst(playerMove, opponentMove);
		}
	}

	private void playerMovesFirstVSMob(String playerMove, String opponentMove)
	{
		//String battleEvent = new String("");
		if(playerMove.equals("A"))
			battleManager.playerAttackToMob();
		else if(playerMove.equals("S"))
			battleManager.playerUseSkillToMob(0);
		else if(playerMove.equals("D"))
			battleManager.playerDefend();
		else if(playerMove.equals("H"))
			battleManager.playerHeal();
		checkBattleStatus(battleManager.getBattleStatus());
		if(!isBattleOver)
		{
			if(opponentMove.equals("A"))
				battleManager.mobAttack();
			else if(opponentMove.equals("D"))
				battleManager.mobDefend();
			else if(opponentMove.equals("S"))
				verifyAndExecuteMobSkill();
			checkBattleStatus(battleManager.getBattleStatus());
		}
		updateDisplays();
	}

	private void mobMovesFirst(String playerMove, String opponentMove)
	{
		//String battleEvent = new String("");
		if(opponentMove.equals("A"))
			battleManager.mobAttack();
		else if(opponentMove.equals("S"))
			verifyAndExecuteMobSkill();
		else if(opponentMove.equals("D"))
			battleManager.mobDefend();
		else if(opponentMove.equals("F"))
			checkBattleStatus(getMobAttemptFlee());
		checkBattleStatus(battleManager.getBattleStatus());
		if(!isBattleOver)
		{
			if(playerMove.equals("A"))
				battleManager.playerAttackToMob();
			else if (playerMove.equals("S"))
				battleManager.playerUseSkillToMob(0);
			checkBattleStatus(battleManager.getBattleStatus());
		}
		updateDisplays();

	}

	private void verifyAndExecuteMobSkill()
	{
		if(battleManager.getMobMonster().getCurrentSP() <= battleManager.getMobMonster().getDefSP())
			battleManager.mobUseSkill();
		else
		{
			battleManager.setBattleEvent(battleManager.getBattleEvent()
					+ battleManager.getMobMonster().getName() + " failed to use "
					+ battleManager.getMobMonster().getSkill().getSkillName() + "!\n");
		}
	}

	private void bossFight(String playerMove, String opponentMove)
	{
		if(battleManager.getPlayer().getCurrentAGI() >= battleManager.getMobMonster().getCurrentAGI())
		{
			if(opponentMove.equals("D") || opponentMove.equals("F"))
				bossMovesFirst(playerMove, opponentMove);
			else playerMovesFirstVSBoss(playerMove, opponentMove);
		}
		else
		{
			if(playerMove.equals("D") || playerMove.equals("H"))
				playerMovesFirstVSBoss(playerMove, opponentMove);
			else bossMovesFirst(playerMove, opponentMove);
		}
	}

	private void playerMovesFirstVSBoss(String playerMove, String opponentMove) 
	{
		if(playerMove.equals("A"))
			battleManager.playerAttackToMob();
		else if(playerMove.equals("S"))
			battleManager.playerUseSkillToMob(0);
		else if(playerMove.equals("D"))
			battleManager.playerDefend();
		else if(playerMove.equals("H"))
			battleManager.playerHeal();
		checkBattleStatus(battleManager.getBattleStatus());
		if(!isBattleOver)
		{
			if(opponentMove.equals("A"))
				battleManager.bossAttack();
			else if(opponentMove.equals("D"))
				battleManager.bossDefend();
			else if(opponentMove.equals("S"))
				verifyAndExecuteMobSkill();
			checkBattleStatus(battleManager.getBattleStatus());
		}
		updateDisplays();
	}

	private void bossMovesFirst(String playerMove, String opponentMove) 
	{
		if(opponentMove.equals("A"))
			battleManager.bossAttack();
		else if(opponentMove.equals("S"))
			verifyAndExecuteMobSkill();
		else if(opponentMove.equals("D"))
			battleManager.bossDefend();
		else if(opponentMove.equals("H"))
			battleManager.bossHeal();
		checkBattleStatus(battleManager.getBattleStatus());
		if(!isBattleOver)
		{
			if(playerMove.equals("A"))
				battleManager.playerAttackToMob();
			else if (playerMove.equals("S"))
				battleManager.playerUseSkillToMob(0);
			checkBattleStatus(battleManager.getBattleStatus());
		}
		updateDisplays();
	}

	/*
	 * NOTE: Code for boss battle seems to be repetitive with respect to mob.
	 * Will optimize this later, after merging with progress bar.
	 * Target of completion on this part: 3/21/2016 11:59pm
	 */
	
	private void checkBattleStatus(int currentStatus)
	{
		if(currentStatus == 1)
		{
			isBattleOver = true;
			battleManager.setBattleEvent(battleManager.getBattleEvent() + 
					battleManager.getMobMonster().getName() + " is defeated! You received "
					+ d0.format(battleManager.getMobMonster().getDefXPYield()) + " XP and Au "
					+ d0.format(battleManager.getMobMonster().getDefAuYield()) + ".\n"
					+ "Click \"Flee\" to end battle.");
			battleManager.getPlayer().addXP(battleManager.getMobMonster().getDefXPYield());
			battleManager.getPlayer().addAu(battleManager.getMobMonster().getDefAuYield());
			battleManager.getPlayer().refreshLevel(systemManager.getHumanPlayer().getBattleClass(), systemManager.getHumanPlayer().getXP());
			systemManager.setHumanPlayer(battleManager.getPlayer());
			systemManager.getNavigationUI().refreshNavigationUI();
			b_attack.setVisible(false);
			b_skill.setVisible(false);
			b_defend.setVisible(false);
			b_heal.setVisible(false);

		}
		else if(currentStatus == 4)
		{
			isBattleOver = true;
			battleManager.setBattleEvent(battleManager.getBattleEvent()
					+ "Our hero has fallen...\n"
					+ "Loss Penalty: Au " + d0.format(systemManager.getHumanPlayer().getAu()/3) + ".\n" 
					+ "Click \"Flee\" to end battle.");
			b_attack.setVisible(false);
			b_skill.setVisible(false);
			b_defend.setVisible(false);
			b_heal.setVisible(false);
			systemManager.getHumanPlayer().addAu(Double.parseDouble(d0.format(systemManager.getHumanPlayer().getAu()/3*(0-1))));
			l_playerHP.setText("HP 0 / " + d0.format(battleManager.getPlayer().getDefHP()));
			l_playerSP.setText("SP 0 / " + d0.format(battleManager.getPlayer().getDefSP()));
		}
	}

	private int getMobAttemptFlee()
	{
		int toReturn = 0;
		if(!(battleManager.getPlayer().getCurrentAGI() >= battleManager.getMobMonster().getCurrentAGI()))
			toReturn = 6;
		return toReturn;
	}

	public void updateDisplays()
	{
		l_playerHP.setText("HP " + d0.format(battleManager.getPlayer().getCurrentHP()) + " / " + d0.format(battleManager.getPlayer().getDefHP()));
		l_playerSP.setText("SP " + d0.format(battleManager.getPlayer().getCurrentSP()) + " / " + d0.format(battleManager.getPlayer().getDefSP()));
		if(battleManager.isMobBattle())
		{
			l_enemyHP.setText("HP " + d0.format(battleManager.getMobMonster().getCurrentHP()) + " / " + d0.format(battleManager.getMobMonster().getDefHP()));
			l_enemySP.setText("SP " + d0.format(battleManager.getMobMonster().getCurrentSP()) + " / " + d0.format(battleManager.getMobMonster().getDefSP()));
		}
		else
		{
			l_enemyHP.setText("HP " + d0.format(battleManager.getBossMonster().getCurrentHP()) + " / " + d0.format(battleManager.getBossMonster().getDefHP()));
			l_enemySP.setText("SP " + d0.format(battleManager.getBossMonster().getCurrentSP()) + " / " + d0.format(battleManager.getBossMonster().getDefSP()));
		}
	}
	
	public void updateHPSPBars()
	{
		totalEnemyDamage = 0;
		totalPlayerDamage = 0;
		currentEnemyProgress = 0;
		currentPlayerProgress = 0;
		currentSPProgress = 0;
		isFirstAttack = true;
		isUsingSkill = false;
		
		pb_playerHP.setValue(Integer.parseInt(d0.format(battleManager.getPlayer().getCurrentHP()/battleManager.getPlayer().getDefHP())) % 1);
		pb_playerSP.setValue(Integer.parseInt(d0.format(battleManager.getPlayer().getCurrentSP()/battleManager.getPlayer().getDefSP())) % 1);
		if(battleManager.isMobBattle())
		{
			pb_enemyHP.setValue(Integer.parseInt(d0.format(battleManager.getMobMonster().getCurrentHP()/battleManager.getMobMonster().getDefHP())) % 1);
			pb_enemySP.setValue(Integer.parseInt(d0.format(battleManager.getMobMonster().getCurrentSP()/battleManager.getMobMonster().getDefSP())) % 1);
		}
		else
		{
			pb_enemyHP.setValue(Integer.parseInt(d0.format(battleManager.getBossMonster().getCurrentHP()/battleManager.getBossMonster().getDefHP())) % 1);
			pb_enemyHP.setValue(Integer.parseInt(d0.format(battleManager.getBossMonster().getCurrentHP()/battleManager.getBossMonster().getDefHP())) % 1);
		}
	}
}
