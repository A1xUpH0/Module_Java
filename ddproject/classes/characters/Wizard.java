package ddproject.classes.characters;

import ddproject.classes.Character;


public class Wizard extends Character {

  String name; // Name
  int health; // Health Points
  int strength; // Strength Points
  String offensiveEquipment; // Offensive Equipment
  String defensiveEquipment; // Defensive Equipment


  public Wizard(String name, String offensiveEquipment, String defensiveEquipment) { // Values Attribution
    this.name = name;
    this.health = 6;
    this.strength = 15;
    this.offensiveEquipment = offensiveEquipment;
    this.defensiveEquipment = defensiveEquipment;
  }

  // Getters et Setters
  public String getName() {
    return name;
  }
  public void setName(String name) {
      this.name = name;
  }

  public String getOffensiveEquipment() {
    return offensiveEquipment;
  }
  public void setOffensiveEquipment(String offensiveEquipment) {
      this.offensiveEquipment = offensiveEquipment;
  }

  public String getDefensiveEquipment() {
    return offensiveEquipment;
  }
  public void setDefensiveEquipment(String defensiveEquipment) {
      this.defensiveEquipment = defensiveEquipment;
  }
}