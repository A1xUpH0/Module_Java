package ddproject.classes;


public class Character {

    private String name; // Name
    private String classChoice; // Class Choice

   
    public Character() { // Constructor Setting Less
        this.name = "Unknown";
        this.classChoice = "Unknown";
    }

   
    public Character(String name) { // Constructor with Name
        this.name = name;
        this.classChoice = "Unknown";
    }

    
    public Character(String name, String classChoice) { // Constructor with Name and classChoice
        this.name = name;
        this.classChoice = classChoice;
    }


    // Getters et Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassChoice() {
        return classChoice;
    }
    public void setClass(String classChoice) {
        this.classChoice = classChoice;
    }
  }