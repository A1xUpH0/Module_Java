package ddproject.classes.characters;

import ddproject.classes.Character; // Import Charcter Class


public class Wizard extends Character {

  /**
   * Name
   */
  private String name;

  /**
   * Health Points
   */
  private int health;

  /**
   * Strength Points
   */
  private int strength;

  /**
   * Offensive Equipment
   */
  private String offensiveEquipment;

  /**
   * Defensive Equipment
   */
  private String defensiveEquipment;


  /**
   * Constructor Wizard
   * @param name
   * @param offensiveEquipment
   * @param defensiveEquipment
   */
  public Wizard(String name, String offensiveEquipment, String defensiveEquipment) {
    this.name = name;
    this.health = 6;
    this.strength = 15;
    this.offensiveEquipment = offensiveEquipment;
    this.defensiveEquipment = defensiveEquipment;
  }

  // Getters et Setters
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
      this.name = name;
  }

  public String getOffensiveEquipment() {
    return offensiveEquipment;
  }
  public void setOffensiveEquipment(String offensiveEquipment) {
      this.offensiveEquipment = offensiveEquipment;
  }

  public String getDefensiveEquipment() {
    return offensiveEquipment;
  }
  public void setDefensiveEquipment(String defensiveEquipment) {
      this.defensiveEquipment = defensiveEquipment;
  }
}
