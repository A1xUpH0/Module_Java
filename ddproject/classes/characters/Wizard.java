package ddproject.classes.characters;

import ddproject.classes.Character; // Import Charcter Class


public class Wizard extends Character {

  /**
   * The name of the Wizard 
   */
  private String name;

  /**
   * The health of the Wizard
   */
  private int health;

  /**
   * The strength of the Wizard
   */
  private int strength;

  /**
   * The offensive equipment of the Wizard
   */
  private String offensiveEquipment;

  /**
   * The defensive equipment of the Wizard
   */
  private String defensiveEquipment;


  /**
   * The constructor of the Wizard class
   * @param name : The name of the Wizard
   * @param offensiveEquipment : The offensive equipment of the Wizard
   * @param defensiveEquipment : The defensive equipment of the Wizard
   */
  public Wizard(String name, String offensiveEquipment, String defensiveEquipment) {
    this.name = name;
    this.health = 6;
    this.strength = 15;
    this.offensiveEquipment = offensiveEquipment;
    this.defensiveEquipment = defensiveEquipment;
  }

/**
 * Method which return a sentence to show the parameters "name", "offensiveEquipment", "defensiveEquipment"
   * @param name : The name of the Wizard
   * @param offensiveEquipment : The offensive equipment of the Wizard
   * @param defensiveEquipment : The defensive equipment of the Wizard
 * @return a sentence with the parameters
 */
  public String toString(String name, String offensiveEquipment, String defensiveEquipment){
    return "| Character : " + name + ", Health : " + health + ", Strenght : " + strength + " |";
  }


  // Getters et Setters
  

  /**
   * Getter of "name" variable
   * @return name : The name of the Wizard 
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
   * @return offensiveEquipment : The offensive equipment of the Wizard
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
   * @return defensiveEquipment : The defensive equipment of the Wizard
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
