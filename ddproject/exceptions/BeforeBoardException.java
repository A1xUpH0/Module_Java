package ddproject.exceptions;

import ddproject.classes.Player;

public class BeforeBoardException extends Exception {
  
  public BeforeBoardException(Player player){
    player.setPosition(0);
    System.out.println("case " + player.getPosition() + "/" + 63);
} 

}
