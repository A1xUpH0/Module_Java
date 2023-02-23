package ddproject.classes.cases.enemiecases;

import java.util.Scanner;

import ddproject.classes.Enemy;
import ddproject.classes.Player;
import ddproject.classes.cases.EnemyCase;
import ddproject.classes.enemies.Dragon;
import ddproject.classes.equipments.offensive.weapons.Bow;

public class DragonCase extends EnemyCase{

  public DragonCase(Player player) {
    super(player);
  }
  
  Scanner sc = new Scanner(System.in);
  int choice;
  private boolean correct = false;

  Enemy dragon;

  public void run(Player player) {
    if (hasEnemy(dragon)){
      System.out.println("case " + player.getPosition() + "/" + 63 + " | Dragon on this case");
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
      if (player.getInventory()[choice] instanceof Bow) {
        playerDamage += 2;
      }
      if (player.getThunderbolt()){
        playerDamage *= 2;
        player.setThunderbolt(false);
      }
      dragon.setHealth(dragon.getHealth() - playerDamage);

      if (dragon.getHealth() <= 0){
        System.out.println("FIGHT WIN !");
      }
      else {
        player.setHealth(player.getHealth() - dragon.getStrength());
        System.out.println("FIGHT LOSE | " + dragon.getStrength() + " health points lost");
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
      dragon = new Dragon();
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