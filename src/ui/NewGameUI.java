package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
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
	
	private SystemManager systemManager;
	private NewGameHandler newGameHandler;

	public NewGameUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		newGameHandler = new NewGameHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
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
