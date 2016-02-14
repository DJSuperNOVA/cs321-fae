package ui;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;

public class InformationUI extends JPanel 
{
	private JTextArea ta_info;
	private JButton b_about, b_credits, b_howTo, b_back;
	private JLabel l_bg;
	
	private SystemManager systemManager;
	private InformationHandler informationHandler;

	public InformationUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		informationHandler = new InformationHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		b_about = new JButton("About");
		b_about.setFocusPainted(false);
		b_about.setOpaque(false);
		b_about.setContentAreaFilled(false);
		b_about.setForeground(Color.WHITE);
		b_about.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_about.setBounds(10, 11, 235, 95);
		add(b_about);
		
		b_credits = new JButton("Credits");
		b_credits.setFocusPainted(false);
		b_credits.setOpaque(false);
		b_credits.setContentAreaFilled(false);
		b_credits.setForeground(Color.WHITE);
		b_credits.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_credits.setBounds(10, 117, 235, 95);
		add(b_credits);
		
		b_howTo = new JButton("How to Play");
		b_howTo.setFocusPainted(false);
		b_howTo.setOpaque(false);
		b_howTo.setContentAreaFilled(false);
		b_howTo.setForeground(Color.WHITE);
		b_howTo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_howTo.setBounds(10, 223, 235, 95);
		add(b_howTo);
		
		b_back = new JButton("Back");
		b_back.setFocusPainted(false);
		b_back.setOpaque(false);
		b_back.setContentAreaFilled(false);
		b_back.setForeground(Color.WHITE);
		b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_back.setBounds(10, 494, 235, 95);
		add(b_back);
		
		ta_info = new JTextArea();
		ta_info.setOpaque(false);
		ta_info.setForeground(Color.WHITE);
		ta_info.setEditable(false);
		ta_info.setHighlighter(null);
		ta_info.setText("Click a Button and Blah Blah Blah");
		ta_info.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_info.setBounds(253, 11, 803, 578);
		add(ta_info);
		ta_info.setColumns(10);
		
		l_bg = new JLabel();
		l_bg.setIcon(new ImageIcon("../cs321-fae/src/graphics/Common_BG.png"));
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		b_back.addActionListener(informationHandler);
	}
	
	private class InformationHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Back"))
				systemManager.showMainMenuUI();
		}
	}

}
