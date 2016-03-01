package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import managers.ImageManager;
import managers.LanguageManager;
import managers.StatsManager;
import managers.SystemManager;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class NewGameUI extends JPanel 
{
	private JLabel l_selectCharacter, l_name, l_class, l_hp, l_sp, l_atk, l_crt, l_agi, l_def, l_spc,
				l_spStat, l_hpStat, l_atkStat, l_crtStat, l_defStat, l_agiStat, l_spcStat, l_classType,
				l_information, l_bg;
	private JButton b_swordsman, b_mage, b_start, b_back;
	private JTextField tf_name;
	private JTextArea ta_description;
	
	private ImageManager imageManager;
	private LanguageManager languageManager;
	private SystemManager systemManager;
	private StatsManager statsManager;
	private NewGameHandler newGameHandler;

	public NewGameUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		newGameHandler = new NewGameHandler();
		imageManager = new ImageManager();
		languageManager = new LanguageManager("newGame");
		statsManager = new StatsManager();
		
//		image = new ImageIcon("footballQuestioner/ExitButtonLabel.png");
//        image = getScaledImage(250, 100, image);
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		l_selectCharacter = new JLabel();
		l_selectCharacter.setForeground(Color.WHITE);
		l_selectCharacter.setText("Select Character");
		l_selectCharacter.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_selectCharacter.setBounds(33, 11, 179, 37);
		add(l_selectCharacter);
		
		b_swordsman = new JButton();
		b_swordsman.setIcon(imageManager.getNewGameGraphic("Swordsman"));
		b_swordsman.setBorder(null);
		b_swordsman.setRolloverIcon(imageManager.getNewGameGraphic("Swordsman_Selected"));
		b_swordsman.setSelectedIcon(imageManager.getNewGameGraphic("Swordsman_Selected"));
		b_swordsman.setContentAreaFilled(false);
		b_swordsman.setFocusPainted(false);
		b_swordsman.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_swordsman.setBounds(21, 59, 300, 520);
		add(b_swordsman);
		
		b_mage = new JButton();
		b_mage.setIcon(imageManager.getNewGameGraphic("Mage"));
		b_mage.setBorder(null);
		b_mage.setRolloverIcon(imageManager.getNewGameGraphic("Mage_Selected"));
		b_mage.setSelectedIcon(imageManager.getNewGameGraphic("Mage_Selected"));
		b_mage.setContentAreaFilled(false);
		b_mage.setFocusPainted(false);
		b_mage.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_mage.setBounds(743, 59, 300, 520);
		add(b_mage);
		
		l_name = new JLabel();
		l_name.setForeground(Color.WHITE);
		l_name.setText("Name:");
		l_name.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_name.setBounds(343, 59, 57, 31);
		add(l_name);
		
		l_class = new JLabel();
		l_class.setForeground(Color.WHITE);
		l_class.setText("Class:");
		l_class.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_class.setBounds(343, 101, 57, 31);
		add(l_class);
		
		l_hp = new JLabel();
		l_hp.setForeground(Color.WHITE);
		l_hp.setText("HP");
		l_hp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_hp.setBounds(343, 143, 57, 31);
		add(l_hp);
		
		l_sp = new JLabel();
		l_sp.setForeground(Color.WHITE);
		l_sp.setText("SP");
		l_sp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_sp.setBounds(343, 175, 57, 31);
		add(l_sp);
		
		l_atk = new JLabel();
		l_atk.setForeground(Color.WHITE);
		l_atk.setText("Attack");
		l_atk.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_atk.setBounds(343, 207, 57, 31);
		add(l_atk);
		
		l_crt = new JLabel();
		l_crt.setForeground(Color.WHITE);
		l_crt.setText("Critical");
		l_crt.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_crt.setBounds(343, 237, 57, 31);
		add(l_crt);
		
		l_def = new JLabel();
		l_def.setForeground(Color.WHITE);
		l_def.setText("Defense");
		l_def.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_def.setBounds(527, 143, 64, 31);
		add(l_def);
		
		l_agi = new JLabel();
		l_agi.setForeground(Color.WHITE);
		l_agi.setText("Agility");
		l_agi.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_agi.setBounds(527, 175, 57, 31);
		add(l_agi);
		
		l_spc = new JLabel();
		l_spc.setForeground(Color.WHITE);
		l_spc.setText("Special");
		l_spc.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_spc.setBounds(527, 207, 57, 31);
		add(l_spc);
		
		l_information = new JLabel();
		l_information.setForeground(Color.WHITE);
		l_information.setText("Information:");
		l_information.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_information.setBounds(343, 279, 104, 31);
		add(l_information);
		
		ta_description = new JTextArea();
		ta_description.setForeground(Color.WHITE);
		ta_description.setLineWrap(true);
		ta_description.setWrapStyleWord(true);
		ta_description.setOpaque(false);
		ta_description.setAlignmentX(TOP_ALIGNMENT);
		ta_description.setWrapStyleWord(true);
		ta_description.setText("Click one of the two characters to select and enter your name.");
		ta_description.setEditable(false);
		ta_description.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_description.setBounds(343, 321, 380, 203);
		add(ta_description);
		
		l_hpStat = new JLabel();
		l_hpStat.setForeground(Color.WHITE);
		l_hpStat.setText("-");
		l_hpStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_hpStat.setBounds(434, 143, 57, 31);
		add(l_hpStat);
		
		l_spStat = new JLabel();
		l_spStat.setForeground(Color.WHITE);
		l_spStat.setText("-");
		l_spStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_spStat.setBounds(434, 175, 57, 31);
		add(l_spStat);
		
		l_atkStat = new JLabel();
		l_atkStat.setForeground(Color.WHITE);
		l_atkStat.setText("-");
		l_atkStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_atkStat.setBounds(434, 207, 57, 31);
		add(l_atkStat);
		
		l_crtStat = new JLabel();
		l_crtStat.setForeground(Color.WHITE);
		l_crtStat.setText("-");
		l_crtStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_crtStat.setBounds(434, 237, 57, 31);
		add(l_crtStat);
		
		l_defStat = new JLabel();
		l_defStat.setForeground(Color.WHITE);
		l_defStat.setText("-");
		l_defStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_defStat.setBounds(626, 143, 57, 31);
		add(l_defStat);
		
		l_agiStat = new JLabel();
		l_agiStat.setForeground(Color.WHITE);
		l_agiStat.setText("-");
		l_agiStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_agiStat.setBounds(626, 175, 57, 31);
		add(l_agiStat);
		
		l_spcStat = new JLabel();
		l_spcStat.setForeground(Color.WHITE);
		l_spcStat.setText("-");
		l_spcStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_spcStat.setBounds(626, 207, 57, 31);
		add(l_spcStat);
		
		l_classType = new JLabel();
		l_classType.setText("-");
		l_classType.setForeground(Color.WHITE);
		l_classType.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_classType.setBounds(426, 101, 104, 31);
		add(l_classType);
		
		tf_name = new JTextField();
		tf_name.setText("");
		tf_name.setCaretColor(Color.WHITE);
		tf_name.setBackground(Color.BLACK);
		tf_name.setForeground(Color.WHITE);
		tf_name.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		tf_name.setBounds(410, 59, 300, 31);
		add(tf_name);
		tf_name.setColumns(10);
		
		b_start = new JButton();
		b_start.setIcon(imageManager.getNewGameGraphic("Start"));
		b_start.setBorder(null);
		b_start.setRolloverIcon(imageManager.getNewGameGraphic("Start_Hover"));
		b_start.setForeground(Color.WHITE);
		b_start.setContentAreaFilled(false);
		b_start.setFocusPainted(false);
		b_start.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_start.setBounds(331, 535, 200, 45);
		add(b_start);
		
		b_back = new JButton();
		b_back.setIcon(imageManager.getNewGameGraphic("Back"));
		b_back.setBorder(null);
		b_back.setRolloverIcon(imageManager.getNewGameGraphic("Back_Hover"));
		b_back.setForeground(Color.WHITE);
		b_back.setContentAreaFilled(false);
		b_back.setFocusPainted(false);
		b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_back.setBounds(536, 535, 200, 45);
		add(b_back);
		
		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getCommonBG());
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		b_swordsman.addActionListener(newGameHandler);
		b_mage.addActionListener(newGameHandler);
		b_start.addActionListener(newGameHandler);
		b_back.addActionListener(newGameHandler);
	}
	
	private class NewGameHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Object action = e.getSource();
			if(action.equals(b_start))
			{
				if(l_classType.getText().equals("-"))
					ta_description.setText("Please choose between Swordsman or Mage.");
				else if(tf_name.getText().equals(""))
					ta_description.setText("Please enter a name.");
				else
				{
					initializeHumanPlayer();
					systemManager.showIntroductionUI();
				}
			}
			else if(action.equals(b_back))
				systemManager.showMainMenuUI();
			else if(action.equals(b_swordsman))
			{
				l_classType.setText("Swordsman");
				ta_description.setText(languageManager.getSwordsmanDescription());
				displaySwordsmanStats();
				b_swordsman.setSelected(true);
				b_mage.setSelected(false);
			}
			else if(action.equals(b_mage))
			{
				l_classType.setText("Mage");
				ta_description.setText(languageManager.getMageDescription());
				displayMageStats();
				b_swordsman.setSelected(false);
				b_mage.setSelected(true);
			}

		}

		private void displaySwordsmanStats() 
		{
			l_hpStat.setText(statsManager.getPlayerHPbaseStat("Swordsman", 1) + "");
			l_spStat.setText(statsManager.getPlayerSPbaseStat("Swordsman", 1) + "");
			l_atkStat.setText(statsManager.getPlayerATKbaseStat("Swordsman", 1) + "");
			l_defStat.setText(statsManager.getPlayerDEFbaseStat("Swordsman", 1) + "");
			l_spcStat.setText(statsManager.getPlayerSPCbaseStat("Swordsman", 1) + "");
			l_agiStat.setText(statsManager.getPlayerAGIbaseStat("Swordsman", 1) + "");
			l_crtStat.setText(statsManager.getPlayerCRTbaseStat("Swordsman", 1) + "");
		}
		
		private void displayMageStats() 
		{
			l_hpStat.setText(statsManager.getPlayerHPbaseStat("Mage", 1) + "");
			l_spStat.setText(statsManager.getPlayerSPbaseStat("Mage", 1) + "");
			l_atkStat.setText(statsManager.getPlayerATKbaseStat("Mage", 1) + "");
			l_defStat.setText(statsManager.getPlayerDEFbaseStat("Mage", 1) + "");
			l_spcStat.setText(statsManager.getPlayerSPCbaseStat("Mage", 1) + "");
			l_agiStat.setText(statsManager.getPlayerAGIbaseStat("Mage", 1) + "");
			l_crtStat.setText(statsManager.getPlayerCRTbaseStat("Mage", 1) + "");
		}
		
		private void initializeHumanPlayer()
		{
			systemManager.getHumanPlayer().setName(tf_name.getText());
			systemManager.getHumanPlayer().setBattleClass(l_classType.getText());
			systemManager.getHumanPlayer().setXP(0);
			systemManager.getHumanPlayer().setAu(300);
			systemManager.getHumanPlayer().setBossWins(0);
			systemManager.getHumanPlayer().setBossKeys(0);
			systemManager.getHumanPlayer().setPlusHP(0);
			systemManager.getHumanPlayer().setPlusSP(0);
			systemManager.getHumanPlayer().setPlusATK(0);
			systemManager.getHumanPlayer().setPlusDEF(0);
			systemManager.getHumanPlayer().setPlusSPC(0);
			systemManager.getHumanPlayer().setPlusAGI(0);
			systemManager.getHumanPlayer().setPlusCRT(0);
		}
	}
}
