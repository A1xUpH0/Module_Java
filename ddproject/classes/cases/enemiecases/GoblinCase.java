package ddproject.classes.cases.enemiecases;

import java.util.Scanner;

import ddproject.classes.Enemy;
import ddproject.classes.Player;
import ddproject.classes.cases.EnemyCase;
import ddproject.classes.enemies.Goblin;

public class GoblinCase extends EnemyCase {

  public GoblinCase(Player player) {
    super(player);
  }
  
  Scanner sc = new Scanner(System.in);
  int choice;
  private boolean correct = false;

  Enemy goblin;

  public void run(Player player) {
    if (hasEnemy(goblin)){
      System.out.println("case " + player.getPosition() + "/" + 63 + " | Goblin on this case");
      do{
        System.out.println("\nChoose your equipment");
        System.out.println(" 0 - " + player.getInventory()[0].toString());
        System.out.println(" 1 - " + player.getInventory()[1].toString());
        choice  = sc.nextInt();
        sc.nextLine();
        if(choice == 1 || choice == 0){
          correct = true;
        }
        else {
          correct = false;
        }
      }while(!correct);

      int playerDamage = player.getStrength() + player.getInventory()[choice].level;
    
      if (player.getThunderbolt()){
        playerDamage *= 2;
        player.setThunderbolt(false);
      }
      goblin.setHealth(goblin.getHealth() - playerDamage);

      if (goblin.getHealth() <= 0){
        System.out.println("FIGHT WIN !");
      }
      else {
        player.setHealth(player.getHealth() - goblin.getStrength());
        System.out.println("FIGHT LOSE | " + goblin.getStrength() + " health points lost");
        System.out.println("\nWould you escape ?");
        System.out.println(" 0 - Escape");
        System.out.println(" 1 - Fight");
        int escapeChoice  = sc.nextInt();
        sc.nextLine();
        if (escapeChoice == 0){
          player.setPosition(player.getPosition() - 2);
          System.out.println("case " + player.getPosition() + "/" + 63 + " | You escape the fight");
        }
      else {
        run(player);
      }
      }
    } else {
      goblin = new Goblin();
      run(player);
    }
  }

    /**
   * Method which verify if the game has a player
   * @return a boolean
   */
  public boolean hasEnemy(Enemy enemy) {
    return enemy != null;
  }
}
