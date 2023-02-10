package ddproject.classes.equipments;

public class OffensiveEquipment {
  
  /**
   * Equipment (Weapon or Spell) [String]
   */
  private String equipment; 

  /**
   * Attack Level [Int]
   */
  private int level;

  /**
   * Name [String]
   */
  private String name; 

  /**
   * Constructor Offensive Equipment
   * @param equipment
   * @param level
   * @param name
   */
  public OffensiveEquipment(String equipment, int level, String name) {
    this.equipment = equipment;
    this.level = level;
    this.name = name;
  }


  // Getters et Setters

  public String getEquipment() { 
    return equipment;
  }
  public void setEquipment(String equipment) {
      this.equipment = equipment;
   }
   public String getLevel() {
    return equipment;
  }
  public void setLevel(int level) {
      this.level = level;
   }

   public String getName() {
    return equipment;
  }
  public void setName(String name) {
      this.name = name;
   }
}
