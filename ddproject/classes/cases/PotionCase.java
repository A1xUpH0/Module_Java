package ddproject.classes.cases;

import ddproject.classes.Case;
import ddproject.classes.Player;

public class PotionCase extends Case {

  public PotionCase(Player player, String type) {
    super(player);
    this.type = type;
  }

  private String type;
  private int health;

  public void run(Player player) {

    if (type == "Standard potion" || type == "Big potion") {
      if (type == "Standard potion") {
        health = 2;
      } else {
        health = 5;
      }
      System.out.println("case " + player.getPosition() + "/" + 63 + " | You get " + health + " health points !");
      addHealth(player, health);
    } else {
      System.out.println("case " + player.getPosition() + "/" + 63 + " | You get a Thunderbolt potion");
      player.setThunderbolt(true);
    }
  }

  protected void addHealth(Player player, int health) {
    player.health += health;
  }
}
