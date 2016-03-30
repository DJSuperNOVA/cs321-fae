package ui;

import java.util.Random;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import domain.BossMonster;
import managers.ImageManager;
import managers.LanguageManager;
import managers.SystemManager;
import managers.StatsManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

public class NavigationUI extends JPanel 
{
	private JTextField tf_wins, tf_keys;
	private JLabel l_area, l_instructions, l_bg;
	private JButton b_loc1, b_loc2, b_loc3, b_loc4, b_loc5, b_loc6, b_loc7, b_loc8, b_loc9, b_loc10,
					b_loc11, b_loc12, b_rest, b_boss, b_shop, b_save, b_quit, b_areaInfo, b_inventory;
	private JLabel l_missionDetail, l_mobsDesc, l_missions;
	private JTextArea ta_status, ta_stats;

	private SystemManager systemManager;
	private ImageManager imageManager;
	private NavigationHandler navigationHandler;
	private StatsManager statsManager;
	private LanguageManager languageManager;
	private BossMonster bossMonster;
	
	private Random random;
	private DecimalFormat d0 = new DecimalFormat("####");
	
	public NavigationUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		navigationHandler = new NavigationHandler();
		imageManager = new ImageManager();
		statsManager = new StatsManager();
		languageManager = new LanguageManager("areaNames");
		random = new Random();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		l_area = new JLabel("Navigation");
		l_area.setForeground(Color.WHITE);
		l_area.setFont(new Font("Trajan Pro", Font.PLAIN, 24));
		l_area.setBounds(30, 11, 493, 30);
		add(l_area);
		
		l_instructions = new JLabel("Click anywhere in the map to fight mobs.");
		l_instructions.setForeground(Color.WHITE);
		l_instructions.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_instructions.setBounds(30, 39, 493, 30);
		add(l_instructions);
		
		b_loc1 = new JButton();
		b_loc1.setActionCommand("Loc1");
		b_loc1.setIcon(imageManager.getAreaLocation(1, "1b"));
		b_loc1.setRolloverIcon(imageManager.getAreaLocation(1, "1"));
		b_loc1.setContentAreaFilled(false);
		b_loc1.setFocusPainted(false);
		b_loc1.setOpaque(false);
		b_loc1.setForeground(Color.WHITE);
		b_loc1.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_loc1.setBounds(70, 80, 125, 125);
		add(b_loc1);
		
		b_loc2 = new JButton();
		b_loc2.setActionCommand("Loc2");
		b_loc2.setIcon(imageManager.getAreaLocation(1, "2b"));
		b_loc2.setRolloverIcon(imageManager.getAreaLocation(1, "2"));
		b_loc2.setContentAreaFilled(false);
		b_loc2.setFocusPainted(false);
		b_loc2.setOpaque(false);
		b_loc2.setForeground(Color.WHITE);
		b_loc2.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_loc2.setBounds(195, 80, 125, 125);
		add(b_loc2);
		
		b_loc3 = new JButton();
		b_loc3.setActionCommand("Loc3");
		b_loc3.setIcon(imageManager.getAreaLocation(1, "3b"));
		b_loc3.setRolloverIcon(imageManager.getAreaLocation(1, "3"));
		b_loc3.setContentAreaFilled(false);
		b_loc3.setFocusPainted(false);
		b_loc3.setOpaque(false);
		b_loc3.setForeground(Color.WHITE);
		b_loc3.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_loc3.setBounds(320, 80, 125, 125);
		add(b_loc3);
		
		b_loc4 = new JButton();
		b_loc4.setActionCommand("Loc4");
		b_loc4.setIcon(imageManager.getAreaLocation(1, "4b"));
		b_loc4.setRolloverIcon(imageManager.getAreaLocation(1, "4"));
		b_loc4.setContentAreaFilled(false);
		b_loc4.setFocusPainted(false);
		b_loc4.setOpaque(false);
		b_loc4.setForeground(Color.WHITE);
		b_loc4.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_loc4.setBounds(445, 80, 125, 125);
		add(b_loc4);
		
		b_loc5 = new JButton();
		b_loc5.setActionCommand("Loc5");
		b_loc5.setIcon(imageManager.getAreaLocation(1, "5b"));
		b_loc5.setRolloverIcon(imageManager.getAreaLocation(1, "5"));
		b_loc5.setContentAreaFilled(false);
		b_loc5.setFocusPainted(false);
		b_loc5.setOpaque(false);
		b_loc5.setForeground(Color.WHITE);
		b_loc5.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_loc5.setBounds(70, 205, 125, 125);
		add(b_loc5);
		
		b_loc6 = new JButton();
		b_loc6.setActionCommand("Loc6");
		b_loc6.setIcon(imageManager.getAreaLocation(1, "6b"));
		b_loc6.setRolloverIcon(imageManager.getAreaLocation(1, "6"));
		b_loc6.setContentAreaFilled(false);
		b_loc6.setFocusPainted(false);
		b_loc6.setOpaque(false);
		b_loc6.setForeground(Color.WHITE);
		b_loc6.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_loc6.setBounds(195, 205, 125, 125);
		add(b_loc6);
		
		b_loc7 = new JButton();
		b_loc7.setActionCommand("Loc7");
		b_loc7.setIcon(imageManager.getAreaLocation(1, "7b"));
		b_loc7.setRolloverIcon(imageManager.getAreaLocation(1, "7"));
		b_loc7.setContentAreaFilled(false);
		b_loc7.setFocusPainted(false);
		b_loc7.setOpaque(false);
		b_loc7.setForeground(Color.WHITE);
		b_loc7.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_loc7.setBounds(320, 205, 125, 125);
		add(b_loc7);
		
		b_loc8 = new JButton();
		b_loc8.setActionCommand("Loc8");
		b_loc8.setIcon(imageManager.getAreaLocation(1, "8b"));
		b_loc8.setRolloverIcon(imageManager.getAreaLocation(1, "8"));
		b_loc8.setContentAreaFilled(false);
		b_loc8.setFocusPainted(false);
		b_loc8.setOpaque(false);
		b_loc8.setForeground(Color.WHITE);
		b_loc8.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_loc8.setBounds(445, 205, 125, 125);
		add(b_loc8);
		
		b_loc9 = new JButton();
		b_loc9.setActionCommand("Loc9");
		b_loc9.setIcon(imageManager.getAreaLocation(1, "9b"));
		b_loc9.setRolloverIcon(imageManager.getAreaLocation(1, "9"));
		b_loc9.setContentAreaFilled(false);
		b_loc9.setFocusPainted(false);
		b_loc9.setOpaque(false);
		b_loc9.setForeground(Color.WHITE);
		b_loc9.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_loc9.setBounds(70, 330, 125, 125);
		add(b_loc9);
		
		b_loc10 = new JButton();
		b_loc10.setActionCommand("Loc10");
		b_loc10.setIcon(imageManager.getAreaLocation(1, "10b"));
		b_loc10.setRolloverIcon(imageManager.getAreaLocation(1, "10"));
		b_loc10.setContentAreaFilled(false);
		b_loc10.setFocusPainted(false);
		b_loc10.setOpaque(false);
		b_loc10.setForeground(Color.WHITE);
		b_loc10.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_loc10.setBounds(195, 330, 125, 125);
		add(b_loc10);
		
		b_loc11 = new JButton();
		b_loc11.setActionCommand("Loc11");
		b_loc11.setIcon(imageManager.getAreaLocation(1, "11b"));
		b_loc11.setRolloverIcon(imageManager.getAreaLocation(1, "11"));
		b_loc11.setContentAreaFilled(false);
		b_loc11.setFocusPainted(false);
		b_loc11.setOpaque(false);
		b_loc11.setForeground(Color.WHITE);
		b_loc11.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_loc11.setBounds(320, 330, 125, 125);
		add(b_loc11);
		
		b_loc12 = new JButton();
		b_loc12.setActionCommand("Loc12");
		b_loc12.setIcon(imageManager.getAreaLocation(1, "12b"));
		b_loc12.setRolloverIcon(imageManager.getAreaLocation(1, "12"));
		b_loc12.setContentAreaFilled(false);
		b_loc12.setFocusPainted(false);
		b_loc12.setOpaque(false);
		b_loc12.setForeground(Color.WHITE);
		b_loc12.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_loc12.setBounds(445, 330, 125, 125);
		add(b_loc12);
		
		l_missionDetail = new JLabel("Complete the missions to fight the boss.");
		l_missionDetail.setForeground(Color.WHITE);
		l_missionDetail.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_missionDetail.setBounds(70, 466, 350, 30);
		add(l_missionDetail);
		
		l_mobsDesc = new JLabel("Mob Levels: 1 to 5");
		l_mobsDesc.setForeground(Color.WHITE);
		l_mobsDesc.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_mobsDesc.setBounds(425, 466, 148, 30);
		add(l_mobsDesc);

		/*
		 * Player's HP and SP now always restored to full after every battle.
		 * Beneficial to both players and the developers.
		 * (I mean, even at testing phase, you really can't win a match without healing first.)
		 * 
		b_rest = new JButton();
		b_rest.setActionCommand("Rest to Inn");
		b_rest.setBorder(null);
		b_rest.setIcon(imageManager.getNavigationGraphic("Inn"));
		b_rest.setRolloverIcon(imageManager.getNavigationGraphic("Inn_Hover"));
		b_rest.setContentAreaFilled(false);
		b_rest.setFocusPainted(false);
		b_rest.setOpaque(false);
		b_rest.setForeground(Color.WHITE);
		b_rest.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_rest.setBounds(30, 525, 170, 50);
		add(b_rest);
		*/
		
		b_shop = new JButton();
		b_shop.setActionCommand("Shop");
		b_shop.setBorder(null);
		b_shop.setIcon(imageManager.getNavigationGraphic("Shop"));
		b_shop.setRolloverIcon(imageManager.getNavigationGraphic("Shop_Hover"));
		b_shop.setContentAreaFilled(false);
		b_shop.setFocusPainted(false);
		b_shop.setOpaque(false);
		b_shop.setForeground(Color.WHITE);
		b_shop.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_shop.setBounds(70, 525, 170, 50);
		add(b_shop);
		
		b_boss = new JButton();
		b_boss.setActionCommand("Fight Boss");
		b_boss.setBorder(null);
		b_boss.setIcon(imageManager.getNavigationGraphic("BossFight"));
		b_boss.setRolloverIcon(imageManager.getNavigationGraphic("BossFight_Hover"));
		b_boss.setContentAreaFilled(false);
		b_boss.setFocusPainted(false);
		b_boss.setOpaque(false);
		b_boss.setForeground(Color.WHITE);
		b_boss.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_boss.setBounds(400, 525, 170, 50);
		add(b_boss);
		
		b_save = new JButton();
		b_save.setActionCommand("Save Game");
		b_save.setBorder(null);
		b_save.setIcon(imageManager.getNavigationGraphic("Save"));
		b_save.setRolloverIcon(imageManager.getNavigationGraphic("Save_Hover"));
		b_save.setContentAreaFilled(false);
		b_save.setFocusPainted(false);
		b_save.setOpaque(false);
		b_save.setForeground(Color.WHITE);
		b_save.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_save.setBounds(655, 525, 170, 50);
		add(b_save);
		
		b_quit = new JButton();
		b_quit.setActionCommand("Quit");
		b_quit.setBorder(null);
		b_quit.setIcon(imageManager.getNavigationGraphic("Quit"));
		b_quit.setRolloverIcon(imageManager.getNavigationGraphic("Quit_Hover"));
		b_quit.setContentAreaFilled(false);
		b_quit.setFocusPainted(false);
		b_quit.setOpaque(false);
		b_quit.setForeground(Color.WHITE);
		b_quit.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_quit.setBounds(863, 525, 170, 50);
		add(b_quit);
		
		b_inventory = new JButton();
		b_inventory.setActionCommand("Inventory");
		b_inventory.setBorder(null);
		b_inventory.setIcon(imageManager.getNavigationGraphic("Inventory"));
		b_inventory.setRolloverIcon(imageManager.getNavigationGraphic("Inventory_Hover"));
		b_inventory.setContentAreaFilled(false);
		b_inventory.setFocusPainted(false);
		b_inventory.setOpaque(false);
		b_inventory.setForeground(Color.WHITE);
		b_inventory.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_inventory.setBounds(655, 466, 170, 50);
		add(b_inventory);
		
		b_areaInfo = new JButton();
		b_areaInfo.setActionCommand("Area Selection");  // THIS THIS THIS THIS NEEEDS TO BE CHANGED
		b_areaInfo.setBorder(null);
		b_areaInfo.setIcon(imageManager.getNavigationGraphic("AreaInfo"));
		b_areaInfo.setRolloverIcon(imageManager.getNavigationGraphic("AreaInfo_Hover"));
		b_areaInfo.setContentAreaFilled(false);
		b_areaInfo.setFocusPainted(false);
		b_areaInfo.setOpaque(false);
		b_areaInfo.setForeground(Color.WHITE);
		b_areaInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_areaInfo.setBounds(863, 466, 170, 50);
		add(b_areaInfo);
		
		ta_status = new JTextArea();
		ta_status.setOpaque(false);
		ta_status.setForeground(Color.WHITE);
		ta_status.setText("");
		ta_status.setEditable(false);
		ta_status.setHighlighter(null);
		ta_status.setFont(new Font("Nyala", Font.PLAIN, 20));
		ta_status.setBounds(655, 106, 376, 64);
		add(ta_status);
		
		ta_stats = new JTextArea();
		ta_stats.setOpaque(false);
		ta_stats.setForeground(Color.WHITE);
		ta_stats.setText("Stats");
		ta_stats.setFont(new Font("Nyala", Font.PLAIN, 20));
		ta_stats.setEditable(false);
		ta_stats.setHighlighter(null);
		ta_stats.setBounds(655, 171, 376, 159);
		add(ta_stats);
		
		l_missions = new JLabel("Missions");
		l_missions.setForeground(Color.WHITE);
		l_missions.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_missions.setBounds(655, 312, 80, 30);
		add(l_missions);
		
		tf_wins = new JTextField();
		tf_wins.setOpaque(false);
		tf_wins.setForeground(Color.WHITE);
		tf_wins.setEditable(false);
		tf_wins.setHighlighter(null);
		tf_wins.setText("Battle Wins:");
		tf_wins.setFont(new Font("Nyala", Font.PLAIN, 20));
		tf_wins.setBounds(655, 342, 376, 38);
		add(tf_wins);
		tf_wins.setColumns(10);
		
		tf_keys = new JTextField();
		tf_keys.setOpaque(false);
		tf_keys.setForeground(Color.WHITE);
		tf_keys.setEditable(false);
		tf_keys.setHighlighter(null);
		tf_keys.setText("Boss Keys:");
		tf_keys.setFont(new Font("Nyala", Font.PLAIN, 20));
		tf_keys.setColumns(10);
		tf_keys.setBounds(655, 391, 376, 38);
		add(tf_keys);
		
		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getCommonBG());
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		b_shop.addActionListener(navigationHandler);
		//b_rest.addActionListener(navigationHandler);
		b_save.addActionListener(navigationHandler);
		b_quit.addActionListener(navigationHandler);
		b_inventory.addActionListener(navigationHandler);
		b_loc1.addActionListener(navigationHandler);
		b_loc2.addActionListener(navigationHandler);
		b_loc3.addActionListener(navigationHandler);
		b_loc4.addActionListener(navigationHandler);
		b_loc5.addActionListener(navigationHandler);
		b_loc6.addActionListener(navigationHandler);
		b_loc7.addActionListener(navigationHandler);
		b_loc8.addActionListener(navigationHandler);
		b_loc9.addActionListener(navigationHandler);
		b_loc10.addActionListener(navigationHandler);
		b_loc11.addActionListener(navigationHandler);
		b_loc12.addActionListener(navigationHandler);
		b_boss.addActionListener(navigationHandler);
		b_areaInfo.addActionListener(navigationHandler);
	}
	
	private class NavigationHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Shop"))
			{
				systemManager.getShopUI().refreshStatsShopUI(systemManager.getSelectedArea());
				systemManager.showShopUI();
			}
			else if(action.equals("Inventory"))
				systemManager.showInventoryUI();
			else if(action.equals("Rest to Inn"))
				healPlayer();
			else if(action.equals("Save Game"))
				systemManager.showLoadSaveUI(false);
			else if(action.equals("Quit"))
				System.exit(0);
			else if(action.substring(0, 3).equals("Loc")) //this
			{
				systemManager.playSFX("common_confirm");
				String mobID = "m" + randomizeSpawn();
				systemManager.showBattleUI(mobID);
				systemManager.playMusic("bgm_mobbattle");
			}
			else if(action.equals("Fight Boss")) //this
			{
//				String bossID = "b";
//				systemManager.showBattleUI(bossID);
			}
			repaint();
		}
	}
	
	public void healPlayer() 
	{
		systemManager.getHumanPlayer().setCurrentHP(systemManager.getHumanPlayer().getDefHP());
		systemManager.getHumanPlayer().setCurrentSP(systemManager.getHumanPlayer().getDefSP());
		//systemManager.getHumanPlayer().setAu(systemManager.getHumanPlayer().getAu()-5);
		//Players are now always healed after battle, free of charge.
		systemManager.getNavigationUI().refreshNavigationUI();
	}
	
	public int randomizeSpawn() //this
	{
		int randomMob = random.nextInt( 4 + 2*systemManager.getSelectedArea() ) + 1;
		return randomMob;
	}

	public void refreshNavigationUI()
	{
		bossMonster = statsManager.getBossMonster(systemManager.getSelectedArea());
		l_mobsDesc.setText("Mob Levels: " + statsManager.getMinMobLevel(systemManager.getSelectedArea()) + " ~ " + statsManager.getMaxMobLevel(systemManager.getSelectedArea()));
		ta_status.setText(systemManager.getHumanPlayer().getName() + "\tLv: " + systemManager.getHumanPlayer().getLevel() + "\n"
				+ "HP : " + d0.format(systemManager.getHumanPlayer().getCurrentHP()) + " / " + d0.format(systemManager.getHumanPlayer().getDefHP()) + "\t"
				+ "\tSP : " + d0.format(systemManager.getHumanPlayer().getCurrentSP()) + " / " + d0.format(systemManager.getHumanPlayer().getDefSP()) + "\n"
				+ "Money\t: Au " + d0.format(systemManager.getHumanPlayer().getAu()));
		ta_stats.setText("XP\t: " + d0.format(systemManager.getHumanPlayer().getXP()) + " / " + d0.format(systemManager.getStatsManager().getPlayerXPtoNextLevel(systemManager.getHumanPlayer().getBattleClass(), systemManager.getHumanPlayer().getLevel())) + "\n"
				+ "Attack\t: " + d0.format(systemManager.getHumanPlayer().getCurrentATK()) + "\n"
				+ "Defense\t: " + d0.format(systemManager.getHumanPlayer().getCurrentDEF()) + "\n"
				+ "Special\t: " + d0.format(systemManager.getHumanPlayer().getCurrentSPC()) + "\n"
				+ "Agility\t: " + d0.format(systemManager.getHumanPlayer().getCurrentAGI()) + "\n"
				+ "Critical\t: " + d0.format(systemManager.getHumanPlayer().getCurrentCRT()));
		tf_wins.setText("Battle Wins\t: " + systemManager.getHumanPlayer().getWins() + " / " + bossMonster.getMissionWins());
		if(systemManager.getHumanPlayer().getWins() >= bossMonster.getMissionWins())
		{
			tf_wins.setForeground(Color.GREEN);
			tf_wins.setText("Battle Wins\t: " + bossMonster.getMissionWins() + " / " + bossMonster.getMissionWins());
		}
		else tf_wins.setForeground(Color.LIGHT_GRAY);
		tf_keys.setText("Boss Keys\t: " + systemManager.getHumanPlayer().getBossKeys() + " / " + bossMonster.getMissionBossKeys());
		if(systemManager.getHumanPlayer().getBossKeys() >= bossMonster.getMissionBossKeys())
			tf_keys.setForeground(Color.GREEN);
		else tf_keys.setForeground(Color.LIGHT_GRAY);
		/*
		 * Boss keys are allowed to exceed its required amount because it is spent every boss fight attempt.
		 * However, if the boss is defeated, the counter will reset to 0.
		 */
		l_area.setText(languageManager.getAreaName(systemManager.getSelectedArea()));
		refreshAreaLocations(systemManager.getSelectedArea());
		systemManager.playMusic("bgm_area"+systemManager.getSelectedArea());
	}
	
	private void refreshAreaLocations(int area)
	{
		b_loc1.setIcon(imageManager.getAreaLocation(area, "1b"));
		b_loc1.setRolloverIcon(imageManager.getAreaLocation(area, "1"));
		b_loc2.setIcon(imageManager.getAreaLocation(area, "2b"));
		b_loc2.setRolloverIcon(imageManager.getAreaLocation(area, "2"));
		b_loc3.setIcon(imageManager.getAreaLocation(area, "3b"));
		b_loc3.setRolloverIcon(imageManager.getAreaLocation(area, "3"));
		b_loc4.setIcon(imageManager.getAreaLocation(area, "4b"));
		b_loc4.setRolloverIcon(imageManager.getAreaLocation(area, "4"));
		b_loc5.setIcon(imageManager.getAreaLocation(area, "5b"));
		b_loc5.setRolloverIcon(imageManager.getAreaLocation(area, "5"));
		b_loc6.setIcon(imageManager.getAreaLocation(area, "6b"));
		b_loc6.setRolloverIcon(imageManager.getAreaLocation(area, "6"));
		b_loc7.setIcon(imageManager.getAreaLocation(area, "7b"));
		b_loc7.setRolloverIcon(imageManager.getAreaLocation(area, "7"));
		b_loc8.setIcon(imageManager.getAreaLocation(area, "8b"));
		b_loc8.setRolloverIcon(imageManager.getAreaLocation(area, "8"));
		b_loc9.setIcon(imageManager.getAreaLocation(area, "9b"));
		b_loc9.setRolloverIcon(imageManager.getAreaLocation(area, "9"));
		b_loc10.setIcon(imageManager.getAreaLocation(area, "10b"));
		b_loc10.setRolloverIcon(imageManager.getAreaLocation(area, "10"));
		b_loc11.setIcon(imageManager.getAreaLocation(area, "11b"));
		b_loc11.setRolloverIcon(imageManager.getAreaLocation(area, "11"));
		b_loc12.setIcon(imageManager.getAreaLocation(area, "12b"));
		b_loc12.setRolloverIcon(imageManager.getAreaLocation(area, "12"));	
	}
}
