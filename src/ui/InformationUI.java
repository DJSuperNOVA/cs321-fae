package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InformationUI extends JFrame 
{

	private JPanel contentPane;
	private JTextField txtBlahBlahBlah;

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
					InformationUI frame = new InformationUI();
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
	public InformationUI() 
	{
		setTitle("Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("About");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 11, 233, 95);
		contentPane.add(btnNewButton);
		
		JButton btnCredits = new JButton("Credits");
		btnCredits.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnCredits.setBounds(10, 117, 233, 95);
		contentPane.add(btnCredits);
		
		JButton btnHowToPlay = new JButton("How to Play");
		btnHowToPlay.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnHowToPlay.setBounds(10, 223, 233, 95);
		contentPane.add(btnHowToPlay);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnBack.setBounds(10, 494, 233, 95);
		contentPane.add(btnBack);
		
		txtBlahBlahBlah = new JTextField();
		txtBlahBlahBlah.setEditable(false);
		txtBlahBlahBlah.setText("Click a Button and Blah Blah Blah");
		txtBlahBlahBlah.setHorizontalAlignment(SwingConstants.CENTER);
		txtBlahBlahBlah.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtBlahBlahBlah.setBounds(253, 11, 803, 578);
		contentPane.add(txtBlahBlahBlah);
		txtBlahBlahBlah.setColumns(10);
	}

}
