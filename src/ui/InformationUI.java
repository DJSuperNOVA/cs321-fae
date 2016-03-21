package ui;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import managers.ImageManager;
import managers.SystemManager;
import managers.LanguageManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;

public class InformationUI extends JPanel 
{
	private JTextArea ta_info;
	private JButton b_about, b_credits, b_howTo, b_back;
	private JLabel l_bg;
	
	private SystemManager systemManager;
	private ImageManager imageManager;
	private InformationHandler informationHandler;
	private LanguageManager languageManager;
	

	public InformationUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		informationHandler = new InformationHandler();
		imageManager = new ImageManager();
		languageManager = new LanguageManager("info");
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		b_about = new JButton();
		b_about.setActionCommand("About");
		b_about.setBorder(null);
		b_about.setIcon(imageManager.getInformationGraphic("About"));
		b_about.setRolloverIcon(imageManager.getInformationGraphic("About_Hover"));
		b_about.setSelectedIcon(imageManager.getInformationGraphic("About_Hover"));
		b_about.setFocusPainted(false);
		b_about.setOpaque(false);
		b_about.setContentAreaFilled(false);
		b_about.setForeground(Color.WHITE);
		b_about.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_about.setBounds(10, 11, 235, 95);
		b_about.setSelected(true);
		add(b_about);
		
		b_credits = new JButton();
		b_credits.setActionCommand("Credits");
		b_credits.setBorder(null);
		b_credits.setIcon(imageManager.getInformationGraphic("Credits"));
		b_credits.setRolloverIcon(imageManager.getInformationGraphic("Credits_Hover"));
		b_credits.setSelectedIcon(imageManager.getInformationGraphic("Credits_Hover"));
		b_credits.setFocusPainted(false);
		b_credits.setOpaque(false);
		b_credits.setContentAreaFilled(false);
		b_credits.setForeground(Color.WHITE);
		b_credits.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_credits.setBounds(10, 117, 235, 95);
		add(b_credits);
		
		b_howTo = new JButton();
		b_howTo.setActionCommand("how to Play");
		b_howTo.setBorder(null);
		b_howTo.setIcon(imageManager.getInformationGraphic("HowTo"));
		b_howTo.setRolloverIcon(imageManager.getInformationGraphic("HowTo_Hover"));
		b_howTo.setSelectedIcon(imageManager.getInformationGraphic("HowTo_Hover"));
		b_howTo.setFocusPainted(false);
		b_howTo.setOpaque(false);
		b_howTo.setContentAreaFilled(false);
		b_howTo.setForeground(Color.WHITE);
		b_howTo.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_howTo.setBounds(10, 223, 235, 95);
		add(b_howTo);
		
		b_back = new JButton();
		b_back.setActionCommand("Back");
		b_back.setBorder(null);
		b_back.setIcon(imageManager.getInformationGraphic("Back"));
		b_back.setRolloverIcon(imageManager.getInformationGraphic("Back_Hover"));
		b_back.setFocusPainted(false);
		b_back.setOpaque(false);
		b_back.setContentAreaFilled(false);
		b_back.setForeground(Color.WHITE);
		b_back.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		b_back.setBounds(10, 494, 235, 95);
		add(b_back);
		
		ta_info = new JTextArea();
		ta_info.setOpaque(false);
		ta_info.setForeground(Color.WHITE);
		ta_info.setEditable(false);
		ta_info.setHighlighter(null);
		ta_info.setText(languageManager.getAboutInformation().replaceAll("~]", "\n\n"));
		ta_info.setFont(new Font("Nyala", Font.PLAIN, 20));
		ta_info.setBounds(253, 11, 803, 578);
		add(ta_info);
		ta_info.setColumns(10);
		ta_info.setLineWrap(true);
		ta_info.setWrapStyleWord(true);
		l_bg = new JLabel();
		l_bg.setIcon(imageManager.getCommonBG());
		l_bg.setBounds(0, 0, 1066, 600);
		add(l_bg);
		
		b_back.addActionListener(informationHandler);
		b_about.addActionListener(informationHandler);
		b_credits.addActionListener(informationHandler);
	}
	
	private class InformationHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String action = e.getActionCommand();
			if(action.equals("Back"))
				systemManager.showMainMenuUI();
			else if(action.equals("About"))
			{
				ta_info.setText(languageManager.getAboutInformation().replaceAll("~]", "\n\n"));
				b_about.setSelected(true);
				b_credits.setSelected(false);
				b_howTo.setSelected(false);
			}
			else if(action.equals("Credits"))
			{
				ta_info.setText(languageManager.getCreditsInformation().replaceAll("~]", "\n\n"));
				b_about.setSelected(false);
				b_credits.setSelected(true);
				b_howTo.setSelected(false);
			}
			repaint();
		}
	}

}
