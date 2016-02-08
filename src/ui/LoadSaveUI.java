package ui;

<<<<<<< HEAD
=======
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
>>>>>>> origin/master
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
	
<<<<<<< HEAD
	private JPanel p_firstSlot, p_secondSlot, p_thirdSlot;
	private JButton b_firstChar, b_secondChar, b_thirdChar, b_load, b_save, b_delete, b_back;
	private JTextArea ta_firstInfo, ta_secondInfo, ta_thirdInfo;
	private JLabel l_loadSave;
=======
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel;
	private JButton button;
	private JTextArea textArea;
	private JButton button_1;
	private JTextArea textArea_1;
	private JButton btnNewButton;
	private JTextArea txtrName;
>>>>>>> origin/master
	
	private SystemManager systemManager;
	private LoadSaveHandler loadSaveHandler;

	public LoadSaveUI(SystemManager systemManager, boolean forLoad) 
	{
		this.systemManager = systemManager;
		this.forLoad = forLoad;
		loadSaveHandler = new LoadSaveHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
<<<<<<< HEAD
		p_firstSlot = new JPanel();
		p_firstSlot.setLayout(null);
		p_firstSlot.setBounds(380, 78, 311, 428);
		add(p_firstSlot);
		
		b_firstChar = new JButton("Character Image");
		b_firstChar.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_firstChar.setBounds(10, 11, 291, 322);
		p_firstSlot.add(b_firstChar);
		
		ta_firstInfo = new JTextArea();
		ta_firstInfo.setEditable(false);
		ta_firstInfo.setHighlighter(null);
		ta_firstInfo.setText("Name\r\nArea\r\nLevel");
		ta_firstInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_firstInfo.setBounds(10, 344, 291, 62);
		p_firstSlot.add(ta_firstInfo);
		
		p_secondSlot = new JPanel();
		p_secondSlot.setLayout(null);
		p_secondSlot.setBounds(723, 78, 311, 428);
		add(p_secondSlot);
		
		b_secondChar = new JButton("Character Image");
		b_secondChar.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_secondChar.setBounds(10, 11, 291, 322);
		p_secondSlot.add(b_secondChar);
		
		ta_secondInfo = new JTextArea();
		ta_secondInfo.setEditable(false);
		ta_secondInfo.setHighlighter(null);
		ta_secondInfo.setText("Name\r\nArea\r\nLevel");
		ta_secondInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_secondInfo.setBounds(10, 345, 291, 62);
		p_secondSlot.add(ta_secondInfo);
		
		p_thirdSlot = new JPanel();
		p_thirdSlot.setBounds(35, 78, 311, 428);
		add(p_thirdSlot);
		p_thirdSlot.setLayout(null);
		
		b_thirdChar = new JButton("Character Image");
		b_thirdChar.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_thirdChar.setBounds(10, 11, 291, 323);
		p_thirdSlot.add(b_thirdChar);
		
		ta_thirdInfo = new JTextArea();
		ta_thirdInfo.setEditable(false);
		ta_thirdInfo.setHighlighter(null);
		ta_thirdInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_thirdInfo.setText("Name\r\nArea\r\nLevel");
		ta_thirdInfo.setBounds(10, 345, 291, 62);
		p_thirdSlot.add(ta_thirdInfo);
		
		if(forLoad)
			l_loadSave = new JLabel("Load Game");
		else
			l_loadSave = new JLabel("Save Game");
		l_loadSave.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_loadSave.setBounds(10, 11, 139, 37);
		add(l_loadSave);
		
		if(forLoad)
		{
			b_load = new JButton("Load");
			b_load.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			b_load.setBounds(35, 543, 205, 45);
			add(b_load);
			
			b_delete = new JButton("Delete");
			b_delete.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			b_delete.setBounds(432, 543, 205, 45);
			add(b_delete);
			
			b_back = new JButton("Back to Main Menu");
			b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			b_back.setBounds(828, 543, 205, 45);
			add(b_back);
		}
		else
		{
			b_save = new JButton("Save");
			b_save.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			b_save.setBounds(300, 543, 205, 45);
			add(b_save);
			
			b_back = new JButton("Back to Game");
			b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			b_back.setBounds(566, 543, 205, 45);
			add(b_back);		
		}
		
		b_back.addActionListener(loadSaveHandler);
=======
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
	
>>>>>>> origin/master
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
