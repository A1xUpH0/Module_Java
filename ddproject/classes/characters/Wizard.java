package ddproject.classes.characters;

import ddproject.classes.Player;
import ddproject.classes.equipments.defensive.Potion;
import ddproject.classes.equipments.offensive.Spell;

public class Wizard extends Player {

  /**
   * The constructor of the Wizard class
   * @param name
   * @param health
   * @param strength
   */
  public Wizard(String name, int health, int strength, Spell offensive, Potion defensive) {
    super(name, health, strength, offensive, defensive);
  }
}
