package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class InventoryUI extends JPanel 
{
	private JList list;
	private JLabel lblNewLabel;
	private JLabel lblCurrent;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;

	private SystemManager systemManager;
	private InventoryHandler inventoryHandler;
	
	public InventoryUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		inventoryHandler = new InventoryHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		DefaultListModel listModel = new DefaultListModel();
		listModel.addElement("Items Go Here");
		
		list = new JList(listModel);
		list.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		list.setBounds(10, 11, 434, 578);
		add(list);
		
		lblNewLabel = new JLabel("<html>Item Name: SP Potion<br>In Stock: 99<br>\"Item Description\"</html>");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel.setBounds(454, 12, 602, 131);
		add(lblNewLabel);
		
		lblCurrent = new JLabel("Current Player Stats Here");
		lblCurrent.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrent.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblCurrent.setBounds(454, 154, 602, 352);
		add(lblCurrent);
		
		btnNewButton = new JButton("Use Item");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(454, 517, 195, 72);
		add(btnNewButton);
		
		button = new JButton("Discard Item");
		button.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button.setBounds(658, 517, 195, 72);
		add(button);
		
		button_1 = new JButton("Back");
		button_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_1.setBounds(861, 517, 195, 72);
		add(button_1);
		
		button_1.addActionListener(inventoryHandler);
	}
	
	private class InventoryHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Back"))
				systemManager.showNavigationUI();
		}
	}
}
