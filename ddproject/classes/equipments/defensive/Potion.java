package ddproject.classes.equipments.defensive;

import ddproject.classes.equipments.DefensiveEquipment; // Import Defensive Equipment Class

public class Potion extends DefensiveEquipment{

  /**
   * The constructor of the Potion class
   * @param level : The level of the Potion
   * @param name : The name of the Potion
   */
  public Potion(int level, String name) {
    super(level, name);
  }
}
