package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.SystemManager;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class BattleUI extends JPanel 
{
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel lblEnemy;
	private JLabel lblNewLabel_2;
	private JProgressBar progressBar;
	private JLabel lblNewLabel_3;
	private JProgressBar progressBar_1;
	private JLabel lblLvEnemy;
	private JProgressBar progressBar_2;
	private JLabel lblSp;
	private JLabel label;
	private JLabel label_1;
	private JProgressBar progressBar_3;
	private JButton btnUseSkill;
	private JButton btnNewButton;
	private JButton btnDefend;
	private JButton btnInventory;
	private JButton btnHeal;
	private JButton btnFlee;
	private JTextArea txtrBattleProgress;

	private SystemManager systemManager;
	
	public BattleUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		lblNewLabel_1 = new JLabel("Hero");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(46, 25, 316, 279);
		add(lblNewLabel_1);
		
		lblEnemy = new JLabel("Enemy");
		lblEnemy.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnemy.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblEnemy.setBackground(Color.DARK_GRAY);
		lblEnemy.setBounds(637, 25, 316, 279);
		add(lblEnemy);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\clgaruta\\Desktop\\My Programs\\Java Projects\\cs321-fae-master\\src\\test.png"));
		lblNewLabel.setBounds(10, 11, 1050, 321);
		add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Lv 101 Player");
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(32, 332, 127, 26);
		add(lblNewLabel_2);
		
		progressBar = new JProgressBar();
		progressBar.setBackground(Color.RED);
		progressBar.setValue(100);
		progressBar.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		progressBar.setBounds(169, 366, 244, 14);
		add(progressBar);
		
		lblNewLabel_3 = new JLabel("HP 9999/9999");
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(32, 366, 127, 14);
		add(lblNewLabel_3);
		
		progressBar_1 = new JProgressBar();
		progressBar_1.setValue(100);
		progressBar_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		progressBar_1.setBackground(Color.RED);
		progressBar_1.setBounds(169, 391, 244, 14);
		add(progressBar_1);
		
		lblSp = new JLabel("SP 9999/9999");
		lblSp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSp.setBounds(32, 391, 127, 14);
		add(lblSp);
		
		lblLvEnemy = new JLabel("Lv 101 Mob");
		lblLvEnemy.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblLvEnemy.setBounds(661, 332, 127, 26);
		add(lblLvEnemy);
		
		label = new JLabel("HP 9999/9999");
		label.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label.setBounds(661, 366, 127, 14);
		add(label);
		
		label_1 = new JLabel("SP 9999/9999");
		label_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_1.setBounds(661, 391, 127, 14);
		add(label_1);
		
		progressBar_2 = new JProgressBar();
		progressBar_2.setValue(100);
		progressBar_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		progressBar_2.setBackground(Color.RED);
		progressBar_2.setBounds(798, 366, 244, 14);
		add(progressBar_2);
		
		progressBar_3 = new JProgressBar();
		progressBar_3.setValue(100);
		progressBar_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		progressBar_3.setBackground(Color.RED);
		progressBar_3.setBounds(798, 391, 244, 14);
		add(progressBar_3);
		
		btnNewButton = new JButton("ATTACK");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 416, 149, 83);
		add(btnNewButton);
		
		btnUseSkill = new JButton("USE SKILL");
		btnUseSkill.setVerticalAlignment(SwingConstants.BOTTOM);
		btnUseSkill.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnUseSkill.setBounds(169, 416, 149, 83);
		add(btnUseSkill);
		
		btnInventory = new JButton("INVENTORY");
		btnInventory.setVerticalAlignment(SwingConstants.BOTTOM);
		btnInventory.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnInventory.setBounds(328, 416, 149, 83);
		add(btnInventory);
		
		btnDefend = new JButton("DEFEND");
		btnDefend.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDefend.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnDefend.setBounds(10, 510, 149, 83);
		add(btnDefend);
		
		btnHeal = new JButton("HEAL");
		btnHeal.setVerticalAlignment(SwingConstants.BOTTOM);
		btnHeal.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnHeal.setBounds(169, 510, 149, 83);
		add(btnHeal);
		
		btnFlee = new JButton("FLEE");
		btnFlee.setVerticalAlignment(SwingConstants.BOTTOM);
		btnFlee.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnFlee.setBounds(328, 510, 149, 83);
		add(btnFlee);
		
		txtrBattleProgress = new JTextArea();
		txtrBattleProgress.setText("Battle progress...");
		txtrBattleProgress.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtrBattleProgress.setBounds(507, 416, 553, 173);
		add(txtrBattleProgress);
	}
}
