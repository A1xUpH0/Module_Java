package ddproject.classes.cases.enemiecases;

import ddproject.classes.Enemy;
import ddproject.classes.Player;
import ddproject.classes.cases.EnemyCase;
import ddproject.classes.enemies.EvilSpirit;

public class EvilSpiritCase extends EnemyCase {

  public EvilSpiritCase(Player player) {
    super(player);
  }
  

  public void run(Player player) {
    System.out.println("case " + player.getPosition() + "/" + 63 + " | Evil spirit on this case");
    int playerDamage = player.getStrength() + player.getOffensive().level;
    Enemy evilSpirit = new EvilSpirit();
    if (playerDamage >= evilSpirit.getHealth()){
      System.out.println("FIGHT WIN !");
    }
    else {
      player.setHealth(player.getHealth() - evilSpirit.getStrength());
      System.out.println("You lose " + evilSpirit.getStrength() + " health points");
    }
  }
}
