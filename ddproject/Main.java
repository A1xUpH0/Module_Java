package ddproject;

import java.util.Scanner;  // Import the Scanner class

public class Main {

  /**
   * Method which display the menu in the terminal
   * @param args
   */
  public static void main(String[] args){
    
    Game game = new Game();
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu(game,sc);
    menu.run();
  }
}