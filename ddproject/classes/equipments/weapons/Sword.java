package ddproject.classes.equipments.weapons;

import ddproject.classes.equipments.Weapon;

public class Sword extends Weapon {

  /**
   * The constructor of the Sword class
   * 
   * @param level
   */
  public Sword(int level) {
    super(level);
  }

  @Override
  public String toString() {
    return "| Sword level : " + level + " |";
  }
}
