package ddproject.classes.equipments.weapons;

import ddproject.classes.equipments.Weapon;

public class Bow extends Weapon {

  /**
   * The constructor of the Bow class
   * 
   * @param level
   */
  public Bow(int level) {
    super(4);
  }

  @Override
  public String toString() {
    return "| Bow level : " + level + " |";
  }
}
