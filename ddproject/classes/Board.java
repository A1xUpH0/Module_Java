package ddproject.classes;

import java.util.Random;

import ddproject.classes.cases.EmptyCase;
import ddproject.classes.cases.enemiecases.DragonCase;
import ddproject.classes.cases.enemiecases.EvilSpiritCase;
import ddproject.classes.cases.enemiecases.GoblinCase;
import ddproject.classes.cases.enemiecases.OrcCase;
import ddproject.classes.cases.enemiecases.SorcererCase;
import ddproject.classes.cases.offensiveequipmentcases.spellcases.FireballCase;
import ddproject.classes.cases.offensiveequipmentcases.spellcases.InvisibilityCase;
import ddproject.classes.cases.offensiveequipmentcases.spellcases.LightningCase;
import ddproject.classes.cases.offensiveequipmentcases.weaponcases.BowCase;
import ddproject.classes.cases.offensiveequipmentcases.weaponcases.MaceCase;
import ddproject.classes.cases.offensiveequipmentcases.weaponcases.SwordCase;
import ddproject.classes.cases.potioncases.BigPotionCase;
import ddproject.classes.cases.potioncases.StandardPotionCase;

public class Board {
  

  Player player;

  public Board(Player player){
    this.player = player;
  }

  private Case[] board = new Case[64];


  private Case[] enemies = {
    new DragonCase(player),
    new EvilSpiritCase(player),
    new GoblinCase(player),
    new OrcCase(player),
    new SorcererCase(player)
  };
  private Case[] equipements = {
    new BowCase(player),
    new MaceCase(player),
    new SwordCase(player),
    new FireballCase(player),
    new InvisibilityCase(player),
    new LightningCase(player)
  };
  private Case[] potions = {
      new StandardPotionCase(player),
      new BigPotionCase(player)
  };


  public void generateBoard(){
    for (int i = 0; i < 63; i++) {
      int diceTypeCase = virtualDice(16);

      if (diceTypeCase <= 3) {
        board[i] = equipements[virtualDice(5)];
      }
      else if (diceTypeCase <= 5) {
        board[i] = enemies[virtualDice(4)];
      }
      else if (diceTypeCase <= 7) {
        board[i] = potions[virtualDice(1)];
      }
      else{
        board[i] = new EmptyCase(player);
      }
    }
    System.out.println("\n\nBoard created\n\nSTARTING...");
  }

  /**
   * Method which return a random integer (1 - max)
   * @return an integer
   */
  public int virtualDice(int max) {
    return new Random().nextInt(max + 1);
  }


    // Getters et Setters

  /**
   * Getter of "board" variable
   * @return board : The board of the character
   */
  public Case[] getBoard() {
    return board;
  }
  /**
  * Setter of "board" variable
  * @param board : The board of the character
  */
  public void setBoard(Case[] board) {
    this.board = board;
  }
}