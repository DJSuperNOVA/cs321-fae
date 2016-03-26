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
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;

import java.awt.Color;

public class StoryUI extends JPanel 
{
	private JLabel l_bg, l_storyImage;
	private JTextArea ta_story;
	private JButton b_next;

	private ImageManager imageManager;
	private LanguageManager languageManager;
	private SystemManager systemManager;
	private StoryHandler storyHandler;

	public StoryUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		storyHandler = new StoryHandler();
		imageManager = new ImageManager();
		languageManager = new LanguageManager("cutscene");

		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);

		ta_story = new JTextArea();
		ta_story.setEditable(false);
		ta_story.setEnabled(false);
		ta_story.setForeground(Color.WHITE);
		ta_story.setOpaque(false);
		ta_story.setLineWrap(true);
		ta_story.setWrapStyleWord(true);
		ta_story.setAlignmentX(CENTER_ALIGNMENT);
		ta_story.setAlignmentY(CENTER_ALIGNMENT);
		ta_story.setFont(new Font("Nyala", Font.PLAIN, 20));
		ta_story.setText("");
		ta_story.setText(languageManager.getCutsceneText(0).replaceAll("~]", "\n"));
		ta_story.setBounds(50, 369, 954, 166);
		add(ta_story);

		b_next = new JButton();
		b_next.setDisabledIcon(imageManager.getStoryGraphic("Next_Disabled"));
		b_next.setActionCommand("Next");
		b_next.setBorder(null);
		b_next.setIcon(imageManager.getStoryGraphic("Next"));
		b_next.setRolloverIcon(imageManager.getStoryGraphic("Next_Hover"));
		b_next.setContentAreaFilled(false);
		b_next.setForeground(Color.WHITE);
		b_next.setFocusPainted(false);
		b_next.setOpaque(false);
		b_next.setEnabled(false);
		b_next.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_next.setBounds(490, 546, 90, 45);
		add(b_next);
		
		l_storyImage = new JLabel();
		l_storyImage.setIcon(imageManager.getStoryGraphic("Part" + 0));
		l_storyImage.setBounds(8, 10, 1066, 325);
		add(l_storyImage);

		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getCommonBG());
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);

		b_next.addActionListener(storyHandler);
	}

	public void rollText(int bossWins)
	{
		String wholeText = new String(languageManager.getCutsceneText(0));
		String[] textArray = wholeText.split("");
		
		new SwingWorker<Void, String>() 
		{
			String toRoll = new String("");
			int time = 0;

			@Override
			protected Void doInBackground() throws Exception 
			{
				for (String s: textArray) 
				{
					toRoll += s;
					ta_story.setText(toRoll.replaceAll("~]", "\n"));
					Thread.sleep(68);
					time += 50;
					if(time == 5000) //delay before setting the next button enabled
						b_next.setEnabled(true);
				}
				return null;
			}

			@Override
			protected void process(List<String> chunks) 
			{
				for (String chunk : chunks) 
				{
					ta_story.append(chunk + "\n");
				}
			}

			@Override
			protected void done() 
			{
				
			}

		}.execute();
	}
	
	private class StoryHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Next"))
				systemManager.showAreaSelectionUI();
			systemManager.playSFX("common_confirm");
			
			repaint();
		}
	}
}
