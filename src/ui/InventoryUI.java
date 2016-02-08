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
<<<<<<< HEAD
	private JList<String> jl_items;
	private JLabel l_itemDetails, l_stats;
	private JButton b_use, b_discard, b_back;
=======
	private JList list;
	private JLabel lblNewLabel;
	private JLabel lblCurrent;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
>>>>>>> origin/master

	private SystemManager systemManager;
	private InventoryHandler inventoryHandler;
	
	public InventoryUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		inventoryHandler = new InventoryHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
<<<<<<< HEAD
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("Items Go Here");
		
		jl_items = new JList<String>(listModel);
		jl_items.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		jl_items.setBounds(10, 11, 434, 578);
		add(jl_items);
		
		l_itemDetails = new JLabel("<html>Item Name: SP Potion<br>In Stock: 99<br>\"Item Description\"</html>");
		l_itemDetails.setVerticalAlignment(SwingConstants.TOP);
		l_itemDetails.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_itemDetails.setBounds(454, 12, 602, 131);
		add(l_itemDetails);
		
		l_stats = new JLabel("Current Player Stats Here");
		l_stats.setHorizontalAlignment(SwingConstants.CENTER);
		l_stats.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_stats.setBounds(454, 154, 602, 352);
		add(l_stats);
		
		b_use = new JButton("Use Item");
		b_use.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_use.setBounds(454, 517, 195, 70);
		add(b_use);
		
		b_discard = new JButton("Discard Item");
		b_discard.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_discard.setBounds(658, 517, 195, 70);
		add(b_discard);
		
		b_back = new JButton("Back");
		b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_back.setBounds(861, 517, 195, 70);
		add(b_back);
		
		b_back.addActionListener(inventoryHandler);
=======
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
>>>>>>> origin/master
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
