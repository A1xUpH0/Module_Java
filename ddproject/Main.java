package ddproject;

import java.util.Scanner;  // Import the Scanner class
import ddproject.classes.Character;  // Import the Character class


public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Create a Scanner object
    String name, classChoice; // Name and Class Choice

    int choice = FirstChoice(sc);

    if (choice == 1) { // Choice nb #1
      System.out.println("\nChoose character's class (Warrior or Wizard) :");
      classChoice = sc.next();

      IsValidClass(classChoice, sc);
      
      System.out.println("\nEnter chracter's name :");
      name = sc.next();
      
      System.out.println("\nShow or Modify Informations ?");
      System.out.println("1. Show all character's informations");
      System.out.println("2. Modify informations");
      // System.out.println("3. Start Game");
      int infoChoice = sc.nextInt();

      switch (infoChoice) {
        case 1: // Choice nb #1
          ShowInfos(name, classChoice);
          break;

        case 2: // Choice nb #2
          ModifyInfos(name,classChoice, sc);
          break;

          // case 3: // Choice nb #3
          // System.out.println("\nGame Starting ...");
          // new Game();                         // TODO Start New Game
          // break;

        default: // Another Choice ???
          NotValidChoice();
          break;
      }
 
        Object character = new Character(name,classChoice);
        System.out.println("\n" + character);

    }

    else if (choice == 2) { // Choice nb #2
      System.out.println("\nGoodbye");
    } 
    
    else { // Another Choice ???
      NotValidChoice();
    }


    

    sc.close();

    
  }


  private static int FirstChoice(Scanner sc){
    System.out.println("\nNew Character or Quit Game ?");
    System.out.println("1. Create character");
    System.out.println("2. Quit Game");
    int choice = sc.nextInt();
    return choice;
  } 

  private static void ShowInfos(String name, String classChoice){
    System.out.println("Class : " + classChoice);
    System.out.println("Name : " + name);
  }

  private static void ModifyInfos(String name, String classChoice, Scanner sc){
    System.out.println("\nEnter the new name :");
    name = sc.next();
    System.out.println("\nNew informations :");
    ShowInfos(name, classChoice);
  }
  private static void NotValidChoice(){
    System.out.println("\nChoice not valid");
  }

  private static void IsValidClass(String classChoice, Scanner sc){
    if (!classChoice.equals("Warrior") && !classChoice.equals("Wizard")) {
      NotValidChoice();
      System.out.println("\nChoose character's class (Warrior or Wizard) :");
      classChoice = sc.next();
    }
  }
}