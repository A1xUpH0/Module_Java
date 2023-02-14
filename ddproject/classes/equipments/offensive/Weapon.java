package ddproject.classes.equipments.offensive;

import ddproject.classes.equipments.OffensiveEquipment; // Import Offensive Equipment Class

public class Weapon extends OffensiveEquipment{

  /**
   * The constructor of the Weapon class
   * @param level : The level of the Weapon
   * @param name : The name of the Weapon
   */
  public Weapon(int level, String name) {
    super(level, name);
  }
  
}
