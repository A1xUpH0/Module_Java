package ddproject.classes.cases.enemiecases;

import ddproject.classes.Enemy;
import ddproject.classes.Player;
import ddproject.classes.cases.EnemyCase;
import ddproject.classes.enemies.Orc;

public class OrcCase extends EnemyCase {

  public OrcCase(Player player) {
    super(player);
  }
  

  public void run(Player player) {
    System.out.println("case " + player.getPosition() + "/" + 63 + " | Orc on this case");
    int playerDamage = player.getStrength() + player.getOffensive().level;
    Enemy orc = new Orc();
    if (playerDamage >= orc.getHealth()){
      System.out.println("FIGHT WIN !");
    }
    else {
      player.setHealth(player.getHealth() - orc.getStrength());
      System.out.println("You lose " + orc.getStrength() + " health points");
    }
  }
}
