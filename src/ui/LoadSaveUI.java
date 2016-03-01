package ui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.ImageManager;
import managers.SystemManager;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Color;

public class LoadSaveUI extends JPanel 
{
	private boolean forLoad; //for distinguishing whether for load or for save game.
	
	private JPanel p_firstSlot, p_secondSlot, p_thirdSlot;
	private JButton b_firstChar, b_secondChar, b_thirdChar, b_load, b_save, b_delete, b_back;
	private JTextArea ta_firstInfo, ta_secondInfo, ta_thirdInfo;
	private JLabel l_loadSave, l_bg;
	
	private SystemManager systemManager;
	private ImageManager imageManager;
	private LoadSaveHandler loadSaveHandler;

	public LoadSaveUI(SystemManager systemManager, boolean forLoad) 
	{
		this.systemManager = systemManager;
		this.forLoad = forLoad;
		imageManager = new ImageManager();
		loadSaveHandler = new LoadSaveHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		p_firstSlot = new JPanel();
		p_firstSlot.setOpaque(false);
		p_firstSlot.setLayout(null);
		p_firstSlot.setBounds(380, 78, 311, 428);
		add(p_firstSlot);
		
		b_firstChar = new JButton("Character Image");
		b_firstChar.setContentAreaFilled(false);
		b_firstChar.setOpaque(false);
		b_firstChar.setForeground(Color.WHITE);
		b_firstChar.setFocusPainted(false);
		b_firstChar.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_firstChar.setBounds(10, 11, 291, 322);
		p_firstSlot.add(b_firstChar);
		
		ta_firstInfo = new JTextArea();
		ta_firstInfo.setOpaque(false);
		ta_firstInfo.setForeground(Color.WHITE);
		ta_firstInfo.setEditable(false);
		ta_firstInfo.setHighlighter(null);
		ta_firstInfo.setText("Name: -\r\nArea: -\r\nLevel: -");
		ta_firstInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_firstInfo.setBounds(10, 344, 291, 62);
		p_firstSlot.add(ta_firstInfo);
		
		p_secondSlot = new JPanel();
		p_secondSlot.setOpaque(false);
		p_secondSlot.setLayout(null);
		p_secondSlot.setBounds(723, 78, 311, 428);
		add(p_secondSlot);
		
		b_secondChar = new JButton("Character Image");
		b_secondChar.setContentAreaFilled(false);
		b_secondChar.setOpaque(false);
		b_secondChar.setForeground(Color.WHITE);
		b_secondChar.setFocusPainted(false);
		b_secondChar.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_secondChar.setBounds(10, 11, 291, 322);
		p_secondSlot.add(b_secondChar);
		
		ta_secondInfo = new JTextArea();
		ta_secondInfo.setOpaque(false);
		ta_secondInfo.setForeground(Color.WHITE);
		ta_secondInfo.setEditable(false);
		ta_secondInfo.setHighlighter(null);
		ta_secondInfo.setText("Name: -\r\nArea: -\r\nLevel: -");
		ta_secondInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_secondInfo.setBounds(10, 345, 291, 62);
		p_secondSlot.add(ta_secondInfo);
		
		p_thirdSlot = new JPanel();
		p_thirdSlot.setOpaque(false);
		p_thirdSlot.setBounds(35, 78, 311, 428);
		add(p_thirdSlot);
		p_thirdSlot.setLayout(null);
		
		b_thirdChar = new JButton("Character Image");
		b_thirdChar.setContentAreaFilled(false);
		b_thirdChar.setOpaque(false);
		b_thirdChar.setForeground(Color.WHITE);
		b_thirdChar.setFocusPainted(false);
		b_thirdChar.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_thirdChar.setBounds(10, 11, 291, 323);
		p_thirdSlot.add(b_thirdChar);
		
		ta_thirdInfo = new JTextArea();
		ta_thirdInfo.setOpaque(false);
		ta_thirdInfo.setForeground(Color.WHITE);
		ta_thirdInfo.setEditable(false);
		ta_thirdInfo.setHighlighter(null);
		ta_thirdInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_thirdInfo.setText("Name:\r\nArea: -\r\nLevel: -");
		ta_thirdInfo.setBounds(10, 345, 291, 62);
		p_thirdSlot.add(ta_thirdInfo);
		
		if(forLoad)
			l_loadSave = new JLabel("Load Game");
		else
			l_loadSave = new JLabel("Save Game");
		l_loadSave.setForeground(Color.WHITE);
		l_loadSave.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_loadSave.setBounds(10, 11, 139, 37);
		add(l_loadSave);
		
		if(forLoad)
		{
			b_load = new JButton();
			b_load.setActionCommand("Load");
			b_load.setBorder(null);
			b_load.setIcon(imageManager.getLoadSaveGraphic("Load"));
			b_load.setRolloverIcon(imageManager.getLoadSaveGraphic("Load_Hover"));
			b_load.setContentAreaFilled(false);
			b_load.setOpaque(false);
			b_load.setForeground(Color.WHITE);
			b_load.setFocusPainted(false);
			b_load.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			b_load.setBounds(35, 543, 205, 45);
			add(b_load);
			
			b_delete = new JButton();
			b_delete.setActionCommand("Delete");
			b_delete.setBorder(null);
			b_delete.setIcon(imageManager.getLoadSaveGraphic("Delete"));
			b_delete.setRolloverIcon(imageManager.getLoadSaveGraphic("Delete_Hover"));
			b_delete.setContentAreaFilled(false);
			b_delete.setOpaque(false);
			b_delete.setForeground(Color.WHITE);
			b_delete.setFocusPainted(false);
			b_delete.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			b_delete.setBounds(432, 543, 205, 45);
			add(b_delete);
			
			b_back = new JButton();
			b_back.setActionCommand("Back to Main Menu");
			b_back.setBorder(null);
			b_back.setIcon(imageManager.getLoadSaveGraphic("Back"));
			b_back.setRolloverIcon(imageManager.getLoadSaveGraphic("Back_Hover"));
			b_back.setContentAreaFilled(false);
			b_back.setOpaque(false);
			b_back.setForeground(Color.WHITE);
			b_back.setFocusPainted(false);
			b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			b_back.setBounds(828, 543, 205, 45);
			add(b_back);
		}
		else
		{
			b_save = new JButton();
			b_save.setActionCommand("Save");
			b_save.setBorder(null);
			b_save.setIcon(imageManager.getLoadSaveGraphic("Save"));
			b_save.setRolloverIcon(imageManager.getLoadSaveGraphic("Save_Hover"));
			b_save.setContentAreaFilled(false);
			b_save.setOpaque(false);
			b_save.setForeground(Color.WHITE);
			b_save.setFocusPainted(false);
			b_save.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			b_save.setBounds(300, 543, 205, 45);
			add(b_save);
			
			b_back = new JButton();
			b_back.setActionCommand("Back to Game");
			b_back.setBorder(null);
			b_back.setIcon(imageManager.getLoadSaveGraphic("Back"));
			b_back.setRolloverIcon(imageManager.getLoadSaveGraphic("Back_Hover"));
			b_back.setContentAreaFilled(false);
			b_back.setOpaque(false);
			b_back.setForeground(Color.WHITE);
			b_back.setFocusPainted(false);
			b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			b_back.setBounds(566, 543, 205, 45);
			add(b_back);		
		}
		
		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getCommonBG());
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		b_back.addActionListener(loadSaveHandler);
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
