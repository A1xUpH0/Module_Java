package ddproject.classes.cases.offensiveequipmentcases.weaponcases;

import java.util.Random;

import ddproject.classes.Player;
import ddproject.classes.cases.offensiveequipmentcases.WeaponCase;
import ddproject.classes.equipments.offensive.Weapon;

public class SwordCase extends WeaponCase {

  public SwordCase(Player player) {
    super(player);
  }
  

  public void run(Player player){
    System.out.println("case " + player.getPosition() + "/" + 63 + " | You find a new sword");
    Weapon newWeapon = new Weapon(virtualDice(5));
    if (betterThanOlder(player.getOffensive().level, newWeapon.level) & allowToEquip(player)){
      player.offensive = newWeapon;
      System.out.println("Weapon changed");
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
