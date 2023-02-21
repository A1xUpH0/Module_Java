package ddproject.classes.cases;

import ddproject.classes.Case;
import ddproject.classes.Enemy;
import ddproject.classes.Player;

public abstract class EnemyCase extends Case {
  
  public EnemyCase(Player player) {
    super(player);
  }
  private Player player;
  private Enemy enemy;


  // Getters et Setters

   /**
   * Getter of "player" variable
   * @return player : The player
   */
  public Player getPlayer() {
    return player;
  }
  /**
  * Setter of "name" variable
  * @param name : The name of the character
  */
  public void setPlayer(Player player) {
    this.player = player;
  }


   /**
   * Getter of "enemy" variable
   * @return enemy : The enemy
   */
  public Enemy getEnemy() {
    return enemy;
  }
  /**
  * Setter of "name" variable
  * @param name : The name of the character
  */
  public void setEnemy(Enemy enemy) {
    this.enemy = enemy;
  }
}
