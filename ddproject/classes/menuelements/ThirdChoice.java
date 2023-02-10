package ddproject.classes.menuelements;

import java.util.Scanner;  // Import the Scanner class
import ddproject.classes.menuelements.ThirdChoice; // Import The Third Choice Class

public class ThirdChoice {
  
  /**
   * Method Third Choice
   * @param sc
   * @return [Bool]
   */
  public boolean thirdChoice(Scanner sc) {

    System.out.println("\nWould you continue to play ?");
    System.out.println("1. Continue to play");
    System.out.println("2. Quit game");
    /**
     * Choice
     */
    int continueChoice = sc.nextInt();
    

    switch (continueChoice) {
      case 1: // Choice nb #1
        break;

      case 2: // Choice nb #2
        return false;
              
      default: // Another Choice ???

      OthersMethod instance = new OthersMethod();
      instance.NotValidChoice(); // Call the Method Not Valid Choice
      break;
    }
    return true;
  }
}
