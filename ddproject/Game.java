package ddproject;

import java.util.Random;

import ddproject.classes.Board;
import ddproject.classes.Case;
import ddproject.classes.Player;
import ddproject.classes.cases.EmptyCase;
import ddproject.classes.characters.Warrior;
import ddproject.exceptions.BeforeBoardException;
import ddproject.exceptions.OutOfBoardException;

public class Game {

  private Player player;

  /**
   * Constructor of the Game class
   */
  public Game() {
    this.player = null;
  }

  private Board board;

  /**
   * Method which run the game
   * 
   * @throws BeforeBoardException
   */
  public void run(Player player) throws OutOfBoardException, BeforeBoardException {

    this.player = player;

    this.board = new Board(player);
    boolean isEnd = false;

    player.setPosition(1);

    if (player instanceof Warrior) {
      player.setHealth(10);
    } else {
      player.setHealth(6);
    }
    player.setThunderbolt(false);

    board.generateBoard();

    while (!isEnd) {
      if (player.getPosition() > 63) {
        throw new OutOfBoardException(player);
      } else {
        isEnd = round();
      }

      if (player.getPosition() < 0) {
        throw new BeforeBoardException(player);
      }
    }
  }

  /**
   * Method which simulate one round of the game
   * 
   * @return a boolean
   */
  public boolean round() {
    if (player.getPosition() < 63 && player.getHealth() > 0) {
      Case currentCase = board.getBoard()[player.getPosition()];
      currentCase.run(player);
      board.getBoard()[player.getPosition()] = new EmptyCase(player);
      player.setPosition(player.getPosition() + virtualDice());
      return false;
    } else {
      if (player.getHealth() <= 0) {
        System.out.println("You lose the game");
      } else {
        System.out.println("You win the game");
      }
      System.out.println("THE END");
      return true;
    }
  }

  /**
   * Method which retur a random integer (1 - 6)
   * 
   * @return an integer
   */
  public int virtualDice() {
    return new Random().nextInt(5 + 1) + 1;
  }

  /**
   * Method which verify if the game has a player
   * 
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
   * 
   * @return player : The player of the character
   */
  public Player getPlayer() {
    return player;
  }

  /**
   * Setter of "player" variable
   * 
   * @param player : The player of the character
   */
  public void setPlayer(Player player) {
    this.player = player;
  }
}
