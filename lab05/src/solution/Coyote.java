package solution;

/**
 * The class for Coyote.
 * 
 * @author Connor Lawson
 * @version 55.369
 *
 */
public class Coyote extends Canine
{
    /**
     * The constructor for Coyote.
     * @param myZoo is my zoo.
     * @param name is the name.
     */
    public Coyote(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     * The coyote makes a noise.
     */
    public void makeNoise()
    {
        System.out.println("howl...");
    }

    /**
     * The coyote eats.
     */
    public void eat()
    {
        System.out.println("gnaws...");
        setHungerLevel(getHungerLevel() - 2);
    }
}
