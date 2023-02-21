package ddproject.classes;

import ddproject.classes.equipments.OffensiveEquipment;
import ddproject.classes.equipments.offensive.Weapon;

public abstract class Player {

  /**
   * The name of the character
   */
  private String name;
  /**
   * The type of the character (Warrior or Wizard)
   */
  public int health;
  /**
   * The strength of the Character
   */
  private int strength;
  /**
   * The positionof the Character
   */
  private int position;
  /**
   * The offensive equipment of the Character (Weapon or Spell)
   */
  public OffensiveEquipment offensive;


  /**
   * Constructor of the Character class (default value)
   */
  public Player() {
    this.name = "Unknown";
    this.health = 0;
    this.strength = 0;
    this.position = 0;
    this.offensive = new Weapon(5);
  }
  /**
   * Constructor of the Character class
   * @param name : The name of the character
   * @param type : The type of the character
   * @param health : The health of the character
   * @param strength : The strength of the character
   */
  public Player(String name, int health, int strength, int position, OffensiveEquipment offensive) {
    this.name = name;
    this.health = health;
    this.strength = strength;
    this.position = position;
    this.offensive = offensive;
  }


  /**
   * override of the method toString
   */
  @Override
  public String toString(){
    return "| Player : " + name + ", Health : " + health + ", Strenght : " + strength + " |";
  }
  

  // Getters et Setters

   /**
   * Getter of "name" variable
   * @return name : The name of the character
   */
  public String getName() {
       return name;
  }
  /**
   * Setter of "name" variable
   * @param name : The name of the character
   */
  public void setName(String name) {
      this.name = name;
  }


  /**
   * Getter of "health" variable
   * @return"health : The health of the character
   */
  public int getHealth() {
    return health;
  }
  /**
   * Setter of "health" variable
   * @param health : The health of the character
   */
  public void setHealth(int health) {
      this.health = health;
  }


  /**
   * Getter of "strength" variable
   * @return"strength : The strength of the character
   */
  public int getStrength() {
    return strength;
  }
  /**
   * Setter of "strength" variable
   * @param strength : The strength of the character
   */
  public void setStrength(int strength) {
      this.strength = strength;
  }


  /**
   * Getter of "offensive" variable
   * @return"offensive : The offensive of the character
   */
  public OffensiveEquipment getOffensive() {
    return offensive;
  }
  /**
   * Setter of "strength" variable
   * @param strength : The strength of the character
   */
  public void setOffensive(OffensiveEquipment offensive) {
      this.offensive = offensive;
  }


    /**
   * Getter of "position" variable
   * @return"position : The position of the character
   */
  public int getPosition() {
    return position;
  }
  /**
   * Setter of "position" variable
   * @param position : The position of the character
   */
  public void setPosition(int position) {
      this.position = position;
  }
}