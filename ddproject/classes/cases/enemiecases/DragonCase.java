package ddproject.classes.cases.enemiecases;

import ddproject.classes.Enemy;
import ddproject.classes.Player;
import ddproject.classes.cases.EnemyCase;
import ddproject.classes.enemies.Dragon;

public class DragonCase extends EnemyCase{

  public DragonCase(Player player) {
    super(player);
  }
  

  public void run(Player player) {
    System.out.println("case " + player.getPosition() + "/" + 63 + " | Dragon on this case");
    int playerDamage = player.getStrength() + player.getOffensive().level;
    Enemy dragon = new Dragon();
    // System.out.println(playerDamage + " | " + dragon.getHealth());
    if (playerDamage >= dragon.getHealth()){
      System.out.println("FIGHT WIN !");
    }
    else {
      player.setHealth(player.getHealth() - dragon.getStrength());
      System.out.println("You lose " + dragon.getStrength() + " health points");
    }
  }
}