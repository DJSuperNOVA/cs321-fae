package ui;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import domain.GameItem;
import managers.ImageManager;
import managers.SystemManager;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Component;

public class InventoryUI extends JPanel
{
	private JList<String> jl_items;
	private JLabel l_itemInfo, l_quantity, l_bg;
	private JButton b_plus, b_minus, b_use, b_sell, b_back, b_cancel;
	private JTextArea ta_stats, ta_status;
	
	private final int YESNO = JOptionPane.YES_NO_OPTION;
	private final int YES = JOptionPane.YES_OPTION;
	private final int NO = JOptionPane.NO_OPTION;
	
	private SystemManager systemManager;
	private ImageManager imageManager;
	private InventoryHandler inventoryHandler;
	private MouseHandler mouseHandler;
	
	private String selectedItem;
	private int quantity, sellPrice;
	private boolean isBattle;
	
	private ArrayList<GameItem> playerGameItem;
	
	private DecimalFormat d0 = new DecimalFormat("####");
	
	public InventoryUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		inventoryHandler = new InventoryHandler();
		imageManager = new ImageManager();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		jl_items = new JList<String>();
		jl_items.setBorder(new LineBorder(Color.RED, 1, true));
		jl_items.setSelectionBackground(Color.DARK_GRAY);
		jl_items.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jl_items.setOpaque(false);
		jl_items.setDragEnabled(true);
		jl_items.setCellRenderer(new TransparentListCellRenderer());
		jl_items.setFont(new Font("Nyala", Font.PLAIN, 20));
		jl_items.setBounds(40, 41, 404, 509);
		add(jl_items);
		
		l_itemInfo = new JLabel("");
		l_itemInfo.setForeground(Color.WHITE);
		l_itemInfo.setVerticalAlignment(SwingConstants.TOP);
		l_itemInfo.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_itemInfo.setBounds(464, 41, 560, 131);
		add(l_itemInfo);
		
		ta_stats = new JTextArea();
		ta_stats.setOpaque(false);
		ta_stats.setForeground(Color.WHITE);
		ta_stats.setFont(new Font("Nyala", Font.PLAIN, 20));
		ta_stats.setEditable(false);
		ta_stats.setHighlighter(null);
		ta_stats.setBounds(464, 273, 560, 159);
		add(ta_stats);
		
		ta_status = new JTextArea();
		ta_status.setOpaque(false);
		ta_status.setForeground(Color.WHITE);
		ta_status.setFont(new Font("Nyala", Font.PLAIN, 20));
		ta_status.setEditable(false);
		ta_status.setHighlighter(null);
		ta_status.setBounds(464, 183, 560, 90);
		add(ta_status);
		
		l_quantity = new JLabel("0");
		l_quantity.setVisible(false);
		l_quantity.setForeground(Color.WHITE);
		l_quantity.setHorizontalAlignment(SwingConstants.CENTER);
		l_quantity.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_quantity.setBounds(722, 440, 65, 30);
		add(l_quantity);
		
		b_use = new JButton();
		b_use.setActionCommand("Use Item");
		b_use.setBorder(null);
		b_use.setVisible(false);
		b_use.setIcon(imageManager.getInventoryGraphic("UseItem"));
		b_use.setRolloverIcon(imageManager.getInventoryGraphic("UseItem_Hover"));
		b_use.setDisabledIcon(imageManager.getInventoryGraphic("UseItem_Disabled"));
		b_use.setFocusPainted(false);
		b_use.setContentAreaFilled(false);
		b_use.setOpaque(false);
		b_use.setForeground(Color.WHITE);
		b_use.setBounds(536, 480, 195, 70);
		add(b_use);
		
		b_sell = new JButton();
		b_sell.setActionCommand("Sell");
		b_sell.setBorder(null);
		b_sell.setVisible(false);
		b_sell.setEnabled(false);
		b_sell.setIcon(imageManager.getInventoryGraphic("Sell"));
		b_sell.setRolloverIcon(imageManager.getInventoryGraphic("Sell_Hover"));
		b_sell.setDisabledIcon(imageManager.getInventoryGraphic("Sell_Disabled"));
		b_sell.setFocusPainted(false);
		b_sell.setContentAreaFilled(false);
		b_sell.setOpaque(false);
		b_sell.setForeground(Color.WHITE);
		b_sell.setBounds(536, 480, 195, 70);
		add(b_sell);
		
		b_minus = new JButton();
		b_minus.setActionCommand("Minus");
		b_minus.setBorder(null);
		b_minus.setVisible(false);
		b_minus.setEnabled(false);
		b_minus.setIcon(imageManager.getInventoryGraphic("Minus"));
		b_minus.setRolloverIcon(imageManager.getInventoryGraphic("Minus_Hover"));
		b_minus.setDisabledIcon(imageManager.getInventoryGraphic("Minus_Disabled"));
		b_minus.setFocusPainted(false);
		b_minus.setContentAreaFilled(false);
		b_minus.setOpaque(false);
		b_minus.setForeground(Color.WHITE);
		b_minus.setBounds(678, 440, 44, 30);
		add(b_minus);
		
		b_plus = new JButton();
		b_plus.setActionCommand("Plus");
		b_plus.setBorder(null);
		b_plus.setVisible(false);
		b_plus.setEnabled(false);
		b_plus.setIcon(imageManager.getInventoryGraphic("Plus"));
		b_plus.setRolloverIcon(imageManager.getInventoryGraphic("Plus_Hover"));
		b_plus.setDisabledIcon(imageManager.getInventoryGraphic("Plus_Disabled"));
		b_plus.setFocusPainted(false);
		b_plus.setContentAreaFilled(false);
		b_plus.setOpaque(false);
		b_plus.setForeground(Color.WHITE);
		b_plus.setBounds(789, 440, 44, 30);
		add(b_plus);
		
		b_back = new JButton();
		b_back.setActionCommand("Back");
		b_back.setBorder(null);
		b_back.setVisible(false);
		b_back.setIcon(imageManager.getInventoryGraphic("Back"));
		b_back.setRolloverIcon(imageManager.getInventoryGraphic("Back_Hover"));
		b_back.setFocusPainted(false);
		b_back.setContentAreaFilled(false);
		b_back.setOpaque(false);
		b_back.setForeground(Color.WHITE);
		b_back.setBounds(782, 480, 195, 70);
		add(b_back);
		
		b_cancel = new JButton();
		b_cancel.setActionCommand("Cancel");
		b_cancel.setBorder(null);
		b_cancel.setVisible(false);
		b_cancel.setVisible(false);
		b_cancel.setIcon(imageManager.getInventoryGraphic("Cancel"));
		b_cancel.setRolloverIcon(imageManager.getInventoryGraphic("Cancel_Hover"));
		b_cancel.setFocusPainted(false);
		b_cancel.setContentAreaFilled(false);
		b_cancel.setOpaque(false);
		b_cancel.setForeground(Color.WHITE);
		b_cancel.setBounds(782, 480, 195, 70);
		add(b_cancel);
		
		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getCommonBG());
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		b_back.addActionListener(inventoryHandler);
		b_sell.addActionListener(inventoryHandler);
		b_use.addActionListener(inventoryHandler);
		b_minus.addActionListener(inventoryHandler);
		b_plus.addActionListener(inventoryHandler);
		b_cancel.addActionListener(inventoryHandler);
	}
	
	private class InventoryHandler implements ActionListener
	{
		int reply;
		
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Cancel"))
				refreshInventoryUI(false);
			else if(action.equals("Back"))
			{
				if(isBattle)
					systemManager.showBattleUI();
				else
				{
					jl_items.removeMouseListener(mouseHandler);
					systemManager.getNavigationUI().refreshNavigationUI();
					systemManager.showNavigationUI();
				}
			}
			else if(action.equals("Use Item"))
			{
				for(GameItem playerItem: playerGameItem)
					if(playerItem.getItemName().equals(selectedItem))
					{
						playerItem.setQuantity(playerItem.getQuantity() - 1);
						break;
					}
				
				systemManager.showBattleUI1(selectedItem);
			}
			else if(action.equals("Plus"))
				l_quantity.setText(Integer.parseInt(l_quantity.getText()) + 1 + "");
			else if(action.equals("Minus"))
				l_quantity.setText(Integer.parseInt(l_quantity.getText()) - 1 + "");
			else if(action.equals("Sell"))
			{
				int iterator = 0;

				reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to sell this?", "Confirm", YESNO);
				if(reply == YES)
				{
					ArrayList<GameItem> tempPlayerItems = playerGameItem;
					for(GameItem item: playerGameItem)
					{
						if(item.getItemName().equals(selectedItem))
						{
							JOptionPane.showMessageDialog(null, "Gained " + Integer.parseInt(l_quantity.getText()) * sellPrice + " Au.", "Sell", 
									JOptionPane.INFORMATION_MESSAGE);
							
							systemManager.getHumanPlayer().setAu(systemManager.getHumanPlayer().getAu() + 
									(Integer.parseInt(l_quantity.getText()) * sellPrice));
							
							if(item.getQuantity() == Integer.parseInt(l_quantity.getText()))
								tempPlayerItems.remove(iterator);
							else
							{
								try
								{
									item.setQuantity(item.getQuantity() - Integer.parseInt(l_quantity.getText()));
									tempPlayerItems.remove(iterator);
									tempPlayerItems.add(iterator, item);
								}
								catch(java.util.ConcurrentModificationException ex)
								{
									
								}
							}
							playerGameItem = tempPlayerItems;
							systemManager.getHumanPlayer().setInventory(playerGameItem);
							
							refreshInventoryUI(false);
							break;
						}
						iterator++;
					}
				}
			}
			
			checkQuantity();
			
			repaint();
		}
	}
	
	private class MouseHandler implements MouseListener
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{	
			if(isBattle)
			{
				if(!jl_items.isSelectionEmpty())
					if(e.getClickCount() == 1)
					{
						b_use.setEnabled(true);
						
						int number;
						
						if((jl_items.getSelectedValue().charAt(1) >= 0) && (jl_items.getSelectedValue().charAt(1) <= 9))
							number = Integer.parseInt(jl_items.getSelectedValue().charAt(0) + "" + 
									jl_items.getSelectedValue().charAt(1));
						else
							number = jl_items.getSelectedValue().charAt(0);
						
						if(number < 10)
							selectedItem = jl_items.getSelectedValue().substring(2, jl_items.getSelectedValue().length());
						else
							selectedItem = jl_items.getSelectedValue().substring(3, jl_items.getSelectedValue().length());
		
						for(GameItem item: playerGameItem)
						{
							if(item.getItemName().equals(selectedItem))
							{
								quantity = item.getQuantity();
								sellPrice = (int) item.getSellingValue();
								
								l_itemInfo.setText("<html>Item Name: " + selectedItem
										+ "<br>In Stock: " + quantity
										+ "<br>Item Description: " + item.getItemDesc()
										+ "<br>Buying Price: Au " + item.getBuyingValue() 
										+ "<br>Selling Price: Au " + item.getSellingValue() + "</html>");
								break;
							}
						}
					}
			}
			else
				if(!jl_items.isSelectionEmpty())
					if(e.getClickCount() == 1)
					{
						b_back.setVisible(false);
						b_cancel.setVisible(true);
						b_plus.setEnabled(true);
						b_minus.setEnabled(false);
						int number;
						
						if((jl_items.getSelectedValue().charAt(1) >= 0) && (jl_items.getSelectedValue().charAt(1) <= 9))
							number = Integer.parseInt(jl_items.getSelectedValue().charAt(0) + "" + 
									jl_items.getSelectedValue().charAt(1));
						else
							number = jl_items.getSelectedValue().charAt(0);
						
						if(number < 10)
							selectedItem = jl_items.getSelectedValue().substring(2, jl_items.getSelectedValue().length());
						else
							selectedItem = jl_items.getSelectedValue().substring(3, jl_items.getSelectedValue().length());
		
						for(GameItem item: playerGameItem)
						{
							if(item.getItemName().equals(selectedItem))
							{
								quantity = item.getQuantity();
								sellPrice = (int) item.getSellingValue();
								
								l_itemInfo.setText("<html>Item Name: " + selectedItem
										+ "<br>In Stock: " + quantity
										+ "<br>Item Description: " + item.getItemDesc()
										+ "<br>Buying Price: Au " + item.getBuyingValue() 
										+ "<br>Selling Price: Au " + item.getSellingValue() + "</html>");
								break;
							}
						}
					}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public void refreshInventoryUI(boolean isBattle)
	{
		this.isBattle = isBattle;
		b_back.setVisible(false);
		b_back.setEnabled(false);
		b_use.setVisible(false);
		b_use.setEnabled(false);
		b_cancel.setVisible(false);
		b_cancel.setEnabled(false);
		b_sell.setVisible(false);
		b_sell.setEnabled(false);
		b_plus.setVisible(false);
		b_plus.setEnabled(false);
		b_minus.setVisible(false);
		b_minus.setEnabled(false);
		l_quantity.setVisible(false);
		
		if(isBattle)
		{
			b_back.setVisible(true);
			b_back.setEnabled(true);
			b_use.setEnabled(false);
			b_use.setVisible(true);
		}
		else
		{
			sellPrice = 0;
			l_quantity.setVisible(true);
			b_plus.setVisible(true);
			b_minus.setVisible(true);
			b_sell.setVisible(true);
			b_sell.setEnabled(false);
			b_back.setVisible(true);
			b_back.setEnabled(true);
			b_cancel.setVisible(false);
			b_cancel.setEnabled(true);
		}
		playerGameItem = systemManager.getHumanPlayer().getInventory();
		mouseHandler = new MouseHandler();
		quantity = 0;

		l_itemInfo.setText("<html>Item Name:<br>In Stock:<br>Item Description:<br>"
				+ "Buying Price: Au<br>Selling Price: Au</html>");
		l_quantity.setText("0");
		ta_status.setText("Player Information\n" + systemManager.getHumanPlayer().getName() + "\tLv: " + systemManager.getHumanPlayer().getLevel() + "\n"
				+ "HP\t: " + d0.format(systemManager.getHumanPlayer().getCurrentHP()) + "\n"
				+ "SP\t: " + d0.format(systemManager.getHumanPlayer().getCurrentSP()) + "\n"
				+ "Money\t: Au " + d0.format(systemManager.getHumanPlayer().getAu()));
		ta_stats.setText("XP\t: " + d0.format(systemManager.getHumanPlayer().getXP()) + " / " + 
				d0.format(systemManager.getStatsManager().getPlayerXPtoNextLevel(systemManager.getHumanPlayer().getBattleClass(), 
						systemManager.getHumanPlayer().getLevel())) + "\n"
				+ "Attack\t: " + d0.format(systemManager.getHumanPlayer().getCurrentATK()) + "\n"
				+ "Defense\t: " + d0.format(systemManager.getHumanPlayer().getCurrentDEF()) + "\n"
				+ "Special\t: " + d0.format(systemManager.getHumanPlayer().getCurrentSPC()) + "\n"
				+ "Agility\t: " + d0.format(systemManager.getHumanPlayer().getCurrentAGI()) + "\n"
				+ "Critical\t: " + d0.format(systemManager.getHumanPlayer().getCurrentCRT()));
		
		selectedItem = null;
		
		refreshInventoryList();
	}
	
	private void refreshInventoryList()
	{
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		int iterator = 0;
		for(GameItem item: playerGameItem)
		{
			if(item.getQuantity() != 0)
			{
				iterator++;
				listModel.addElement(iterator + ". " + item.getItemName());
			}
		}
		
		jl_items.setModel(listModel);
		jl_items.addMouseListener(mouseHandler);
	}
	
	private void checkQuantity()
	{
		if(!(Integer.parseInt(l_quantity.getText()) > quantity - 1))
			b_plus.setEnabled(true);
		else
			b_plus.setEnabled(false);
		
		if(!(Integer.parseInt(l_quantity.getText()) == 0))
		{
			b_minus.setEnabled(true);
			b_sell.setEnabled(true);
		}
		else
		{
			b_minus.setEnabled(false);
			b_sell.setEnabled(false);
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
