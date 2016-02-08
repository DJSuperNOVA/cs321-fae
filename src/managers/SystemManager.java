package managers;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import ui.*;

public class SystemManager extends JFrame
{
	private Container container;
	private CardLayout card;
	
	private BattleUI battleUI;
	private InformationUI informationUI;
	private IntroductionUI introductionUI;
	private InventoryUI inventoryUI;
	private LoadSaveUI loadUI;
	private LoadSaveUI saveUI;
	private MainMenuUI mainMenuUI;
	private NavigationUI navigationUI;
	private NewGameUI newGameUI;
	private ShopUI shopUI;
	
	public SystemManager()
	{
		container = getContentPane();
		card = new CardLayout();
		container.setLayout(card);
<<<<<<< HEAD
		setBounds(100, 100, 1072, 629);
=======
		setBounds(100, 100, 1082, 639);
>>>>>>> origin/master

		mainMenuUI = new MainMenuUI(this);
		container.add(mainMenuUI, "Main Menu");

		newGameUI = new NewGameUI(this);
		container.add(newGameUI, "New Game");

		loadUI = new LoadSaveUI(this, true);
		container.add(loadUI, "Load");

		saveUI = new LoadSaveUI(this, false);
		container.add(saveUI, "Save");
		
		informationUI = new InformationUI(this);
		container.add(informationUI, "Information");

		introductionUI = new IntroductionUI(this);
		container.add(introductionUI, "Introduction");

		navigationUI = new NavigationUI(this);
		container.add(navigationUI, "Navigation");

		inventoryUI = new InventoryUI(this);
		container.add(inventoryUI, "Inventory");
		
		shopUI = new ShopUI(this);
		container.add(shopUI, "Shop");

		battleUI = new BattleUI(this);
		container.add(battleUI, "Battle");
		
		setResizable(false);
<<<<<<< HEAD
		setLocationRelativeTo(null);
=======
>>>>>>> origin/master
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void showMainMenuUI()
	{
		setTitle("Main Menu");
<<<<<<< HEAD
=======
		setLocationRelativeTo(null);
>>>>>>> origin/master
		card.show(container, "Main Menu");
		repaint();
	}

	public void showNewGameUI()
	{
		setTitle("New Game");
<<<<<<< HEAD
		card.show(container, "New Game");
		repaint();
=======
		setLocationRelativeTo(null);
		card.show(container, "New Game");
>>>>>>> origin/master
	}

	public void showLoadSaveUI(boolean forLoad)
	{
		if(forLoad)
		{
			setTitle("Load Game");
<<<<<<< HEAD
=======
			setLocationRelativeTo(null);
>>>>>>> origin/master
			card.show(container, "Load");
		}
		else
		{
			setTitle("Save Game");
<<<<<<< HEAD
			card.show(container, "Save");
		}
		repaint();
=======
			setLocationRelativeTo(null);
			card.show(container, "Save");
		}	
>>>>>>> origin/master
	}

	public void showInformationUI()
	{
		setTitle("Information");
<<<<<<< HEAD
		card.show(container, "Information");
		repaint();
=======
		setLocationRelativeTo(null);
		card.show(container, "Information");
>>>>>>> origin/master
	}

	public void showIntroductionUI()
	{
		setTitle("Introduction");
<<<<<<< HEAD
		card.show(container, "Introduction");
		repaint();
=======
		setLocationRelativeTo(null);
		card.show(container, "Introduction");
>>>>>>> origin/master
	}

	public void showNavigationUI()
	{
		setTitle("Navigation");
<<<<<<< HEAD
		card.show(container, "Navigation");
		repaint();
=======
		setLocationRelativeTo(null);
		card.show(container, "Navigation");
>>>>>>> origin/master
	}

	public void showInventoryUI()
	{
		setTitle("Inventory");
<<<<<<< HEAD
		card.show(container, "Inventory");
		repaint();
=======
		setLocationRelativeTo(null);
		card.show(container, "Inventory");
>>>>>>> origin/master
	}

	public void showShopUI()
	{
		setTitle("Shop");
<<<<<<< HEAD
		card.show(container, "Shop");
		repaint();
=======
		setLocationRelativeTo(null);
		card.show(container, "Shop");
>>>>>>> origin/master
	}

	public void showBattleUI()
	{
		setTitle("Battle");
<<<<<<< HEAD
		card.show(container, "Battle");
		repaint();
=======
		setLocationRelativeTo(null);
		card.show(container, "Battle");
>>>>>>> origin/master
	}

	public static void main(String[] args)
	{
		new SystemManager().showMainMenuUI();
	}
}
