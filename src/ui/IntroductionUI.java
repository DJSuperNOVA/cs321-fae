package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import managers.ImageManager;
import managers.LanguageManager;
import managers.SystemManager;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class IntroductionUI extends JPanel 
{
	private JLabel l_bg;
	private JTextArea ta_story;
	private JButton b_next;
	
	private ImageManager imageManager;
	private LanguageManager languageManager;
	private SystemManager systemManager;
	private IntroductionHandler introductionHandler;

	public IntroductionUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		introductionHandler = new IntroductionHandler();
		imageManager = new ImageManager();
		languageManager = new LanguageManager("cutscene");
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		ta_story = new JTextArea();
		ta_story.setForeground(Color.WHITE);
		ta_story.setOpaque(false);
		ta_story.setLineWrap(true);
		ta_story.setWrapStyleWord(true);
		ta_story.setAlignmentX(CENTER_ALIGNMENT);
		ta_story.setAlignmentY(CENTER_ALIGNMENT);
		ta_story.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_story.setText(languageManager.getCutsceneText(systemManager.getHumanPlayer().getBossWins()));
		ta_story.setBounds(10, 11, 1046, 524);
		add(ta_story);
		
		b_next = new JButton();
		b_next.setActionCommand("Next");
		b_next.setBorder(null);
		b_next.setIcon(imageManager.getIntroductionGraphic("Next"));
		b_next.setRolloverIcon(imageManager.getIntroductionGraphic("Next_Hover"));
		b_next.setContentAreaFilled(false);
		b_next.setForeground(Color.WHITE);
		b_next.setFocusPainted(false);
		b_next.setOpaque(false);
		b_next.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_next.setBounds(490, 546, 90, 45);
		add(b_next);
		
		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getCommonBG());
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		b_next.addActionListener(introductionHandler);
	}
	
	private class IntroductionHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Next"))
				systemManager.showNavigationUI();
		}
	}

}
