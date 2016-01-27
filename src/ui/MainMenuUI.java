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
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainMenuUI extends JFrame 
{

	private JPanel contentPane;

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
					MainMenuUI frame = new MainMenuUI();
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
	public MainMenuUI() 
	{
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New Game");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(32, 517, 225, 51);
		contentPane.add(btnNewButton);
		
		JButton btnLoadGame = new JButton("Load Game");
		btnLoadGame.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnLoadGame.setBounds(290, 517, 225, 51);
		contentPane.add(btnLoadGame);
		
		JButton btnInformation = new JButton("Information");
		btnInformation.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnInformation.setBounds(548, 517, 225, 51);
		contentPane.add(btnInformation);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnExit.setBounds(806, 517, 225, 51);
		contentPane.add(btnExit);
	}
}
