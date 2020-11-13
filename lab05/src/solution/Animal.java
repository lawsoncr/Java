package solution;

/**
 * The Animal class.
 * 
 * @author Connor Lawson
 * @version 1.32542
 */
public abstract class Animal
{
    private String name;
    private Zoo zoo;
    private int hunger;

    /**
     * The constructor for Animal.
     * @param myZoo is my zoo.
     * @param name is the name of the zoo.
     */
    public Animal(Zoo myZoo, String name)
    {        
        setName(name);
        setHungerLevel(0);
    }
    
    /**
     * Get method for zoo.
     * @return zoo returns zoo.
     */
    public Zoo getZoo()
    {
        return zoo;
    }
    
    /**
     * Set method for zoo.
     * @param zoo sets zoo.
     */
    public void setZoo(Zoo zoo)
    {
        this.zoo = zoo;
    }
    
    /**
     * Get method for hungerLevel.
     * @return hunger returns hunger level.
     */
    public int getHungerLevel()
    {
        return hunger;
    }
    
    /**
     * Set method for hungerLevel.
     * @param hunger sets the animal's hunger level.
     */
    public void setHungerLevel(int hunger)
    {
        if(hunger < 0)
            hunger = 0;
        
        else if(hunger > 10)
            hunger = 10;
       
        this.hunger = hunger;
    }
    
    /**
     * Get method for name.
     * @return name returns the name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set method for name.
     * @param name sets the name.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * The animal sleeps.
     */
    public void sleep()
    {
        System.out.println("sleeping...");
        setHungerLevel(10);
    }
    
    /**
     * The animal roams around.
     */
    public void roam()
    {
        System.out.println("moving around...");
        setHungerLevel(getHungerLevel() + 1);
    }  

    /**
     * The animal makes a noise.
     */
    public abstract void makeNoise();
    
    /**
     * The animal eats.
     */
    public abstract void eat();    
    
}