package solution;

/**
 * The class for WildDog.
 * 
 * @author Connor Lawson
 * @version 45.25
 *
 */
public class WildDog extends Canine
{
    /**
     * The constructor for WildDog.
     * @param myZoo is my zoo.
     * @param name is the name.
     */
    public WildDog(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     * The wild dog makes a noise.
     */
    public void makeNoise()
    {
        System.out.println("bark...");
    }

    /**
     * The wild dog eats.
     */
    public void eat()
    {
        System.out.println("slop...");
        setHungerLevel(getHungerLevel() - 3);
    }
}
