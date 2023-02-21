package ddproject.exceptions;

import ddproject.classes.Player;

public class OutOfBoardException extends Exception {
  
  public OutOfBoardException(Player player){
      if (player.getHealth() <= 0) {
        System.out.println("You lose the game");
      }
      else {
        System.out.println("You win the game");
      }
      System.out.println("THE END");
  }  
}