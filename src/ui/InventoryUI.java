package ui;

import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

public class InventoryUI extends JPanel 
{
	private JList<String> jl_items;
	private JLabel l_itemDetails, l_stats, l_bg;
	private JButton b_use, b_sell, b_back;

	private SystemManager systemManager;
	private InventoryHandler inventoryHandler;
	
	public InventoryUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		inventoryHandler = new InventoryHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("Items Go Here");
		
		jl_items = new JList<String>(listModel);
		jl_items.setSelectionBackground(Color.DARK_GRAY);
		jl_items.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		jl_items.setOpaque(false);
		jl_items.setCellRenderer(new TransparentListCellRenderer());
		jl_items.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		jl_items.setBounds(10, 11, 434, 578);
		add(jl_items);
		
		l_itemDetails = new JLabel("<html>Item Name: SP Potion<br>In Stock: 99<br>\"Item Description\"</html>");
		l_itemDetails.setForeground(Color.WHITE);
		l_itemDetails.setVerticalAlignment(SwingConstants.TOP);
		l_itemDetails.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_itemDetails.setBounds(454, 12, 602, 131);
		add(l_itemDetails);
		
		l_stats = new JLabel("Current Player Stats Here");
		l_stats.setForeground(Color.WHITE);
		l_stats.setHorizontalAlignment(SwingConstants.CENTER);
		l_stats.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_stats.setBounds(454, 154, 602, 352);
		add(l_stats);
		
		b_use = new JButton("Use Item");
		b_use.setFocusPainted(false);
		b_use.setContentAreaFilled(false);
		b_use.setOpaque(false);
		b_use.setForeground(Color.WHITE);
		b_use.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_use.setBounds(454, 517, 195, 70);
		add(b_use);
		
		b_sell = new JButton("Sell Item");
		b_sell.setFocusPainted(false);
		b_sell.setContentAreaFilled(false);
		b_sell.setOpaque(false);
		b_sell.setForeground(Color.WHITE);
		b_sell.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_sell.setBounds(658, 517, 195, 70);
		add(b_sell);
		
		b_back = new JButton("Back");
		b_back.setFocusPainted(false);
		b_back.setContentAreaFilled(false);
		b_back.setOpaque(false);
		b_back.setForeground(Color.WHITE);
		b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_back.setBounds(861, 517, 195, 70);
		add(b_back);
		
		l_bg = new JLabel();
		l_bg.setIcon(new ImageIcon("../cs321-fae/src/graphics/Common_BG.png"));
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		b_back.addActionListener(inventoryHandler);
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
	
	private class TransparentListCellRenderer extends DefaultListCellRenderer 
	{

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) 
        {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            setForeground(Color.WHITE);
            setOpaque(isSelected);
            return this;
        }

    }
}
