package ddproject.classes.equipments.spells;

import ddproject.classes.equipments.Spell;

public class Lightning extends Spell {

  /**
   * The constructor of the Lightning class
   * 
   * @param level
   */
  public Lightning(int level) {
    super(level);
  }

  @Override
  public String toString() {
    return "| Lightning level : " + level + " |";
  }
}
