package ddproject.classes.cases;

import java.util.Random;
import java.util.Scanner;

import ddproject.classes.Case;
import ddproject.classes.Player;
import ddproject.classes.characters.Warrior;
import ddproject.classes.characters.Wizard;
import ddproject.classes.equipments.Equipment;
import ddproject.classes.equipments.spells.Fireball;
import ddproject.classes.equipments.spells.Invisibility;
import ddproject.classes.equipments.spells.Lightning;
import ddproject.classes.equipments.weapons.Bow;
import ddproject.classes.equipments.weapons.Mace;
import ddproject.classes.equipments.weapons.Sword;

public class EquipmentCase extends Case {

  Scanner sc = new Scanner(System.in);
  private Player player;
  private Equipment offensive;
  private String type;
  private Equipment newEquipment;
  private Boolean test;
  private boolean correct = false;

  public EquipmentCase(Player player, String type) {
    super(player);
    this.type = type;
  }

  public void run(Player player) {
    switch (this.type) {
      case "Bow":
        newEquipment = new Bow(virtualDice(5));
        break;
      case "Mace":
        newEquipment = new Mace(virtualDice(5));
        break;
      case "Sword":
        newEquipment = new Sword(virtualDice(5));
        break;
      case "Fireball":
        newEquipment = new Fireball(virtualDice(5));
        break;
      case "Invisibility":
        newEquipment = new Invisibility(virtualDice(5));
        break;
      case "Lightning":
        newEquipment = new Lightning(virtualDice(5));
        break;
      default:
        break;
    }
    System.out.println("case " + player.getPosition() + "/" + 63 + " | You find a new " + type);

    if (type == "Bow" || type == "Mace" || type == "Sword") {
      test = allowToEquipWarrior(player);
    } else {
      test = allowToEquipWizard(player);
    }

    if (test) {
      do {
        System.out.println(
            " Would you replace  " + player.getInventory()[1].toString() + " by " + newEquipment.toString() + " ?");
        System.out.println(" 0 - YES");
        System.out.println(" 1 - NO");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 0) {
          player.inventory[1] = newEquipment;
          System.out.println("Equipment changed");
          correct = true;
        } else if (choice == 1) {
          correct = true;
        } else {
          correct = false;
        }
      } while (!correct);
    }
  }

  public boolean betterThanOlder(int offensive1, int offensive2) {
    if (offensive1 < offensive2) {
      return true;
    } else {
      return false;
    }
  }

  public boolean allowToEquipWizard(Player player) {
    return player instanceof Wizard;
  }

  public boolean allowToEquipWarrior(Player player) {
    return player instanceof Warrior;
  }

  /**
   * Method which return a random integer (1 - max)
   * 
   * @return an integer
   */
  public int virtualDice(int max) {
    return new Random().nextInt(max + 1);
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
   * Getter of "offensive" variable
   * 
   * @return offensive : The offensive
   */
  public Equipment getOffensive() {
    return offensive;
  }

  /**
   * Setter of "name" variable
   * 
   * @param name : The name of the character
   */
  public void setOffensive(Equipment offensive) {
    this.offensive = offensive;
  }
}
