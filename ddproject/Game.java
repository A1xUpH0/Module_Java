package ddproject;

import java.util.Random;

import ddproject.classes.Player;

public class Game {

  private Player player;
  /**
   * The last case of the board
   */
  private static int endBoard = 64;

  /**
   * Constructor of the Game class
   */
  public Game() {
    this.player = null;
  }


  /**
   * Method which run the game
   */
  public void run() {

    boolean isEnd = false;

    while (!isEnd) {
      isEnd = round();
    }
  }


  public boolean round() {
    if (player.position < endBoard){
      System.out.println("case " + player.position + "/" + endBoard);
      player.position += virtualDice();
      return false;
    }
    else {
      System.out.println("case " + player.position + "/" + endBoard);
      System.out.println("THE END");
      return true;
    }
    
  }


  public int virtualDice() {
    return new Random().nextInt(5 + 1)  + 1;
  }


  /**
   * Method which verify if the game has a player
   * @return a boolean
   */
  public boolean hasPlayer() {
      return this.player != null;
  }


  /**
   * Method which delete the current player
   */
  public void unsetPlayer() {
      this.player = null;
  }


  // Getters et Setters

   /**
   * Getter of "player" variable
   * @return player : The player of the character
   */
  public Player getPlayer() {
    return player;
  }
  /**
  * Setter of "player" variable
  * @param player : The player of the character
  */
  public void setPlayer(Player player) {
    this.player = player;
  }
}
