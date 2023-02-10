package ddproject.classes.equipments.offensive;

import ddproject.classes.equipments.OffensiveEquipment; // Import Offensive Equipment Class

public class Spell extends OffensiveEquipment{

  /**
   * The constructor of the Spell class
   * @param type : The type of the Spell
   * @param level : The level of the Spell
   * @param name : The name of the Spell
   */
  public Spell(String type, int level, String name) {
    super(type, level, name);
  }
  
}
