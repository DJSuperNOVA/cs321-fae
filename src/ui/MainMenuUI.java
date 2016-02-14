package ui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MainMenuUI extends JPanel 
{
	private JButton b_newGame, b_loadGame, b_information, b_exit;
	private JLabel l_bg;
	
	private SystemManager systemManager;
	private MainMenuHandler mainMenuHandler;

	public MainMenuUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		mainMenuHandler = new MainMenuHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		b_newGame = new JButton("New Game");
		b_newGame.setForeground(Color.WHITE);
		b_newGame.setFocusPainted(false);
		b_newGame.setContentAreaFilled(false);
		b_newGame.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_newGame.setBounds(32, 517, 225, 50);
		add(b_newGame);
		
		b_loadGame = new JButton("Load Game");
		b_loadGame.setForeground(Color.WHITE);
		b_loadGame.setFocusPainted(false);
		b_loadGame.setContentAreaFilled(false);
		b_loadGame.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_loadGame.setBounds(290, 517, 225, 50);
		add(b_loadGame);
		
		b_information = new JButton("Information");
		b_information.setForeground(Color.WHITE);
		b_information.setFocusPainted(false);
		b_information.setContentAreaFilled(false);
		b_information.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_information.setBounds(548, 517, 225, 50);
		add(b_information);
		
		b_exit = new JButton("Exit");
		b_exit.setForeground(Color.WHITE);
		b_exit.setFocusPainted(false);
		b_exit.setContentAreaFilled(false);
		b_exit.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_exit.setBounds(806, 517, 225, 50);
		add(b_exit);
		
		l_bg = new JLabel();
		l_bg.setIcon(new ImageIcon("../cs321-fae/src/graphics/MainMenu_TitleScreen.png"));
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		b_newGame.addActionListener(mainMenuHandler);
		b_loadGame.addActionListener(mainMenuHandler);
		b_information.addActionListener(mainMenuHandler);
		b_exit.addActionListener(mainMenuHandler);
	}
	
	private class MainMenuHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			
			if(action.equals("New Game"))
				systemManager.showNewGameUI();
			else if(action.equals("Load Game"))
				systemManager.showLoadSaveUI(true);
			else if(action.equals("Information"))
				systemManager.showInformationUI();
			else if(action.equals("Exit"))
				System.exit(0);
		}
		
	}
}
