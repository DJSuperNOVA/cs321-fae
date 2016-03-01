package managers;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StatsManager 
{
	/*
	 * The StatsManager stores the raw base stats of players, mobs, and bosses.
	 * It also includes the XP chart for Swordsman and Mage.
	 */

	private Scanner in;
	private double[] swordsmanXPChart, mageXPChart;
	private ArrayList<Integer[]> swordsmanBaseStats, mageBaseStats;

	public StatsManager()
	{
		scanSwordsmanXPChart();
		scanMageXPChart();
		scanSwordsmanBaseStats();
		scanMageBaseStats();
		scanMobBaseStats();
		scanBossBaseStats();
	}

	private void scanSwordsmanXPChart() 
	{
		try 
		{
			in = new Scanner(new File("resources/data/swordsman_xpchart.fae"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		swordsmanXPChart = new double[100];
		int index = 0;
		while(in.hasNext())
		{
			swordsmanXPChart[index] = Integer.parseInt(in.next());
			index++;
		}
	}

	public int getPlayerLevel(String battleClass, double xp)
	{
		int toReturn;
		if(battleClass.equals("Swordsman"))
		{
			for(toReturn = 0; toReturn < swordsmanXPChart.length; toReturn++)
			{
				if(xp < swordsmanXPChart[toReturn])
				{
					toReturn++;
					break;
				}
			}
		}
		else
		{
			for(toReturn = 0; toReturn < mageXPChart.length; toReturn++)
			{
				if(xp < mageXPChart[toReturn])
				{
					toReturn++;
					break;
				}
			}
		}
		return toReturn;
	}

	public double getPlayerXPtoNextLevel(String battleClass, int level)
	{
		double toReturn = 0.0;
		if(battleClass.equals("Swordsman"))
		{
			if(level < 101)
				toReturn = swordsmanXPChart[level-1];
			else
				toReturn = 999999999;
		}
		else
		{
			if(level < 101)
				toReturn = mageXPChart[level-1];
			else
				toReturn = 999999999;
		}
		return toReturn;
	}

	private void scanMageXPChart() 
	{
		try 
		{
			in = new Scanner(new File("resources/data/mage_xpchart.fae"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		mageXPChart = new double[100];
		int index = 0;
		while(in.hasNext())
		{
			mageXPChart[index] = Integer.parseInt(in.next());
			index++;
		}
	}

	private void scanSwordsmanBaseStats()
	{
		try
		{
			in = new Scanner(new File("resources/data/basestats_swordsman.fae"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Integer[] stats;
		String[] statsInString;
		swordsmanBaseStats = new ArrayList<Integer[]>();
		while(in.hasNext())
		{
			statsInString = in.next().split(",");
			stats = new Integer[7];
			for(int i = 0; i < stats.length; i++)
				stats[i] = Integer.parseInt(statsInString[i]);
			swordsmanBaseStats.add(stats);
		}
	}

	private void scanMageBaseStats() 
	{
		try
		{
			in = new Scanner(new File("resources/data/basestats_mage.fae"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Integer[] stats;
		String[] statsInString;
		mageBaseStats = new ArrayList<Integer[]>();
		while(in.hasNext())
		{
			statsInString = in.next().split(",");
			stats = new Integer[7];
			for(int i = 0; i < stats.length; i++)
				stats[i] = Integer.parseInt(statsInString[i]);
			mageBaseStats.add(stats);
		}
	}

	public Integer getPlayerHPbaseStat(String battleClass, int level)
	{
		int toReturn = 0;
		if(battleClass.equals("Swordsman"))
			toReturn = swordsmanBaseStats.get(level-1)[0];
		else
			toReturn = mageBaseStats.get(level-1)[0];
		return toReturn;
	}
	public Integer getPlayerSPbaseStat(String battleClass, int level)
	{
		int toReturn = 0;
		if(battleClass.equals("Swordsman"))
			toReturn = swordsmanBaseStats.get(level-1)[1];
		else
			toReturn = mageBaseStats.get(level-1)[1];
		return toReturn;
	}
	public Integer getPlayerATKbaseStat(String battleClass, int level)
	{
		int toReturn = 0;
		if(battleClass.equals("Swordsman"))
			toReturn = swordsmanBaseStats.get(level-1)[2];
		else
			toReturn = mageBaseStats.get(level-1)[2];
		return toReturn;
	}
	public Integer getPlayerDEFbaseStat(String battleClass, int level)
	{
		int toReturn = 0;
		if(battleClass.equals("Swordsman"))
			toReturn = swordsmanBaseStats.get(level-1)[3];
		else
			toReturn = mageBaseStats.get(level-1)[3];
		return toReturn;
	}
	public Integer getPlayerSPCbaseStat(String battleClass, int level)
	{
		int toReturn = 0;
		if(battleClass.equals("Swordsman"))
			toReturn = swordsmanBaseStats.get(level-1)[4];
		else
			toReturn = mageBaseStats.get(level-1)[4];
		return toReturn;
	}
	public Integer getPlayerAGIbaseStat(String battleClass, int level)
	{
		int toReturn = 0;
		if(battleClass.equals("Swordsman"))
			toReturn = swordsmanBaseStats.get(level-1)[5];
		else
			toReturn = mageBaseStats.get(level-1)[5];
		return toReturn;
	}
	public Integer getPlayerCRTbaseStat(String battleClass, int level)
	{
		int toReturn = 0;
		if(battleClass.equals("Swordsman"))
			toReturn = swordsmanBaseStats.get(level-1)[6];
		else
			toReturn = mageBaseStats.get(level-1)[6];
		return toReturn;
	}
	

	private void scanMobBaseStats() 
	{
		// TODO Auto-generated method stub

	}

	private void scanBossBaseStats()
	{
		// TODO Auto-generated method stub

	}

	public static void main(String[] args)
	{
		new StatsManager();
	}
}