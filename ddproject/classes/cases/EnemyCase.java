package ddproject.classes.cases;

import java.util.Scanner;

import ddproject.classes.Case;
import ddproject.classes.Enemy;
import ddproject.classes.Player;
import ddproject.classes.enemies.Dragon;
import ddproject.classes.enemies.EvilSpirit;
import ddproject.classes.enemies.Goblin;
import ddproject.classes.enemies.Orc;
import ddproject.classes.enemies.Sorcerer;
import ddproject.classes.equipments.spells.Invisibility;
import ddproject.classes.equipments.weapons.Bow;

public class EnemyCase extends Case {

  public EnemyCase(Player player, String type) {
    super(player);
    this.type = type;
  }

  private Player player;
  private Enemy enemy;
  private String type;

  Scanner sc = new Scanner(System.in);
  int choice;
  private boolean correct = false;

  public void run(Player player) {
    if (!hasEnemy(enemy)) {
      switch (this.type) {
        case "Dragon":
          enemy = new Dragon();
          break;
        case "Evil spirit":
          enemy = new EvilSpirit();
          break;
        case "Goblin":
          enemy = new Goblin();
          break;
        case "Orc":
          enemy = new Orc();
          break;
        case "Sorcerer":
          enemy = new Sorcerer();
          break;
        default:
          break;
      }
    }
    System.out.println("case " + player.getPosition() + "/" + 63 + " | " + type + " on this case");
    do {
      System.out.println("You have " + player.getHealth() + " HP\n");
      System.out.println("\nChoose your equipment");
      System.out.println(" 0 - " + player.getInventory()[0].toString());
      System.out.println(" 1 - " + player.getInventory()[1].toString());
      choice = sc.nextInt();
      sc.nextLine();
      if (choice == 1 || choice == 0) {
        correct = true;
      } else {
        correct = false;
      }
    } while (!correct);

    int playerDamage = player.getStrength() + player.getInventory()[choice].level;

    if (type == "Dragon" && player.getInventory()[choice] instanceof Bow) {
      playerDamage += 2;
    }

    if (type == "EvilSpirit" && player.getInventory()[choice] instanceof Invisibility) {
      playerDamage += 3;
    }

    if (player.getThunderbolt()) {
      playerDamage *= 2;
      player.setThunderbolt(false);
    }

    enemy.setHealth(enemy.getHealth() - playerDamage);

    if (enemy.getHealth() <= 0) {
      System.out.println("FIGHT WIN !");
    } else {
      player.setHealth(player.getHealth() - enemy.getStrength());
      System.out.println("FIGHT LOSE | " + enemy.getStrength() + " health points lost");
      System.out.println("\nWould you escape ?");
      System.out.println(" 0 - Escape");
      System.out.println(" 1 - Fight");
      int escapeChoice = sc.nextInt();
      sc.nextLine();

      if (escapeChoice == 0) {
        player.setPosition(player.getPosition() - 2);
        System.out.println("case " + player.getPosition() + "/" + 63 + " | You escape the fight");
      } else {
        run(player);
      }
    }
  }

  /**
   * Method which verify if the game has a player
   * 
   * @return a boolean
   */
  public boolean hasEnemy(Enemy enemy) {
    return enemy != null;
  }

  // Getters et Setters

  /**
   * Getter of "player" variable
   * 
   * @return player : The player
   */
  public Player getPlayer() {
    return player;
  }

  /**
   * Setter of "name" variable
   * 
   * @param name : The name of the character
   */
  public void setPlayer(Player player) {
    this.player = player;
  }

  /**
   * Getter of "enemy" variable
   * 
   * @return enemy : The enemy
   */
  public Enemy getEnemy() {
    return enemy;
  }

  /**
   * Setter of "name" variable
   * 
   * @param name : The name of the character
   */
  public void setEnemy(Enemy enemy) {
    this.enemy = enemy;
  }
}
