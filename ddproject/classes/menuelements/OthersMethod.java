package ddproject.classes.menuelements;

import java.util.Scanner;  // Import the Scanner class
import ddproject.classes.menuelements.OthersMethod; // Import the Others Method class

  public class OthersMethod {

    /**
     * Method which diplay the "name" and the "class" of the character
     * @param name : The name of the character
     * @param classChoice : The class of the character
     */
    public void ShowInfos(String name, String classChoice){
      System.out.println("Class : " + classChoice);
    }

    /**
     * Method which modify the "name" and the "class" of the character
     * @param name : The name of the character
     * @param classChoice : The class of the character
     * @param sc : The scanner of the terminal
     */
    public void ModifyInfos(String name, String classChoice, Scanner sc){
      System.out.println("\nEnter the new name :");
      name = sc.next();
      System.out.println("\nNew informations :");
    }

    /**
     * Method which diplay an error message
     */
    public void NotValidChoice(){ // Method Not Valid Choice
      System.out.println("\nERROR : Choice not valid"); // Error Message
    }

    /**
     * Method which verify if the user's choice of class is valid
     * @param classChoice : The class of the character
     * @param sc : The scanner of the terminal
     */
    public void IsValidClass(String classChoice, Scanner sc){
      if (!classChoice.equals("Warrior") && !classChoice.equals("Wizard")) {
        NotValidChoice();
        System.out.println("\nChoose character's class (Warrior or Wizard) :");
        classChoice = sc.next();
      }
    }
  }