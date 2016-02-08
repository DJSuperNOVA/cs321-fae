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

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
<<<<<<< HEAD
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

=======
>>>>>>> origin/master
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class BattleUI extends JPanel 
{
<<<<<<< HEAD
	private JLabel l_player, l_bgTest, lblEnemy, l_playerLvl, l_playerHP, l_enemyLvl, l_playerSP, l_enemyHP,
				l_enemySp;
	private JProgressBar pb_playerHP, pb_playerSP, pb_enemyHP, pb_enemySP;
	private JButton b_skill, b_attack, b_defend, b_inventory, b_heal, b_flee;
	private JTextArea ta_progress;

	private SystemManager systemManager;
	private BattleHandler battleHandler;
=======
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
>>>>>>> origin/master
	
	public BattleUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
<<<<<<< HEAD
		battleHandler = new BattleHandler();
=======
>>>>>>> origin/master
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
<<<<<<< HEAD
		l_player = new JLabel("Player");
		l_player.setHorizontalAlignment(SwingConstants.CENTER);
		l_player.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_player.setBackground(Color.DARK_GRAY);
		l_player.setOpaque(true);
		l_player.setBounds(46, 25, 315, 280);
		l_player.setForeground(Color.WHITE);
		add(l_player);
=======
		lblNewLabel_1 = new JLabel("Hero");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(46, 25, 316, 279);
		add(lblNewLabel_1);
>>>>>>> origin/master
		
		lblEnemy = new JLabel("Enemy");
		lblEnemy.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnemy.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblEnemy.setBackground(Color.DARK_GRAY);
<<<<<<< HEAD
		lblEnemy.setOpaque(true);
		lblEnemy.setBounds(637, 25, 315, 280);
		lblEnemy.setForeground(Color.WHITE);
		add(lblEnemy);
		
		l_bgTest = new JLabel("");
		l_bgTest.setIcon(new ImageIcon("C:\\Users\\clgaruta\\Desktop\\My Programs\\Java Projects\\cs321-fae\\src\\test.png"));
		l_bgTest.setBounds(10, 10, 1046, 300);
		add(l_bgTest);
		
		l_playerLvl = new JLabel("Lv 101 Player");
		l_playerLvl.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_playerLvl.setBounds(32, 332, 127, 26);
		add(l_playerLvl);
		
		pb_playerHP = new JProgressBar();
		pb_playerHP.setBackground(Color.RED);
		pb_playerHP.setValue(100);
		pb_playerHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		pb_playerHP.setBounds(169, 366, 244, 14);
		add(pb_playerHP);
		
		l_playerHP = new JLabel("HP 9999/9999");
		l_playerHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_playerHP.setBounds(32, 366, 127, 14);
		add(l_playerHP);
		
		pb_playerSP = new JProgressBar();
		pb_playerSP.setValue(100);
		pb_playerSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		pb_playerSP.setBackground(Color.RED);
		pb_playerSP.setBounds(169, 391, 244, 14);
		add(pb_playerSP);
		
		l_playerSP = new JLabel("SP 9999/9999");
		l_playerSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_playerSP.setBounds(32, 391, 127, 14);
		add(l_playerSP);
		
		l_enemyLvl = new JLabel("Lv 101 Mob");
		l_enemyLvl.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_enemyLvl.setBounds(661, 332, 127, 26);
		add(l_enemyLvl);
		
		l_enemyHP = new JLabel("HP 9999/9999");
		l_enemyHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_enemyHP.setBounds(661, 366, 127, 14);
		add(l_enemyHP);
		
		l_enemySp = new JLabel("SP 9999/9999");
		l_enemySp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_enemySp.setBounds(661, 391, 127, 14);
		add(l_enemySp);
		
		pb_enemyHP = new JProgressBar();
		pb_enemyHP.setValue(100);
		pb_enemyHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		pb_enemyHP.setBackground(Color.RED);
		pb_enemyHP.setBounds(798, 366, 244, 14);
		add(pb_enemyHP);
		
		pb_enemySP = new JProgressBar();
		pb_enemySP.setValue(100);
		pb_enemySP.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		pb_enemySP.setBackground(Color.RED);
		pb_enemySP.setBounds(798, 391, 244, 14);
		add(pb_enemySP);
		
		b_attack = new JButton("ATTACK");
		b_attack.setVerticalAlignment(SwingConstants.BOTTOM);
		b_attack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_attack.setBounds(10, 416, 150, 85);
		add(b_attack);
		
		b_skill = new JButton("USE SKILL");
		b_skill.setVerticalAlignment(SwingConstants.BOTTOM);
		b_skill.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_skill.setBounds(169, 416, 150, 85);
		add(b_skill);
		
		b_inventory = new JButton("INVENTORY");
		b_inventory.setVerticalAlignment(SwingConstants.BOTTOM);
		b_inventory.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_inventory.setBounds(328, 416, 150, 85);
		add(b_inventory);
		
		b_defend = new JButton("DEFEND");
		b_defend.setVerticalAlignment(SwingConstants.BOTTOM);
		b_defend.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_defend.setBounds(10, 510, 150, 85);
		add(b_defend);
		
		b_heal = new JButton("HEAL");
		b_heal.setVerticalAlignment(SwingConstants.BOTTOM);
		b_heal.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_heal.setBounds(169, 510, 150, 85);
		add(b_heal);
		
		b_flee = new JButton("FLEE");
		b_flee.setVerticalAlignment(SwingConstants.BOTTOM);
		b_flee.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_flee.setBounds(328, 510, 150, 85);
		add(b_flee);
		
		ta_progress = new JTextArea();
		ta_progress.setEditable(false);
		ta_progress.setHighlighter(null);
		ta_progress.setText("Battle progress...");
		ta_progress.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_progress.setBounds(507, 416, 549, 180);
		add(ta_progress);
		
		b_flee.addActionListener(battleHandler);
	}
	
	private class BattleHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("FLEE"))
				systemManager.showNavigationUI();
		}
=======
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
>>>>>>> origin/master
	}
}
