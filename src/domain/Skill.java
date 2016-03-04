package domain;

public class Skill 
{
	/*
	 * Skills are special attacks that FAECharacters use. Basically, a skill is a signature move
	 * which is unique to every FAECharacter, and the only differences of these to normal attacks
	 * is that it has a Name, and it consumes SP (Skill Points).
	 */
	
	private String skillName;
	private double skillHPCost;
	private double skillSPCost;
	private int requiredLevel;
	
	//GETTERS AND SETTERS
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public double getSkillHPCost() {
		return skillHPCost;
	}
	public void setSkillHPCost(double skillHPCost) {
		this.skillHPCost = skillHPCost;
	}
	public double getSkillSPCost() {
		return skillSPCost;
	}
	public void setSkillSPCost(double costSP) {
		this.skillSPCost = costSP;
	}
	public int getRequiredLevel() {
		return requiredLevel;
	}
	public void setRequiredLevel(int requiredLevel) {
		this.requiredLevel = requiredLevel;
	}
}
