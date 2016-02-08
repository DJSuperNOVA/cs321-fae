package ui;

<<<<<<< HEAD
import javax.swing.DefaultListModel;
=======
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
>>>>>>> origin/master
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
<<<<<<< HEAD
=======
import javax.swing.ListModel;
>>>>>>> origin/master
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ShopUI extends JPanel 
{
<<<<<<< HEAD
	private JList<String> jl_items;
	private JLabel l_statsShop, l_itemShop, l_money, l_have, l_hpText, l_spText, l_attackText, l_defenseText,
				l_powerText, l_speedText, l_criticalText, l_baseHP, l_baseSP, l_baseAttack, l_baseDefense,
				l_basePower, l_baseSpeed, l_baseCritical, l_addedHP, l_addedSP, l_addedDefense, l_addedAttack,
				l_addedPower, l_addedCritical, l_addedSpeed, l_totalPointsText, l_perPriceText, l_totalPriceText,
				l_totalPrice, l_perPrice, l_totalPoints, l_information, l_itemInfo, l_itemPrice, l_itemPriceText,
				l_quantityText, l_quantity;
	private JButton b_downHP, b_downAttack, b_downDefense, b_downPower, b_downSP, b_downSpeed, b_downCritical,
				b_upSP, b_upHP, b_upAttack, b_upDefense, b_upPower, b_upCritical, b_upSpeed, b_back, b_upgrade,
				b_buy, b_upQuantity, b_downQuantity;
=======
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
>>>>>>> origin/master

	private SystemManager systemManager;
	private ShopHandler shopHandler;
	
	public ShopUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		shopHandler = new ShopHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
<<<<<<< HEAD
		l_statsShop = new JLabel("Stats Shop");
		l_statsShop.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_statsShop.setBounds(10, 11, 90, 34);
		add(l_statsShop);
		
		l_itemShop = new JLabel("Item Shop");
		l_itemShop.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_itemShop.setBounds(541, 11, 90, 34);
		add(l_itemShop);
		
		l_money = new JLabel("<html>Money:<br>Au 1000</html>");
		l_money.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_money.setBounds(541, 56, 253, 49);
		add(l_money);
		
		l_have = new JLabel("<html>In Inventory:<br>99</html>");
		l_have.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_have.setBounds(804, 56, 252, 49);
		add(l_have);
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("Items Go Here");
		
		jl_items = new JList<String>(listModel);
		jl_items.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		jl_items.setBounds(541, 116, 515, 413);
		add(jl_items);
		
		l_hpText = new JLabel("HP");
		l_hpText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_hpText.setBounds(10, 65, 90, 20);
		add(l_hpText);
		
		l_spText = new JLabel("SP");
		l_spText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_spText.setBounds(10, 85, 90, 20);
		add(l_spText);
		
		l_attackText = new JLabel("ATTACK");
		l_attackText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_attackText.setBounds(10, 105, 90, 20);
		add(l_attackText);
		
		l_defenseText = new JLabel("DEFENSE");
		l_defenseText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_defenseText.setBounds(10, 125, 90, 20);
		add(l_defenseText);
		
		l_powerText = new JLabel("POWER");
		l_powerText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_powerText.setBounds(10, 145, 90, 20);
		add(l_powerText);
		
		l_speedText = new JLabel("SPEED");
		l_speedText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_speedText.setBounds(10, 165, 90, 20);
		add(l_speedText);
		
		l_criticalText = new JLabel("CRITICAL");
		l_criticalText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_criticalText.setBounds(10, 185, 90, 20);
		add(l_criticalText);
		
		l_baseHP = new JLabel("0");
		l_baseHP.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseHP.setBounds(144, 65, 65, 20);
		add(l_baseHP);
		
		l_baseSP = new JLabel("0");
		l_baseSP.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseSP.setBounds(144, 85, 65, 20);
		add(l_baseSP);
		
		l_baseAttack = new JLabel("0");
		l_baseAttack.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseAttack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseAttack.setBounds(144, 105, 65, 20);
		add(l_baseAttack);
		
		l_baseDefense = new JLabel("0");
		l_baseDefense.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseDefense.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseDefense.setBounds(144, 125, 65, 20);
		add(l_baseDefense);
		
		l_basePower = new JLabel("0");
		l_basePower.setHorizontalAlignment(SwingConstants.CENTER);
		l_basePower.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_basePower.setBounds(144, 145, 65, 20);
		add(l_basePower);
		
		l_baseSpeed = new JLabel("0");
		l_baseSpeed.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseSpeed.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseSpeed.setBounds(144, 165, 65, 20);
		add(l_baseSpeed);
		
		l_baseCritical = new JLabel("0");
		l_baseCritical.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseCritical.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseCritical.setBounds(144, 185, 65, 20);
		add(l_baseCritical);
		
		b_downHP = new JButton("-");
		b_downHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downHP.setBounds(100, 65, 44, 20);
		add(b_downHP);
		
		b_downSP = new JButton("-");
		b_downSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downSP.setBounds(100, 85, 44, 20);
		add(b_downSP);
		
		b_downAttack = new JButton("-");
		b_downAttack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downAttack.setBounds(100, 105, 44, 20);
		add(b_downAttack);
		
		b_downDefense = new JButton("-");
		b_downDefense.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downDefense.setBounds(100, 125, 44, 20);
		add(b_downDefense);
		
		b_downPower = new JButton("-");
		b_downPower.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downPower.setBounds(100, 145, 44, 20);
		add(b_downPower);

		b_downSpeed = new JButton("-");
		b_downSpeed.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downSpeed.setBounds(100, 165, 44, 20);
		add(b_downSpeed);
		
		b_downCritical = new JButton("-");
		b_downCritical.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downCritical.setBounds(100, 185, 44, 20);
		add(b_downCritical);
		
		b_upHP = new JButton("+");
		b_upHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upHP.setBounds(209, 65, 44, 20);
		add(b_upHP);
		
		b_upSP = new JButton("+");
		b_upSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upSP.setBounds(209, 85, 44, 20);
		add(b_upSP);
		
		b_upAttack = new JButton("+");
		b_upAttack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upAttack.setBounds(209, 105, 44, 20);
		add(b_upAttack);
		
		b_upDefense = new JButton("+");
		b_upDefense.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upDefense.setBounds(209, 125, 44, 20);
		add(b_upDefense);
		
		b_upPower = new JButton("+");
		b_upPower.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upPower.setBounds(209, 145, 44, 20);
		add(b_upPower);
		
		b_upSpeed = new JButton("+");
		b_upSpeed.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upSpeed.setBounds(209, 165, 44, 20);
		add(b_upSpeed);
		
		b_upCritical = new JButton("+");
		b_upCritical.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upCritical.setBounds(209, 185, 44, 20);
		add(b_upCritical);
		
		l_addedHP = new JLabel("0");
		l_addedHP.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedHP.setBounds(255, 65, 197, 20);
		add(l_addedHP);
		
		l_addedSP = new JLabel("0");
		l_addedSP.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedSP.setBounds(255, 85, 197, 20);
		add(l_addedSP);
		
		l_addedAttack = new JLabel("0");
		l_addedAttack.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedAttack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedAttack.setBounds(255, 105, 197, 20);
		add(l_addedAttack);
		
		l_addedDefense = new JLabel("0");
		l_addedDefense.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedDefense.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedDefense.setBounds(255, 125, 197, 20);
		add(l_addedDefense);
		
		l_addedPower = new JLabel("0");
		l_addedPower.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedPower.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedPower.setBounds(255, 145, 197, 20);
		add(l_addedPower);
		
		l_addedSpeed = new JLabel("0");
		l_addedSpeed.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedSpeed.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedSpeed.setBounds(255, 165, 197, 20);
		add(l_addedSpeed);
		
		l_addedCritical = new JLabel("0");
		l_addedCritical.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedCritical.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedCritical.setBounds(255, 185, 197, 20);
		add(l_addedCritical);
		
		b_back = new JButton("Back");
		b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_back.setBounds(886, 540, 170, 50);
		add(b_back);
		
		l_totalPointsText = new JLabel("Total Points:");
		l_totalPointsText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_totalPointsText.setBounds(10, 230, 160, 20);
		add(l_totalPointsText);
		
		l_perPriceText = new JLabel("Price per Point: Au");
		l_perPriceText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_perPriceText.setBounds(10, 250, 160, 20);
		add(l_perPriceText);
		
		l_totalPriceText = new JLabel("Upgrade Price: Au");
		l_totalPriceText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_totalPriceText.setBounds(10, 270, 160, 20);
		add(l_totalPriceText);
		
		l_totalPoints = new JLabel("0");
		l_totalPoints.setHorizontalAlignment(SwingConstants.RIGHT);
		l_totalPoints.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_totalPoints.setBounds(192, 230, 65, 20);
		add(l_totalPoints);
				
		l_perPrice = new JLabel("0");
		l_perPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		l_perPrice.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_perPrice.setBounds(192, 250, 65, 20);
		add(l_perPrice);
		
		l_totalPrice = new JLabel("0");
		l_totalPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		l_totalPrice.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_totalPrice.setBounds(192, 270, 65, 20);
		add(l_totalPrice);
		
		b_upgrade = new JButton("Upgrade");
		b_upgrade.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upgrade.setBounds(311, 250, 120, 40);
		add(b_upgrade);
		
		l_information = new JLabel("Selected Item Information");
		l_information.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_information.setBounds(10, 329, 235, 34);
		add(l_information);
		
		l_itemInfo = new JLabel("<html>Item Name<br>Item Description<br>Item Price Per unit</html>");
		l_itemInfo.setVerticalAlignment(SwingConstants.TOP);
		l_itemInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_itemInfo.setBounds(10, 374, 521, 151);
		add(l_itemInfo);
		
		l_quantityText = new JLabel("Quantity");
		l_quantityText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_quantityText.setBounds(10, 549, 90, 20);
		add(l_quantityText);
		
		l_itemPrice = new JLabel("0");
		l_itemPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		l_itemPrice.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_itemPrice.setBounds(341, 549, 111, 20);
		add(l_itemPrice);
		
		l_itemPriceText = new JLabel("Price: Au");
		l_itemPriceText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_itemPriceText.setBounds(255, 549, 76, 20);
		add(l_itemPriceText);
		
		b_buy = new JButton("Buy");
		b_buy.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_buy.setBounds(462, 540, 70, 40);
		add(b_buy);
		
		b_upQuantity = new JButton("+");
		b_upQuantity.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upQuantity.setBounds(209, 549, 44, 20);
		add(b_upQuantity);
		
		l_quantity = new JLabel("0");
		l_quantity.setHorizontalAlignment(SwingConstants.CENTER);
		l_quantity.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_quantity.setBounds(144, 549, 65, 20);
		add(l_quantity);
		
		b_downQuantity = new JButton("-");
		b_downQuantity.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downQuantity.setBounds(100, 549, 44, 20);
		add(b_downQuantity);
		
		b_back.addActionListener(shopHandler);
=======
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
>>>>>>> origin/master
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
