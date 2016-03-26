package ui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;
import managers.ImageManager;

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
	private ImageManager imageManager;
	private MainMenuHandler mainMenuHandler;

	public MainMenuUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		imageManager = new ImageManager();
		mainMenuHandler = new MainMenuHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		b_newGame = new JButton();
		b_newGame.setIcon(imageManager.getMainMenuGraphic("New"));
		b_newGame.setRolloverIcon(imageManager.getMainMenuGraphic("New_Hover"));
		b_newGame.setBorder(null);
		b_newGame.setForeground(Color.WHITE);
		b_newGame.setFocusPainted(false);
		b_newGame.setContentAreaFilled(false);
		b_newGame.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_newGame.setBounds(32, 517, 225, 50);
		add(b_newGame);
		
		b_loadGame = new JButton();
		b_loadGame.setIcon(imageManager.getMainMenuGraphic("Load"));
		b_loadGame.setRolloverIcon(imageManager.getMainMenuGraphic("Load_Hover"));
		b_loadGame.setBorder(null);
		b_loadGame.setForeground(Color.WHITE);
		b_loadGame.setFocusPainted(false);
		b_loadGame.setContentAreaFilled(false);
		b_loadGame.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_loadGame.setBounds(290, 517, 225, 50);
		add(b_loadGame);
		
		b_information = new JButton();
		b_information.setIcon(imageManager.getMainMenuGraphic("Information"));
		b_information.setRolloverIcon(imageManager.getMainMenuGraphic("Information_Hover"));
		b_information.setBorder(null);
		b_information.setForeground(Color.WHITE);
		b_information.setFocusPainted(false);
		b_information.setContentAreaFilled(false);
		b_information.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_information.setBounds(548, 517, 225, 50);
		add(b_information);
		
		b_exit = new JButton();
		b_exit.setIcon(imageManager.getMainMenuGraphic("Quit"));
		b_exit.setRolloverIcon(imageManager.getMainMenuGraphic("Quit_Hover"));
		b_exit.setBorder(null);
		b_exit.setForeground(Color.WHITE);
		b_exit.setFocusPainted(false);
		b_exit.setContentAreaFilled(false);
		b_exit.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_exit.setBounds(806, 517, 225, 50);
		add(b_exit);
		
		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getMainMenuGraphic("TitleScreen"));
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
			Object action = e.getSource();
			
			if(action.equals(b_newGame))
				systemManager.showNewGameUI();
			else if(action.equals(b_loadGame))
				systemManager.showLoadSaveUI(true);
			else if(action.equals(b_information))
				systemManager.showInformationUI();
			else if(action.equals(b_exit))
				System.exit(0);
			systemManager.playSFX("common_confirm");
			
			repaint();
		}
		
	}
}
