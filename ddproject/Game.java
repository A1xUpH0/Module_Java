package ddproject;

import java.util.Random;

import ddproject.classes.Board;
import ddproject.classes.Case;
import ddproject.classes.Player;
import ddproject.classes.cases.EmptyCase;
import ddproject.classes.characters.Warrior;
import ddproject.classes.equipments.offensive.spells.Fireball;
import ddproject.classes.equipments.offensive.weapons.Sword;
import ddproject.exceptions.OutOfBoardException;

public class Game {

  private Player player;

  /**
   * Constructor of the Game class
   */
  public Game() {
    this.player = null;
  }

 Board board = new Board(player);
  /**
   * Method which run the game
   */
  public void run() throws OutOfBoardException {

   

    boolean isEnd = false;

    player.setPosition(1);
    if (player instanceof Warrior){
      player.setOffensive(new Sword(0));
      player.setHealth(10);
    }
    else {
      player.setOffensive(new Fireball(0));
      player.setHealth(6);
    }


    board.generateBoard();
    
    while (!isEnd) {
      if (player.getPosition() > 63) {
        throw new OutOfBoardException(player);
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
    if (player.getPosition() < 63 && player.getHealth() > 0){
      Case currentCase = board.getBoard()[player.getPosition()];
      currentCase.run(player);
      board.getBoard()[player.getPosition()] = new EmptyCase(player);
      int newPos = player.getPosition() + virtualDice();
      player.setPosition(newPos);
      return false;
    }
    else {
      if (player.getHealth() <= 0) {
        System.out.println("You lose the game");
      }
      else {
        System.out.println("You win the game");
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
