package ddproject.classes.cases.enemiecases;

import ddproject.classes.Enemy;
import ddproject.classes.Player;
import ddproject.classes.cases.EnemyCase;
import ddproject.classes.enemies.Goblin;

public class GoblinCase extends EnemyCase {

  public GoblinCase(Player player) {
    super(player);
  }
  

  public void run(Player player) {
    System.out.println("case " + player.getPosition() + "/" + 63 + " | Goblin on this case");
    int playerDamage = player.getStrength() + player.getOffensive().level;
    Enemy goblin = new Goblin();
    if (playerDamage >= goblin.getHealth()){
      System.out.println("FIGHT WIN !");
    }
    else {
      player.setHealth(player.getHealth() - goblin.getStrength());
      System.out.println("You lose " + goblin.getStrength() + " health points");
    }
  }
}
