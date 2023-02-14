package ddproject.exceptions;

public class OutOfBoardException extends Exception {
  public OutOfBoardException(){
    System.out.println("Leaving the board during the game is forbiden");
  }  
}
