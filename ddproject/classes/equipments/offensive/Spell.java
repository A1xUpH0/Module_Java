package ddproject.classes.equipments.offensive;

import ddproject.classes.equipments.OffensiveEquipment; // Import Offensive Equipment Class

public class Spell extends OffensiveEquipment{

  /**
   * The constructor of the Spell class
   * @param level : The level of the Spell
   * @param name : The name of the Spell
   */
  public Spell(int level, String name) {
    super(level, name);
  }
  
}