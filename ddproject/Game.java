package ddproject;

import java.util.Random; // Import Random Class

public class Game {


  public void game(){ // Method Game

    /**
     * The initial position of the character
     */
    int POSINIT = 1;

    /**
     * The position of the END of the game
     */
    int END = 64;
  
    /**
     * The position of the character
     */
    int posPlayer;

    /**
     * WIN ? variable
     */
    boolean win = false;

    posPlayer = POSINIT; // Init. Pos of Player

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
   * Method which drop the dices (1 -> 6) 
   * @return an Integer
   */
  private static int DropDice(){
    return new Random().nextInt(6) + 1;
  }

  /**
   * Method which simulate 1 round
   * @param posPlayer : The position of the character
   * @param END : The position of the END of the game
   * @return [Int]
   */
  private static int Round(int posPlayer, int END){
    if (posPlayer >= END){
      return -1;
    }
    else {
      return posPlayer += DropDice();
    }
  }
}
