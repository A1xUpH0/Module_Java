package ddproject.classes.menuelements;

import java.util.Scanner;  // Import the Scanner class

public class FirstChoice {


  /**
   * Method First Choice
   * @param sc
   */
  public void firstChoice(Scanner sc) {
    
    /**
     * Name and Class Choice
     */
      String name, classChoice;
  
  
      System.out.println("\nNew Character or Quit Game ?");
      System.out.println("1. Create character");
      System.out.println("2. Quit Game");
      /**
       * Choice
       */
      int choice = sc.nextInt();

  
      if (choice == 1) { // Choice nb #1
        System.out.println("\nChoose character's class (Warrior or Wizard) :"); 
        classChoice = sc.next(); // Choose your Class
  
        OthersMethod instance1 = new OthersMethod();
        instance1.IsValidClass(classChoice, sc); // Call the Method IsValidClass
        
        System.out.println("\nEnter chracter's name :");
        name = sc.next(); // Choose your Name
        
        SecondChoice instance2 = new SecondChoice();
        instance2.secondChoice(sc, name, classChoice); // Call the Method Second Choice
      }
      else if (choice == 2) { // Choice nb #2
        System.out.println("\nGoodbye"); // Say Goodbye
      } 
      else { // Another Choice ???
        OthersMethod instance3 = new OthersMethod();
        instance3.NotValidChoice(); // Call the Method Not Valid Choice
      }
  
      sc.close();
    }
  }