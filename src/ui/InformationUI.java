package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
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
	private JTextField txtBlahBlahBlah;
	private JButton btnNewButton;
	private JButton btnCredits;
	private JButton btnHowToPlay;
	private JButton btnBack;
	
	private SystemManager systemManager;
	private InformationHandler informationHandler;

	public InformationUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		informationHandler = new InformationHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
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
