package ui;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ShopUI extends JPanel 
{
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

	private SystemManager systemManager;
	private ShopHandler shopHandler;
	
	public ShopUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		shopHandler = new ShopHandler();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
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
