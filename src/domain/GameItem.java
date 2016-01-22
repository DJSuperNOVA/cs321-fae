package domain;

public class GameItem
{
	/*
	 * GameItems are objects used by the player in altering its stats.
	 * It can either be consumed (Potions) or equipped (Weapon, Armor, Accessory, Footwear).
	 * These are the attributes of items:
	 * 
	 * ItemID				: The serial number of the item. The item's area availability and item type
	 * 							can be determined through it. This is the format--
	 * 									The letter defines it's type:
	 * 										W = Weapon, A = Armor, X = Accessory, F = Footwear (Usable)
	 * 										P = Potion (Consumable)
	 * 									The first number defines what area that item can be bought or dropped.
	 * 									The last two numbers define the proper item code.
	 * Item Name			: The proper name for the item.
	 * Item Info Code		: The code which will serve as the key in obtaining the item's description
	 * 							in the LanguageManager.
	 * Buying Value			: The price of the item (in Au) when bought to the Shop with quantity = 1.
	 * Selling Value		: The price of the item (in Au) when sold to the Shop with quantity = 1.
	 * Quantity				: The quantity of the item in the bundle. When the same item is acquired, it will 
	 * 							not add another entry in the player's Inventory but adds the quantity instead.
	 * EffectCurrentHP		: The item's effect in the player's current HP.
	 * EffectCurrentSP		: The item's effect in the player's current SP.
	 * EffectCurrentATK		: The item's effect in the player's current ATK.
	 * EffectCurrentDEF		: The item's effect in the player's current DEF.
	 * EffectCurrentPOW		: The item's effect in the player's current POW.
	 * EffectCurrentSPD		: The item's effect in the player's current SPD.
	 * EffectCurrentLUK		: The item's effect in the player's current LUK.
	 * EffectDefHP			: The item's effect in the player's default HP.
	 * EffectDefSP			: The item's effect in the player's default SP.
	 * EffectDefATK			: The item's effect in the player's default ATK.
	 * EffectDefDEF			: The item's effect in the player's default DEF.
	 * EffectDefPOW			: The item's effect in the player's default POW.
	 * EffectDefSPD			: The item's effect in the player's default SPD.
	 * EffectDefLUK			: The item's effect in the player's default LUK.
	 * EffectCureAilment	: The item's effect in treating the player's ailment.
	 *  
	 */
	
	private String itemID, itemName, itemInfoCode;
	private double buyingValue, sellingValue;
	private int quantity;
	private double effectCurrentHP, effectCurrentSP, effectCurrentATK, effectCurrentDEF, 
					effectCurrentPOW, effectCurrentSPD, effectCurrentLUK;
	private double effectDefHP, effectDefSP, effectDefATK, effectDefDEF, effectDefPOW, effectDefSPD, effectDefLUK;
	
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
	public String getItemInfoCode() {
		return itemInfoCode;
	}
	public void setItemInfoCode(String itemInfoCode) {
		this.itemInfoCode = itemInfoCode;
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
	public void setSellingValue(double sellingValue) {
		this.sellingValue = sellingValue;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getEffectCurrentHP() {
		return effectCurrentHP;
	}
	public void setEffectCurrentHP(double effectCurrentHP) {
		this.effectCurrentHP = effectCurrentHP;
	}
	public double getEffectCurrentSP() {
		return effectCurrentSP;
	}
	public void setEffectCurrentSP(double effectCurrentSP) {
		this.effectCurrentSP = effectCurrentSP;
	}
	public double getEffectCurrentATK() {
		return effectCurrentATK;
	}
	public void setEffectCurrentATK(double effectCurrentATK) {
		this.effectCurrentATK = effectCurrentATK;
	}
	public double getEffectCurrentDEF() {
		return effectCurrentDEF;
	}
	public void setEffectCurrentDEF(double effectCurrentDEF) {
		this.effectCurrentDEF = effectCurrentDEF;
	}
	public double getEffectCurrentPOW() {
		return effectCurrentPOW;
	}
	public void setEffectCurrentPOW(double effectCurrentPOW) {
		this.effectCurrentPOW = effectCurrentPOW;
	}
	public double getEffectCurrentSPD() {
		return effectCurrentSPD;
	}
	public void setEffectCurrentSPD(double effectCurrentSPD) {
		this.effectCurrentSPD = effectCurrentSPD;
	}
	public double getEffectCurrentLUK() {
		return effectCurrentLUK;
	}
	public void setEffectCurrentLUK(double effectCurrentLUK) {
		this.effectCurrentLUK = effectCurrentLUK;
	}
	public double getEffectDefHP() {
		return effectDefHP;
	}
	public void setEffectDefHP(double effectDefHP) {
		this.effectDefHP = effectDefHP;
	}
	public double getEffectDefSP() {
		return effectDefSP;
	}
	public void setEffectDefSP(double effectDefSP) {
		this.effectDefSP = effectDefSP;
	}
	public double getEffectDefATK() {
		return effectDefATK;
	}
	public void setEffectDefATK(double effectDefATK) {
		this.effectDefATK = effectDefATK;
	}
	public double getEffectDefDEF() {
		return effectDefDEF;
	}
	public void setEffectDefDEF(double effectDefDEF) {
		this.effectDefDEF = effectDefDEF;
	}
	public double getEffectDefPOW() {
		return effectDefPOW;
	}
	public void setEffectDefPOW(double effectDefPOW) {
		this.effectDefPOW = effectDefPOW;
	}
	public double getEffectDefSPD() {
		return effectDefSPD;
	}
	public void setEffectDefSPD(double effectDefSPD) {
		this.effectDefSPD = effectDefSPD;
	}
	public double getEffectDefLUK() {
		return effectDefLUK;
	}
	public void setEffectDefLUK(double effectDefLUK) {
		this.effectDefLUK = effectDefLUK;
	}
	
}
