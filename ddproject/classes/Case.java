package ddproject.classes;

import ddproject.classes.equipments.OffensiveEquipment;

public class Case {
  
  private OffensiveEquipment contentOffensive;
  private Enemy contentEnemy;


  /**
   * Constructor of the class Case (empty)
   */
  public Case(Player player) {
    
  }
 

  public void run(Player player){}

   
    // Getters et Setters

  /**
   * Getter of "contentOffensive" variable
   * @return contentOffensive : The offensive content of the character
   */
  public OffensiveEquipment getContentOffensive() {
    return contentOffensive;
  }
  /**
  * Setter of "contentOffensive" variable
  * @param contentOffensive : The offensive content of the character
  */
  public void setContentOffensive(OffensiveEquipment contentOffensive) {
    this.contentOffensive = contentOffensive;
  }


/**
* Getter of "contentEnemy" variable
* @return"contentEnemy : The enemy content of the character
*/
public Enemy getContentEnemy() {
 return contentEnemy;
}
/**
* Setter of "contentEnemy" variable
* @param contentEnemy : The enemy content of the character
*/
public void setContentEnemy(Enemy contentEnemy) {
   this.contentEnemy = contentEnemy;
}
}
