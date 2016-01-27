package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class LoadSaveUI extends JFrame 
{

	private JPanel contentPane;
	private boolean isForLoad; //for distinguishing whether for load or for save game.

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try 
				{
					LoadSaveUI frame = new LoadSaveUI();
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
	public LoadSaveUI() 
	{
		isForLoad = false;
		if(isForLoad)
			setTitle("Load Game");
		else
			setTitle("Save Game");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(380, 78, 311, 428);
		contentPane.add(panel_1);
		
		JButton button = new JButton("Character Image");
		button.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button.setBounds(10, 11, 291, 322);
		panel_1.add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("Name\r\nArea\r\nLevel");
		textArea.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textArea.setBounds(10, 344, 291, 72);
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(723, 78, 311, 428);
		contentPane.add(panel_2);
		
		JButton button_1 = new JButton("Character Image");
		button_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_1.setBounds(10, 11, 291, 322);
		panel_2.add(button_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setText("Name\r\nArea\r\nLevel");
		textArea_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textArea_1.setBounds(10, 345, 291, 72);
		panel_2.add(textArea_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(35, 78, 311, 428);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Character Image");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 11, 291, 323);
		panel.add(btnNewButton);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setEditable(false);
		txtrName.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtrName.setText("Name\r\nArea\r\nLevel");
		txtrName.setBounds(10, 345, 291, 72);
		panel.add(txtrName);
		
		JLabel lblNewLabel;
		if(isForLoad)
			lblNewLabel = new JLabel("Load Game");
		else
			lblNewLabel = new JLabel("Save Game");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 139, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnLoad;
		JButton btnNewButton_1;
		JButton btnDelete;
		JButton button_4;
		
		if(isForLoad)
		{
			btnLoad = new JButton("LOAD");
			btnLoad.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			btnLoad.setBounds(35, 543, 206, 46);
			contentPane.add(btnLoad);
			
			btnDelete = new JButton("DELETE");
			btnDelete.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			btnDelete.setBounds(432, 543, 206, 46);
			contentPane.add(btnDelete);
			
			button_4 = new JButton("Back to Main Menu");
			button_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			button_4.setBounds(828, 543, 206, 46);
			contentPane.add(button_4);
		}
		else
		{
			btnNewButton_1 = new JButton("SAVE");
			btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			btnNewButton_1.setBounds(300, 543, 206, 46);
			contentPane.add(btnNewButton_1);
			
			button_4 = new JButton("Back to Game");
			button_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
			button_4.setBounds(566, 543, 206, 46);
			contentPane.add(button_4);		
		}
	
	}
}
