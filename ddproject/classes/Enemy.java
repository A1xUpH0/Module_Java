package ddproject.classes;

public class Enemy {
  
  private int health;

  private int strength;


  /**
   * Constructor of the class enemy
   */
  public Enemy(int health, int strength){
    this.health = health;
    this.strength = strength;
  }


  // Getters et Setters

  /**
   * Getter of "health" variable
   * @return health : The health of the character
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
   * @return strength : The strength of the character
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

}
