package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class NewGameUI extends JFrame 
{

	private JPanel contentPane;
	private JLabel txtSelectCharacter;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					NewGameUI frame = new NewGameUI();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewGameUI() 
	{
		setTitle("New Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSelectCharacter = new JLabel();
		txtSelectCharacter.setText("SELECT CHARACTER");
		txtSelectCharacter.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtSelectCharacter.setBounds(33, 11, 179, 37);
		contentPane.add(txtSelectCharacter);
		
		JButton btnNewButton = new JButton("Swordsman");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(21, 59, 300, 520);
		contentPane.add(btnNewButton);
		
		JButton btnMage = new JButton("Mage");
		btnMage.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnMage.setBounds(743, 59, 300, 520);
		contentPane.add(btnMage);
		
		JLabel lblName = new JLabel();
		lblName.setText("Name:");
		lblName.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblName.setBounds(343, 59, 57, 31);
		contentPane.add(lblName);
		
		JLabel lblClass = new JLabel();
		lblClass.setText("Class:");
		lblClass.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblClass.setBounds(343, 101, 57, 31);
		contentPane.add(lblClass);
		
		JLabel lblHp = new JLabel();
		lblHp.setText("HP");
		lblHp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblHp.setBounds(343, 143, 57, 31);
		contentPane.add(lblHp);
		
		JLabel lblSp = new JLabel();
		lblSp.setText("SP");
		lblSp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSp.setBounds(343, 175, 57, 31);
		contentPane.add(lblSp);
		
		JLabel lblAtk = new JLabel();
		lblAtk.setText("ATK");
		lblAtk.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblAtk.setBounds(343, 207, 57, 31);
		contentPane.add(lblAtk);
		
		JLabel lblCrt = new JLabel();
		lblCrt.setText("CRT");
		lblCrt.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblCrt.setBounds(343, 237, 57, 31);
		contentPane.add(lblCrt);
		
		JLabel lblDef = new JLabel();
		lblDef.setText("DEF");
		lblDef.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblDef.setBounds(527, 143, 57, 31);
		contentPane.add(lblDef);
		
		JLabel lblSpd = new JLabel();
		lblSpd.setText("SPD");
		lblSpd.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSpd.setBounds(527, 175, 57, 31);
		contentPane.add(lblSpd);
		
		JLabel lblPow = new JLabel();
		lblPow.setText("POW");
		lblPow.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblPow.setBounds(527, 207, 57, 31);
		contentPane.add(lblPow);
		
		JLabel lblInformation = new JLabel();
		lblInformation.setText("Information:");
		lblInformation.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblInformation.setBounds(343, 279, 104, 31);
		contentPane.add(lblInformation);
		
		JLabel lblSomeInformation = new JLabel();
		lblSomeInformation.setVerticalAlignment(SwingConstants.TOP);
		lblSomeInformation.setText("Some information...");
		lblSomeInformation.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSomeInformation.setBounds(343, 321, 380, 203);
		contentPane.add(lblSomeInformation);
		
		JLabel label = new JLabel();
		label.setText("-");
		label.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label.setBounds(434, 143, 57, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setText("-");
		label_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_1.setBounds(434, 175, 57, 31);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("-");
		label_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_2.setBounds(434, 207, 57, 31);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setText("-");
		label_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_3.setBounds(434, 237, 57, 31);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setText("-");
		label_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_4.setBounds(626, 143, 57, 31);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setText("-");
		label_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_5.setBounds(626, 175, 57, 31);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setText("-");
		label_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_6.setBounds(626, 207, 57, 31);
		contentPane.add(label_6);
		
		JLabel lblSwordsman = new JLabel();
		lblSwordsman.setText("Swordsman");
		lblSwordsman.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSwordsman.setBounds(426, 101, 104, 31);
		contentPane.add(lblSwordsman);
		
		textField = new JTextField();
		textField.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textField.setBounds(410, 59, 300, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnStartAdventure = new JButton("Start Adventure");
		btnStartAdventure.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnStartAdventure.setBounds(331, 535, 199, 44);
		contentPane.add(btnStartAdventure);
		
		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnBackToMain.setBounds(536, 535, 197, 44);
		contentPane.add(btnBackToMain);
	}
}
