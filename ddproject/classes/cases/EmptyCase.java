package ddproject.classes.cases;

import ddproject.classes.Case;
import ddproject.classes.Player;

public class EmptyCase extends Case{

  public EmptyCase(Player player) {
    super(player);
  }
  

  public void run(Player player){
    System.out.println("case " + player.getPosition() + "/" + 63 + " | Empty Case");
  }
}
