package ddproject.classes.characters;

import ddproject.classes.Player;
import ddproject.classes.equipments.offensive.Spell;

public class Wizard extends Player {

  /**
   * The constructor of the Wizard class
   * @param name
   * @param health
   * @param strength
   */
  public Wizard(String name, Spell offensive) {
    super(name, 6, 15, 0, offensive);
  }
}
