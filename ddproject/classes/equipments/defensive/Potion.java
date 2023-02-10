package ddproject.classes.equipments.defensive;

import ddproject.classes.equipments.DefensiveEquipment; // Import Defensive Equipment Class

public class Potion extends DefensiveEquipment{

  /**
   * The constructor of the Potion class
   * @param type : The type of the Potion
   * @param level : The level of the Potion
   * @param name : The name of the Potion
   */
  public Potion(String type, int level, String name) {
    super(type, level, name);
  }
}
