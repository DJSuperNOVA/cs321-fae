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

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InformationUI extends JPanel 
{
<<<<<<< HEAD
	private JTextField tf_info;
	private JButton b_about, b_credits, b_howTo, b_back;
=======
	private JTextField txtBlahBlahBlah;
	private JButton btnNewButton;
	private JButton btnCredits;
	private JButton btnHowToPlay;
	private JButton btnBack;
>>>>>>> origin/master
	
	private SystemManager systemManager;
	private InformationHandler informationHandler;

	public InformationUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		informationHandler = new InformationHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
<<<<<<< HEAD
		b_about = new JButton("About");
		b_about.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_about.setBounds(10, 11, 235, 95);
		add(b_about);
		
		b_credits = new JButton("Credits");
		b_credits.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_credits.setBounds(10, 117, 235, 95);
		add(b_credits);
		
		b_howTo = new JButton("How to Play");
		b_howTo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_howTo.setBounds(10, 223, 235, 95);
		add(b_howTo);
		
		b_back = new JButton("Back");
		b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_back.setBounds(10, 494, 235, 95);
		add(b_back);
		
		tf_info = new JTextField();
		tf_info.setEditable(false);
		tf_info.setHighlighter(null);
		tf_info.setText("Click a Button and Blah Blah Blah");
		tf_info.setHorizontalAlignment(SwingConstants.CENTER);
		tf_info.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		tf_info.setBounds(253, 11, 803, 578);
		add(tf_info);
		tf_info.setColumns(10);
		
		b_back.addActionListener(informationHandler);
=======
		btnNewButton = new JButton("About");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 11, 233, 95);
		add(btnNewButton);
		
		btnCredits = new JButton("Credits");
		btnCredits.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnCredits.setBounds(10, 117, 233, 95);
		add(btnCredits);
		
		btnHowToPlay = new JButton("How to Play");
		btnHowToPlay.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnHowToPlay.setBounds(10, 223, 233, 95);
		add(btnHowToPlay);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnBack.setBounds(10, 494, 233, 95);
		add(btnBack);
		
		txtBlahBlahBlah = new JTextField();
		txtBlahBlahBlah.setEditable(false);
		txtBlahBlahBlah.setText("Click a Button and Blah Blah Blah");
		txtBlahBlahBlah.setHorizontalAlignment(SwingConstants.CENTER);
		txtBlahBlahBlah.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtBlahBlahBlah.setBounds(253, 11, 803, 578);
		add(txtBlahBlahBlah);
		txtBlahBlahBlah.setColumns(10);
		
		btnBack.addActionListener(informationHandler);
>>>>>>> origin/master
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
