package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class LoadSaveUI extends JPanel 
{
	private boolean forLoad; //for distinguishing whether for load or for save game.
	
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel;
	private JButton button;
	private JTextArea textArea;
	private JButton button_1;
	private JTextArea textArea_1;
	private JButton btnNewButton;
	private JTextArea txtrName;
	
	private SystemManager systemManager;
	private LoadSaveHandler loadSaveHandler;

	public LoadSaveUI(SystemManager systemManager, boolean forLoad) 
	{
		this.systemManager = systemManager;
		this.forLoad = forLoad;
		loadSaveHandler = new LoadSaveHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(380, 78, 311, 428);
		add(panel_1);
		
		button = new JButton("Character Image");
		button.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button.setBounds(10, 11, 291, 322);
		panel_1.add(button);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("Name\r\nArea\r\nLevel");
		textArea.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textArea.setBounds(10, 344, 291, 72);
		panel_1.add(textArea);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(723, 78, 311, 428);
		add(panel_2);
		
		button_1 = new JButton("Character Image");
		button_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_1.setBounds(10, 11, 291, 322);
		panel_2.add(button_1);
		
		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setText("Name\r\nArea\r\nLevel");
		textArea_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textArea_1.setBounds(10, 345, 291, 72);
		panel_2.add(textArea_1);
		
		panel = new JPanel();
		panel.setBounds(35, 78, 311, 428);
		add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("Character Image");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 11, 291, 323);
		panel.add(btnNewButton);
		
		txtrName = new JTextArea();
		txtrName.setEditable(false);
		txtrName.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtrName.setText("Name\r\nArea\r\nLevel");
		txtrName.setBounds(10, 345, 291, 72);
		panel.add(txtrName);
		
		JLabel lblNewLabel;
		if(forLoad)
			lblNewLabel = new JLabel("Load Game");
		else
			lblNewLabel = new JLabel("Save Game");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 139, 37);
		add(lblNewLabel);
		
		JButton btnLoad;
		JButton btnNewButton_1;
		JButton btnDelete;
		JButton button_4;
		
		if(forLoad)
		{
			btnLoad = new JButton("LOAD");
			btnLoad.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			btnLoad.setBounds(35, 543, 206, 46);
			add(btnLoad);
			
			btnDelete = new JButton("DELETE");
			btnDelete.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			btnDelete.setBounds(432, 543, 206, 46);
			add(btnDelete);
			
			button_4 = new JButton("Back to Main Menu");
			button_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			button_4.setBounds(828, 543, 206, 46);
			add(button_4);
		}
		else
		{
			btnNewButton_1 = new JButton("SAVE");
			btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			btnNewButton_1.setBounds(300, 543, 206, 46);
			add(btnNewButton_1);
			
			button_4 = new JButton("Back to Game");
			button_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			button_4.setBounds(566, 543, 206, 46);
			add(button_4);		
		}
		
		button_4.addActionListener(loadSaveHandler);
	
	}
	
	private class LoadSaveHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Back to Main Menu"))
				systemManager.showMainMenuUI();
			else if(action.equals("Back to Game"))
				systemManager.showNavigationUI();
		}
	}
}
