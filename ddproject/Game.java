package ddproject;

import ddproject.classes.Player;

public class Game {

  private Player player;


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
    System.out.println("TODO : run game");
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
