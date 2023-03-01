package ddproject.classes.equipments.spells;

import ddproject.classes.equipments.Spell;

public class Fireball extends Spell {

  /**
   * The constructor of the Fireball class
   * 
   * @param level
   */
  public Fireball(int level) {
    super(level);
  }

  @Override
  public String toString() {
    return "| Fireball level : " + level + " |";
  }
}
