package ddproject.classes.equipments.offensive.spells;

import ddproject.classes.equipments.offensive.Spell;

public class Lightning extends Spell {

  /**
   * The constructor of the Lightning class
   * @param level
   */
  public Lightning(int level) {
    super(level);
  }
  

  @Override
  public String toString(){
    return "| Lightning level : " + level + " |";
  }
}
