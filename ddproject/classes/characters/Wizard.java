package ddproject.classes.characters;

import ddproject.classes.Player;

public class Wizard extends Player {

  /**
   * The constructor of the Wizard class
   * @param name
   * @param health
   * @param strength
   */
  public Wizard(String name) {
    super(name, 6, 15, 0);
  }
}
