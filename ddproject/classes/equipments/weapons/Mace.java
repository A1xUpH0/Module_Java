package ddproject.classes.equipments.weapons;

import ddproject.classes.equipments.Weapon;

public class Mace extends Weapon {

  /**
   * The constructor of the Mace class
   * 
   * @param level
   */
  public Mace(int level) {
    super(level);
  }

  @Override
  public String toString() {
    return "| Mace level : " + level + " |";
  }
}
