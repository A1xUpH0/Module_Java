package ddproject.classes.cases.potioncases;

import ddproject.classes.Player;
import ddproject.classes.cases.PotionCase;

public class BigPotionCase extends PotionCase {
  
  public BigPotionCase(Player player){
    super(player); 
  }

  public void run(Player player){
    System.out.println("case " + player.getPosition() + "/" + 63 + " | You get 5 health points !");
    addHealth(player, 5);
  }
}
