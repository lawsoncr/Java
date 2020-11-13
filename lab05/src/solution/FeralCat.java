package solution;

/**
 * The class for FeralCat.
 * 
 * @author Connor Lawson
 * @version 5.639
 *
 */
public class FeralCat extends Feline
{
    /**
     * The constructor for FeralCat.
     * @param myZoo is my Zoo.
     * @param name is the name.
     */
    public FeralCat(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     * The Feral Cat makes noise.
     */
    public void makeNoise()
    {
        System.out.println("meow...");
    }

    /**
     * The Feral Cat eats.
     */
    public void eat()
    {
        System.out.println("pick...");
        setHungerLevel(getHungerLevel() - 3);
    }
}
