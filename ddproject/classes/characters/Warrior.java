package ddproject.classes.characters;

import ddproject.classes.Character; // Import Character Class


public class Warrior extends Character {

  /**
   * The name of the Warrior 
   */
  private String name;

  /**
   * The health of the Warrior
   */
  private int health;

  /**
   * The strength of the Warrior
   */
  private int strength;

  /**
   * The offensive equipment of the Warrior
   */
  private String offensiveEquipment;

  /**
   * The defensive equipment of the Warrior
   */
  private String defensiveEquipment;


  /**
   * The constructor of the Warrior class
   * @param name : The name of the Warrior
   * @param offensiveEquipment : The offensive equipment of the Warrior
   * @param defensiveEquipment : The defensive equipment of the Warrior
   */
  public Warrior(String name, String offensiveEquipment, String defensiveEquipment) {
    this.name = name;
    this.health = 10;
    this.strength = 10;
    this.offensiveEquipment = offensiveEquipment;
    this.defensiveEquipment = defensiveEquipment;
  }

/**
 * Method which return a sentence to show the parameters "name", "offensiveEquipment", "defensiveEquipment"
   * @param name : The name of the Warrior
   * @param offensiveEquipment : The offensive equipment of the Warrior
   * @param defensiveEquipment : The defensive equipment of the Warrior
 * @return a sentence with the parameters
 */
  public String toString(String name, String offensiveEquipment, String defensiveEquipment){
    return "| Character : " + name + ", Health : " + health + ", Strenght : " + strength + " |";
  }


  // Getters et Setters
  

  /**
   * Getter of "name" variable
   * @return name : The name of the Warrior 
   */
  public String getName() {
    return name;
  }

  /**
   * Setter of "name" variable
   * @param name
   */
  public void setName(String name) {
      this.name = name;
  }

  /**
   * Getter of "offensiveEquipment" variable
   * @return offensiveEquipment : The offensive equipment of the Warrior
   */
  public String getOffensiveEquipment() {
    return offensiveEquipment;
  }

  /**
   * Setter of "offensiveEquipment" variable
   * @param offensiveEquipment
   */
  public void setOffensiveEquipment(String offensiveEquipment) {
      this.offensiveEquipment = offensiveEquipment;
  }

  /**
   * Getter of "defensiveEquipment" variable
   * @return defensiveEquipment : The defensive equipment of the Warrior
   */
  public String getDefensiveEquipment() {
    return defensiveEquipment;
  }

  /**
   * Setter of "defensiveEquipment" variable
   * @param defensiveEquipment
   */
  public void setDefensiveEquipment(String defensiveEquipment) {
      this.defensiveEquipment = defensiveEquipment;
  }
}
