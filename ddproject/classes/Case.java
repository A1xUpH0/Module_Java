package ddproject.classes;

import ddproject.classes.equipments.OffensiveEquipment;
import ddproject.classes.equipments.Potion;

public class Case {
  
  private OffensiveEquipment contentOffensive;
  private Enemy contentEnemy;

  private String message = "Empty case";


  /**
   * Constructor of the class Case (empty)
   */
  public Case() {
    toString();
  }
  /**
   * Constructor of the class Case (contentDefensive)
   * @param potion
   */
  public Case(Potion potion) {
    message = "Potion on this case";
    toString();
  }
  /**
   * Constructor of the class Case (contentOffensive)
   * @param contentOffensive
   */
  public Case(OffensiveEquipment contentOffensive) {
    message = "Offensive equipement on this case";
    toString();
  }
  /**
   * Constructor of the class Case (contentEnemy)
   * @param contentEnemy
   */
  public Case(Enemy contentEnemy) {
    message = "Enemy on this case";
    toString();
  }


   public String toString() {
    System.out.println(this.message);
    return "";
   }

   
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
