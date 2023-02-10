package ddproject.classes;


public abstract class Character {

  /**
   * The name of the character
   */
    private String name;

    /**
     * The class of the character
     */
    private String classChoice;

   
    /**
     * Constructor of the Character class
     */
    public Character() {
        this.name = "Unknown";
        this.classChoice = "Unknown";
    }

    /**
     * Constructor of the Character class
     * @param name : The name of the character
     */
    public Character(String name) {
        this.name = name;
        this.classChoice = "Unknown";
    }

    /**
     * Constructor of the Character class
     * @param name : The name of the character
     * @param classChoice : The class of the character
     */
    public Character(String name, String classChoice) {
        this.name = name;
        this.classChoice = classChoice;
    }


    // Getters et Setters
    
    /**
     * Getter of "name" variable
     * @return name : The name of the character
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of "name" variable
     * @param name : The name of the character
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter of "classChoice" variable
     * @return"classChoice : The class of the character
     */
    public String getClassChoice() {
        return classChoice;
    }

    /**
     * Setter of "classChoice" variable
     * @param classChoice : The class of the character
     */
    public void setClass(String classChoice) {
        this.classChoice = classChoice;
    }
  }