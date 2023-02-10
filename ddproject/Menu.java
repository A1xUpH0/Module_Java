package ddproject;

import java.util.Scanner;  // Import the Scanner class
import ddproject.classes.menuelements.FirstChoice; // Import the First Choice class 

public class Menu {
  
  /**
   * Method which strat the scanner and call the first choice
   */
  public void menu() {
    Scanner sc = new Scanner(System.in); // Create a Scanner object 

    FirstChoice instance = new FirstChoice();
    instance.firstChoice(sc); // call Method First Choice

  }
}
