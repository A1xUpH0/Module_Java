package ddproject.classes.equipments.spells;

import ddproject.classes.equipments.Spell;

public class Invisibility extends Spell {

  /**
   * The constructor of the Invisibility class
   * 
   * @param level
   */
  public Invisibility(int level) {
    super(5);
  }

  @Override
  public String toString() {
    return "| Invisibility level : " + level + " |";
  }
}
