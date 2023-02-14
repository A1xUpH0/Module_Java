package ddproject.classes.equipments;

public abstract class OffensiveEquipment {
  
  /**
   * The level of the equipment
   */
  private int level;

  /**
   * The name of the equipment
   */
  private String name; 

  /**
   * The constructor of the OffensiveEquipment class
   * @param level : The level of the equipment
   * @param name : The name of the equipment
   */
  public OffensiveEquipment(int level, String name) {
    this.level = level;
    this.name = name;
  }


  // Getters et Setters

   /**
   * Getter of the level of the equipment
   * @return level
   */
   public int getLevel() {
    return level;
  }

  /**
   * Getter of the level of the equipment
   * @param level : The level of the equipment
   */
  public void setLevel(int level) {
      this.level = level;
   }

   /**
   * Getter of the name of the equipment
   * @return name
   */
   public String getName() {
    return name;
  }

  /**
   * Getter of the name of the equipment
   * @param name : The name of the equipment
   */
  public void setName(String name) {
      this.name = name;
   }
}
