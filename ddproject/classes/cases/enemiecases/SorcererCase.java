package ddproject.classes.cases.enemiecases;

import ddproject.classes.Enemy;
import ddproject.classes.Player;
import ddproject.classes.cases.EnemyCase;
import ddproject.classes.enemies.Sorcerer;

public class SorcererCase extends EnemyCase {

  public SorcererCase(Player player) {
    super(player);
    
  }


  public void run(Player player) {
    System.out.println("case " + player.getPosition() + "/" + 63 + " | Sorcerer on this case");
    int playerDamage = player.getStrength() + player.getOffensive().level;
    Enemy sorcerer = new Sorcerer();
    if (playerDamage >= sorcerer.getHealth()){
      System.out.println("FIGHT WIN !");
    }
    else {
      player.setHealth(player.getHealth() - sorcerer.getStrength());
      System.out.println("You lose " + sorcerer.getStrength() + " health points");
    }
  }
}
