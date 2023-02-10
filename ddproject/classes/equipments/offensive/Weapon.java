package ddproject.classes.equipments.offensive;

import ddproject.classes.equipments.OffensiveEquipment; // Import Offensive Equipment Class

public class Weapon extends OffensiveEquipment{

  /**
   * The constructor of the Weapon class
   * @param type : The type of the Weapon
   * @param level : The level of the Weapon
   * @param name : The name of the Weapon
   */
  public Weapon(String type, int level, String name) {
    super(type, level, name);
  }
  
}
