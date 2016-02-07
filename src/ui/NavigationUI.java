package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NavigationUI extends JPanel 
{
	private JTextField txtBattleWins;
	private JTextField txtBossKeys;
	private JLabel lblNewLabel;
	private JLabel lblClickAnywhereIn;
	private JButton btnNewButton;
	private JButton btnLoc;
	private JButton btnLoc_1;
	private JButton btnLoc_2;
	private JButton btnLoc_3;
	private JButton btnLoc_4;
	private JButton btnLoc_5;
	private JButton btnLoc_6;
	private JButton btnLoc_7;
	private JButton btnLoc_8;
	private JButton btnLoc_9;
	private JButton btnLoc_10;
	private JLabel lblArea;
	private JLabel lblMobLevel;
	private JButton btnNewButton_1;
	private JButton btnFightBoss;
	private JButton btnShop;
	private JButton btnSaveGame;
	private JButton btnQuit;
	private JButton btnAreaInfo;
	private JButton btnInventory;
	private JTextArea txtrNameLvHp;
	private JTextArea textArea;
	private JLabel lblMissions;

	private SystemManager systemManager;
	private NavigationHandler navigationHandler;
	
	public NavigationUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		navigationHandler = new NavigationHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		lblNewLabel = new JLabel("Area 1: Peiyuu Village");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 11, 285, 30);
		add(lblNewLabel);
		
		lblClickAnywhereIn = new JLabel("Click anywhere in the map to fight mobs.");
		lblClickAnywhereIn.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblClickAnywhereIn.setBounds(30, 39, 285, 30);
		add(lblClickAnywhereIn);
		
		btnNewButton = new JButton("Loc01");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(70, 80, 125, 125);
		add(btnNewButton);
		
		btnLoc = new JButton("Loc02");
		btnLoc.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc.setBounds(195, 80, 125, 125);
		add(btnLoc);
		
		btnLoc_1 = new JButton("Loc03");
		btnLoc_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_1.setBounds(320, 80, 125, 125);
		add(btnLoc_1);
		
		btnLoc_2 = new JButton("Loc04");
		btnLoc_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_2.setBounds(445, 80, 125, 125);
		add(btnLoc_2);
		
		btnLoc_3 = new JButton("Loc05");
		btnLoc_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_3.setBounds(70, 205, 125, 125);
		add(btnLoc_3);
		
		btnLoc_4 = new JButton("Loc06");
		btnLoc_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_4.setBounds(195, 205, 125, 125);
		add(btnLoc_4);
		
		btnLoc_5 = new JButton("Loc07");
		btnLoc_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_5.setBounds(320, 205, 125, 125);
		add(btnLoc_5);
		
		btnLoc_6 = new JButton("Loc08");
		btnLoc_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_6.setBounds(445, 205, 125, 125);
		add(btnLoc_6);
		
		btnLoc_7 = new JButton("Loc09");
		btnLoc_7.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_7.setBounds(70, 330, 125, 125);
		add(btnLoc_7);
		
		btnLoc_8 = new JButton("Loc10");
		btnLoc_8.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_8.setBounds(195, 330, 125, 125);
		add(btnLoc_8);
		
		btnLoc_9 = new JButton("Loc11");
		btnLoc_9.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_9.setBounds(320, 330, 125, 125);
		add(btnLoc_9);
		
		btnLoc_10 = new JButton("Loc12");
		btnLoc_10.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_10.setBounds(445, 330, 125, 125);
		add(btnLoc_10);
		
		lblArea = new JLabel("Area 1");
		lblArea.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblArea.setBounds(102, 466, 56, 30);
		add(lblArea);
		
		lblMobLevel = new JLabel("Mob Level 1 to 5");
		lblMobLevel.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblMobLevel.setBounds(375, 466, 148, 30);
		add(lblMobLevel);
		
		btnNewButton_1 = new JButton("Rest to Inn");
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton_1.setBounds(30, 525, 168, 48);
		add(btnNewButton_1);
		
		btnShop = new JButton("Shop");
		btnShop.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnShop.setBounds(236, 525, 168, 48);
		add(btnShop);
		
		btnFightBoss = new JButton("Fight Boss");
		btnFightBoss.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnFightBoss.setBounds(445, 525, 168, 48);
		add(btnFightBoss);
		
		btnSaveGame = new JButton("Save Game");
		btnSaveGame.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnSaveGame.setBounds(655, 525, 168, 48);
		add(btnSaveGame);
		
		btnQuit = new JButton("Quit");
		btnQuit.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnQuit.setBounds(863, 525, 168, 48);
		add(btnQuit);
		
		btnInventory = new JButton("Inventory");
		btnInventory.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnInventory.setBounds(655, 466, 168, 48);
		add(btnInventory);
		
		btnAreaInfo = new JButton("Area Info");
		btnAreaInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnAreaInfo.setBounds(863, 466, 168, 48);
		add(btnAreaInfo);
		
		txtrNameLvHp = new JTextArea();
		txtrNameLvHp.setText("Name\t\tLv\r\nHP\t\tSP\r\nAu");
		txtrNameLvHp.setEditable(false);
		txtrNameLvHp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtrNameLvHp.setBounds(655, 106, 376, 64);
		add(txtrNameLvHp);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textArea.setEditable(false);
		textArea.setBounds(655, 171, 376, 114);
		add(textArea);
		
		lblMissions = new JLabel("Missions");
		lblMissions.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblMissions.setBounds(655, 312, 80, 30);
		add(lblMissions);
		
		txtBattleWins = new JTextField();
		txtBattleWins.setText("Battle Wins:");
		txtBattleWins.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtBattleWins.setBounds(655, 342, 376, 38);
		add(txtBattleWins);
		txtBattleWins.setColumns(10);
		
		txtBossKeys = new JTextField();
		txtBossKeys.setText("Boss Keys:");
		txtBossKeys.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtBossKeys.setColumns(10);
		txtBossKeys.setBounds(655, 391, 376, 38);
		add(txtBossKeys);
		
		btnShop.addActionListener(navigationHandler);
		btnSaveGame.addActionListener(navigationHandler);
		btnQuit.addActionListener(navigationHandler);
		btnInventory.addActionListener(navigationHandler);
	}
	
	private class NavigationHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Shop"))
				systemManager.showShopUI();
			else if(action.equals("Inventory"))
				systemManager.showInventoryUI();
			else if(action.equals("Save Game"))
				systemManager.showLoadSaveUI(false);
			else if(action.equals("Quit"))
				System.exit(0);
		}
	}

}
