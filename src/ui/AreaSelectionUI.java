package ui;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managers.ImageManager;
import managers.SystemManager;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaSelectionUI extends JPanel 
{
	private ImageManager imageManager;
	private SystemManager systemManager;
	private JButton b_area1, b_area2, b_area3, b_area4, b_area5, b_area6, b_area7, b_area8;
	private JLabel l_bg;
	private AreaSelectionHandler areaSelectionHandler;
	
	public AreaSelectionUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		imageManager = new ImageManager();
		areaSelectionHandler = new AreaSelectionHandler();
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		b_area1 = new JButton();
		b_area1.setBounds(21, 69, 240, 180);
		b_area1.setActionCommand("Area1");
		b_area1.setIcon(imageManager.getAreaSelectionGraphic("1"));
		b_area1.setRolloverIcon(imageManager.getAreaSelectionGraphic("1_Hover"));
		b_area1.setBorder(null);
		add(b_area1);
		
		b_area2 = new JButton();
		b_area2.setBounds(286, 69, 240, 180);
		b_area2.setActionCommand("Area2");
		b_area2.setIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area2.setRolloverIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area2.setEnabled(false);
		b_area2.setBorder(null);
		add(b_area2);
		
		b_area3 = new JButton();
		b_area3.setBounds(551, 69, 240, 180);
		b_area3.setActionCommand("Area3");
		b_area3.setIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area3.setRolloverIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area3.setEnabled(false);
		b_area3.setBorder(null);
		add(b_area3);
		
		b_area4 = new JButton();
		b_area4.setBounds(816, 69, 240, 180);
		b_area4.setActionCommand("Area4");
		b_area4.setIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area4.setRolloverIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area4.setEnabled(false);
		b_area4.setBorder(null);
		add(b_area4);
		
		b_area5 = new JButton();
		b_area5.setBounds(21, 288, 240, 180);
		b_area5.setActionCommand("Area5");
		b_area5.setIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area5.setRolloverIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area5.setEnabled(false);
		b_area5.setBorder(null);
		add(b_area5);
		
		b_area6 = new JButton();
		b_area6.setBounds(286, 288, 240, 180);
		b_area6.setActionCommand("Area6");
		b_area6.setIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area6.setRolloverIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area6.setEnabled(false);
		b_area6.setBorder(null);
		add(b_area6);
		
		b_area7 = new JButton();
		b_area7.setBounds(551, 288, 240, 180);
		b_area7.setActionCommand("Area7");
		b_area7.setIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area7.setRolloverIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area7.setEnabled(false);
		b_area7.setBorder(null);
		add(b_area7);
		
		b_area8 = new JButton();
		b_area8.setBounds(816, 288, 240, 180);
		b_area8.setActionCommand("Area8");
		b_area8.setIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area8.setRolloverIcon(imageManager.getAreaSelectionGraphic("Locked"));
		b_area8.setEnabled(false);
		b_area8.setBorder(null);
		add(b_area8);
		
		l_bg = new JLabel();
		l_bg.setBounds(0, 0, 1066, 600);
		l_bg.setIcon(imageManager.getCommonBG());
		add(l_bg);
		
		b_area1.addActionListener(areaSelectionHandler);
	}
	
	private class AreaSelectionHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent ae) 
		{
			systemManager.playSFX("common_confirm");
			if(ae.getActionCommand().equals("Area1"))
			{
				systemManager.setSelectedArea(1);
				systemManager.getNavigationUI().refreshNavigationUI();
				systemManager.showNavigationUI();
			}
			if(ae.getActionCommand().equals("Area2"))
			{
				systemManager.setSelectedArea(2);
				systemManager.getNavigationUI().refreshNavigationUI();
				systemManager.showNavigationUI();
			}
			if(ae.getActionCommand().equals("Area3"))
			{
				systemManager.setSelectedArea(3);
				systemManager.getNavigationUI().refreshNavigationUI();
				systemManager.showNavigationUI();
			}
			if(ae.getActionCommand().equals("Area4"))
			{
				systemManager.setSelectedArea(4);
				systemManager.getNavigationUI().refreshNavigationUI();
				systemManager.showNavigationUI();
			}
			if(ae.getActionCommand().equals("Area5"))
			{
				systemManager.setSelectedArea(5);
				systemManager.getNavigationUI().refreshNavigationUI();
				systemManager.showNavigationUI();
			}
			if(ae.getActionCommand().equals("Area6"))
			{
				systemManager.setSelectedArea(6);
				systemManager.getNavigationUI().refreshNavigationUI();
				systemManager.showNavigationUI();
			}
			if(ae.getActionCommand().equals("Area7"))
			{
				systemManager.setSelectedArea(7);
				systemManager.getNavigationUI().refreshNavigationUI();
				systemManager.showNavigationUI();
			}
			if(ae.getActionCommand().equals("Area8"))
			{
				systemManager.setSelectedArea(8);
				systemManager.getNavigationUI().refreshNavigationUI();
				systemManager.showNavigationUI();
			}
			repaint();
		}
	}
	
	public void refreshAreaSelectionUI()
	{
		for(int i = 0; i <= systemManager.getHumanPlayer().getBossWins(); i++)
		{
			if(i == 0)
			{
				b_area1.setIcon(imageManager.getAreaSelectionGraphic("1"));
				b_area1.setRolloverIcon(imageManager.getAreaSelectionGraphic("1_Hover"));
				b_area1.setEnabled(true);
			}
			if(i == 1)
			{
				b_area1.setIcon(imageManager.getAreaSelectionGraphic("2"));
				b_area1.setRolloverIcon(imageManager.getAreaSelectionGraphic("2_Hover"));
				b_area1.setEnabled(true);
			}
			if(i == 2)
			{
				b_area1.setIcon(imageManager.getAreaSelectionGraphic("3"));
				b_area1.setRolloverIcon(imageManager.getAreaSelectionGraphic("3_Hover"));
				b_area1.setEnabled(true);
			}
			if(i == 3)
			{
				b_area1.setIcon(imageManager.getAreaSelectionGraphic("4"));
				b_area1.setRolloverIcon(imageManager.getAreaSelectionGraphic("4_Hover"));
				b_area1.setEnabled(true);
			}
			if(i == 4)
			{
				b_area1.setIcon(imageManager.getAreaSelectionGraphic("5"));
				b_area1.setRolloverIcon(imageManager.getAreaSelectionGraphic("5_Hover"));
				b_area1.setEnabled(true);
			}
			if(i == 5)
			{
				b_area1.setIcon(imageManager.getAreaSelectionGraphic("6"));
				b_area1.setRolloverIcon(imageManager.getAreaSelectionGraphic("6_Hover"));
				b_area1.setEnabled(true);
			}
			if(i == 6)
			{
				b_area1.setIcon(imageManager.getAreaSelectionGraphic("7"));
				b_area1.setRolloverIcon(imageManager.getAreaSelectionGraphic("7_Hover"));
				b_area1.setEnabled(true);
			}
			if(i >= 7)
			{
				b_area1.setIcon(imageManager.getAreaSelectionGraphic("8"));
				b_area1.setRolloverIcon(imageManager.getAreaSelectionGraphic("8_Hover"));
				b_area1.setEnabled(true);
			}
		}
		
	}
}
