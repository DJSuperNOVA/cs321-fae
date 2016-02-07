package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class IntroductionUI extends JPanel 
{
	private JTextField txtQuickstory;
	private JButton btnNewButton;
	
	private SystemManager systemManager;
	private IntroductionHandler introductionHandler;

	public IntroductionUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		introductionHandler = new IntroductionHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
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
