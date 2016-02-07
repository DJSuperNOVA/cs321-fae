package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ShopUI extends JPanel 
{
	private JLabel lblNewLabel;
	private JLabel lblItemShop;
	private JLabel lblMoney;
	private JList list;
	private JLabel lblinInventory;
	private JLabel lblHp;
	private JLabel lblSp;
	private JLabel lblAttack;
	private JLabel lblDefense;
	private JLabel lblSpecial;
	private JLabel lblSpeed;
	private JLabel lblLuck;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_7;
	private JButton button_6;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_12;
	private JLabel label_7;
	private JButton button_11;
	private JLabel label_8;
	private JLabel label_10;
	private JLabel label_9;
	private JLabel label_11;
	private JLabel label_13;
	private JLabel label_12;
	private JButton btnNewButton_1;
	private JLabel lblTotalPoints;
	private JLabel lblPricePer;
	private JLabel lblUpgradePriceAu;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel lblSelected;
	private JLabel lblitemNameitemDescriptionitem;
	private JButton btnNewButton_2;
	private JLabel label_17;
	private JLabel lblPrice;
	private JLabel lblQuantity;
	private JButton btnBuy;
	private JButton button_13;
	private JLabel label_18;
	private JButton button_14;

	private SystemManager systemManager;
	private ShopHandler shopHandler;
	
	public ShopUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		shopHandler = new ShopHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		lblNewLabel = new JLabel("Stats Shop");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 90, 34);
		add(lblNewLabel);
		
		lblItemShop = new JLabel("Item Shop");
		lblItemShop.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblItemShop.setBounds(541, 11, 90, 34);
		add(lblItemShop);
		
		lblMoney = new JLabel("<html>Money:<br>Au 1000</html>");
		lblMoney.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblMoney.setBounds(541, 56, 253, 49);
		add(lblMoney);
		
		lblinInventory = new JLabel("<html>In Inventory:<br>99</html>");
		lblinInventory.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblinInventory.setBounds(804, 56, 252, 49);
		add(lblinInventory);
		
		DefaultListModel listModel = new DefaultListModel();
		listModel.addElement("Items Go Here");
		
		list = new JList(listModel);
		list.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		list.setBounds(541, 116, 515, 413);
		add(list);
		
		lblHp = new JLabel("HP");
		lblHp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblHp.setBounds(10, 65, 90, 20);
		add(lblHp);
		
		lblSp = new JLabel("SP");
		lblSp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSp.setBounds(10, 85, 90, 20);
		add(lblSp);
		
		lblAttack = new JLabel("ATTACK");
		lblAttack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblAttack.setBounds(10, 105, 90, 20);
		add(lblAttack);
		
		lblDefense = new JLabel("DEFENSE");
		lblDefense.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblDefense.setBounds(10, 125, 90, 20);
		add(lblDefense);
		
		lblSpecial = new JLabel("SPECIAL");
		lblSpecial.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSpecial.setBounds(10, 145, 90, 20);
		add(lblSpecial);
		
		lblSpeed = new JLabel("SPEED");
		lblSpeed.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSpeed.setBounds(10, 165, 90, 20);
		add(lblSpeed);
		
		lblLuck = new JLabel("CRITICAL");
		lblLuck.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblLuck.setBounds(10, 185, 90, 20);
		add(lblLuck);
		
		label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label.setBounds(144, 65, 65, 20);
		add(label);
		
		label_1 = new JLabel("0");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_1.setBounds(144, 85, 65, 20);
		add(label_1);
		
		label_2 = new JLabel("0");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_2.setBounds(144, 105, 65, 20);
		add(label_2);
		
		label_3 = new JLabel("0");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_3.setBounds(144, 125, 65, 20);
		add(label_3);
		
		label_4 = new JLabel("0");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_4.setBounds(144, 145, 65, 20);
		add(label_4);
		
		label_5 = new JLabel("0");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_5.setBounds(144, 165, 65, 20);
		add(label_5);
		
		label_6 = new JLabel("0");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_6.setBounds(144, 185, 65, 20);
		add(label_6);
		
		btnNewButton = new JButton("-");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(100, 65, 44, 20);
		add(btnNewButton);
		
		button = new JButton("-");
		button.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button.setBounds(100, 105, 44, 20);
		add(button);
		
		button_1 = new JButton("-");
		button_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_1.setBounds(100, 125, 44, 20);
		add(button_1);
		
		button_2 = new JButton("-");
		button_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_2.setBounds(100, 145, 44, 20);
		add(button_2);
		
		button_3 = new JButton("-");
		button_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_3.setBounds(100, 85, 44, 20);
		add(button_3);
		
		button_4 = new JButton("-");
		button_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_4.setBounds(100, 165, 44, 20);
		add(button_4);
		
		button_5 = new JButton("-");
		button_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_5.setBounds(100, 185, 44, 20);
		add(button_5);
		
		button_6 = new JButton("+");
		button_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_6.setBounds(209, 65, 44, 20);
		add(button_6);
		
		button_7 = new JButton("+");
		button_7.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_7.setBounds(209, 85, 44, 20);
		add(button_7);
		
		button_8 = new JButton("+");
		button_8.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_8.setBounds(209, 105, 44, 20);
		add(button_8);
		
		button_9 = new JButton("+");
		button_9.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_9.setBounds(209, 125, 44, 20);
		add(button_9);
		
		button_10 = new JButton("+");
		button_10.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_10.setBounds(209, 145, 44, 20);
		add(button_10);
		
		button_11 = new JButton("+");
		button_11.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_11.setBounds(209, 165, 44, 20);
		add(button_11);
		
		button_12 = new JButton("+");
		button_12.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_12.setBounds(209, 185, 44, 20);
		add(button_12);
		
		label_7 = new JLabel("0");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_7.setBounds(255, 65, 197, 20);
		add(label_7);
		
		label_8 = new JLabel("0");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_8.setBounds(255, 85, 197, 20);
		add(label_8);
		
		label_9 = new JLabel("0");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_9.setBounds(255, 105, 197, 20);
		add(label_9);
		
		label_10 = new JLabel("0");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_10.setBounds(255, 125, 197, 20);
		add(label_10);
		
		label_11 = new JLabel("0");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_11.setBounds(255, 145, 197, 20);
		add(label_11);
		
		label_12 = new JLabel("0");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_12.setBounds(255, 165, 197, 20);
		add(label_12);
		
		label_13 = new JLabel("0");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_13.setBounds(255, 185, 197, 20);
		add(label_13);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton_1.setBounds(886, 540, 170, 49);
		add(btnNewButton_1);
		
		lblTotalPoints = new JLabel("Total Points:");
		lblTotalPoints.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblTotalPoints.setBounds(10, 230, 159, 20);
		add(lblTotalPoints);
		
		lblPricePer = new JLabel("Price per Point: Au");
		lblPricePer.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblPricePer.setBounds(10, 250, 159, 20);
		add(lblPricePer);
		
		lblUpgradePriceAu = new JLabel("Upgrade Price: Au");
		lblUpgradePriceAu.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblUpgradePriceAu.setBounds(10, 270, 159, 20);
		add(lblUpgradePriceAu);
		
		label_14 = new JLabel("0");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_14.setBounds(192, 270, 65, 20);
		add(label_14);
		
		label_15 = new JLabel("0");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_15.setBounds(192, 250, 65, 20);
		add(label_15);
		
		label_16 = new JLabel("0");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_16.setBounds(192, 230, 65, 20);
		add(label_16);
		
		btnNewButton_2 = new JButton("Upgrade");
		btnNewButton_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton_2.setBounds(311, 250, 120, 40);
		add(btnNewButton_2);
		
		lblSelected = new JLabel("Selected Item Information");
		lblSelected.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSelected.setBounds(10, 329, 235, 34);
		add(lblSelected);
		
		lblitemNameitemDescriptionitem = new JLabel("<html>Item Name<br>Item Description<br>Item Price Per unit</html>");
		lblitemNameitemDescriptionitem.setVerticalAlignment(SwingConstants.TOP);
		lblitemNameitemDescriptionitem.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblitemNameitemDescriptionitem.setBounds(10, 374, 521, 151);
		add(lblitemNameitemDescriptionitem);
		
		lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblQuantity.setBounds(10, 549, 90, 20);
		add(lblQuantity);
		
		label_17 = new JLabel("0");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_17.setBounds(341, 549, 111, 20);
		add(label_17);
		
		lblPrice = new JLabel("Price: Au");
		lblPrice.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblPrice.setBounds(255, 549, 76, 20);
		add(lblPrice);
		
		btnBuy = new JButton("Buy");
		btnBuy.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnBuy.setBounds(462, 540, 69, 40);
		add(btnBuy);
		
		button_13 = new JButton("+");
		button_13.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_13.setBounds(209, 549, 44, 20);
		add(button_13);
		
		label_18 = new JLabel("0");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_18.setBounds(144, 549, 65, 20);
		add(label_18);
		
		button_14 = new JButton("-");
		button_14.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		button_14.setBounds(100, 549, 44, 20);
		add(button_14);
		
		btnNewButton_1.addActionListener(shopHandler);
	}
	
	private class ShopHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Back"))
				systemManager.showNavigationUI();
		}
	}

}
