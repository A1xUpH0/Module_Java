package ddproject.classes.characters;

import ddproject.classes.Player;
import ddproject.classes.equipments.defensive.Shield;
import ddproject.classes.equipments.offensive.Weapon;

public class Warrior extends Player {

  /**
   * The constructor of the Warrior class
   * @param name
   * @param health
   * @param strength
   */
  public Warrior(String name, int health, int strength, Weapon offensive, Shield defensive) {
    super(name, health, strength, offensive, defensive);
  }
}
