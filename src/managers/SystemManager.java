package managers;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import domain.HumanPlayer;
import ui.*;

public class SystemManager extends JFrame
{
	private Container container;
	private CardLayout card;
	
	private BattleUI battleUI;
	private InformationUI informationUI;
	private StoryUI storyUI;
	private InventoryUI inventoryUI;
	private LoadSaveUI loadUI;
	private LoadSaveUI saveUI;
	private MainMenuUI mainMenuUI;
	private NavigationUI navigationUI;
	private NewGameUI newGameUI;
	private ShopUI shopUI;
	
	private HumanPlayer humanPlayer;
	
	private String playerClass;
	
	public SystemManager()
	{
		container = getContentPane();
		card = new CardLayout();
		container.setLayout(card);
		humanPlayer = new HumanPlayer();
		setBounds(100, 100, 1072, 629);

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

		storyUI = new StoryUI(this);
		container.add(storyUI, "Story");

		navigationUI = new NavigationUI(this);
		container.add(navigationUI, "Navigation");

		inventoryUI = new InventoryUI(this);
		container.add(inventoryUI, "Inventory");
		
		shopUI = new ShopUI(this);
		container.add(shopUI, "Shop");

		battleUI = new BattleUI(this);
		container.add(battleUI, "Battle");
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void showMainMenuUI()
	{
		setTitle("Main Menu");
		card.show(container, "Main Menu");
		repaint();
	}

	public void showNewGameUI()
	{
		setTitle("New Game");
		card.show(container, "New Game");
		repaint();
	}

	public void showLoadSaveUI(boolean forLoad)
	{
		if(forLoad)
		{
			setTitle("Load Game");
			card.show(container, "Load");
		}
		else
		{
			setTitle("Save Game");
			card.show(container, "Save");
		}
		repaint();
	}

	public void showInformationUI()
	{
		setTitle("Information");
		card.show(container, "Information");
		repaint();
	}

	public void showStoryUI()
	{
		setTitle("Story");
		card.show(container, "Story");
		repaint();
	}

	public void showNavigationUI()
	{
		setTitle("Navigation");
		card.show(container, "Navigation");
		repaint();
	}

	public void showInventoryUI()
	{
		setTitle("Inventory");
		card.show(container, "Inventory");
		repaint();
	}

	public void showShopUI()
	{
		setTitle("Shop");
		card.show(container, "Shop");
		repaint();
	}

	public void showBattleUI(String monsterID)
	{
		setTitle("Battle");
		card.show(container, "Battle");
		battleUI.processPlayerImage(playerClass); //this
		battleUI.processMonsterID(monsterID); //this
		battleUI.initializeBattleManager();
		battleUI.updateHPSPBars();
		repaint();
	}

	public HumanPlayer getHumanPlayer()
	{
		return humanPlayer;
	}

	public void setHumanPlayer(HumanPlayer humanPlayer) 
	{
		this.humanPlayer = humanPlayer;
	}
	
	public String getPlayerClass() //this
	{
		return playerClass;
	}
	
	public void setPlayerClass(String playerClass) //this
	{
		this.playerClass = playerClass;
	}
	
	public StoryUI getStoryUI()
	{
		return storyUI;
	}
	
	public static void main(String[] args)
	{
		java.awt.EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				new SystemManager().showMainMenuUI();
			}
		});
	}
}
