package ui;

<<<<<<< HEAD
import javax.swing.JLabel;
=======
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
>>>>>>> origin/master
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

<<<<<<< HEAD
=======
import javax.swing.JTextField;
>>>>>>> origin/master
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

<<<<<<< HEAD
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class IntroductionUI extends JPanel 
{
	private JLabel l_story;
	private JButton b_next;
=======
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class IntroductionUI extends JPanel 
{
	private JTextField txtQuickstory;
	private JButton btnNewButton;
>>>>>>> origin/master
	
	private SystemManager systemManager;
	private IntroductionHandler introductionHandler;

	public IntroductionUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		introductionHandler = new IntroductionHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
<<<<<<< HEAD
		l_story = new JLabel();
		l_story.setHorizontalAlignment(SwingConstants.CENTER);
		l_story.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_story.setText("<html><center>Quick story<br>Mention game objectives</center></html>");
		l_story.setBounds(10, 11, 1046, 524);
		add(l_story);
		
		b_next = new JButton("Next");
		b_next.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_next.setBounds(490, 546, 90, 45);
		add(b_next);
		
		b_next.addActionListener(introductionHandler);
=======
		txtQuickstory = new JTextField();
		txtQuickstory.setEditable(false);
		txtQuickstory.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuickstory.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtQuickstory.setText("QUICKSTORY\r\nMENTION GAME OBJECTIVES");
		txtQuickstory.setBounds(10, 11, 1046, 524);
		add(txtQuickstory);
		txtQuickstory.setColumns(10);
		
		btnNewButton = new JButton("Next");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(490, 546, 89, 43);
		add(btnNewButton);
		
		btnNewButton.addActionListener(introductionHandler);
>>>>>>> origin/master
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
