package ddproject.classes.equipments;

public abstract class DefensiveEquipment {
  
  /**
   * The type of the equipment (Shield or Potion)
   */
  private String type; 

  /**
   * The level of the equipment
   */
  private int level;

  /**
   * The name of the equipment
   */
  private String name; 

  /**
   * The constructor of the DefensiveEquipment class
   * @param type : The type of the equipment
   * @param level : The level of the equipment
   * @param name : The name of the equipment
   */
  public DefensiveEquipment(String type, int level, String name) {
    this.type = type;
    this.level = level;
    this.name = name;
  }


  // Getters et Setters

  /**
   * Getter of the type of the equipment
   * @return type
   */
  public String getType() { 
    return type;
  }

  /**
   * Setter of the type of the equipment
   * @param type : The type of the equipment
   */
  public void setType(String type) {
      this.type = type;
   }

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
