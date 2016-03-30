package ui;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import domain.GameItem;
import managers.SystemManager;
import managers.ImageManager;
import managers.StatsManager;

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
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.border.LineBorder;

public class ShopUI extends JPanel
{
	private JList<String> jl_items;
	private JLabel l_statsShop, l_itemShop, l_money, l_have, l_hpText, l_spText, l_attackText, l_defenseText,
				l_powerText, l_agilityText, l_criticalText, l_baseHP, l_baseSP, l_baseAttack, l_baseDefense,
				l_baseSpecial, l_baseAgility, l_baseCritical, l_addedHP, l_addedSP, l_addedDefense, l_addedAttack,
				l_addedSpecial, l_addedCritical, l_addedAgility, l_totalPointsText, l_perPriceText, l_totalPriceText,
				l_totalPrice, l_totalPoints, l_itemInfo, l_itemPrice, l_itemPriceText,
				l_quantityText, l_quantity, l_bg;
	private JButton b_downHP, b_downAttack, b_downDefense, b_downSpecial, b_downSP, b_downAgility, b_downCritical,
				b_upSP, b_upHP, b_upAttack, b_upDefense, b_upSpecial, b_upCritical, b_upAgility, b_back, b_upgrade,
				b_purchase, b_upQuantity, b_downQuantity;
	
	private final int YESNO = JOptionPane.YES_NO_OPTION;
	private final int YES = JOptionPane.YES_OPTION;
	private final int NO = JOptionPane.NO_OPTION;

	private Integer totalPoints, totalPrice, totalItemPrice, quantityToBuy, quantity, itemPrice;
	private String selectedItem;
	private boolean isSelected;
	
	private SystemManager systemManager;
	private ImageManager imageManager;
	private ShopHandler shopHandler;
	private MouseHandler mouseHandler;
	private StatsManager statsManager;
	private ArrayList<GameItem> shopGameItem, playerGameItem;
	
	private DecimalFormat d0 = new DecimalFormat("####");

	public ShopUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		shopHandler = new ShopHandler();
		imageManager = new ImageManager();
		statsManager = systemManager.getStatsManager();
		
		totalPoints = 0;
		totalPrice = 0;
		itemPrice = 0;
		totalItemPrice = 0;
		quantityToBuy = 0;
		quantity = 0;
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		l_statsShop = new JLabel("Stats Shop");
		l_statsShop.setForeground(Color.WHITE);
		l_statsShop.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_statsShop.setBounds(10, 368, 90, 26);
		add(l_statsShop);
		
		l_itemShop = new JLabel("Item Shop");
		l_itemShop.setForeground(Color.WHITE);
		l_itemShop.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_itemShop.setBounds(10, 11, 90, 34);
		add(l_itemShop);
		
		l_money = new JLabel();
		l_money.setForeground(Color.WHITE);
		l_money.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_money.setBounds(834, 56, 197, 34);
		add(l_money);
		
		l_have = new JLabel();
		l_have.setForeground(Color.WHITE);
		l_have.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_have.setBounds(431, 128, 170, 49);
		add(l_have);
		
		l_itemInfo = new JLabel();
		l_itemInfo.setForeground(Color.WHITE);
		l_itemInfo.setVerticalAlignment(SwingConstants.TOP);
		l_itemInfo.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_itemInfo.setBounds(431, 216, 388, 121);
		add(l_itemInfo);
		
		jl_items = new JList<String>();
		jl_items.setBorder(new LineBorder(Color.CYAN, 1, true));
		jl_items.setOpaque(false);
		jl_items.setDragEnabled(true);
		jl_items.setSelectionBackground(Color.DARK_GRAY);
		jl_items.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		jl_items.setCellRenderer(new TransparentListCellRenderer());
		jl_items.setFont(new Font("Nyala", Font.PLAIN, 20));
		jl_items.setBounds(10, 56, 402, 281);
		add(jl_items);

		l_hpText = new JLabel("HP");
		l_hpText.setForeground(Color.WHITE);
		l_hpText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_hpText.setBounds(20, 395, 90, 30);
		add(l_hpText);
		
		l_spText = new JLabel("SP");
		l_spText.setForeground(Color.WHITE);
		l_spText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_spText.setBounds(20, 430, 90, 30);
		add(l_spText);
		
		l_attackText = new JLabel("ATTACK");
		l_attackText.setForeground(Color.WHITE);
		l_attackText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_attackText.setBounds(20, 465, 90, 30);
		add(l_attackText);
		
		l_defenseText = new JLabel("DEFENSE");
		l_defenseText.setForeground(Color.WHITE);
		l_defenseText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_defenseText.setBounds(20, 500, 90, 30);
		add(l_defenseText);
		
		l_powerText = new JLabel("SPECIAL");
		l_powerText.setForeground(Color.WHITE);
		l_powerText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_powerText.setBounds(423, 395, 90, 30);
		add(l_powerText);
		
		l_agilityText = new JLabel("AGILITY");
		l_agilityText.setForeground(Color.WHITE);
		l_agilityText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_agilityText.setBounds(423, 430, 90, 30);
		add(l_agilityText);
		
		l_criticalText = new JLabel("CRITICAL");
		l_criticalText.setForeground(Color.WHITE);
		l_criticalText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_criticalText.setBounds(423, 465, 90, 30);
		add(l_criticalText);
		
		l_baseHP = new JLabel("0");
		l_baseHP.setForeground(Color.WHITE);
		l_baseHP.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseHP.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_baseHP.setBounds(154, 395, 65, 30);
		add(l_baseHP);
		
		l_baseSP = new JLabel("0");
		l_baseSP.setForeground(Color.WHITE);
		l_baseSP.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseSP.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_baseSP.setBounds(154, 430, 65, 30);
		add(l_baseSP);
		
		l_baseAttack = new JLabel("0");
		l_baseAttack.setForeground(Color.WHITE);
		l_baseAttack.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseAttack.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_baseAttack.setBounds(154, 465, 65, 30);
		add(l_baseAttack);
		
		l_baseDefense = new JLabel("0");
		l_baseDefense.setForeground(Color.WHITE);
		l_baseDefense.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseDefense.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_baseDefense.setBounds(154, 500, 65, 30);
		add(l_baseDefense);
		
		l_baseSpecial = new JLabel("0");
		l_baseSpecial.setForeground(Color.WHITE);
		l_baseSpecial.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseSpecial.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_baseSpecial.setBounds(557, 395, 65, 30);
		add(l_baseSpecial);
		
		l_baseAgility = new JLabel("0");
		l_baseAgility.setForeground(Color.WHITE);
		l_baseAgility.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseAgility.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_baseAgility.setBounds(557, 430, 65, 30);
		add(l_baseAgility);
		
		l_baseCritical = new JLabel("0");
		l_baseCritical.setForeground(Color.WHITE);
		l_baseCritical.setHorizontalAlignment(SwingConstants.CENTER);
		l_baseCritical.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_baseCritical.setBounds(557, 465, 65, 30);
		add(l_baseCritical);
		
		b_downHP = new JButton();
		b_downHP.setIcon(imageManager.getShopGraphic("Minus"));
		b_downHP.setRolloverIcon(imageManager.getShopGraphic("Minus_Hover"));
		b_downHP.setDisabledIcon(imageManager.getShopGraphic("Minus_Disabled"));
		b_downHP.setBorder(null);
		b_downHP.setContentAreaFilled(false);
		b_downHP.setFocusPainted(false);
		b_downHP.setOpaque(false);
		b_downHP.setForeground(Color.WHITE);
		b_downHP.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_downHP.setBounds(110, 395, 44, 30);
		add(b_downHP);
		
		b_downSP = new JButton();
		b_downSP.setIcon(imageManager.getShopGraphic("Minus"));
		b_downSP.setRolloverIcon(imageManager.getShopGraphic("Minus_Hover"));
		b_downSP.setDisabledIcon(imageManager.getShopGraphic("Minus_Disabled"));
		b_downSP.setBorder(null);
		b_downSP.setContentAreaFilled(false);
		b_downSP.setFocusPainted(false);
		b_downSP.setOpaque(false);
		b_downSP.setForeground(Color.WHITE);
		b_downSP.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_downSP.setBounds(110, 430, 44, 30);
		add(b_downSP);
		
		b_downAttack = new JButton();
		b_downAttack.setIcon(imageManager.getShopGraphic("Minus"));
		b_downAttack.setRolloverIcon(imageManager.getShopGraphic("Minus_Hover"));
		b_downAttack.setDisabledIcon(imageManager.getShopGraphic("Minus_Disabled"));
		b_downAttack.setBorder(null);
		b_downAttack.setContentAreaFilled(false);
		b_downAttack.setFocusPainted(false);
		b_downAttack.setOpaque(false);
		b_downAttack.setForeground(Color.WHITE);
		b_downAttack.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_downAttack.setBounds(110, 465, 44, 30);
		add(b_downAttack);
		
		b_downDefense = new JButton();
		b_downDefense.setIcon(imageManager.getShopGraphic("Minus"));
		b_downDefense.setRolloverIcon(imageManager.getShopGraphic("Minus_Hover"));
		b_downDefense.setDisabledIcon(imageManager.getShopGraphic("Minus_Disabled"));
		b_downDefense.setBorder(null);
		b_downDefense.setContentAreaFilled(false);
		b_downDefense.setFocusPainted(false);
		b_downDefense.setOpaque(false);
		b_downDefense.setForeground(Color.WHITE);
		b_downDefense.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_downDefense.setBounds(110, 500, 44, 30);
		add(b_downDefense);
		
		b_downSpecial = new JButton();
		b_downSpecial.setIcon(imageManager.getShopGraphic("Minus"));
		b_downSpecial.setRolloverIcon(imageManager.getShopGraphic("Minus_Hover"));
		b_downSpecial.setDisabledIcon(imageManager.getShopGraphic("Minus_Disabled"));
		b_downSpecial.setBorder(null);
		b_downSpecial.setContentAreaFilled(false);
		b_downSpecial.setFocusPainted(false);
		b_downSpecial.setOpaque(false);
		b_downSpecial.setForeground(Color.WHITE);
		b_downSpecial.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_downSpecial.setBounds(513, 395, 44, 30);
		add(b_downSpecial);

		b_downAgility = new JButton();
		b_downAgility.setIcon(imageManager.getShopGraphic("Minus"));
		b_downAgility.setRolloverIcon(imageManager.getShopGraphic("Minus_Hover"));
		b_downAgility.setDisabledIcon(imageManager.getShopGraphic("Minus_Disabled"));
		b_downAgility.setBorder(null);
		b_downAgility.setContentAreaFilled(false);
		b_downAgility.setFocusPainted(false);
		b_downAgility.setOpaque(false);
		b_downAgility.setForeground(Color.WHITE);
		b_downAgility.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_downAgility.setBounds(513, 430, 44, 30);
		add(b_downAgility);
		
		b_downCritical = new JButton();
		b_downCritical.setIcon(imageManager.getShopGraphic("Minus"));
		b_downCritical.setRolloverIcon(imageManager.getShopGraphic("Minus_Hover"));
		b_downCritical.setDisabledIcon(imageManager.getShopGraphic("Minus_Disabled"));
		b_downCritical.setBorder(null);
		b_downCritical.setContentAreaFilled(false);
		b_downCritical.setFocusPainted(false);
		b_downCritical.setOpaque(false);
		b_downCritical.setForeground(Color.WHITE);
		b_downCritical.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_downCritical.setBounds(513, 465, 44, 30);
		add(b_downCritical);
		
		b_upHP = new JButton();
		b_upHP.setIcon(imageManager.getShopGraphic("Plus"));
		b_upHP.setRolloverIcon(imageManager.getShopGraphic("Plus_Hover"));
		b_upHP.setDisabledIcon(imageManager.getShopGraphic("Plus_Disabled"));
		b_upHP.setBorder(null);
		b_upHP.setContentAreaFilled(false);
		b_upHP.setFocusPainted(false);
		b_upHP.setOpaque(false);
		b_upHP.setForeground(Color.WHITE);
		b_upHP.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_upHP.setBounds(219, 395, 44, 30);
		add(b_upHP);
		
		b_upSP = new JButton();
		b_upSP.setIcon(imageManager.getShopGraphic("Plus"));
		b_upSP.setRolloverIcon(imageManager.getShopGraphic("Plus_Hover"));
		b_upSP.setDisabledIcon(imageManager.getShopGraphic("Plus_Disabled"));
		b_upSP.setBorder(null);
		b_upSP.setContentAreaFilled(false);
		b_upSP.setFocusPainted(false);
		b_upSP.setOpaque(false);
		b_upSP.setForeground(Color.WHITE);
		b_upSP.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_upSP.setBounds(219, 430, 44, 30);
		add(b_upSP);
		
		b_upAttack = new JButton();
		b_upAttack.setIcon(imageManager.getShopGraphic("Plus"));
		b_upAttack.setRolloverIcon(imageManager.getShopGraphic("Plus_Hover"));
		b_upAttack.setDisabledIcon(imageManager.getShopGraphic("Plus_Disabled"));
		b_upAttack.setBorder(null);
		b_upAttack.setContentAreaFilled(false);
		b_upAttack.setFocusPainted(false);
		b_upAttack.setOpaque(false);
		b_upAttack.setForeground(Color.WHITE);
		b_upAttack.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_upAttack.setBounds(219, 465, 44, 30);
		add(b_upAttack);
		
		b_upDefense = new JButton();
		b_upDefense.setIcon(imageManager.getShopGraphic("Plus"));
		b_upDefense.setRolloverIcon(imageManager.getShopGraphic("Plus_Hover"));
		b_upDefense.setDisabledIcon(imageManager.getShopGraphic("Plus_Disabled"));
		b_upDefense.setBorder(null);
		b_upDefense.setContentAreaFilled(false);
		b_upDefense.setFocusPainted(false);
		b_upDefense.setOpaque(false);
		b_upDefense.setForeground(Color.WHITE);
		b_upDefense.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_upDefense.setBounds(219, 500, 44, 30);
		add(b_upDefense);
		
		b_upSpecial = new JButton();
		b_upSpecial.setIcon(imageManager.getShopGraphic("Plus"));
		b_upSpecial.setRolloverIcon(imageManager.getShopGraphic("Plus_Hover"));
		b_upSpecial.setDisabledIcon(imageManager.getShopGraphic("Plus_Disabled"));
		b_upSpecial.setBorder(null);
		b_upSpecial.setContentAreaFilled(false);
		b_upSpecial.setFocusPainted(false);
		b_upSpecial.setOpaque(false);
		b_upSpecial.setForeground(Color.WHITE);
		b_upSpecial.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_upSpecial.setBounds(622, 395, 44, 30);
		add(b_upSpecial);
		
		b_upAgility = new JButton();
		b_upAgility.setIcon(imageManager.getShopGraphic("Plus"));
		b_upAgility.setRolloverIcon(imageManager.getShopGraphic("Plus_Hover"));
		b_upAgility.setDisabledIcon(imageManager.getShopGraphic("Plus_Disabled"));
		b_upAgility.setBorder(null);
		b_upAgility.setContentAreaFilled(false);
		b_upAgility.setFocusPainted(false);
		b_upAgility.setOpaque(false);
		b_upAgility.setForeground(Color.WHITE);
		b_upAgility.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_upAgility.setBounds(622, 430, 44, 30);
		add(b_upAgility);
		
		b_upCritical = new JButton();
		b_upCritical.setIcon(imageManager.getShopGraphic("Plus"));
		b_upCritical.setRolloverIcon(imageManager.getShopGraphic("Plus_Hover"));
		b_upCritical.setDisabledIcon(imageManager.getShopGraphic("Plus_Disabled"));
		b_upCritical.setBorder(null);
		b_upCritical.setContentAreaFilled(false);
		b_upCritical.setFocusPainted(false);
		b_upCritical.setOpaque(false);
		b_upCritical.setForeground(Color.WHITE);
		b_upCritical.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_upCritical.setBounds(622, 465, 44, 30);
		add(b_upCritical);
		
		l_addedHP = new JLabel("0");
		l_addedHP.setForeground(Color.WHITE);
		l_addedHP.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedHP.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_addedHP.setBounds(265, 395, 87, 30);
		add(l_addedHP);
		
		l_addedSP = new JLabel("0");
		l_addedSP.setForeground(Color.WHITE);
		l_addedSP.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedSP.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_addedSP.setBounds(265, 430, 87, 30);
		add(l_addedSP);
		
		l_addedAttack = new JLabel("0");
		l_addedAttack.setForeground(Color.WHITE);
		l_addedAttack.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedAttack.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_addedAttack.setBounds(265, 465, 87, 30);
		add(l_addedAttack);
		
		l_addedDefense = new JLabel("0");
		l_addedDefense.setForeground(Color.WHITE);
		l_addedDefense.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedDefense.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_addedDefense.setBounds(265, 500, 87, 30);
		add(l_addedDefense);
		
		l_addedSpecial = new JLabel("0");
		l_addedSpecial.setForeground(Color.WHITE);
		l_addedSpecial.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedSpecial.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_addedSpecial.setBounds(668, 395, 79, 30);
		add(l_addedSpecial);
		
		l_addedAgility = new JLabel("0");
		l_addedAgility.setForeground(Color.WHITE);
		l_addedAgility.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedAgility.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_addedAgility.setBounds(668, 430, 79, 30);
		add(l_addedAgility);
		
		l_addedCritical = new JLabel("0");
		l_addedCritical.setForeground(Color.WHITE);
		l_addedCritical.setHorizontalAlignment(SwingConstants.CENTER);
		l_addedCritical.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_addedCritical.setBounds(668, 465, 79, 30);
		add(l_addedCritical);
		
		b_back = new JButton();
		b_back.setActionCommand("BACK");
		b_back.setIcon(imageManager.getShopGraphic("Back"));
		b_back.setRolloverIcon(imageManager.getShopGraphic("Back_Hover"));
		b_back.setBorder(null);
		b_back.setContentAreaFilled(false);
		b_back.setFocusPainted(false);
		b_back.setOpaque(false);
		b_back.setForeground(Color.WHITE);
		b_back.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_back.setBounds(834, 512, 197, 58);
		add(b_back);
		
		l_totalPointsText = new JLabel("Total Points:");
		l_totalPointsText.setForeground(Color.WHITE);
		l_totalPointsText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_totalPointsText.setBounds(506, 500, 160, 30);
		add(l_totalPointsText);
		
		l_perPriceText = new JLabel("Price per Stat Point: Au 100");
		l_perPriceText.setForeground(Color.WHITE);
		l_perPriceText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_perPriceText.setBounds(74, 544, 226, 30);
		add(l_perPriceText);
		
		l_totalPriceText = new JLabel("Upgrade Price: Au");
		l_totalPriceText.setForeground(Color.WHITE);
		l_totalPriceText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_totalPriceText.setBounds(432, 544, 147, 30);
		add(l_totalPriceText);
		
		l_totalPoints = new JLabel("0");
		l_totalPoints.setForeground(Color.GREEN);
		l_totalPoints.setHorizontalAlignment(SwingConstants.CENTER);
		l_totalPoints.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_totalPoints.setBounds(668, 500, 79, 30);
		add(l_totalPoints);
		
		l_totalPrice = new JLabel("0");
		l_totalPrice.setForeground(Color.WHITE);
		l_totalPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		l_totalPrice.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_totalPrice.setBounds(579, 544, 90, 30);
		add(l_totalPrice);
		
		b_upgrade = new JButton();
		b_upgrade.setIcon(imageManager.getShopGraphic("Upgrade"));
		b_upgrade.setRolloverIcon(imageManager.getShopGraphic("Upgrade_Hover"));
		b_upgrade.setDisabledIcon(imageManager.getShopGraphic("Upgrade_Disabled"));
		b_upgrade.setActionCommand("UPGRADE");
		b_upgrade.setBorder(null);
		b_upgrade.setContentAreaFilled(false);
		b_upgrade.setFocusPainted(false);
		b_upgrade.setOpaque(false);
		b_upgrade.setForeground(Color.WHITE);
		b_upgrade.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_upgrade.setBounds(834, 412, 197, 58);
		add(b_upgrade);
		
		l_quantityText = new JLabel("Quantity");
		l_quantityText.setForeground(Color.WHITE);
		l_quantityText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_quantityText.setBounds(431, 74, 90, 30);
		add(l_quantityText);
		
		l_itemPrice = new JLabel("0");
		l_itemPrice.setForeground(Color.WHITE);
		l_itemPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		l_itemPrice.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_itemPrice.setBounds(920, 157, 111, 20);
		add(l_itemPrice);
		
		l_itemPriceText = new JLabel("Price: Au");
		l_itemPriceText.setForeground(Color.WHITE);
		l_itemPriceText.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_itemPriceText.setBounds(834, 157, 76, 20);
		add(l_itemPriceText);
		
		b_purchase = new JButton();
		b_purchase.setActionCommand("PURCHASE");
		b_purchase.setIcon(imageManager.getShopGraphic("Purchase"));
		b_purchase.setRolloverIcon(imageManager.getShopGraphic("Purchase_Hover"));
		b_purchase.setDisabledIcon(imageManager.getShopGraphic("Purchase_Disabled"));
		b_purchase.setBorder(null);
		b_purchase.setContentAreaFilled(false);
		b_purchase.setFocusPainted(false);
		b_purchase.setOpaque(false);
		b_purchase.setForeground(Color.WHITE);
		b_purchase.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_purchase.setBounds(834, 206, 197, 76);
		add(b_purchase);
		
		b_upQuantity = new JButton();
		b_upQuantity.setIcon(imageManager.getShopGraphic("Plus"));
		b_upQuantity.setRolloverIcon(imageManager.getShopGraphic("Plus_Hover"));
		b_upQuantity.setDisabledIcon(imageManager.getShopGraphic("Plus_Disabled"));
		b_upQuantity.setBorder(null);
		b_upQuantity.setContentAreaFilled(false);
		b_upQuantity.setFocusPainted(false);
		b_upQuantity.setOpaque(false);
		b_upQuantity.setForeground(Color.WHITE);
		b_upQuantity.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_upQuantity.setBounds(630, 74, 44, 30);
		add(b_upQuantity);
		
		l_quantity = new JLabel("0");
		l_quantity.setForeground(Color.WHITE);
		l_quantity.setHorizontalAlignment(SwingConstants.CENTER);
		l_quantity.setFont(new Font("Nyala", Font.PLAIN, 20));
		l_quantity.setBounds(565, 74, 65, 30);
		add(l_quantity);
		
		b_downQuantity = new JButton();
		b_downQuantity.setIcon(imageManager.getShopGraphic("Minus"));
		b_downQuantity.setRolloverIcon(imageManager.getShopGraphic("Minus_Hover"));
		b_downQuantity.setDisabledIcon(imageManager.getShopGraphic("Minus_Disabled"));
		b_downQuantity.setBorder(null);
		b_downQuantity.setContentAreaFilled(false);
		b_downQuantity.setFocusPainted(false);
		b_downQuantity.setOpaque(false);
		b_downQuantity.setForeground(Color.WHITE);
		b_downQuantity.setFont(new Font("Nyala", Font.PLAIN, 20));
		b_downQuantity.setBounds(521, 74, 44, 30);
		add(b_downQuantity);
		
		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getCommonBG());
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		checkStatsShop();
		
		b_back.addActionListener(shopHandler);
		b_upHP.addActionListener(shopHandler);
		b_downHP.addActionListener(shopHandler);
		b_upSP.addActionListener(shopHandler);
		b_downSP.addActionListener(shopHandler);
		b_upAttack.addActionListener(shopHandler);
		b_downAttack.addActionListener(shopHandler);
		b_upDefense.addActionListener(shopHandler);
		b_downDefense.addActionListener(shopHandler);
		b_upSpecial.addActionListener(shopHandler);
		b_downSpecial.addActionListener(shopHandler);
		b_upAgility.addActionListener(shopHandler);
		b_downAgility.addActionListener(shopHandler);
		b_upCritical.addActionListener(shopHandler);
		b_downCritical.addActionListener(shopHandler);
		b_upQuantity.addActionListener(shopHandler);
		b_downQuantity.addActionListener(shopHandler);
		b_upgrade.addActionListener(shopHandler);
		b_purchase.addActionListener(shopHandler);
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
				l_addedHP.setForeground(Color.GREEN);
			}
			else if(e.getSource() == b_downHP)
			{
				if(!l_baseHP.getText().equals("0"))
				{
					l_baseHP.setText(Integer.parseInt(l_baseHP.getText()) - 1 + "");
					l_addedHP.setText(Integer.parseInt(l_addedHP.getText()) - 1 + "");
				}
				if(Double.parseDouble(l_addedHP.getText()) == systemManager.getHumanPlayer().getPlusHP())
					l_addedHP.setForeground(Color.WHITE);
			}
			else if(e.getSource() == b_upSP)
			{
				l_baseSP.setText(Integer.parseInt(l_baseSP.getText()) + 1 + "");
				l_addedSP.setText(Integer.parseInt(l_addedSP.getText()) + 1 + "");
				l_addedSP.setForeground(Color.GREEN);
			}
			else if(e.getSource() == b_downSP)
			{
				if(!l_baseSP.getText().equals("0"))
				{
					l_baseSP.setText(Integer.parseInt(l_baseSP.getText()) - 1 + "");
					l_addedSP.setText(Integer.parseInt(l_addedSP.getText()) - 1 + "");
				}
				if(Double.parseDouble(l_addedSP.getText()) == systemManager.getHumanPlayer().getPlusSP())
					l_addedSP.setForeground(Color.WHITE);
			}
			else if(e.getSource() == b_upAttack)
			{
				l_baseAttack.setText(Integer.parseInt(l_baseAttack.getText()) + 1 + "");
				l_addedAttack.setText(Integer.parseInt(l_addedAttack.getText()) + 1 + "");
				l_addedAttack.setForeground(Color.GREEN);
			}
			else if(e.getSource() == b_downAttack)
			{
				if(!l_baseAttack.getText().equals("0"))
				{
					l_baseAttack.setText(Integer.parseInt(l_baseAttack.getText()) - 1 + "");
					l_addedAttack.setText(Integer.parseInt(l_addedAttack.getText()) - 1 + "");
				}
				if(Double.parseDouble(l_addedAttack.getText()) == systemManager.getHumanPlayer().getPlusATK())
					l_addedAttack.setForeground(Color.WHITE);
			}
			else if(e.getSource() == b_upDefense)
			{
				l_baseDefense.setText(Integer.parseInt(l_baseDefense.getText()) + 1 + "");
				l_addedDefense.setText(Integer.parseInt(l_addedDefense.getText()) + 1 + "");
				l_addedDefense.setForeground(Color.GREEN);
			}
			else if(e.getSource() == b_downDefense)
			{
				if(!l_baseDefense.getText().equals("0"))
				{
					l_baseDefense.setText(Integer.parseInt(l_baseDefense.getText()) - 1 + "");
					l_addedDefense.setText(Integer.parseInt(l_addedDefense.getText()) - 1 + "");
				}
				if(Double.parseDouble(l_addedDefense.getText()) == systemManager.getHumanPlayer().getPlusDEF())
					l_addedDefense.setForeground(Color.WHITE);
			}
			else if(e.getSource() == b_upSpecial)
			{
				l_baseSpecial.setText(Integer.parseInt(l_baseSpecial.getText()) + 1 + "");
				l_addedSpecial.setText(Integer.parseInt(l_addedSpecial.getText()) + 1 + "");
				l_addedSpecial.setForeground(Color.GREEN);
			}
			else if(e.getSource() == b_downSpecial)
			{
				if(!l_baseSpecial.getText().equals("0"))
				{
					l_baseSpecial.setText(Integer.parseInt(l_baseSpecial.getText()) - 1 + "");
					l_addedSpecial.setText(Integer.parseInt(l_addedSpecial.getText()) - 1 + "");
				}
				if(Double.parseDouble(l_addedSpecial.getText()) == systemManager.getHumanPlayer().getPlusSPC())
					l_addedSpecial.setForeground(Color.WHITE);
			}
			else if(e.getSource() == b_upAgility)
			{
				l_baseAgility.setText(Integer.parseInt(l_baseAgility.getText()) + 1 + "");
				l_addedAgility.setText(Integer.parseInt(l_addedAgility.getText()) + 1 + "");
				l_addedAgility.setForeground(Color.GREEN);
			}
			else if(e.getSource() == b_downAgility)
			{
				if(!l_baseAgility.getText().equals("0"))
				{
					l_baseAgility.setText(Integer.parseInt(l_baseAgility.getText()) - 1 + "");
					l_addedAgility.setText(Integer.parseInt(l_addedAgility.getText()) - 1 + "");
				}
				if(Double.parseDouble(l_addedAgility.getText()) == systemManager.getHumanPlayer().getPlusAGI())
					l_addedAgility.setForeground(Color.WHITE);
			}
			else if(e.getSource() == b_upCritical)
			{
				l_baseCritical.setText(Integer.parseInt(l_baseCritical.getText()) + 1 + "");
				l_addedCritical.setText(Integer.parseInt(l_addedCritical.getText()) + 1 + "");
				l_addedCritical.setForeground(Color.GREEN);
			}
			else if(e.getSource() == b_downCritical)
			{
				if(!l_baseCritical.getText().equals("0"))
				{
					l_baseCritical.setText(Integer.parseInt(l_baseCritical.getText()) - 1 + "");
					l_addedCritical.setText(Integer.parseInt(l_addedCritical.getText()) - 1 + "");
				}
				if(Double.parseDouble(l_addedCritical.getText()) == systemManager.getHumanPlayer().getPlusCRT())
					l_addedCritical.setForeground(Color.WHITE);
			}
			else if(action.equals("UPGRADE"))
			{
				if(!(systemManager.getHumanPlayer().getAu() < totalPrice))
				{
					reply = JOptionPane.showConfirmDialog(null, "Changes are permanent. Continue?", "Confirm", YESNO);
					if(reply == YES)
					{
						systemManager.getHumanPlayer().setAu(systemManager.getHumanPlayer().getAu() - totalPrice);
						
						systemManager.getHumanPlayer().setPlusHP(Double.parseDouble(l_addedHP.getText()));
						systemManager.getHumanPlayer().setPlusSP(Double.parseDouble(l_addedSP.getText()));
						systemManager.getHumanPlayer().setPlusATK(Double.parseDouble(l_addedAttack.getText()));
						systemManager.getHumanPlayer().setPlusDEF(Double.parseDouble(l_addedDefense.getText()));
						systemManager.getHumanPlayer().setPlusAGI(Double.parseDouble(l_addedAgility.getText()));
						systemManager.getHumanPlayer().setPlusSPC(Double.parseDouble(l_addedSpecial.getText()));
						systemManager.getHumanPlayer().setPlusCRT(Double.parseDouble(l_addedCritical.getText()));
						
						systemManager.getHumanPlayer().calculateDefStats();

						l_money.setText("Money: Au " + d0.format(systemManager.getHumanPlayer().getAu()));
						resetTextColor();
						resetStatsAddedValue();
					}
				}
				else
					JOptionPane.showMessageDialog(null, "Not enough gold.");
			}
			else if(action.equals("PURCHASE"))
			{
				reply = JOptionPane.showConfirmDialog(null, "Confirm to proceed purchase.", "Confirm", YESNO);
				if(reply == YES)
				{
					ArrayList<GameItem> tempPlayerItems = playerGameItem;
					isSelected = true;
					for(GameItem item: shopGameItem)
						if(item.getItemName().equals(selectedItem))
						{
							systemManager.getHumanPlayer().setAu(systemManager.getHumanPlayer().getAu() - totalItemPrice);
							jl_items.removeSelectionInterval(jl_items.getSelectedIndices()[0], jl_items.getSelectedIndices()[0]);

							l_quantity.setText("0");
							l_itemPrice.setText("0");
							b_purchase.setEnabled(false);
							b_upQuantity.setEnabled(false);
							b_downQuantity.setEnabled(false);
							selectedItem = null;

							l_have.setText("<html>In Inventory:<br>-</html>");
							l_itemInfo.setText("<html>Item Name:<br>Item Description:"
									+ "<br>Buying Price: Au<br>Selling Price: Au</html>");
							l_money.setText("Money: Au " + d0.format(systemManager.getHumanPlayer().getAu()));

							int iterator = 0;
							item.setItemQuantity(quantityToBuy);
							
							if(playerGameItem.equals(null))
								playerGameItem.add(item);
							else
							{
								try
								{
									for(GameItem playerItem: playerGameItem)
									{
										if(playerItem.getItemID().equals(item.getItemID()))
										{
											playerItem.setItemQuantity(playerItem.getItemQuantity() + quantityToBuy);
											tempPlayerItems.remove(iterator);
											tempPlayerItems.add(iterator, playerItem);
										}
										else if(iterator + 1 == playerGameItem.size() && 
												!playerItem.getItemID().equals(item.getItemID()))
											tempPlayerItems.add(item);
										iterator++;
									}
								}
								catch(java.util.ConcurrentModificationException ex)
								{
									
								}
							}
							playerGameItem = tempPlayerItems;
							systemManager.getHumanPlayer().setInventory(playerGameItem);

							break;
						}
				}
			}
			else if(action.equals("BACK"))
			{
				jl_items.removeMouseListener(mouseHandler);
				systemManager.getNavigationUI().refreshNavigationUI();
				systemManager.showNavigationUI();
			}
			else if(e.getSource() == b_upQuantity)
				l_quantity.setText("" + (Integer.parseInt(l_quantity.getText()) + 1));
			else if(e.getSource() == b_downQuantity)
				l_quantity.setText("" + (Integer.parseInt(l_quantity.getText()) - 1));
			
			quantityToBuy = Integer.parseInt(l_quantity.getText());
			totalItemPrice = quantityToBuy * itemPrice;
			l_itemPrice.setText("" + totalItemPrice);
			
			totalPoints = Integer.parseInt(l_addedHP.getText()) + Integer.parseInt(l_addedSP.getText()) +
					Integer.parseInt(l_addedAttack.getText()) + Integer.parseInt(l_addedDefense.getText()) +
					Integer.parseInt(l_addedSpecial.getText()) + Integer.parseInt(l_addedAgility.getText()) +
					Integer.parseInt(l_addedCritical.getText());
			totalPrice = (totalPoints - Integer.parseInt(d0.format(systemManager.getHumanPlayer().getTotalPlusPoints()))) * 100;
			
			l_totalPoints.setText(totalPoints.toString());
			l_totalPrice.setText(totalPrice.toString());
			
			if(!action.equals("PURCHASE"))
				checkItemShop();
			checkStatsShop();

			repaint();
		}
	}
	
	private class MouseHandler implements MouseListener
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{
			if(selectedItem == null || !selectedItem.equals(jl_items.getSelectedValue()))
				isSelected = true;
			else
				isSelected = false;
						
			if(e.getClickCount() == 1 && isSelected)
			{
				isSelected = false;
				b_upQuantity.setEnabled(true);
				b_downQuantity.setEnabled(false);

				selectedItem = jl_items.getSelectedValue();

				for(GameItem item: shopGameItem)
				{
					if(item.getItemName().equals(selectedItem))
					{
						for(GameItem playerItem: playerGameItem)
							if(playerItem.getItemID().equals(item.getItemID()))
								quantity = playerItem.getItemQuantity();
						itemPrice = (int) item.getBuyingValue();
						l_itemInfo.setText("<html>Item Name: " + selectedItem + " <br>"
								+ "Item Description: " + item.getItemDesc()
								+ "<br>Buying Price: Au " + item.getBuyingValue() 
								+ "<br>Selling Price: Au " + item.getSellingValue() + "</html>");
						break;
					}
					else
						quantity = 0;
				}
				
//				for(GameItem playerItem: playerGameItem)
//					System.out.println(playerItem.getItemQuantity());

				l_have.setText("<html>In Inventory:<br> " + quantity + " </html>");

			}
			else if(!isSelected)
			{
				b_downQuantity.setEnabled(false);
				b_upQuantity.setEnabled(false);
				isSelected = true;
				
				selectedItem = "";
				quantity = 0;
				l_have.setText("<html>In Inventory:<br>-</html>");
				l_itemInfo.setText("<html>Item Name:<br>Item Description:"
						+ "<br>Buying Price: Au<br>Selling Price: Au</html>");
				jl_items.removeSelectionInterval(jl_items.getSelectedIndices()[0], jl_items.getSelectedIndices()[0]);
			}
			l_quantity.setText("0");
			l_itemPrice.setText("0");
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
	
	public void refreshStatsShopUI(int area)
	{
		playerGameItem = systemManager.getHumanPlayer().getInventory();
		b_purchase.setEnabled(false);
		b_upQuantity.setEnabled(false);
		b_downQuantity.setEnabled(false);
		l_itemInfo.setText("<html>Item Name:<br>Item Description:<br>Buying Price: Au<br>Selling Price: Au</html>");
		l_have.setText("<html>In Inventory:<br>-</html>");
		isSelected = true;
		selectedItem = null;
		mouseHandler = new MouseHandler();
		l_quantity.setText("0");
		l_itemPrice.setText("0");

		l_money.setText("Money: Au " + d0.format(systemManager.getHumanPlayer().getAu()));
		l_baseHP.setText(d0.format(systemManager.getHumanPlayer().getDefHP()));
		l_baseSP.setText(d0.format(systemManager.getHumanPlayer().getDefSP()));
		l_baseAttack.setText(d0.format(systemManager.getHumanPlayer().getDefATK()));
		l_baseDefense.setText(d0.format(systemManager.getHumanPlayer().getDefDEF()));
		l_baseSpecial.setText(d0.format(systemManager.getHumanPlayer().getDefSPC()));
		l_baseAgility.setText(d0.format(systemManager.getHumanPlayer().getDefAGI()));
		l_baseCritical.setText(d0.format(systemManager.getHumanPlayer().getDefCRT()));

		l_addedHP.setText(d0.format(systemManager.getHumanPlayer().getPlusHP()));
		l_addedSP.setText(d0.format(systemManager.getHumanPlayer().getPlusSP()));
		l_addedAttack.setText(d0.format(systemManager.getHumanPlayer().getPlusATK()));
		l_addedDefense.setText(d0.format(systemManager.getHumanPlayer().getPlusDEF()));
		l_addedSpecial.setText(d0.format(systemManager.getHumanPlayer().getPlusSPC()));
		l_addedAgility.setText(d0.format(systemManager.getHumanPlayer().getPlusAGI()));
		l_addedCritical.setText(d0.format(systemManager.getHumanPlayer().getPlusCRT()));
		
		resetStatsAddedValue();
		checkStatsShop();
		
		refreshItemShop(area);
	}
	
	private void refreshItemShop(int area)
	{		
		shopGameItem = statsManager.getPurchasableItemsOnArea(area);
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		
		for(GameItem item: shopGameItem)
			listModel.addElement(item.getItemName());
		
		jl_items.setModel(listModel);
		jl_items.addMouseListener(mouseHandler);
		
	}
	
	private void checkStatsShop()
	{
		if(totalPoints != (int) systemManager.getHumanPlayer().getTotalPlusPoints())
			b_upgrade.setEnabled(true);
		else
			b_upgrade.setEnabled(false);
		
		if(Double.parseDouble(l_addedHP.getText()) != systemManager.getHumanPlayer().getPlusHP())
			b_downHP.setEnabled(true);
		else
			b_downHP.setEnabled(false);
		
		if(!l_baseHP.getText().equals("999"))
			b_upHP.setEnabled(true);
		else
			b_upHP.setEnabled(false);
		
		if(Double.parseDouble(l_addedSP.getText()) != systemManager.getHumanPlayer().getPlusSP())
			b_downSP.setEnabled(true);
		else
			b_downSP.setEnabled(false);
		
		if(!l_baseSP.getText().equals("999"))
			b_upSP.setEnabled(true);
		else
			b_upSP.setEnabled(false);
		
		if(Double.parseDouble(l_addedAttack.getText()) != systemManager.getHumanPlayer().getPlusATK())
			b_downAttack.setEnabled(true);
		else
			b_downAttack.setEnabled(false);
		
		if(!l_baseAttack.getText().equals("999"))
			b_upAttack.setEnabled(true);
		else
			b_upAttack.setEnabled(false);
		
		if(Double.parseDouble(l_addedDefense.getText()) != systemManager.getHumanPlayer().getPlusDEF())
			b_downDefense.setEnabled(true);
		else
			b_downDefense.setEnabled(false);
		
		if(!l_baseDefense.getText().equals("999"))
			b_upDefense.setEnabled(true);
		else
			b_upDefense.setEnabled(false);
		
		if(Double.parseDouble(l_addedSpecial.getText()) != systemManager.getHumanPlayer().getPlusSPC())
			b_downSpecial.setEnabled(true);
		else
			b_downSpecial.setEnabled(false);
		
		if(!l_baseSpecial.getText().equals("999"))
			b_upSpecial.setEnabled(true);
		else
			b_upSpecial.setEnabled(false);
		
		if(Double.parseDouble(l_addedAgility.getText()) != systemManager.getHumanPlayer().getPlusAGI())
			b_downAgility.setEnabled(true);
		else
			b_downAgility.setEnabled(false);
		
		if(!l_baseAgility.getText().equals("999"))
			b_upAgility.setEnabled(true);
		else
			b_upAgility.setEnabled(false);
		
		if(Double.parseDouble(l_addedCritical.getText()) != systemManager.getHumanPlayer().getPlusCRT())
			b_downCritical.setEnabled(true);
		else
			b_downCritical.setEnabled(false);
		
		if(!l_baseCritical.getText().equals("999"))
			b_upCritical.setEnabled(true);
		else
			b_upCritical.setEnabled(false);
		
		if(totalPrice + 100 > (int) systemManager.getHumanPlayer().getAu())
			disablePlusStats();
		else
			enablePlusStats();
	}
	
	private void checkItemShop()
	{
		if(Integer.parseInt(l_quantity.getText()) != 0)
			b_purchase.setEnabled(true);
		else
			b_purchase.setEnabled(false);
		
		if(!(Integer.parseInt(l_quantity.getText()) <= 0))
			b_downQuantity.setEnabled(true);
		else
			b_downQuantity.setEnabled(false);
		
		if(!l_quantity.getText().equals("999"))
			b_upQuantity.setEnabled(true);
		else
			b_upQuantity.setEnabled(false);
		
		if(totalItemPrice + itemPrice > (int) systemManager.getHumanPlayer().getAu())
			b_upQuantity.setEnabled(false);
		else
			b_upQuantity.setEnabled(true);;
	}
	
	private void disablePlusStats()
	{
		b_upSP.setEnabled(false);
		b_upHP.setEnabled(false);
		b_upAttack.setEnabled(false);
		b_upDefense.setEnabled(false);
		b_upSpecial.setEnabled(false);
		b_upCritical.setEnabled(false);
		b_upAgility.setEnabled(false);
	}
	
	private void enablePlusStats()
	{
		b_upSP.setEnabled(true);
		b_upHP.setEnabled(true);
		b_upAttack.setEnabled(true);
		b_upDefense.setEnabled(true);
		b_upSpecial.setEnabled(true);
		b_upCritical.setEnabled(true);
		b_upAgility.setEnabled(true);
	}
	
	private void resetStatsAddedValue()
	{
		l_addedHP.setText(d0.format(systemManager.getHumanPlayer().getPlusHP()));
		l_addedSP.setText(d0.format(systemManager.getHumanPlayer().getPlusSP()));
		l_addedAttack.setText(d0.format(systemManager.getHumanPlayer().getPlusATK()));
		l_addedDefense.setText(d0.format(systemManager.getHumanPlayer().getPlusDEF()));
		l_addedSpecial.setText(d0.format(systemManager.getHumanPlayer().getPlusSPC()));
		l_addedAgility.setText(d0.format(systemManager.getHumanPlayer().getPlusAGI()));
		l_addedCritical.setText(d0.format(systemManager.getHumanPlayer().getPlusCRT()));
		l_totalPoints.setText(d0.format(systemManager.getHumanPlayer().getTotalPlusPoints()));
		l_totalPrice.setText("0");
	}
	
	private void resetTextColor()
	{
		l_addedAttack.setForeground(Color.WHITE);
		l_addedDefense.setForeground(Color.WHITE);
		l_addedSpecial.setForeground(Color.WHITE);
		l_addedAgility.setForeground(Color.WHITE);
		l_addedCritical.setForeground(Color.WHITE);
		l_addedHP.setForeground(Color.WHITE);
		l_addedSP.setForeground(Color.WHITE);
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