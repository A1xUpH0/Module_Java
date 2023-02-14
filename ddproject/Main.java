package ddproject;

import java.util.Scanner;  // Import the Scanner class

import ddproject.exceptions.OutOfBoardException;

public class Main {

  /**
   * Method which display the menu in the terminal
   * @param args
   * @throws OutOfBoardException
   */
  public static void main(String[] args) throws OutOfBoardException{
    
    Game game = new Game();
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu(game,sc);
    menu.run();
  }
}