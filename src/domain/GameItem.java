package domain;

public class GameItem
{
	/*
	 * GameItems are objects used by the player in altering its stats.
	 * These are the attributes of items:
	 * 
	 * Item ID				: The serial number of the item.
	 * Area Available		: The area number where the item can be bought.
	 * Item Name			: The proper name for the item.
	 * Item Description		: The item's description retrieved from the LanguageManager.
	 * Item Quantity		: The quantity of how many the player has the item.
	 * Buying Value			: The price of the item (in Au) when bought to the Shop with quantity = 1.
	 * Selling Value		: The price of the item (in Au) when sold to the Shop with quantity = 1.
	 * EffectHPtoPlayer		: The item's effect in the player's current HP.
	 * EffectSPtoPlayer		: The item's effect in the player's current SP.
	 * EffectATKtoPlayer	: The item's effect in the player's current ATK.
	 * EffectDEFtoPlayer	: The item's effect in the player's current DEF.
	 * EffectSPCtoPlayer	: The item's effect in the player's current SPC.
	 * EffectAGItoPlayer	: The item's effect in the player's current AGI.
	 * EffectCRTtoPlayer	: The item's effect in the player's current CRT.
	 * EffectHPtoOpponent	: The item's effect in the opponent's current HP.
	 * EffectSPtoOpponent	: The item's effect in the opponent's current SP.
	 * EffectATKtoOpponent	: The item's effect in the opponent's current ATK.
	 * EffectDEFtoOpponent	: The item's effect in the opponent's current DEF.
	 * EffectSPCtoOpponent	: The item's effect in the opponent's current POW.
	 * EffectAGItoOpponent	: The item's effect in the opponent's current SPD.
	 * EffectCRTtoOpponent	: The item's effect in the opponent's current LUK.
	 *  
	 */
	
	private String itemID, itemName, itemDesc;
	private int areaAvailable, itemQuantity;
	private double buyingValue, sellingValue;
	private double effectHPtoPlayer, effectSPtoPlayer, effectATKtoPlayer, effectDEFtoPlayer,
				   effectSPCtoPlayer, effectAGItoPlayer, effectCRTtoPlayer,
				   effectHPtoOpponent, effectSPtoOpponent, effectATKtoOpponent, effectDEFtoOpponent,
				   effectSPCtoOpponent, effectAGItoOpponent, effectCRTtoOpponent;
	
	//GETTERS AND SETTERS
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public int getAreaAvailable() {
		return areaAvailable;
	}
	public void setAreaAvailable(int areaAvailable) {
		this.areaAvailable = areaAvailable;
	}
	public double getBuyingValue() {
		return buyingValue;
	}
	public void setBuyingValue(double buyingValue) {
		this.buyingValue = buyingValue;
	}
	public double getSellingValue() {
		return sellingValue;
	}
	public void setSellingValue(double sellValue) {
		this.sellingValue = sellValue;
	}
	public double getEffectHPtoPlayer() {
		return effectHPtoPlayer;
	}
	public void setEffectHPtoPlayer(double effectHPtoPlayer) {
		this.effectHPtoPlayer = effectHPtoPlayer;
	}
	public double getEffectSPtoPlayer() {
		return effectSPtoPlayer;
	}
	public void setEffectSPtoPlayer(double effectSPtoPlayer) {
		this.effectSPtoPlayer = effectSPtoPlayer;
	}
	public double getEffectATKtoPlayer() {
		return effectATKtoPlayer;
	}
	public void setEffectATKtoPlayer(double effectATKtoPlayer) {
		this.effectATKtoPlayer = effectATKtoPlayer;
	}
	public double getEffectDEFtoPlayer() {
		return effectDEFtoPlayer;
	}
	public void setEffectDEFtoPlayer(double effectDEFtoPlayer) {
		this.effectDEFtoPlayer = effectDEFtoPlayer;
	}
	public double getEffectSPCtoPlayer() {
		return effectSPCtoPlayer;
	}
	public void setEffectSPCtoPlayer(double effectSPCtoPlayer) {
		this.effectSPCtoPlayer = effectSPCtoPlayer;
	}
	public double getEffectAGItoPlayer() {
		return effectAGItoPlayer;
	}
	public void setEffectAGItoPlayer(double effectAGItoPlayer) {
		this.effectAGItoPlayer = effectAGItoPlayer;
	}
	public double getEffectCRTtoPlayer() {
		return effectCRTtoPlayer;
	}
	public void setEffectCRTtoPlayer(double effectCRTtoPlayer) {
		this.effectCRTtoPlayer = effectCRTtoPlayer;
	}
	public double getEffectHPtoOpponent() {
		return effectHPtoOpponent;
	}
	public void setEffectHPtoOpponent(double effectHPtoOpponent) {
		this.effectHPtoOpponent = effectHPtoOpponent;
	}
	public double getEffectSPtoOpponent() {
		return effectSPtoOpponent;
	}
	public void setEffectSPtoOpponent(double effectSPtoOpponent) {
		this.effectSPtoOpponent = effectSPtoOpponent;
	}
	public double getEffectATKtoOpponent() {
		return effectATKtoOpponent;
	}
	public void setEffectATKtoOpponent(double effectATKtoOpponent) {
		this.effectATKtoOpponent = effectATKtoOpponent;
	}
	public double getEffectDEFtoOpponent() {
		return effectDEFtoOpponent;
	}
	public void setEffectDEFtoOpponent(double effectDEFtoOpponent) {
		this.effectDEFtoOpponent = effectDEFtoOpponent;
	}
	public double getEffectSPCtoOpponent() {
		return effectSPCtoOpponent;
	}
	public void setEffectSPCtoOpponent(double effectSPCtoOpponent) {
		this.effectSPCtoOpponent = effectSPCtoOpponent;
	}
	public double getEffectAGItoOpponent() {
		return effectAGItoOpponent;
	}
	public void setEffectAGItoOpponent(double effectAGItoOpponent) {
		this.effectAGItoOpponent = effectAGItoOpponent;
	}
	public double getEffectCRTtoOpponent() {
		return effectCRTtoOpponent;
	}
	public void setEffectCRTtoOpponent(double effectCRTtoOpponent) {
		this.effectCRTtoOpponent = effectCRTtoOpponent;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
}
