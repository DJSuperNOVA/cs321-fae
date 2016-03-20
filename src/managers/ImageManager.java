package managers;
import javax.swing.ImageIcon;
public class ImageManager 
{
	/*
	 * ImageManager simplifies what image graphics that UI cards will get.
	 */
	
	public ImageIcon getMainMenuGraphic(String graphic)
	{
		return new ImageIcon("resources/graphics/MainMenu/MainMenu_" + graphic + ".png");
	}
	
	public ImageIcon getNewGameGraphic(String graphic)
	{
		return new ImageIcon("resources/graphics/NewGame/NewGame_" + graphic + ".png");
	}
	
	public ImageIcon getInformationGraphic(String graphic)
	{
		return new ImageIcon("resources/graphics/Information/Information_" + graphic + ".png");
	}
	
	public ImageIcon getAreaSelectionGraphic(String graphic)
	{
		return new ImageIcon("resources/graphics/AreaSelection/Area" + graphic + ".png");
	}
	
	public ImageIcon getStoryGraphic(String graphic)
	{
		return new ImageIcon("resources/graphics/Story/Story_" + graphic + ".png");
	}
	
	public ImageIcon getNavigationGraphic(String graphic)
	{
		return new ImageIcon("resources/graphics/Navigation/Navigation_" + graphic + ".png");
	}
	
	public ImageIcon getAreaLocation(int area, String location)
	{
		return new ImageIcon("resources/graphics/Navigation/Navigation_A" + area + "-" + location + ".png");
	}
	
	public ImageIcon getInventoryGraphic(String graphic)
	{
		return new ImageIcon("resources/graphics/Inventory/Inventory_" + graphic + ".png");
	}
	
	public ImageIcon getLoadSaveGraphic(String graphic)
	{
		return new ImageIcon("resources/graphics/LoadSave/LoadSave_" + graphic + ".png");
	}
	
	public ImageIcon getBattleGraphic(String graphic)
	{
		return new ImageIcon("resources/graphics/Battle/Battle_" + graphic + ".png");
	}
	
	public ImageIcon getBattleBG(int area)
	{
		return new ImageIcon("resources/graphics/Battle/Battle_BG-A" + area + ".png");
	}
	
	public ImageIcon getBattlePlayer(String battleClass) //this
	{
		return new ImageIcon("resources/graphics/Battle/BATTLE SPRITES/Battle_" + battleClass + ".png");
	}
	
	public ImageIcon getBattleMobOpponent(int mobID) //this
	{
		return new ImageIcon("resources/graphics/Battle/BATTLE SPRITES/Battle_Mob" + mobID + ".png");
	}
	
	public ImageIcon getBattleBossOpponent(int bossID) //this
	{
		return new ImageIcon("resources/graphics/Battle/BATTLE SPRITES/Battle_Boss" + bossID + ".png");
	}
	
	public ImageIcon getShopGraphic(String graphic)
	{
		return new ImageIcon("resources/graphics/Shop/Shop_" + graphic + ".png");
	}
	
	public ImageIcon getCommonBG()
	{
		return new ImageIcon("resources/graphics/common/Common_BG.png");
	}
}