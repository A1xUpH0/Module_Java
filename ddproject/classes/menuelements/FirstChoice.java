package ddproject.classes.menuelements;

import java.util.Scanner;  // Import the Scanner class

public class FirstChoice {

/**
 * The name of the character
 */
  private String name;

/**
 * The class of the character
 */
private String classChoice;
  
/**
 * Method which Display the first choice of the menu and get the user's answer (1 or 2)
 * @param sc : The scanner which scan the terminal to get user's answer
 */
  public void firstChoice(Scanner sc) {
    
      System.out.println("\nNew Character or Quit Game ?");
      System.out.println("1. Create character");
      System.out.println("2. Quit Game");
      /**
       * The choice answer (Create character or Quit game)
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

    // Getter & Setter

  /**
   * Getter of "name" variable
   * @return name : The name of the character
   */
  public String getName() {
    return name;
  }

  /**
   * Setter of "name" variable
   * @param name
   */
  public void setName(String name) {
      this.name = name;
  }

  /**
   * Getter of "classChoice" variable
   * @return classChoice : The class of the character
   */
  public String getClassChoice() {
    return classChoice;
  }

  /**
   * Setter of "classChoice" variable
   * @param classChoice
   */
  public void setClassChoice(String classChoice) {
      this.classChoice = classChoice;
  }

}