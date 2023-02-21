package ddproject.classes.cases;

import ddproject.classes.Case;
import ddproject.classes.Player;
import ddproject.classes.equipments.OffensiveEquipment;

public abstract class OffensiveEquipmentCase extends Case {
  
  private Player player;
  private OffensiveEquipment offensive;

  public OffensiveEquipmentCase(Player player){
    super(player);
  }

public boolean betterThanOlder(int offensive1, int offensive2){
  if ( offensive1 < offensive2){
    return true;
  }
  else {
    return false;
  }
}


  // Getters et Setters

   /**
   * Getter of "player" variable
   * @return player : The player
   */
  public Player getPlayer() {
    return player;
  }
  /**
  * Setter of "name" variable
  * @param name : The name of the character
  */
  public void setPlayer(Player player) {
    this.player = player;
  }


   /**
   * Getter of "offensive" variable
   * @return offensive : The offensive
   */
  public OffensiveEquipment getOffensive() {
    return offensive;
  }
  /**
  * Setter of "name" variable
  * @param name : The name of the character
  */
  public void setOffensive(OffensiveEquipment offensive) {
    this.offensive = offensive;
  }
}
