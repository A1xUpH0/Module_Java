package ddproject.classes.menuelements;

import java.util.Scanner;  // Import the Scanner class
import ddproject.classes.Character;  // Import the Character class
import ddproject.Game;  // Import the Menu class
import ddproject.classes.menuelements.SecondChoice; // Import the Second Choice Class

public class SecondChoice {

  /**
   * Method Second Choice
   * @param sc
   * @param name
   * @param classChoice
   */
  public void secondChoice(Scanner sc, String name, String classChoice) {

    System.out.println("\nShow or Modify Informations ?");
    System.out.println("1. Show all character's informations");
    System.out.println("2. Modify informations");
    System.out.println("3. Start Game");
    /**
     * Choice
     */
    int infoChoice = sc.nextInt();
    

    switch (infoChoice) {
      case 1: // Choice nb #1

        OthersMethod instance1 = new OthersMethod();
        instance1.ShowInfos(name, classChoice); // Call the Method Show Infos
          break;

      case 2: // Choice nb #2

        OthersMethod instance2 = new OthersMethod();
        instance2.ModifyInfos(name,classChoice, sc); // Call the Method Modify Infos
          break;

      case 3: // Choice nb #3
        Object character = new Character(name,classChoice);
        System.out.println("\n" + character); // Print New Character Creation

        boolean wantContinue = true; // Want Continue ? 


        while (wantContinue){

          System.out.println("\nGame Starting ...");

          Game instance3 = new Game();
          instance3.game(); // Call the Method Game

          ThirdChoice instance4 = new ThirdChoice();
          wantContinue = instance4.thirdChoice(sc); // Call the Method Third Choice
        }
        
        System.out.println("\nGoodbye"); // Say Goodbye
        break;
    }
  }
}
