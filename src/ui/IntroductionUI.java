package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
	private JLabel l_story, l_bg;
	private JButton b_next;
	
	private SystemManager systemManager;
	private IntroductionHandler introductionHandler;

	public IntroductionUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		introductionHandler = new IntroductionHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		l_story = new JLabel();
		l_story.setForeground(Color.WHITE);
		l_story.setHorizontalAlignment(SwingConstants.CENTER);
		l_story.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_story.setText("<html><center>Quick story<br>Mention game objectives</center></html>");
		l_story.setBounds(10, 11, 1046, 524);
		add(l_story);
		
		b_next = new JButton("Next");
		b_next.setContentAreaFilled(false);
		b_next.setForeground(Color.WHITE);
		b_next.setFocusPainted(false);
		b_next.setOpaque(false);
		b_next.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_next.setBounds(490, 546, 90, 45);
		add(b_next);
		
		l_bg = new JLabel();
		l_bg.setIcon(new ImageIcon("../cs321-fae/src/graphics/Common_BG.png"));
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
