package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class BattleUI extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					BattleUI frame = new BattleUI();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BattleUI() 
	{
		setTitle("Battle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1082, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Hero");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(46, 25, 316, 279);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEnemy = new JLabel("Enemy");
		lblEnemy.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnemy.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblEnemy.setBackground(Color.DARK_GRAY);
		lblEnemy.setBounds(637, 25, 316, 279);
		contentPane.add(lblEnemy);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\clgaruta\\Desktop\\My Programs\\Java Projects\\cs321-fae-master\\src\\test.png"));
		lblNewLabel.setBounds(10, 11, 1050, 321);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Lv 101 Player");
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(32, 332, 127, 26);
		contentPane.add(lblNewLabel_2);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.RED);
		progressBar.setValue(100);
		progressBar.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		progressBar.setBounds(169, 366, 244, 14);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel_3 = new JLabel("HP 9999/9999");
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(32, 366, 127, 14);
		contentPane.add(lblNewLabel_3);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(100);
		progressBar_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		progressBar_1.setBackground(Color.RED);
		progressBar_1.setBounds(169, 391, 244, 14);
		contentPane.add(progressBar_1);
		
		JLabel lblSp = new JLabel("SP 9999/9999");
		lblSp.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblSp.setBounds(32, 391, 127, 14);
		contentPane.add(lblSp);
		
		JLabel lblLvEnemy = new JLabel("Lv 101 Mob");
		lblLvEnemy.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblLvEnemy.setBounds(661, 332, 127, 26);
		contentPane.add(lblLvEnemy);
		
		JLabel label_1 = new JLabel("HP 9999/9999");
		label_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_1.setBounds(661, 366, 127, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("SP 9999/9999");
		label_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		label_2.setBounds(661, 391, 127, 14);
		contentPane.add(label_2);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(100);
		progressBar_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		progressBar_2.setBackground(Color.RED);
		progressBar_2.setBounds(798, 366, 244, 14);
		contentPane.add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setValue(100);
		progressBar_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		progressBar_3.setBackground(Color.RED);
		progressBar_3.setBounds(798, 391, 244, 14);
		contentPane.add(progressBar_3);
		
		JButton btnNewButton = new JButton("ATTACK");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 416, 149, 83);
		contentPane.add(btnNewButton);
		
		JButton btnUseSkill = new JButton("USE SKILL");
		btnUseSkill.setVerticalAlignment(SwingConstants.BOTTOM);
		btnUseSkill.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnUseSkill.setBounds(169, 416, 149, 83);
		contentPane.add(btnUseSkill);
		
		JButton btnInventory = new JButton("INVENTORY");
		btnInventory.setVerticalAlignment(SwingConstants.BOTTOM);
		btnInventory.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnInventory.setBounds(328, 416, 149, 83);
		contentPane.add(btnInventory);
		
		JButton btnDefend = new JButton("DEFEND");
		btnDefend.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDefend.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnDefend.setBounds(10, 510, 149, 83);
		contentPane.add(btnDefend);
		
		JButton btnHeal = new JButton("HEAL");
		btnHeal.setVerticalAlignment(SwingConstants.BOTTOM);
		btnHeal.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnHeal.setBounds(169, 510, 149, 83);
		contentPane.add(btnHeal);
		
		JButton btnFlee = new JButton("FLEE");
		btnFlee.setVerticalAlignment(SwingConstants.BOTTOM);
		btnFlee.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnFlee.setBounds(328, 510, 149, 83);
		contentPane.add(btnFlee);
		
		JTextArea txtrBattleProgress = new JTextArea();
		txtrBattleProgress.setText("Battle progress...");
		txtrBattleProgress.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		txtrBattleProgress.setBounds(507, 416, 553, 173);
		contentPane.add(txtrBattleProgress);
	}
}
