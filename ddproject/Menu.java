package ddproject;

import java.util.Random;
import java.util.Scanner;
import ddproject.classes.Player;
import ddproject.classes.characters.Warrior;
import ddproject.classes.characters.Wizard;
import ddproject.classes.equipments.Spell;
import ddproject.classes.equipments.Weapon;
import ddproject.classes.equipments.spells.Fireball;
import ddproject.classes.equipments.weapons.Sword;
import ddproject.exceptions.BeforeBoardException;
import ddproject.exceptions.OutOfBoardException;

public class Menu {

  /**
   * A game which can be run
   */
  private Game game;
  /**
   * A scanner to get terminal inputs
   */
  private Scanner scanner;
  /**
   * A boolean to know when quit the menu
   */
  private boolean exit;

  private Player player;

  /**
   * The constructor of the Menu class
   * 
   * @param game    : A game which can be run
   * @param scanner : A scanner to get terminal inputs
   */
  public Menu(Game game, Scanner scanner) {
    this.game = game;
    this.scanner = scanner;
    this.exit = false;
  }

  /**
   * Method which run the menu
   * 
   * @throws OutOfBoardException
   * @throws BeforeBoardException
   */
  public void run() throws OutOfBoardException, BeforeBoardException {
    System.out.println("\nBonjour !\n");
    while (!this.exit) {
      if (this.game.hasPlayer()) {
        System.out.println("\nCHOOSE");
        System.out.println(" 1 - Update player & equipment");
        System.out.println(" 2 - Delete player & equipment");
        System.out.println(" 3 - Run game");
      } else {
        System.out.println(" 1 - Create player");
      }
      System.out.println(" 0 - Quit");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1:
          if (this.game.hasPlayer()) {
            // If there is already a player we update it
            this.updatePlayer(this.game.getPlayer());
          } else {
            // if no player exists we create a new one
            player = this.createPlayer();
            this.game.setPlayer(player);
          }
          break;

        case 2:
          // We check that there's already a player defined
          if (this.game.hasPlayer()) {
            // if so we remove the currently defined player
            this.game.unsetPlayer();
            // this.game.setPlayer(null);
          }
          break;

        case 3:
          // We check that there's already a player defined
          if (this.game.hasPlayer()) {
            // The we run the game
            try {
              this.game.run(player);
            } catch (OutOfBoardException e) {
            } catch (BeforeBoardException e) {
            }
          }
          break;
        // The user which to exit (we break the main loop)
        case 0:
          this.exit = true;
      }
    }
  }

  /**
   * Method which display a menu to permit update of an existing player
   * 
   * @param player player to update
   */
  private void updatePlayer(Player player) {
    createPlayer();
  }

  /**
   * Method which display a menu for player creation
   * 
   * @return newly created player
   */
  private Player createPlayer() {
    System.out.println("\nType name :");
    String name = this.scanner.nextLine();
    boolean correct;
    Player player = null;
    do {
      System.out.println("\nChoose your class");
      System.out.println(" 1 - Warrior");
      System.out.println(" 2 - Wizard");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1:
          boolean weaponCorrect = false;
          Weapon w1 = new Sword(virtualDice(2));
          Weapon w2 = new Sword(virtualDice(2));
          do {
            System.out.println("\nChoose your weapon");
            System.out.println(" 1 - " + w1.toString());
            System.out.println(" 2 - " + w2.toString());
            int weaponChoice = scanner.nextInt();
            scanner.nextLine();
            player = new Warrior(name);
            if (weaponChoice == 1) {
              player.inventory[0] = w1;
              weaponCorrect = true;
            } else if (weaponChoice == 2) {
              player.inventory[0] = w2;
              weaponCorrect = true;
            } else {
              weaponCorrect = false;
            }
          } while (!weaponCorrect);
          correct = true;
          break;

        case 2:
          boolean spellCorrect = false;
          Spell s1 = new Fireball(virtualDice(2));
          Spell s2 = new Fireball(virtualDice(2));
          do {
            System.out.println("\nChoose your weapon");
            System.out.println(" 1 - " + s1.toString());
            System.out.println(" 2 - " + s2.toString());
            int spellChoice = scanner.nextInt();
            scanner.nextLine();
            player = new Wizard(name);
            if (spellChoice == 1) {
              player.inventory[0] = s1;
              weaponCorrect = true;
            } else if (spellChoice == 2) {
              player.inventory[0] = s2;
              spellCorrect = true;
            } else {
              spellCorrect = false;
            }
          } while (!spellCorrect);
          correct = true;
          break;

        default:
          correct = false;
      }
    } while (!correct);
    return player;
  }

  /**
   * Method which return a random integer (1 - max)
   * 
   * @return an integer
   */
  public int virtualDice(int max) {
    return new Random().nextInt(max + 1);
  }
}
