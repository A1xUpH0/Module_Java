package ddproject.classes.cases.offensiveequipmentcases;

import ddproject.classes.Player;
import ddproject.classes.cases.OffensiveEquipmentCase;
import ddproject.classes.characters.Warrior;

public abstract class WeaponCase extends OffensiveEquipmentCase {

  public WeaponCase(Player player) {
    super(player);
  }
    

  public boolean allowToEquip(Player player){
    return player instanceof Warrior;
  }
}