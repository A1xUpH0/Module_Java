package ddproject.classes.menuelements;

import java.util.Scanner;  // Import the Scanner class
import ddproject.classes.menuelements.OthersMethod; // Import the Others Method class

  public class OthersMethod {

    public void ShowInfos(String name, String classChoice){ // Method Show infos
      System.out.println("Class : " + classChoice);
      System.out.println("Name : " + name); // Print Name & Class
    }


    public void ModifyInfos(String name, String classChoice, Scanner sc){ // Method Modify infos
      System.out.println("\nEnter the new name :");
      name = sc.next(); // Choose Name
      System.out.println("\nNew informations :");
      ShowInfos(name, classChoice); // Call Show Infos
    }


    public void NotValidChoice(){ // Method Not Valid Choice
      System.out.println("\nERROR : Choice not valid"); // Error Message
    }


    public void IsValidClass(String classChoice, Scanner sc){ // Method Is Valid Class
      if (!classChoice.equals("Warrior") && !classChoice.equals("Wizard")) { // Test Class Choice
        NotValidChoice(); // Call Method Not Valid Choice
        System.out.println("\nChoose character's class (Warrior or Wizard) :");
        classChoice = sc.next(); // 2nd Try to choose
      }
    }
  }