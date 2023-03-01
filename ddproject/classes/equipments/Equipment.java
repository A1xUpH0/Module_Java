package ddproject.classes.equipments;

public abstract class Equipment {

  /**
   * The level of the equipment
   */
  public int level;

  /**
   * The constructor of the OffensiveEquipment class
   * 
   * @param level : The level of the equipment
   * @param name  : The name of the equipment
   */
  public Equipment(int level) {
    this.level = level;
  }

  @Override
  public String toString() {
    return "| Offensive equipment level : " + level + " |";
  }

  // Getters et Setters

  /**
   * Getter of the level of the equipment
   * 
   * @return level
   */
  public int getLevel() {
    return level;
  }

  /**
   * Getter of the level of the equipment
   * 
   * @param level : The level of the equipment
   */
  public void setLevel(int level) {
    this.level = level;
  }
}
