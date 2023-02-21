package ddproject.classes.cases;

import ddproject.classes.Case;
import ddproject.classes.Player;

public abstract class PotionCase extends Case {
  
  public PotionCase(Player player) {
    super(player);
  }

  protected void addHealth(Player player, int health){
    player.health += health;
  }
}
