package ddproject.classes.equipments;

public class DefensiveEquipment {
  
  String equipment; // Equipment (Shield or Potion)
  int level; // Defense Level 
  String name; // Name

  public DefensiveEquipment(String equipment, int level, String name) { // Values Attribution
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