package ddproject;

import java.util.Random;

import ddproject.classes.Case;
import ddproject.classes.Enemy;
import ddproject.classes.Player;
import ddproject.classes.equipments.Potion;
import ddproject.classes.equipments.offensive.Spell;
import ddproject.classes.equipments.offensive.Weapon;
import ddproject.exceptions.OutOfBoardException;

public class Game {

  private Player player;
  private static String[] Board = {
    "Empty",
    "Empty",
    "Enemy",
    "Weapon",
    "Potion"
   };
   
  /**
   * The last case of the board
   */
  private static int endBoard = Board.length - 1;


  /**
   * Constructor of the Game class
   */
  public Game() {
    this.player = null;
  }


  /**
   * Method which run the game
   */
  public void run() throws OutOfBoardException {

    boolean isEnd = false;

    player.position = 1;

    while (!isEnd) {
      if (player.position > endBoard) {
        throw new OutOfBoardException();
      }
      else {
        isEnd = round();
      }
    }
  }

/**
 * Method which simulate one round of the game
 * @return a boolean
 */
  public boolean round() {
    if (player.position < endBoard){
      System.out.println("case " + player.position + "/" + endBoard);
      String currentCase = Board[player.position];
      switch (currentCase) {
        case "Empty":
          new Case();
          break;
        case "Enemy":
          new Case(new Enemy(10, 6));
          break;
        case "Weapon":
          new Case(new Weapon(5));
          break;
        case "Spell":
          new Case(new Spell(5));
          break;
        case "Potion":
          new Case(new Potion());
          break;
      }
      player.position += 1;//virtualDice();
      return false;
    }
    else {
      System.out.println("case " + player.position + "/" + endBoard);
      String currentCase = Board[player.position];
      switch (currentCase) {
        case "Empty":
          new Case();
          break;
        case "Enemy":
          new Case(new Enemy(10, 6));
          break;
        case "Weapon":
          new Case(new Weapon(5));
          break;
        case "Spell":
          new Case(new Spell(5));
          break;
        case "Potion":
          new Case(new Potion());
          break;
    }
      System.out.println("THE END");
      return true;
    }
  }


  /**
   * Method which retur a random integer (1 - 6)
   * @return an integer
   */
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
