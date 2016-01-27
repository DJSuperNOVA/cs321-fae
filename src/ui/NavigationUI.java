package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NavigationUI extends JFrame 
{

	private JPanel contentPane;
	private JTextField txtBattleWins;
	private JTextField txtBossKeys;

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
					NavigationUI frame = new NavigationUI();
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
	public NavigationUI() 
	{
		setTitle("Navigation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Area 1: Peiyuu Village");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 11, 285, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblClickAnywhereIn = new JLabel("Click anywhere in the map to fight mobs.");
		lblClickAnywhereIn.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblClickAnywhereIn.setBounds(30, 39, 285, 30);
		contentPane.add(lblClickAnywhereIn);
		
		JButton btnNewButton = new JButton("Loc01");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(70, 80, 125, 125);
		contentPane.add(btnNewButton);
		
		JButton btnLoc = new JButton("Loc02");
		btnLoc.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc.setBounds(195, 80, 125, 125);
		contentPane.add(btnLoc);
		
		JButton btnLoc_1 = new JButton("Loc03");
		btnLoc_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_1.setBounds(320, 80, 125, 125);
		contentPane.add(btnLoc_1);
		
		JButton btnLoc_2 = new JButton("Loc04");
		btnLoc_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_2.setBounds(445, 80, 125, 125);
		contentPane.add(btnLoc_2);
		
		JButton btnLoc_3 = new JButton("Loc05");
		btnLoc_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_3.setBounds(70, 205, 125, 125);
		contentPane.add(btnLoc_3);
		
		JButton btnLoc_4 = new JButton("Loc06");
		btnLoc_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_4.setBounds(195, 205, 125, 125);
		contentPane.add(btnLoc_4);
		
		JButton btnLoc_5 = new JButton("Loc07");
		btnLoc_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_5.setBounds(320, 205, 125, 125);
		contentPane.add(btnLoc_5);
		
		JButton btnLoc_6 = new JButton("Loc08");
		btnLoc_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_6.setBounds(445, 205, 125, 125);
		contentPane.add(btnLoc_6);
		
		JButton btnLoc_7 = new JButton("Loc09");
		btnLoc_7.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_7.setBounds(70, 330, 125, 125);
		contentPane.add(btnLoc_7);
		
		JButton btnLoc_8 = new JButton("Loc10");
		btnLoc_8.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_8.setBounds(195, 330, 125, 125);
		contentPane.add(btnLoc_8);
		
		JButton btnLoc_9 = new JButton("Loc11");
		btnLoc_9.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_9.setBounds(320, 330, 125, 125);
		contentPane.add(btnLoc_9);
		
		JButton btnLoc_10 = new JButton("Loc12");
		btnLoc_10.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoc_10.setBounds(445, 330, 125, 125);
		contentPane.add(btnLoc_10);
		
		JLabel lblArea = new JLabel("Area 1");
		lblArea.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblArea.setBounds(102, 466, 56, 30);
		contentPane.add(lblArea);
		
		JLabel lblMobLevel = new JLabel("Mob Level 1 to 5");
		lblMobLevel.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblMobLevel.setBounds(375, 466, 148, 30);
		contentPane.add(lblMobLevel);
		
		JButton btnNewButton_1 = new JButton("Rest to Inn");
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton_1.setBounds(30, 525, 168, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnShop = new JButton("Shop");
		btnShop.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnShop.setBounds(236, 525, 168, 48);
		contentPane.add(btnShop);
		
		JButton btnFightBoss = new JButton("Fight Boss");
		btnFightBoss.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnFightBoss.setBounds(445, 525, 168, 48);
		contentPane.add(btnFightBoss);
		
		JButton btnSaveGame = new JButton("Save Game");
		btnSaveGame.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnSaveGame.setBounds(655, 525, 168, 48);
		contentPane.add(btnSaveGame);
		
		JButton btnQuiz = new JButton("Quit");
		btnQuiz.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnQuiz.setBounds(863, 525, 168, 48);
		contentPane.add(btnQuiz);
		
		JButton btnInventory = new JButton("Inventory");
		btnInventory.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnInventory.setBounds(655, 466, 168, 48);
		contentPane.add(btnInventory);
		
		JButton btnAreaInfo = new JButton("Area Info");
		btnAreaInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnAreaInfo.setBounds(863, 466, 168, 48);
		contentPane.add(btnAreaInfo);
		
		JTextArea txtrNameLvHp = new JTextArea();
		txtrNameLvHp.setText("Name\t\tLv\r\nHP\t\tSP\r\nAu");
		txtrNameLvHp.setEditable(false);
		txtrNameLvHp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtrNameLvHp.setBounds(655, 106, 376, 64);
		contentPane.add(txtrNameLvHp);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textArea.setEditable(false);
		textArea.setBounds(655, 171, 376, 114);
		contentPane.add(textArea);
		
		JLabel lblMissions = new JLabel("Missions");
		lblMissions.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblMissions.setBounds(655, 312, 80, 30);
		contentPane.add(lblMissions);
		
		txtBattleWins = new JTextField();
		txtBattleWins.setText("Battle Wins:");
		txtBattleWins.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtBattleWins.setBounds(655, 342, 376, 38);
		contentPane.add(txtBattleWins);
		txtBattleWins.setColumns(10);
		
		txtBossKeys = new JTextField();
		txtBossKeys.setText("Boss Keys:");
		txtBossKeys.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtBossKeys.setColumns(10);
		txtBossKeys.setBounds(655, 391, 376, 38);
		contentPane.add(txtBossKeys);
	}

}
