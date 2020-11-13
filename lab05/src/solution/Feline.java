package solution;

/**
 * The class for Feline.
 * 
 * @author Connor Lawson
 * @version 5.2325
 */
public abstract class Feline extends Animal
{
    /**
     * The constructor for Feline.
     * @param myZoo is my zoo.
     * @param name is the name.
     */
    public Feline(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    
    /**
     * The method for roam.
     */
    public void roam()
    {
        System.out.println("felines like to roam alone...");
        setHungerLevel(getHungerLevel() + 1);
    }
}

