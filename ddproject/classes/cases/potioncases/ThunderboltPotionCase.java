package ddproject.classes.cases.potioncases;

import ddproject.classes.Player;
import ddproject.classes.cases.PotionCase;

public class ThunderboltPotionCase extends PotionCase{

  public ThunderboltPotionCase(Player player) {
    super(player);
  }
  
  public void run(Player player) {
    System.out.println("case " + player.getPosition() + "/" + 63 + " | You get a Thunderbolt potion");
    player.setThunderbolt(true);
  }
}
