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
import javax.swing.JOptionPane;

import java.awt.Color;

public class LoadSaveUI extends JPanel 
{
	private boolean forLoad; //for distinguishing whether for load or for save game.

	private JPanel p_secondSlot, p_thirdSlot, p_firstSlot;
	private JButton b_secondChar, b_thirdChar, b_firstChar, b_load, b_save, b_delete, b_back;
	private JTextArea ta_secondInfo, ta_thirdInfo, ta_firstInfo;
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
		p_firstSlot.setBounds(35, 78, 311, 428);
		add(p_firstSlot);
		p_firstSlot.setLayout(null);

		b_firstChar = new JButton();
		b_firstChar.setIcon(imageManager.getLoadSaveGraphic(systemManager.getSaveFileManager().getSaveFile(1).getBattleClass() + ""));
		b_firstChar.setSelectedIcon(imageManager.getLoadSaveGraphic(systemManager.getSaveFileManager().getSaveFile(1).getBattleClass() + "_Selected"));
		b_firstChar.setRolloverIcon(imageManager.getLoadSaveGraphic(systemManager.getSaveFileManager().getSaveFile(1).getBattleClass() + "_Selected"));
		b_firstChar.setDisabledIcon(imageManager.getLoadSaveGraphic("X"));
		b_firstChar.setActionCommand("File1");
		b_firstChar.setContentAreaFilled(false);
		b_firstChar.setOpaque(false);
		b_firstChar.setForeground(Color.WHITE);
		b_firstChar.setFocusPainted(false);
		b_firstChar.setBorder(null);
		b_firstChar.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_firstChar.setBounds(10, 11, 291, 323);
		p_firstSlot.add(b_firstChar);

		ta_firstInfo = new JTextArea();
		ta_firstInfo.setOpaque(false);
		ta_firstInfo.setForeground(Color.WHITE);
		ta_firstInfo.setEditable(false);
		ta_firstInfo.setHighlighter(null);
		ta_firstInfo.setFont(new Font("Nyala", Font.PLAIN, 20));
		ta_firstInfo.setText("Name: " + systemManager.getSaveFileManager().getSaveFile(1).getName() + "\n"
				+ "Bosses Defeated: " + systemManager.getSaveFileManager().getSaveFile(1).getBossWins() +"\n"
				+ "Level: " + systemManager.getSaveFileManager().getSaveFile(1).getLevel());
		ta_firstInfo.setBounds(10, 345, 291, 62);
		p_firstSlot.add(ta_firstInfo);

		p_secondSlot = new JPanel();
		p_secondSlot.setOpaque(false);
		p_secondSlot.setLayout(null);
		p_secondSlot.setBounds(380, 78, 311, 428);
		add(p_secondSlot);

		b_secondChar = new JButton();
		b_secondChar.setIcon(imageManager.getLoadSaveGraphic(systemManager.getSaveFileManager().getSaveFile(2).getBattleClass() + ""));
		b_secondChar.setSelectedIcon(imageManager.getLoadSaveGraphic(systemManager.getSaveFileManager().getSaveFile(2).getBattleClass() + "_Selected"));
		b_secondChar.setRolloverIcon(imageManager.getLoadSaveGraphic(systemManager.getSaveFileManager().getSaveFile(2).getBattleClass() + "_Selected"));
		b_secondChar.setDisabledIcon(imageManager.getLoadSaveGraphic("X"));
		b_secondChar.setActionCommand("File2");
		b_secondChar.setContentAreaFilled(false);
		b_secondChar.setOpaque(false);
		b_secondChar.setForeground(Color.WHITE);
		b_secondChar.setFocusPainted(false);
		b_secondChar.setBorder(null);
		b_secondChar.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_secondChar.setBounds(10, 11, 291, 322);
		p_secondSlot.add(b_secondChar);

		ta_secondInfo = new JTextArea();
		ta_secondInfo.setOpaque(false);
		ta_secondInfo.setForeground(Color.WHITE);
		ta_secondInfo.setEditable(false);
		ta_secondInfo.setHighlighter(null);
		ta_secondInfo.setText("Name: " + systemManager.getSaveFileManager().getSaveFile(2).getName() + "\n"
				+ "Bosses Defeated: " + systemManager.getSaveFileManager().getSaveFile(2).getBossWins() +"\n"
				+ "Level: " + systemManager.getSaveFileManager().getSaveFile(2).getLevel());
		ta_secondInfo.setFont(new Font("Nyala", Font.PLAIN, 20));
		ta_secondInfo.setBounds(10, 344, 291, 62);
		p_secondSlot.add(ta_secondInfo);

		p_thirdSlot = new JPanel();
		p_thirdSlot.setOpaque(false);
		p_thirdSlot.setLayout(null);
		p_thirdSlot.setBounds(723, 78, 311, 428);
		add(p_thirdSlot);

		b_thirdChar = new JButton();
		b_thirdChar.setIcon(imageManager.getLoadSaveGraphic(systemManager.getSaveFileManager().getSaveFile(3).getBattleClass() + ""));
		b_thirdChar.setSelectedIcon(imageManager.getLoadSaveGraphic(systemManager.getSaveFileManager().getSaveFile(3).getBattleClass() + "_Selected"));
		b_thirdChar.setRolloverIcon(imageManager.getLoadSaveGraphic(systemManager.getSaveFileManager().getSaveFile(3).getBattleClass() + "_Selected"));
		b_thirdChar.setDisabledIcon(imageManager.getLoadSaveGraphic("X"));
		b_thirdChar.setActionCommand("File3");
		b_thirdChar.setContentAreaFilled(false);
		b_thirdChar.setOpaque(false);
		b_thirdChar.setForeground(Color.WHITE);
		b_thirdChar.setFocusPainted(false);
		b_thirdChar.setBorder(null);
		b_thirdChar.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_thirdChar.setBounds(10, 11, 291, 322);
		p_thirdSlot.add(b_thirdChar);

		ta_thirdInfo = new JTextArea();
		ta_thirdInfo.setOpaque(false);
		ta_thirdInfo.setForeground(Color.WHITE);
		ta_thirdInfo.setEditable(false);
		ta_thirdInfo.setHighlighter(null);
		ta_thirdInfo.setText("Name: " + systemManager.getSaveFileManager().getSaveFile(3).getName() + "\n"
				+ "Bosses Defeated: " + systemManager.getSaveFileManager().getSaveFile(3).getBossWins() +"\n"
				+ "Level: " + systemManager.getSaveFileManager().getSaveFile(3).getLevel());
		ta_thirdInfo.setFont(new Font("Nyala", Font.PLAIN, 20));
		ta_thirdInfo.setBounds(10, 345, 291, 62);
		p_thirdSlot.add(ta_thirdInfo);

		if(forLoad)
			l_loadSave = new JLabel("Load Game");
		else
			l_loadSave = new JLabel("Save Game");
		l_loadSave.setForeground(Color.WHITE);
		l_loadSave.setFont(new Font("Trajan Pro", Font.PLAIN, 24));
		l_loadSave.setBounds(40, 20, 986, 37);
		l_loadSave.setHorizontalAlignment(WIDTH/2);
		add(l_loadSave);

		b_save = new JButton(); //just to instantiate... it gives out NullPointerException without it
		b_load = new JButton();
		b_delete = new JButton();
		
		if(forLoad)
		{
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

			if(systemManager.getSaveFileManager().getSaveFile(1).getBattleClass().equals("X"))
				b_firstChar.setEnabled(false);
			if(systemManager.getSaveFileManager().getSaveFile(2).getBattleClass().equals("X"))
				b_secondChar.setEnabled(false);
			if(systemManager.getSaveFileManager().getSaveFile(3).getBattleClass().equals("X"))
				b_thirdChar.setEnabled(false);
		}
		else
		{
			b_firstChar.setEnabled(true);
			b_secondChar.setEnabled(true);
			b_thirdChar.setEnabled(true);

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

		b_firstChar.addActionListener(loadSaveHandler);
		b_secondChar.addActionListener(loadSaveHandler);
		b_thirdChar.addActionListener(loadSaveHandler);
		b_load.addActionListener(loadSaveHandler);
		b_save.addActionListener(loadSaveHandler);
		b_delete.addActionListener(loadSaveHandler);
		b_back.addActionListener(loadSaveHandler);
	}

	private class LoadSaveHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Back to Main Menu"))
				systemManager.showMainMenuUI();
			else if(action.equals("File1"))
				loadSave(1);
			else if(action.equals("File2"))
				loadSave(2);
			else if(action.equals("File3"))
				loadSave(3);
			else if(action.equals("Load"))
				loadPlayer();
			else if(action.equals("Back to Game"))
				systemManager.showNavigationUI();

			repaint();
		}

		private void loadPlayer() 
		{
			if(b_firstChar.isSelected())
				systemManager.setHumanPlayer(systemManager.getSaveFileManager().getSaveFile(1));
			else if(b_secondChar.isSelected())
				systemManager.setHumanPlayer(systemManager.getSaveFileManager().getSaveFile(2));
			else if(b_thirdChar.isSelected())
				systemManager.setHumanPlayer(systemManager.getSaveFileManager().getSaveFile(3));
			systemManager.playSFX("attractscreen");
			JOptionPane.showMessageDialog(null, "Load Successful.", "Load Game", JOptionPane.PLAIN_MESSAGE);
			System.out.println(systemManager.getHumanPlayer().toString());
			systemManager.playMusic("bgm_story");
			systemManager.getAreaSelectionUI().refreshAreaSelectionUI();
			systemManager.showAreaSelectionUI();
		}

		private void loadSave(int i) 
		{
			switch(i)
			{
			case 1:
				b_firstChar.setSelected(true);
				b_secondChar.setSelected(false);
				b_thirdChar.setSelected(false);
				break;
			case 2:
				b_firstChar.setSelected(false);
				b_secondChar.setSelected(true);
				b_thirdChar.setSelected(false);
				break;
			case 3:
				b_firstChar.setSelected(false);
				b_secondChar.setSelected(false);
				b_thirdChar.setSelected(true);
				break;
			}
		}
	}
}
