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
		setBounds(100, 100, 1082, 639);

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
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void showMainMenuUI()
	{
		setTitle("Main Menu");
		setLocationRelativeTo(null);
		card.show(container, "Main Menu");
		repaint();
	}

	public void showNewGameUI()
	{
		setTitle("New Game");
		setLocationRelativeTo(null);
		card.show(container, "New Game");
	}

	public void showLoadSaveUI(boolean forLoad)
	{
		if(forLoad)
		{
			setTitle("Load Game");
			setLocationRelativeTo(null);
			card.show(container, "Load");
		}
		else
		{
			setTitle("Save Game");
			setLocationRelativeTo(null);
			card.show(container, "Save");
		}	
	}

	public void showInformationUI()
	{
		setTitle("Information");
		setLocationRelativeTo(null);
		card.show(container, "Information");
	}

	public void showIntroductionUI()
	{
		setTitle("Introduction");
		setLocationRelativeTo(null);
		card.show(container, "Introduction");
	}

	public void showNavigationUI()
	{
		setTitle("Navigation");
		setLocationRelativeTo(null);
		card.show(container, "Navigation");
	}

	public void showInventoryUI()
	{
		setTitle("Inventory");
		setLocationRelativeTo(null);
		card.show(container, "Inventory");
	}

	public void showShopUI()
	{
		setTitle("Shop");
		setLocationRelativeTo(null);
		card.show(container, "Shop");
	}

	public void showBattleUI()
	{
		setTitle("Battle");
		setLocationRelativeTo(null);
		card.show(container, "Battle");
	}

	public static void main(String[] args)
	{
		new SystemManager().showMainMenuUI();
	}
}
