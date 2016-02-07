package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainMenuUI extends JPanel 
{
	private JButton btnNewButton;
	private JButton btnLoadGame;
	private JButton btnInformation;
	private JButton btnExit;
	
	private SystemManager systemManager;
	private MainMenuHandler mainMenuHandler;

	public MainMenuUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		mainMenuHandler = new MainMenuHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		btnNewButton = new JButton("New Game");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(32, 517, 225, 51);
		add(btnNewButton);
		
		btnLoadGame = new JButton("Load Game");
		btnLoadGame.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoadGame.setBounds(290, 517, 225, 51);
		add(btnLoadGame);
		
		btnInformation = new JButton("Information");
		btnInformation.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnInformation.setBounds(548, 517, 225, 51);
		add(btnInformation);
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnExit.setBounds(806, 517, 225, 51);
		add(btnExit);
		
		btnNewButton.addActionListener(mainMenuHandler);
		btnLoadGame.addActionListener(mainMenuHandler);
		btnInformation.addActionListener(mainMenuHandler);
		btnExit.addActionListener(mainMenuHandler);
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
