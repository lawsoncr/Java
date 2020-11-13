package solution;

/**
 * The class for Canine.
 * 
 * @author Connor Lawson
 * @version 1.20325
 *
 */
public abstract class Canine extends Animal
{
    /**
     * The constructor for canine.
     * @param myZoo is my zoo.
     * @param name is the name.
     */
    public Canine(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }
    
    /**
     * The roam method.
     */
    public void roam()
    {
        System.out.println("like canines roam in packs...");
        setHungerLevel(getHungerLevel() + 1);
    }
}
