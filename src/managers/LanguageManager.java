package managers;
import java.io.*;
import java.util.Scanner;

public class LanguageManager
{
	/*
	 * LanguageManager stores the long texts and descriptions used on cutscenes (including introduction),
	 * battle dialogs, information texts, and item descriptions. It is loaded by UI cards that uses it.
	 * 
	 * The UI card may only choose one language pack:
	 * - cutscene
	 * - battle
	 * - newGame
	 * - item
	 * - information
	 */
	
	private String[] cutscenes, battleEvents, newGameDescriptions, itemDescriptions;
	private String about, credits;
	private Scanner in;
	
	public LanguageManager(String langpack)
	{
		if(langpack.equals("cutscene"))
			scanCutscenes();
		else if(langpack.equals("newGame"))
			scanNewGameDescriptions();
		else if(langpack.equals("item"))
			scanItemDescriptions();
		else
			scanInformationTexts();
	}

	private void scanCutscenes() 
	{
		try 
		{
			in = new Scanner(new File("resources/data/cutscene_texts.fae"));
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		String text = new String("");
		while(in.hasNext())
		{
			text += in.next() + " ";
		}
		cutscenes = text.split("~~");
	}

	public String getCutsceneText(int bossWins)
	{
		return cutscenes[bossWins];
		/*
		 * index 0 is the Introduction.
		 */
	}
	
	private void scanNewGameDescriptions() 
	{
		try 
		{
			in = new Scanner(new File("resources/data/newgame_descriptions.fae"));
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = new String("");
		while(in.hasNext())
		{
			text += in.next() + " ";
		}
		newGameDescriptions = text.split("~~");
	}
	
	public String getSwordsmanDescription()
	{
		return newGameDescriptions[0];
	}
	
	public String getMageDescription()
	{
		return newGameDescriptions[1];
	}

	private void scanItemDescriptions() 
	{
		try 
		{
			in = new Scanner(new File("resources/data/item_descriptions.fae"));
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = new String("");
		while(in.hasNext())
		{
			text += in.next() + " ";
		}
		itemDescriptions = text.split("~~");
	}
	
	public String getItemDescription(String itemID)
	{
		int itemIndex = Integer.parseInt(itemID.substring(1)) - 1;
		return itemDescriptions[itemIndex];
	}

	private void scanInformationTexts()
	{
		try 
		{
			in = new Scanner(new File("resources/data/information_about.fae"));
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = new String("");
		while(in.hasNext())
		{
			text += in.next() + " ";
		}
		about = text;
		try 
		{
			in = new Scanner(new File("resources/data/information_credits.fae"));
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		text = new String("");
		while(in.hasNext())
		{
			text += in.next() + " ";
		}
		credits = text;
	}
	
	public String getAboutInformation()
	{
		return about;
	}
	
	public String getCreditsInformation()
	{
		return credits;
	}
}
