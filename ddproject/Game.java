package ddproject;

import java.util.Random;

import ddproject.classes.Case;
import ddproject.classes.Enemy;
import ddproject.classes.Player;
import ddproject.classes.equipments.defensive.Potion;
import ddproject.classes.equipments.defensive.Shield;
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
   
  //  new Case(new Enemy()),
  //   new Case(new Weapon(5, "weapon")),
  //   new Case(new Potion(5, "potion"))
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


  public boolean round() {
    if (player.position < endBoard){
      System.out.println("case " + player.position + "/" + endBoard);
      String currentCase = Board[player.position];
      switch (currentCase) {
        case "Empty":
          new Case();
          break;
        case "Enemy":
          new Case(new Enemy());
          break;
        case "Shield":
          new Case(new Shield(5, "shield"));
          break;
        case "Weapon":
          new Case(new Weapon(5, "weapon"));
          break;
        case "Spell":
          new Case(new Spell(5, "spell"));
          break;
        case "Potion":
          new Case(new Potion(5, "potion"));
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
          new Case(new Enemy());
          break;
        case "Shield":
          new Case(new Shield(5, "shield"));
          break;
        case "Weapon":
          new Case(new Weapon(5, "weapon"));
          break;
        case "Spell":
          new Case(new Spell(5, "spell"));
          break;
        case "Potion":
          new Case(new Potion(5, "potion"));
          break;
    }
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
