package ddproject.classes.equipments.defensive;

import ddproject.classes.equipments.DefensiveEquipment; // Import Defensive Equipment Class

public class Shield extends DefensiveEquipment{

  /**
   * The constructor of the Shield class
   * @param type : The type of the Shield
   * @param level : The level of the Shield
   * @param name : The name of the Shield
   */
  public Shield(String type, int level, String name) {
    super(type, level, name);
  }
}
