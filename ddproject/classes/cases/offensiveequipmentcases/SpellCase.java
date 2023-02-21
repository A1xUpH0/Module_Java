package ddproject.classes.cases.offensiveequipmentcases;

import ddproject.classes.Player;
import ddproject.classes.cases.OffensiveEquipmentCase;
import ddproject.classes.characters.Wizard;

public abstract class SpellCase extends OffensiveEquipmentCase {

  public SpellCase(Player player) {
    super(player);
    
  }


  public boolean allowToEquip(Player player){
    return player instanceof Wizard;
  }
}
