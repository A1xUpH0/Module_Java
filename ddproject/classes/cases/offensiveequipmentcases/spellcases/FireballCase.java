package ddproject.classes.cases.offensiveequipmentcases.spellcases;

import java.util.Random;

import ddproject.classes.Player;
import ddproject.classes.cases.offensiveequipmentcases.SpellCase;
import ddproject.classes.equipments.offensive.Spell;

public class FireballCase extends SpellCase {

  public FireballCase(Player player) {
    super(player);
  }
  

  public void run(Player player){
    System.out.println("case " + player.getPosition() + "/" + 63 + " | You find a new fireball");
    Spell newSpell = new Spell(virtualDice(5));
    if (betterThanOlder(player.getOffensive().level, newSpell.level) & allowToEquip(player)){
      player.offensive = newSpell;
      System.out.println("Spell changed");
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
