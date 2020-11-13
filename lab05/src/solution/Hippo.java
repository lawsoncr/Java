package solution;

/**
 * The class for Hippo.
 * 
 * @author Connor Lawson.
 * @version 6.234
 *
 */
public class Hippo extends Animal
{
    /**
     * The constructor for Hippo.
     * @param myZoo is my zoo.
     * @param name is the name.
     */
    public Hippo(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     * The Hippo makes noise.
     */
    public void makeNoise()
    {
        System.out.println("blub...");
    }

    /**
     * The Hippo eats.
     */
    public void eat()
    {
        System.out.println("slurp...");
        setHungerLevel(getHungerLevel() - 1);
    }
}