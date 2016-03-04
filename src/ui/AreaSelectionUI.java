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
	private JLabel l_bg;
	public AreaSelectionUI(SystemManager systemManager) 
	{
		this.systemManager = systemManager;
		imageManager = new ImageManager();
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JButton button = new JButton("New button");
		button.setBounds(21, 288, 240, 180);
		add(button);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(21, 69, 240, 180);
		add(btnNewButton);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(286, 69, 240, 180);
		add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(286, 288, 240, 180);
		add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(551, 288, 240, 180);
		add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(551, 69, 240, 180);
		add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(816, 69, 240, 180);
		add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_6.setBounds(816, 288, 240, 180);
		add(button_6);
		
		
		l_bg = new JLabel("New label");
		l_bg.setBounds(0, 0, 1066, 600);
		l_bg.setIcon(imageManager.getCommonBG());
		add(l_bg);

	}
	
	public static void main(String[] args)
	{
		new AreaSelectionUI(new SystemManager());
	}
}
