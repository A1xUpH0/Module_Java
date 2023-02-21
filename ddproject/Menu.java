package ddproject;

import java.util.Scanner;
import ddproject.classes.Player;
import ddproject.classes.characters.Warrior;
import ddproject.classes.characters.Wizard;
import ddproject.classes.equipments.offensive.spells.Fireball;
import ddproject.classes.equipments.offensive.weapons.Sword;
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


  /**
   * The constructor of the Menu class
   * @param game : A game which can be run
   * @param scanner : A scanner to get terminal inputs
   */
  public Menu(Game game, Scanner scanner) {
    this.game = game;
    this.scanner = scanner;
    this.exit = false;
  }


  /**
   * Method which run the menu
   * @throws OutOfBoardException
   */
  public void run() throws OutOfBoardException{
    System.out.println("\nBonjour !\n");
    while (!this.exit) {
        if(this.game.hasPlayer()){
          System.out.println("\nCHOOSE");
          System.out.println(" 1 - Update player");
          System.out.println(" 2 - Delete player");
          System.out.println(" 3 - Run game");
        } else {
            System.out.println(" 1 - Create player");
        }
        System.out.println(" 0 - Quit");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
          case 1 : 
            if(this.game.hasPlayer()){
              // If there is already a player we update it
              this.updatePlayer(this.game.getPlayer());
            } else {
              // if no player exists we create a new one
              Player player = this.createPlayer();
              this.game.setPlayer(player);
            }
            break;

          case 2 : 
            // We check that there's already a player defined
            if(this.game.hasPlayer()){
              // if so we remove the currently defined player
              this.game.unsetPlayer();
              //this.game.setPlayer(null);
            }
            break;

          case 3 : 
            // We check that there's already a player defined
            if(this.game.hasPlayer()){
              // The we run the game
              try {
                this.game.run();
              } catch (OutOfBoardException e) {
              }
            }
            break;
          // The user which to exit (we break the main loop)
          case 0 : this.exit = true;
      }
    }
  }


  /**
   * Method which display a menu to permit update of an existing player
   * @param player player to update
   */
  private void updatePlayer(Player player) {
    createPlayer();
  }

  /**
   * Method which display a menu for player creation
   * @return newly created player
   */
  private Player createPlayer() {
    System.out.println("\nType name :");
    String name  = this.scanner.nextLine();
    boolean correct;
    Player player = null;
    do {
      System.out.println("\nChoose class");
      System.out.println(" 1 - Warrior");
      System.out.println(" 2 - Wizard");
      int choice  = scanner.nextInt();
      scanner.nextLine();
      switch (choice){
        case 1 : 
          correct = true;
          player = new Warrior(name, new Sword(0));
          break;

        case 2 :
          correct = true;
          player = new Wizard(name, new Fireball(0));
          break;
          
        default : correct = false;
      }
    } while (!correct);
    return player;
  }
}
