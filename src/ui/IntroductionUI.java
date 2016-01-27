package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class IntroductionUI extends JFrame 
{

	private JPanel contentPane;
	private JTextField txtQuickstory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					IntroductionUI frame = new IntroductionUI();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IntroductionUI() 
	{
		setTitle("Introduction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtQuickstory = new JTextField();
		txtQuickstory.setEditable(false);
		txtQuickstory.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuickstory.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtQuickstory.setText("QUICKSTORY\r\nMENTION GAME OBJECTIVES");
		txtQuickstory.setBounds(10, 11, 1046, 524);
		contentPane.add(txtQuickstory);
		txtQuickstory.setColumns(10);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(490, 546, 89, 43);
		contentPane.add(btnNewButton);
	}

}
