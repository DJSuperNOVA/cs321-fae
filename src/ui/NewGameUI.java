package ui;

<<<<<<< HEAD
=======
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
>>>>>>> origin/master
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class NewGameUI extends JPanel 
{
<<<<<<< HEAD
	private JLabel l_selectCharacter, l_name, l_class, l_hp, l_sp, l_atk, l_crt, l_spd, l_def, l_pow,
				l_spStat, l_hpStat, l_atkStat, l_crtStat, l_defStat, l_spdStat, l_powStat, l_classType,
				l_information, l_description;
	private JButton b_swordsman, b_mage, b_start, b_back;
	private JTextField tf_name;
=======
	private JLabel txtSelectCharacter;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnMage;
	private JLabel lblName;
	private JLabel lblClass;
	private JLabel lblHp;
	private JLabel lblSp;
	private JLabel lblAtk;
	private JLabel lblCrt;
	private JLabel lblSpd;
	private JLabel lblDef;
	private JLabel lblPow;
	private JLabel lblInformation;
	private JLabel lblSomeInformation;
	private JLabel label_1;
	private JLabel label;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lblSwordsman;
	private JButton btnStartAdventure;
	private JButton btnBackToMain;
>>>>>>> origin/master
	
	private SystemManager systemManager;
	private NewGameHandler newGameHandler;

	public NewGameUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		newGameHandler = new NewGameHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
<<<<<<< HEAD
		l_selectCharacter = new JLabel();
		l_selectCharacter.setText("Select Character");
		l_selectCharacter.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_selectCharacter.setBounds(33, 11, 179, 37);
		add(l_selectCharacter);
		
		b_swordsman = new JButton("Swordsman");
		b_swordsman.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_swordsman.setBounds(21, 59, 300, 520);
		add(b_swordsman);
		
		b_mage = new JButton("Mage");
		b_mage.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_mage.setBounds(743, 59, 300, 520);
		add(b_mage);
		
		l_name = new JLabel();
		l_name.setText("Name:");
		l_name.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_name.setBounds(343, 59, 57, 31);
		add(l_name);
		
		l_class = new JLabel();
		l_class.setText("Class:");
		l_class.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_class.setBounds(343, 101, 57, 31);
		add(l_class);
		
		l_hp = new JLabel();
		l_hp.setText("HP");
		l_hp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_hp.setBounds(343, 143, 57, 31);
		add(l_hp);
		
		l_sp = new JLabel();
		l_sp.setText("SP");
		l_sp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_sp.setBounds(343, 175, 57, 31);
		add(l_sp);
		
		l_atk = new JLabel();
		l_atk.setText("ATK");
		l_atk.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_atk.setBounds(343, 207, 57, 31);
		add(l_atk);
		
		l_crt = new JLabel();
		l_crt.setText("CRT");
		l_crt.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_crt.setBounds(343, 237, 57, 31);
		add(l_crt);
		
		l_def = new JLabel();
		l_def.setText("DEF");
		l_def.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_def.setBounds(527, 143, 57, 31);
		add(l_def);
		
		l_spd = new JLabel();
		l_spd.setText("SPD");
		l_spd.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_spd.setBounds(527, 175, 57, 31);
		add(l_spd);
		
		l_pow = new JLabel();
		l_pow.setText("POW");
		l_pow.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_pow.setBounds(527, 207, 57, 31);
		add(l_pow);
		
		l_information = new JLabel();
		l_information.setText("Information:");
		l_information.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_information.setBounds(343, 279, 104, 31);
		add(l_information);
		
		l_description = new JLabel();
		l_description.setVerticalAlignment(SwingConstants.TOP);
		l_description.setText("Some information...");
		l_description.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_description.setBounds(343, 321, 380, 203);
		add(l_description);
		
		l_hpStat = new JLabel();
		l_hpStat.setText("-");
		l_hpStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_hpStat.setBounds(434, 143, 57, 31);
		add(l_hpStat);
		
		l_spStat = new JLabel();
		l_spStat.setText("-");
		l_spStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_spStat.setBounds(434, 175, 57, 31);
		add(l_spStat);
		
		l_atkStat = new JLabel();
		l_atkStat.setText("-");
		l_atkStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_atkStat.setBounds(434, 207, 57, 31);
		add(l_atkStat);
		
		l_crtStat = new JLabel();
		l_crtStat.setText("-");
		l_crtStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_crtStat.setBounds(434, 237, 57, 31);
		add(l_crtStat);
		
		l_defStat = new JLabel();
		l_defStat.setText("-");
		l_defStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_defStat.setBounds(626, 143, 57, 31);
		add(l_defStat);
		
		l_spdStat = new JLabel();
		l_spdStat.setText("-");
		l_spdStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_spdStat.setBounds(626, 175, 57, 31);
		add(l_spdStat);
		
		l_powStat = new JLabel();
		l_powStat.setText("-");
		l_powStat.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_powStat.setBounds(626, 207, 57, 31);
		add(l_powStat);
		
		l_classType = new JLabel();
		l_classType.setText("Swordsman");
		l_classType.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_classType.setBounds(426, 101, 104, 31);
		add(l_classType);
		
		tf_name = new JTextField();
		tf_name.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		tf_name.setBounds(410, 59, 300, 31);
		add(tf_name);
		tf_name.setColumns(10);
		
		b_start = new JButton("Start Adventure");
		b_start.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_start.setBounds(331, 535, 200, 45);
		add(b_start);
		
		b_back = new JButton("Back to Main Menu");
		b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_back.setBounds(536, 535, 200, 45);
		add(b_back);
		
		b_start.addActionListener(newGameHandler);
		b_back.addActionListener(newGameHandler);
=======
		txtSelectCharacter = new JLabel();
		txtSelectCharacter.setText("SELECT CHARACTER");
		txtSelectCharacter.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtSelectCharacter.setBounds(33, 11, 179, 37);
		add(txtSelectCharacter);
		
		btnNewButton = new JButton("Swordsman");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(21, 59, 300, 520);
		add(btnNewButton);
		
		btnMage = new JButton("Mage");
		btnMage.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnMage.setBounds(743, 59, 300, 520);
		add(btnMage);
		
		lblName = new JLabel();
		lblName.setText("Name:");
		lblName.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblName.setBounds(343, 59, 57, 31);
		add(lblName);
		
		lblClass = new JLabel();
		lblClass.setText("Class:");
		lblClass.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblClass.setBounds(343, 101, 57, 31);
		add(lblClass);
		
		lblHp = new JLabel();
		lblHp.setText("HP");
		lblHp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblHp.setBounds(343, 143, 57, 31);
		add(lblHp);
		
		lblSp = new JLabel();
		lblSp.setText("SP");
		lblSp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSp.setBounds(343, 175, 57, 31);
		add(lblSp);
		
		lblAtk = new JLabel();
		lblAtk.setText("ATK");
		lblAtk.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblAtk.setBounds(343, 207, 57, 31);
		add(lblAtk);
		
		lblCrt = new JLabel();
		lblCrt.setText("CRT");
		lblCrt.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblCrt.setBounds(343, 237, 57, 31);
		add(lblCrt);
		
		lblDef = new JLabel();
		lblDef.setText("DEF");
		lblDef.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblDef.setBounds(527, 143, 57, 31);
		add(lblDef);
		
		lblSpd = new JLabel();
		lblSpd.setText("SPD");
		lblSpd.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSpd.setBounds(527, 175, 57, 31);
		add(lblSpd);
		
		lblPow = new JLabel();
		lblPow.setText("POW");
		lblPow.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblPow.setBounds(527, 207, 57, 31);
		add(lblPow);
		
		lblInformation = new JLabel();
		lblInformation.setText("Information:");
		lblInformation.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblInformation.setBounds(343, 279, 104, 31);
		add(lblInformation);
		
		lblSomeInformation = new JLabel();
		lblSomeInformation.setVerticalAlignment(SwingConstants.TOP);
		lblSomeInformation.setText("Some information...");
		lblSomeInformation.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSomeInformation.setBounds(343, 321, 380, 203);
		add(lblSomeInformation);
		
		label = new JLabel();
		label.setText("-");
		label.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label.setBounds(434, 143, 57, 31);
		add(label);
		
		label_1 = new JLabel();
		label_1.setText("-");
		label_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_1.setBounds(434, 175, 57, 31);
		add(label_1);
		
		label_2 = new JLabel();
		label_2.setText("-");
		label_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_2.setBounds(434, 207, 57, 31);
		add(label_2);
		
		label_3 = new JLabel();
		label_3.setText("-");
		label_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_3.setBounds(434, 237, 57, 31);
		add(label_3);
		
		label_4 = new JLabel();
		label_4.setText("-");
		label_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_4.setBounds(626, 143, 57, 31);
		add(label_4);
		
		label_5 = new JLabel();
		label_5.setText("-");
		label_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_5.setBounds(626, 175, 57, 31);
		add(label_5);
		
		label_6 = new JLabel();
		label_6.setText("-");
		label_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_6.setBounds(626, 207, 57, 31);
		add(label_6);
		
		lblSwordsman = new JLabel();
		lblSwordsman.setText("Swordsman");
		lblSwordsman.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSwordsman.setBounds(426, 101, 104, 31);
		add(lblSwordsman);
		
		textField = new JTextField();
		textField.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textField.setBounds(410, 59, 300, 31);
		add(textField);
		textField.setColumns(10);
		
		btnStartAdventure = new JButton("Start Adventure");
		btnStartAdventure.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnStartAdventure.setBounds(331, 535, 199, 44);
		add(btnStartAdventure);
		
		btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnBackToMain.setBounds(536, 535, 197, 44);
		add(btnBackToMain);
		
		btnStartAdventure.addActionListener(newGameHandler);
		btnBackToMain.addActionListener(newGameHandler);
>>>>>>> origin/master
	}
	
	private class NewGameHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Start Adventure"))
				systemManager.showIntroductionUI();
			else if(action.equals("Back to Main Menu"))
				systemManager.showMainMenuUI();
			
		}
	}
}
