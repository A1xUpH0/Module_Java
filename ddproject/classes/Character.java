package ddproject.classes;


public class Character {

  /**
   * Name
   */
    private String name;

    /**
     * Class Choice
     */
    private String classChoice;

   
    /**
     * Constructor Character
     */
    public Character() {
        this.name = "Unknown";
        this.classChoice = "Unknown";
    }

    /**
     * Constructor Character
     * @param name
     */
    public Character(String name) {
        this.name = name;
        this.classChoice = "Unknown";
    }

    /**
     * Constructor Character
     * @param name
     * @param classChoice
     */
    public Character(String name, String classChoice) {
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