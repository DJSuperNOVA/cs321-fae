package ui;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShopUI extends JPanel 
{
	private JList<String> jl_items;
	private JLabel l_statsShop, l_itemShop, l_money, l_have, l_hpText, l_spText, l_attackText, l_defenseText,
				l_powerText, l_agilityText, l_criticalText, l_baseHP, l_baseSP, l_baseAttack, l_baseDefense,
				l_basePower, l_baseAgility, l_baseCritical, l_addedHP, l_addedSP, l_addedDefense, l_addedAttack,
				l_addedPower, l_addedCritical, l_addedAgility, l_totalPointsText, l_perPriceText, l_totalPriceText,
				l_totalPrice, l_perPrice, l_totalPoints, l_information, l_itemInfo, l_itemPrice, l_itemPriceText,
				l_quantityText, l_quantity, l_bg;
	private JButton b_downHP, b_downAttack, b_downDefense, b_downPower, b_downSP, b_downAgility, b_downCritical,
				b_upSP, b_upHP, b_upAttack, b_upDefense, b_upPower, b_upCritical, b_upAgility, b_back, b_upgrade,
				b_buy, b_upQuantity, b_downQuantity;
	
	private final int YESNO = JOptionPane.YES_NO_OPTION;
	private final int YES = JOptionPane.YES_OPTION;
	private final int NO = JOptionPane.NO_OPTION;

	private Integer money, totalPoints, totalPrice, quantity;
	private String selectedItem;
	
	private SystemManager systemManager;
	private ShopHandler shopHandler;
	
	public ShopUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		shopHandler = new ShopHandler();
		
		money = 99999;
		totalPoints = 0;
		totalPrice = 0;
		quantity = 0;
		selectedItem = "";
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		l_statsShop = new JLabel("Stats Shop");
		l_statsShop.setForeground(Color.WHITE);
		l_statsShop.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_statsShop.setBounds(10, 11, 90, 34);
		add(l_statsShop);
		
		l_itemShop = new JLabel("Item Shop");
		l_itemShop.setForeground(Color.WHITE);
		l_itemShop.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_itemShop.setBounds(541, 11, 90, 34);
		add(l_itemShop);
		
		l_money = new JLabel("<html>Money:<br>Au " + money + " </html>");
		l_money.setForeground(Color.WHITE);
		l_money.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_money.setBounds(541, 56, 253, 49);
		add(l_money);
		
		l_have = new JLabel("<html>In Inventory:<br>-</html>");
		l_have.setForeground(Color.WHITE);
		l_have.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_have.setBounds(804, 56, 252, 49);
		add(l_have);
		
		l_itemInfo = new JLabel("<html>Item Name:<br>Item Description:<br>Item Price Per unit:</html>");
		l_itemInfo.setForeground(Color.WHITE);
		l_itemInfo.setVerticalAlignment(SwingConstants.TOP);
		l_itemInfo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_itemInfo.setBounds(10, 374, 521, 151);
		add(l_itemInfo);
		
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel.addElement("HP Potion");
		listModel.addElement("SP Potion");
		
		jl_items = new JList<String>(listModel);
		jl_items.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				if(e.getClickCount() == 1) 
				{
			           selectedItem = jl_items.getSelectedValue();
			           quantity = 10;

						l_itemInfo.setText("<html>Item Name: " + selectedItem + " <br>"
								+ "Item Description: Restores HP by 50"
								+ "<br>Item Price Per unit: Au 10</html>");
						l_have.setText("<html>In Inventory:<br> " + quantity + " </html>");
						
				}
				else if(e.getClickCount() == 2)
				{
					selectedItem = "";
					quantity = 0;
					l_have.setText("<html>In Inventory:<br>-</html>");
					l_itemInfo.setText("<html>Item Name:<br>Item Description:<br>Item Price Per unit:</html>");
					jl_items.removeSelectionInterval(jl_items.getSelectedIndices()[0], jl_items.getSelectedIndices()[0]);
				}
			}
		});
		jl_items.setSelectionBackground(Color.DARK_GRAY);
		jl_items.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//		jl_items.setSelectionModel(new DefaultListSelectionModel()
//		{
//
//			boolean gestureStarted = false;
//
//			@Override
//			public void setSelectionInterval(int index0, int index1) 
//			{
//				if(!gestureStarted)
//					if (isSelectedIndex(index0)) 
//					{
//						
//						super.removeSelectionInterval(index0, index1);
//					}
//					else 
//					{
//						
//						super.addSelectionInterval(index0, index1);
//					}
//				gestureStarted = true;
//			}
//
//			@Override
//			public void setValueIsAdjusting(boolean isAdjusting) 
//			{
//				if (isAdjusting == false) 
//					gestureStarted = false;
//			}
//
//		});
		jl_items.setOpaque(false);
		jl_items.setCellRenderer(new TransparentListCellRenderer());
		jl_items.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		jl_items.setBounds(541, 116, 515, 413);
		add(jl_items);
		
		l_hpText = new JLabel("HP");
		l_hpText.setForeground(Color.WHITE);
		l_hpText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_hpText.setBounds(10, 65, 90, 20);
		add(l_hpText);
		
		l_spText = new JLabel("SP");
		l_spText.setForeground(Color.WHITE);
		l_spText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_spText.setBounds(10, 85, 90, 20);
		add(l_spText);
		
		l_attackText = new JLabel("ATTACK");
		l_attackText.setForeground(Color.WHITE);
		l_attackText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_attackText.setBounds(10, 105, 90, 20);
		add(l_attackText);
		
		l_defenseText = new JLabel("DEFENSE");
		l_defenseText.setForeground(Color.WHITE);
		l_defenseText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_defenseText.setBounds(10, 125, 90, 20);
		add(l_defenseText);
		
		l_powerText = new JLabel("SPECIAL");
		l_powerText.setForeground(Color.WHITE);
		l_powerText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_powerText.setBounds(10, 145, 90, 20);
		add(l_powerText);
		
		l_agilityText = new JLabel("AGILITY");
		l_agilityText.setForeground(Color.WHITE);
		l_agilityText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_agilityText.setBounds(10, 165, 90, 20);
		add(l_agilityText);
		
		l_criticalText = new JLabel("CRITICAL");
		l_criticalText.setForeground(Color.WHITE);
		l_criticalText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_criticalText.setBounds(10, 185, 90, 20);
		add(l_criticalText);
		
		l_baseHP = new JLabel("0");
		l_baseHP.setForeground(Color.WHITE);
		l_baseHP.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseHP.setBounds(144, 65, 65, 20);
		add(l_baseHP);
		
		l_baseSP = new JLabel("0");
		l_baseSP.setForeground(Color.WHITE);
		l_baseSP.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseSP.setBounds(144, 85, 65, 20);
		add(l_baseSP);
		
		l_baseAttack = new JLabel("0");
		l_baseAttack.setForeground(Color.WHITE);
		l_baseAttack.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseAttack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseAttack.setBounds(144, 105, 65, 20);
		add(l_baseAttack);
		
		l_baseDefense = new JLabel("0");
		l_baseDefense.setForeground(Color.WHITE);
		l_baseDefense.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseDefense.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseDefense.setBounds(144, 125, 65, 20);
		add(l_baseDefense);
		
		l_basePower = new JLabel("0");
		l_basePower.setForeground(Color.WHITE);
		l_basePower.setHorizontalAlignment(SwingConstants.CENTER);
		l_basePower.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_basePower.setBounds(144, 145, 65, 20);
		add(l_basePower);
		
		l_baseAgility = new JLabel("0");
		l_baseAgility.setForeground(Color.WHITE);
		l_baseAgility.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseAgility.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseAgility.setBounds(144, 165, 65, 20);
		add(l_baseAgility);
		
		l_baseCritical = new JLabel("0");
		l_baseCritical.setForeground(Color.WHITE);
		l_baseCritical.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseCritical.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_baseCritical.setBounds(144, 185, 65, 20);
		add(l_baseCritical);
		
		b_downHP = new JButton("-");
		b_downHP.setContentAreaFilled(false);
		b_downHP.setFocusPainted(false);
		b_downHP.setOpaque(false);
		b_downHP.setForeground(Color.WHITE);
		b_downHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downHP.setBounds(100, 65, 44, 20);
		add(b_downHP);
		
		b_downSP = new JButton("-");
		b_downSP.setContentAreaFilled(false);
		b_downSP.setFocusPainted(false);
		b_downSP.setOpaque(false);
		b_downSP.setForeground(Color.WHITE);
		b_downSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downSP.setBounds(100, 85, 44, 20);
		add(b_downSP);
		
		b_downAttack = new JButton("-");
		b_downAttack.setContentAreaFilled(false);
		b_downAttack.setFocusPainted(false);
		b_downAttack.setOpaque(false);
		b_downAttack.setForeground(Color.WHITE);
		b_downAttack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downAttack.setBounds(100, 105, 44, 20);
		add(b_downAttack);
		
		b_downDefense = new JButton("-");
		b_downDefense.setContentAreaFilled(false);
		b_downDefense.setFocusPainted(false);
		b_downDefense.setOpaque(false);
		b_downDefense.setForeground(Color.WHITE);
		b_downDefense.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downDefense.setBounds(100, 125, 44, 20);
		add(b_downDefense);
		
		b_downPower = new JButton("-");
		b_downPower.setContentAreaFilled(false);
		b_downPower.setFocusPainted(false);
		b_downPower.setOpaque(false);
		b_downPower.setForeground(Color.WHITE);
		b_downPower.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downPower.setBounds(100, 145, 44, 20);
		add(b_downPower);

		b_downAgility = new JButton("-");
		b_downAgility.setContentAreaFilled(false);
		b_downAgility.setFocusPainted(false);
		b_downAgility.setOpaque(false);
		b_downAgility.setForeground(Color.WHITE);
		b_downAgility.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downAgility.setBounds(100, 165, 44, 20);
		add(b_downAgility);
		
		b_downCritical = new JButton("-");
		b_downCritical.setContentAreaFilled(false);
		b_downCritical.setFocusPainted(false);
		b_downCritical.setOpaque(false);
		b_downCritical.setForeground(Color.WHITE);
		b_downCritical.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downCritical.setBounds(100, 185, 44, 20);
		add(b_downCritical);
		
		b_upHP = new JButton("+");
		b_upHP.setContentAreaFilled(false);
		b_upHP.setFocusPainted(false);
		b_upHP.setOpaque(false);
		b_upHP.setForeground(Color.WHITE);
		b_upHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upHP.setBounds(209, 65, 44, 20);
		add(b_upHP);
		
		b_upSP = new JButton("+");
		b_upSP.setContentAreaFilled(false);
		b_upSP.setFocusPainted(false);
		b_upSP.setOpaque(false);
		b_upSP.setForeground(Color.WHITE);
		b_upSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upSP.setBounds(209, 85, 44, 20);
		add(b_upSP);
		
		b_upAttack = new JButton("+");
		b_upAttack.setContentAreaFilled(false);
		b_upAttack.setFocusPainted(false);
		b_upAttack.setOpaque(false);
		b_upAttack.setForeground(Color.WHITE);
		b_upAttack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upAttack.setBounds(209, 105, 44, 20);
		add(b_upAttack);
		
		b_upDefense = new JButton("+");
		b_upDefense.setContentAreaFilled(false);
		b_upDefense.setFocusPainted(false);
		b_upDefense.setOpaque(false);
		b_upDefense.setForeground(Color.WHITE);
		b_upDefense.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upDefense.setBounds(209, 125, 44, 20);
		add(b_upDefense);
		
		b_upPower = new JButton("+");
		b_upPower.setContentAreaFilled(false);
		b_upPower.setFocusPainted(false);
		b_upPower.setOpaque(false);
		b_upPower.setForeground(Color.WHITE);
		b_upPower.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upPower.setBounds(209, 145, 44, 20);
		add(b_upPower);
		
		b_upAgility = new JButton("+");
		b_upAgility.setContentAreaFilled(false);
		b_upAgility.setFocusPainted(false);
		b_upAgility.setOpaque(false);
		b_upAgility.setForeground(Color.WHITE);
		b_upAgility.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upAgility.setBounds(209, 165, 44, 20);
		add(b_upAgility);
		
		b_upCritical = new JButton("+");
		b_upCritical.setContentAreaFilled(false);
		b_upCritical.setFocusPainted(false);
		b_upCritical.setOpaque(false);
		b_upCritical.setForeground(Color.WHITE);
		b_upCritical.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upCritical.setBounds(209, 185, 44, 20);
		add(b_upCritical);
		
		l_addedHP = new JLabel("0");
		l_addedHP.setForeground(Color.WHITE);
		l_addedHP.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedHP.setBounds(255, 65, 197, 20);
		add(l_addedHP);
		
		l_addedSP = new JLabel("0");
		l_addedSP.setForeground(Color.WHITE);
		l_addedSP.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedSP.setBounds(255, 85, 197, 20);
		add(l_addedSP);
		
		l_addedAttack = new JLabel("0");
		l_addedAttack.setForeground(Color.WHITE);
		l_addedAttack.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedAttack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedAttack.setBounds(255, 105, 197, 20);
		add(l_addedAttack);
		
		l_addedDefense = new JLabel("0");
		l_addedDefense.setForeground(Color.WHITE);
		l_addedDefense.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedDefense.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedDefense.setBounds(255, 125, 197, 20);
		add(l_addedDefense);
		
		l_addedPower = new JLabel("0");
		l_addedPower.setForeground(Color.WHITE);
		l_addedPower.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedPower.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedPower.setBounds(255, 145, 197, 20);
		add(l_addedPower);
		
		l_addedAgility = new JLabel("0");
		l_addedAgility.setForeground(Color.WHITE);
		l_addedAgility.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedAgility.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedAgility.setBounds(255, 165, 197, 20);
		add(l_addedAgility);
		
		l_addedCritical = new JLabel("0");
		l_addedCritical.setForeground(Color.WHITE);
		l_addedCritical.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedCritical.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_addedCritical.setBounds(255, 185, 197, 20);
		add(l_addedCritical);
		
		b_back = new JButton("Back");
		b_back.setContentAreaFilled(false);
		b_back.setFocusPainted(false);
		b_back.setOpaque(false);
		b_back.setForeground(Color.WHITE);
		b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_back.setBounds(886, 540, 170, 50);
		add(b_back);
		
		l_totalPointsText = new JLabel("Total Points:");
		l_totalPointsText.setForeground(Color.WHITE);
		l_totalPointsText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_totalPointsText.setBounds(10, 230, 160, 20);
		add(l_totalPointsText);
		
		l_perPriceText = new JLabel("Price per Point: Au");
		l_perPriceText.setForeground(Color.WHITE);
		l_perPriceText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_perPriceText.setBounds(10, 250, 160, 20);
		add(l_perPriceText);
		
		l_totalPriceText = new JLabel("Upgrade Price: Au");
		l_totalPriceText.setForeground(Color.WHITE);
		l_totalPriceText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_totalPriceText.setBounds(10, 270, 160, 20);
		add(l_totalPriceText);
		
		l_totalPoints = new JLabel("0");
		l_totalPoints.setForeground(Color.WHITE);
		l_totalPoints.setHorizontalAlignment(SwingConstants.RIGHT);
		l_totalPoints.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_totalPoints.setBounds(192, 230, 65, 20);
		add(l_totalPoints);
				
		l_perPrice = new JLabel("100");
		l_perPrice.setForeground(Color.WHITE);
		l_perPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		l_perPrice.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_perPrice.setBounds(192, 250, 65, 20);
		add(l_perPrice);
		
		l_totalPrice = new JLabel("0");
		l_totalPrice.setForeground(Color.WHITE);
		l_totalPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		l_totalPrice.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_totalPrice.setBounds(192, 270, 65, 20);
		add(l_totalPrice);
		
		b_upgrade = new JButton("Upgrade");
		b_upgrade.setContentAreaFilled(false);
		b_upgrade.setFocusPainted(false);
		b_upgrade.setOpaque(false);
		b_upgrade.setForeground(Color.WHITE);
		b_upgrade.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upgrade.setBounds(311, 250, 120, 40);
		add(b_upgrade);
		
		l_information = new JLabel("Selected Item Information");
		l_information.setForeground(Color.WHITE);
		l_information.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_information.setBounds(10, 329, 235, 34);
		add(l_information);
		
		l_quantityText = new JLabel("Quantity");
		l_quantityText.setForeground(Color.WHITE);
		l_quantityText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_quantityText.setBounds(10, 549, 90, 20);
		add(l_quantityText);
		
		l_itemPrice = new JLabel("0");
		l_itemPrice.setForeground(Color.WHITE);
		l_itemPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		l_itemPrice.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_itemPrice.setBounds(341, 549, 111, 20);
		add(l_itemPrice);
		
		l_itemPriceText = new JLabel("Price: Au");
		l_itemPriceText.setForeground(Color.WHITE);
		l_itemPriceText.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_itemPriceText.setBounds(255, 549, 76, 20);
		add(l_itemPriceText);
		
		b_buy = new JButton("Buy");
		b_buy.setContentAreaFilled(false);
		b_buy.setFocusPainted(false);
		b_buy.setOpaque(false);
		b_buy.setForeground(Color.WHITE);
		b_buy.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_buy.setBounds(462, 540, 70, 40);
		add(b_buy);
		
		b_upQuantity = new JButton("+");
		b_upQuantity.setContentAreaFilled(false);
		b_upQuantity.setFocusPainted(false);
		b_upQuantity.setOpaque(false);
		b_upQuantity.setForeground(Color.WHITE);
		b_upQuantity.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_upQuantity.setBounds(209, 549, 44, 20);
		add(b_upQuantity);
		
		l_quantity = new JLabel("0");
		l_quantity.setForeground(Color.WHITE);
		l_quantity.setHorizontalAlignment(SwingConstants.CENTER);
		l_quantity.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_quantity.setBounds(144, 549, 65, 20);
		add(l_quantity);
		
		b_downQuantity = new JButton("-");
		b_downQuantity.setContentAreaFilled(false);
		b_downQuantity.setFocusPainted(false);
		b_downQuantity.setOpaque(false);
		b_downQuantity.setForeground(Color.WHITE);
		b_downQuantity.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_downQuantity.setBounds(100, 549, 44, 20);
		add(b_downQuantity);
		
		l_bg = new JLabel();
		l_bg.setIcon(new ImageIcon("../cs321-fae/src/graphics/Common_BG.png"));
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		checkStats();
		
		b_back.addActionListener(shopHandler);
		b_upHP.addActionListener(shopHandler);
		b_downHP.addActionListener(shopHandler);
		b_upSP.addActionListener(shopHandler);
		b_downSP.addActionListener(shopHandler);
		b_upAttack.addActionListener(shopHandler);
		b_downAttack.addActionListener(shopHandler);
		b_upDefense.addActionListener(shopHandler);
		b_downDefense.addActionListener(shopHandler);
		b_upPower.addActionListener(shopHandler);
		b_downPower.addActionListener(shopHandler);
		b_upAgility.addActionListener(shopHandler);
		b_downAgility.addActionListener(shopHandler);
		b_upCritical.addActionListener(shopHandler);
		b_downCritical.addActionListener(shopHandler);
		b_upgrade.addActionListener(shopHandler);
	}
	
	private class ShopHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			Integer reply;
			
			if(action.equals("Back"))
				systemManager.showNavigationUI();
			else if(e.getSource() == b_upHP)
			{
				l_baseHP.setText(Integer.parseInt(l_baseHP.getText()) + 1 + "");
				l_addedHP.setText(Integer.parseInt(l_addedHP.getText()) + 1 + "");
			}
			else if(e.getSource() == b_downHP)
			{
				if(!l_baseHP.getText().equals("0"))
				{
					l_baseHP.setText(Integer.parseInt(l_baseHP.getText()) - 1 + "");
					l_addedHP.setText(Integer.parseInt(l_addedHP.getText()) - 1 + "");
				}
			}
			else if(e.getSource() == b_upSP)
			{
				l_baseSP.setText(Integer.parseInt(l_baseSP.getText()) + 1 + "");
				l_addedSP.setText(Integer.parseInt(l_addedSP.getText()) + 1 + "");
			}
			else if(e.getSource() == b_downSP)
			{
				if(!l_baseSP.getText().equals("0"))
				{
					l_baseSP.setText(Integer.parseInt(l_baseSP.getText()) - 1 + "");
					l_addedSP.setText(Integer.parseInt(l_addedSP.getText()) - 1 + "");
				}
			}
			else if(e.getSource() == b_upAttack)
			{
				l_baseAttack.setText(Integer.parseInt(l_baseAttack.getText()) + 1 + "");
				l_addedAttack.setText(Integer.parseInt(l_addedAttack.getText()) + 1 + "");
			}
			else if(e.getSource() == b_downAttack)
			{
				if(!l_baseAttack.getText().equals("0"))
				{
					l_baseAttack.setText(Integer.parseInt(l_baseAttack.getText()) - 1 + "");
					l_addedAttack.setText(Integer.parseInt(l_addedAttack.getText()) - 1 + "");
				}
			}
			else if(e.getSource() == b_upDefense)
			{
				l_baseDefense.setText(Integer.parseInt(l_baseDefense.getText()) + 1 + "");
				l_addedDefense.setText(Integer.parseInt(l_addedDefense.getText()) + 1 + "");
			}
			else if(e.getSource() == b_downDefense)
			{
				if(!l_baseDefense.getText().equals("0"))
				{
					l_baseDefense.setText(Integer.parseInt(l_baseDefense.getText()) - 1 + "");
					l_addedDefense.setText(Integer.parseInt(l_addedDefense.getText()) - 1 + "");
				}
			}
			else if(e.getSource() == b_upPower)
			{
				l_basePower.setText(Integer.parseInt(l_basePower.getText()) + 1 + "");
				l_addedPower.setText(Integer.parseInt(l_addedPower.getText()) + 1 + "");
			}
			else if(e.getSource() == b_downPower)
			{
				if(!l_basePower.getText().equals("0"))
				{
					l_basePower.setText(Integer.parseInt(l_basePower.getText()) - 1 + "");
					l_addedPower.setText(Integer.parseInt(l_addedPower.getText()) - 1 + "");
				}
			}
			else if(e.getSource() == b_upAgility)
			{
				l_baseAgility.setText(Integer.parseInt(l_baseAgility.getText()) + 1 + "");
				l_addedAgility.setText(Integer.parseInt(l_addedAgility.getText()) + 1 + "");
			}
			else if(e.getSource() == b_downAgility)
			{
				if(!l_baseAgility.getText().equals("0"))
				{
					l_baseAgility.setText(Integer.parseInt(l_baseAgility.getText()) - 1 + "");
					l_addedAgility.setText(Integer.parseInt(l_addedAgility.getText()) - 1 + "");
				}
			}
			else if(e.getSource() == b_upCritical)
			{
				l_baseCritical.setText(Integer.parseInt(l_baseCritical.getText()) + 1 + "");
				l_addedCritical.setText(Integer.parseInt(l_addedCritical.getText()) + 1 + "");
			}
			else if(e.getSource() == b_downCritical)
			{
				if(!l_baseCritical.getText().equals("0"))
				{
					l_baseCritical.setText(Integer.parseInt(l_baseCritical.getText()) - 1 + "");
					l_addedCritical.setText(Integer.parseInt(l_addedCritical.getText()) - 1 + "");
				}
			}
			else if(action.equals("Upgrade"))
			{
				if(!(money < totalPrice))
				{
					reply = JOptionPane.showConfirmDialog(null, "Changes are permanent. Continue?", "Confirm", YESNO);
					if(reply == YES)
					{
						money = money - totalPrice;
						l_money.setText("<html>Money:<br>Au " + money + " </html>");
						resetAfterUpgrade();
					}
				}
				else
					JOptionPane.showMessageDialog(null, "Not enough gold.");
			}
			
			totalPoints = Integer.parseInt(l_addedHP.getText()) + Integer.parseInt(l_addedSP.getText()) +
					Integer.parseInt(l_addedAttack.getText()) + Integer.parseInt(l_addedDefense.getText()) +
					Integer.parseInt(l_addedPower.getText()) + Integer.parseInt(l_addedAgility.getText()) +
					Integer.parseInt(l_addedCritical.getText());
			totalPrice = totalPoints * 100;
			
			l_totalPoints.setText(totalPoints.toString());
			l_totalPrice.setText(totalPrice.toString());
			
			checkStats();
			
			repaint();
		}
	}
	
	public void checkStats()
	{
		if(totalPoints != 0)
			b_upgrade.setEnabled(true);
		else
			b_upgrade.setEnabled(false);
		
		if(!l_addedHP.getText().equals("0"))
			b_downHP.setEnabled(true);
		else
			b_downHP.setEnabled(false);
		
		if(!l_baseHP.getText().equals("999"))
			b_upHP.setEnabled(true);
		else
			b_upHP.setEnabled(false);
		
		if(!l_addedSP.getText().equals("0"))
			b_downSP.setEnabled(true);
		else
			b_downSP.setEnabled(false);
		
		if(!l_baseSP.getText().equals("999"))
			b_upSP.setEnabled(true);
		else
			b_upSP.setEnabled(false);
		
		if(!l_addedAttack.getText().equals("0"))
			b_downAttack.setEnabled(true);
		else
			b_downAttack.setEnabled(false);
		
		if(!l_baseAttack.getText().equals("999"))
			b_upAttack.setEnabled(true);
		else
			b_upAttack.setEnabled(false);
		
		if(!l_addedDefense.getText().equals("0"))
			b_downDefense.setEnabled(true);
		else
			b_downDefense.setEnabled(false);
		
		if(!l_baseDefense.getText().equals("999"))
			b_upDefense.setEnabled(true);
		else
			b_upDefense.setEnabled(false);
		
		if(!l_addedPower.getText().equals("0"))
			b_downPower.setEnabled(true);
		else
			b_downPower.setEnabled(false);
		
		if(!l_basePower.getText().equals("999"))
			b_upPower.setEnabled(true);
		else
			b_upPower.setEnabled(false);
		
		if(!l_addedAgility.getText().equals("0"))
			b_downAgility.setEnabled(true);
		else
			b_downAgility.setEnabled(false);
		
		if(!l_baseAgility.getText().equals("999"))
			b_upAgility.setEnabled(true);
		else
			b_upAgility.setEnabled(false);
		
		if(!l_addedCritical.getText().equals("0"))
			b_downCritical.setEnabled(true);
		else
			b_downCritical.setEnabled(false);
		
		if(!l_baseCritical.getText().equals("999"))
			b_upCritical.setEnabled(true);
		else
			b_upCritical.setEnabled(false);
	}
	
	public void resetAfterUpgrade()
	{
		l_addedHP.setText("0");
		l_addedSP.setText("0");
		l_addedAttack.setText("0");
		l_addedDefense.setText("0");
		l_addedPower.setText("0");
		l_addedAgility.setText("0");
		l_addedCritical.setText("0");
		l_totalPoints.setText("0");
		l_totalPrice.setText("0");
	}
	
	private class TransparentListCellRenderer extends DefaultListCellRenderer 
	{
		Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
		Border emptyBorder = BorderFactory.createEmptyBorder(2, 2, 2, 2);

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index
				, boolean isSelected, boolean cellHasFocus) 
		{
			super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
			setForeground(Color.WHITE);
			setOpaque(isSelected);
			setBorder(cellHasFocus ? lineBorder : emptyBorder);
			return this;
        }


    }

}
