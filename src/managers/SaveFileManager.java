package managers;
import domain.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SaveFileManager 
{
	/*
	 * SaveFileManager saves and loads the save files of the player.
	 */
	private Scanner in;
	private HumanPlayer[] playerSaves;
	private DecimalFormat d0;
	private StatsManager statsManager;

	public SaveFileManager()
	{
		playerSaves = new HumanPlayer[3];
		statsManager = new StatsManager();
		d0 = new DecimalFormat("####");
		scanSaveFile(1);
		scanSaveFile(2);
		scanSaveFile(3);
	}

	private void scanSaveFile(int i)
	{
		//scanning for save file
		try
		{
			in = new Scanner(new File("resources/data/save"+ i +"_data.fae"));
		} catch(Exception e)
		{
			System.out.println("Failed to scan SaveFile " + i + ".");
			e.printStackTrace();
		}
		HumanPlayer player = new HumanPlayer();
		String rawInfo = new String(""), splitInfo[];
		while(in.hasNext())
		{
			rawInfo += in.next();
		}
		splitInfo = rawInfo.split(",");
		player.setName(splitInfo[0]);
		
		player.setBattleClass(splitInfo[1]);
		player.setXP(Double.parseDouble(d0.format(Double.parseDouble(splitInfo[2])))); //lol
		player.setAu(Double.parseDouble(d0.format(Double.parseDouble(splitInfo[3])))); //hahaha
		/*
		 * Explanation: The decimal shall be disregarded when scanning the XP, Au, and plusStats.
		 * So what happens here is that the collected value (in String) is parsed to Double,
		 * then the DecimalFormat d0 will format that value (in Double) without the decimal values, but
		 * turns it into String. Finally, that string will be reparsed as a Double.
		 * The reason for this is to lessen that multiple unnecessary zeros on the value, like
		 * 1.0000000001.
		 */
		player.setBossWins(Integer.parseInt(splitInfo[4]));
		player.setWins(Integer.parseInt(splitInfo[5]));
		player.setBossKeys(Integer.parseInt(splitInfo[6]));
		player.setPlusHP(Double.parseDouble(d0.format(Double.parseDouble(splitInfo[7]))));
		player.setPlusSP(Double.parseDouble(d0.format(Double.parseDouble(splitInfo[8]))));
		player.setPlusATK(Double.parseDouble(d0.format(Double.parseDouble(splitInfo[9]))));
		player.setPlusDEF(Double.parseDouble(d0.format(Double.parseDouble(splitInfo[10]))));
		player.setPlusSPC(Double.parseDouble(d0.format(Double.parseDouble(splitInfo[11]))));
		player.setPlusAGI(Double.parseDouble(d0.format(Double.parseDouble(splitInfo[12]))));
		player.setPlusCRT(Double.parseDouble(d0.format(Double.parseDouble(splitInfo[13]))));
		player.refreshLevel(splitInfo[1], player.getXP());
		player.calculateDefStats();
		player.setCurrentHP(player.getDefHP());
		player.setCurrentSP(player.getDefSP());
		player.setCurrentATK(player.getDefATK());
		player.setCurrentDEF(player.getDefDEF());
		player.setCurrentSPC(player.getDefSPC());
		player.setCurrentAGI(player.getDefAGI());
		player.setCurrentCRT(player.getDefCRT());
		player.setSkillSet(statsManager.getSkillSet(player.getBattleClass()));
		playerSaves[i-1] = player;
	}
	
	public ArrayList<GameItem> getInventory(int fileNumber)
	{
		ArrayList<GameItem> toReturn = new ArrayList<GameItem>();
		try
		{
			in = new Scanner(new File("resources/data/save" + fileNumber + "_inventory.fae"));
		}catch(Exception e)
		{
			System.out.println("Failed to getInventory" + fileNumber);
			e.printStackTrace();
		}
		GameItem gameItem;
		String rawInfo, splitInfo[];
		
		while(in.hasNextLine())
		{
			gameItem = new GameItem();
			rawInfo = in.nextLine();
			splitInfo = rawInfo.split(",");
			gameItem = statsManager.getGameItem(splitInfo[0]);
			gameItem.setQuantity(Integer.parseInt(splitInfo[1]));
			toReturn.add(gameItem);
		}
		return toReturn;
	}
	
	public void setInventory(int fileNumber, ArrayList<GameItem> inventory)
	{
		File saveFile = new File("resources/data/save" + fileNumber + "_inventory.fae");
		try
		{
			PrintWriter writer = new PrintWriter(saveFile);
			for(GameItem gi: inventory)
			{
				writer.println(gi.getItemID()+","+gi.getQuantity());
			}
			writer.flush();
			writer.close();
		}catch(Exception e)
		{
			System.out.println("Saving inventory for file " + fileNumber + " failed.");
			e.printStackTrace();
		}
	}

	public HumanPlayer getSaveFile(int fileNumber)
	{
		HumanPlayer toReturn = new HumanPlayer();
		if(!(playerSaves[fileNumber-1].getBattleClass().equals("X")))
			toReturn = playerSaves[fileNumber-1];
		else
		{
			toReturn.setName("-------");
			toReturn.setBossWins(0);
			toReturn.setLevel(0);
			toReturn.setBattleClass("X");
		}
		return toReturn;
	}

	public void setSaveFile(int fileNumber, HumanPlayer player)
	{
		File saveFile = new File("resources/data/save" + fileNumber + "_data.fae");
		try 
		{
			PrintWriter writer = new PrintWriter(saveFile);
			writer.println(player.toString());
			writer.flush();
			writer.close();
		} catch (Exception e) 
		{
			System.out.println("Saving on SaveFile " + fileNumber + " failed.");
			e.printStackTrace();
		}
	}
	
	public void deleteSaveFile(int fileNumber)
	{
		File deleteFile = new File("resources/data/save" + fileNumber + "_data.fae");
		try
		{
			PrintWriter writer = new PrintWriter(deleteFile);
			writer.println("-----,"
					+ "X,\n0,\n0,\n0,\n0,\n0,\n0,\n0,\n0,\n0,\n0,\n0,\n0");
			writer.flush();
			writer.close();
			
		}catch(Exception e)
		{
			System.out.println("Delete failed.");
			e.printStackTrace();
		}
	}
}
