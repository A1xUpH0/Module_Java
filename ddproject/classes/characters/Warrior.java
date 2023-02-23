package ddproject.classes.characters;

import ddproject.classes.Player;

public class Warrior extends Player {

  /**
   * The constructor of the Warrior class
   * @param name
   * @param health
   * @param strength
   */
  public Warrior(String name) {
    super(name, 10, 10, 0);
  }
}
