package ui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.ImageManager;
import managers.SystemManager;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class BattleUI extends JPanel 
{
	private JLabel l_player, lblEnemy, l_playerLvl, l_playerHP, l_enemyLvl, l_playerSP, l_enemyHP,
				l_enemySp, l_bg;
	private JProgressBar pb_playerHP, pb_playerSP, pb_enemyHP, pb_enemySP;
	private JButton b_skill, b_attack, b_defend, b_item, b_heal, b_flee;
	private JTextArea ta_progress;

	private SystemManager systemManager;
	private ImageManager imageManager;
	private BattleHandler battleHandler;
	
	public BattleUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		battleHandler = new BattleHandler();
		imageManager = new ImageManager();
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		l_player = new JLabel("Player");
		l_player.setHorizontalAlignment(SwingConstants.CENTER);
		l_player.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_player.setBackground(Color.DARK_GRAY);
		l_player.setBounds(46, 25, 315, 280);
		l_player.setForeground(Color.WHITE);
		add(l_player);
		
		lblEnemy = new JLabel("Enemy");
		lblEnemy.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnemy.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblEnemy.setBackground(Color.DARK_GRAY);
		lblEnemy.setBounds(637, 25, 315, 280);
		lblEnemy.setForeground(Color.WHITE);
		add(lblEnemy);
		
		l_playerLvl = new JLabel("Lv 101 Player");
		l_playerLvl.setForeground(Color.WHITE);
		l_playerLvl.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_playerLvl.setBounds(32, 332, 127, 26);
		add(l_playerLvl);
		
		pb_playerHP = new JProgressBar();
		pb_playerHP.setBorder(new EmptyBorder(0, 0, 0, 0));
		pb_playerHP.setBorderPainted(false);
		pb_playerHP.setForeground(Color.GREEN);
		pb_playerHP.setString("100%");
		pb_playerHP.setBackground(Color.WHITE);
		pb_playerHP.setValue(100);
		pb_playerHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		pb_playerHP.setBounds(169, 366, 244, 14);
		add(pb_playerHP);
		
		l_playerHP = new JLabel("HP 9999/9999");
		l_playerHP.setForeground(Color.WHITE);
		l_playerHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_playerHP.setBounds(32, 366, 127, 14);
		add(l_playerHP);
		
		pb_playerSP = new JProgressBar();
		pb_playerSP.setBorder(new EmptyBorder(0, 0, 0, 0));
		pb_playerSP.setBorderPainted(false);
		pb_playerSP.setString("100%");
		pb_playerSP.setForeground(Color.BLUE);
		pb_playerSP.setValue(100);
		pb_playerSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		pb_playerSP.setBackground(Color.WHITE);
		pb_playerSP.setBounds(169, 391, 244, 14);
		add(pb_playerSP);
		
		l_playerSP = new JLabel("SP 9999/9999");
		l_playerSP.setForeground(Color.WHITE);
		l_playerSP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_playerSP.setBounds(32, 391, 127, 14);
		add(l_playerSP);
		
		l_enemyLvl = new JLabel("Lv 101 Mob");
		l_enemyLvl.setForeground(Color.WHITE);
		l_enemyLvl.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_enemyLvl.setBounds(661, 332, 127, 26);
		add(l_enemyLvl);
		
		l_enemyHP = new JLabel("HP 9999/9999");
		l_enemyHP.setForeground(Color.WHITE);
		l_enemyHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_enemyHP.setBounds(661, 366, 127, 14);
		add(l_enemyHP);
		
		l_enemySp = new JLabel("SP 9999/9999");
		l_enemySp.setForeground(Color.WHITE);
		l_enemySp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		l_enemySp.setBounds(661, 391, 127, 14);
		add(l_enemySp);
		
		pb_enemyHP = new JProgressBar();
		pb_enemyHP.setBorder(new EmptyBorder(0, 0, 0, 0));
		pb_enemyHP.setBorderPainted(false);
		pb_enemyHP.setForeground(Color.GREEN);
		pb_enemyHP.setString("100%");
		pb_enemyHP.setValue(100);
		pb_enemyHP.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		pb_enemyHP.setBackground(Color.RED);
		pb_enemyHP.setBounds(798, 366, 244, 14);
		add(pb_enemyHP);
		
		pb_enemySP = new JProgressBar();
		pb_enemySP.setBorder(new EmptyBorder(0, 0, 0, 0));
		pb_enemySP.setBorderPainted(false);
		pb_enemySP.setString("100%");
		pb_enemySP.setForeground(Color.BLUE);
		pb_enemySP.setValue(100);
		pb_enemySP.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		pb_enemySP.setBackground(Color.WHITE);
		pb_enemySP.setBounds(798, 391, 244, 14);
		add(pb_enemySP);
		
		b_attack = new JButton();
		b_attack.setActionCommand("ATTACK");
		b_attack.setBorder(null);
		b_attack.setIcon(imageManager.getBattleGraphic("Attack"));
		b_attack.setRolloverIcon(imageManager.getBattleGraphic("Attack_Hover"));
		b_attack.setFocusPainted(false);
		b_attack.setContentAreaFilled(false);
		b_attack.setForeground(Color.WHITE);
		b_attack.setOpaque(false);
		b_attack.setVerticalAlignment(SwingConstants.BOTTOM);
		b_attack.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_attack.setBounds(10, 416, 150, 85);
		add(b_attack);
		
		b_skill = new JButton();
		b_skill.setActionCommand("USE SKILL");
		b_skill.setBorder(null);
		b_skill.setIcon(imageManager.getBattleGraphic("UseSkill"));
		b_skill.setRolloverIcon(imageManager.getBattleGraphic("UseSkill_Hover"));
		b_skill.setFocusPainted(false);
		b_skill.setContentAreaFilled(false);
		b_skill.setForeground(Color.WHITE);
		b_skill.setOpaque(false);
		b_skill.setVerticalAlignment(SwingConstants.BOTTOM);
		b_skill.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_skill.setBounds(169, 416, 150, 85);
		add(b_skill);
		
		b_item = new JButton();
		b_item.setActionCommand("INVENTORY");
		b_item.setBorder(null);
		b_item.setIcon(imageManager.getBattleGraphic("Inventory"));
		b_item.setRolloverIcon(imageManager.getBattleGraphic("Inventory_Hover"));
		b_item.setFocusPainted(false);
		b_item.setContentAreaFilled(false);
		b_item.setForeground(Color.WHITE);
		b_item.setOpaque(false);
		b_item.setVerticalAlignment(SwingConstants.BOTTOM);
		b_item.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_item.setBounds(328, 416, 150, 85);
		add(b_item);
		
		b_defend = new JButton();
		b_defend.setActionCommand("DEFEND");
		b_defend.setBorder(null);
		b_defend.setIcon(imageManager.getBattleGraphic("Defend"));
		b_defend.setRolloverIcon(imageManager.getBattleGraphic("Defend_Hover"));
		b_defend.setFocusPainted(false);
		b_defend.setContentAreaFilled(false);
		b_defend.setForeground(Color.WHITE);
		b_defend.setOpaque(false);
		b_defend.setVerticalAlignment(SwingConstants.BOTTOM);
		b_defend.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_defend.setBounds(10, 510, 150, 85);
		add(b_defend);
		
		b_heal = new JButton();
		b_heal.setActionCommand("HEAL");
		b_heal.setBorder(null);
		b_heal.setIcon(imageManager.getBattleGraphic("Heal"));
		b_heal.setRolloverIcon(imageManager.getBattleGraphic("Heal_Hover"));
		b_heal.setFocusPainted(false);
		b_heal.setContentAreaFilled(false);
		b_heal.setForeground(Color.WHITE);
		b_heal.setOpaque(false);
		b_heal.setVerticalAlignment(SwingConstants.BOTTOM);
		b_heal.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_heal.setBounds(169, 510, 150, 85);
		add(b_heal);
		
		b_flee = new JButton();
		b_flee.setActionCommand("FLEE");
		b_flee.setBorder(null);
		b_flee.setIcon(imageManager.getBattleGraphic("Flee"));
		b_flee.setRolloverIcon(imageManager.getBattleGraphic("Flee_Hover"));
		b_flee.setFocusPainted(false);
		b_flee.setContentAreaFilled(false);
		b_flee.setForeground(Color.WHITE);
		b_flee.setOpaque(false);
		b_flee.setVerticalAlignment(SwingConstants.BOTTOM);
		b_flee.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_flee.setBounds(328, 510, 150, 85);
		add(b_flee);
		
		ta_progress = new JTextArea();
		ta_progress.setForeground(Color.WHITE);
		ta_progress.setOpaque(false);
		ta_progress.setEditable(false);
		ta_progress.setHighlighter(null);
		ta_progress.setText("Battle progress...");
		ta_progress.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		ta_progress.setBounds(507, 416, 549, 180);
		add(ta_progress);
		
		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getCommonBG());
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
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
	}
}
