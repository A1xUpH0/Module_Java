package ddproject.classes.cases.offensiveequipmentcases.spellcases;

import java.util.Random;
import java.util.Scanner;

import ddproject.classes.Player;
import ddproject.classes.cases.offensiveequipmentcases.SpellCase;
import ddproject.classes.equipments.offensive.Spell;
import ddproject.classes.equipments.offensive.spells.Invisibility;

public class InvisibilityCase extends SpellCase {

  public InvisibilityCase(Player player) {
    super(player);
  }
  
  Scanner sc = new Scanner(System.in);
  private boolean correct = false;

  public void run(Player player){
    System.out.println("case " + player.getPosition() + "/" + 63 + " | You find a new invisibility");
    Spell newSpell = new Invisibility(virtualDice(5));
    if(allowToEquip(player)){
      do{
        System.out.println(" Would you replace  " + player.getInventory()[1].toString() + " by " + newSpell.toString() + " ?");
        System.out.println(" 0 - YES");
        System.out.println(" 1 - NO");
        int choice  = sc.nextInt();
        sc.nextLine();
        if (choice == 0){
          player.inventory[1] = newSpell;
          System.out.println("Spell changed");
          correct = true;
        }
        else if(choice == 1){
          correct = true;
        }
        else {
          correct = false;
        }
      }while(!correct);
    }
  }


    /**
   * Method which return a random integer (1 - max)
   * @return an integer
   */
  public int virtualDice(int max) {
    return new Random().nextInt(max + 1);
  }
}
