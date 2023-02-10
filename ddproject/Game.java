package ddproject;

import java.util.Random; // Import Random Class

public class Game {


  public void game(){ // Method Game

    /**
     * Initial Position
     */
    int POSINIT = 1;

    /**
     * Position of END Case
     */
    int END = 64;
  
    /**
     * Player Position
     */
    int posPlayer;

    /**
     * WIN ? variable
     */
    boolean win = false;

    posPlayer = POSINIT; // Init Pos of Player

    while (!win){ // Game Loop
      int varPos = Round(posPlayer, END); // Varpos (Test Variable) + Call Method Round

      if (varPos == -1){ // Test (if win)
        win = true;
      } else { // Test (else)
        posPlayer = varPos;
        System.out.println("Case " + posPlayer + "/64"); // Print new position
      }
      
    }

  }
  /**
   * Method Drop Dices (1 -> 6) 
   * @return [Int]
   */
  private static int DropDice(){
    return new Random().nextInt(6) + 1;
  }

  /**
   * Method Round
   * @param posPlayer
   * @param END
   * @return [Int]
   */
  private static int Round(int posPlayer, int END){
    if (posPlayer >= END){
      return -1; // Return Impossible value to Test
    }
    else {
      return posPlayer += DropDice(); // Call Method Drop Dices
    }
  }
}
