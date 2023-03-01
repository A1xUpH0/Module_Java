package ddproject.classes;

import java.util.Random;

import ddproject.classes.cases.EmptyCase;
import ddproject.classes.cases.EnemyCase;
import ddproject.classes.cases.EquipmentCase;
import ddproject.classes.cases.PotionCase;

public class Board {

  Player player;

  public Board(Player player) {
    this.player = player;
  }

  private Case[] board = new Case[64];

  private String[] enemies = {
      "Dragon",
      "Evil spirit",
      "Goblin",
      "Orc",
      "Sorcerer"
  };
  private String[] equipements = {
      "Bow",
      "Mace",
      "Sword",
      "Fireball",
      "Invisibility",
      "Lightning"
  };
  private String[] potions = {
      "Standard potion",
      "Big potion",
      "Thunderbolt potion"
  };

  public void generateBoard() {
    for (int i = 0; i < 63; i++) {
      int diceTypeCase = virtualDice(16);

      if (diceTypeCase <= 3) {
        board[i] = new EquipmentCase(player, equipements[virtualDice(5)]);
      } else if (diceTypeCase <= 5) {
        board[i] = new EnemyCase(player, enemies[virtualDice(4)]);
      } else if (diceTypeCase <= 7) {
        board[i] = new PotionCase(player, potions[virtualDice(2)]);
      } else {
        board[i] = new EmptyCase(player);
      }
    }
    System.out.println("\n\nBoard created\n\nSTARTING...");
  }

  /**
   * Method which return a random integer (1 - max)
   * 
   * @return an integer
   */
  public int virtualDice(int max) {
    return new Random().nextInt(max + 1);
  }

  // Getters et Setters

  /**
   * Getter of "board" variable
   * 
   * @return board : The board of the character
   */
  public Case[] getBoard() {
    return board;
  }

  /**
   * Setter of "board" variable
   * 
   * @param board : The board of the character
   */
  public void setBoard(Case[] board) {
    this.board = board;
  }
}