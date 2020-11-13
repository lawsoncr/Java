package solution;

/**
 * The class for Lion.
 * 
 * @author Connor Lawson
 * @version 2019-02-21
 */
public class Lion extends Feline
{
    /**
     * The constructor for Lion.
     * @param myZoo is my Zoo.
     * @param name is the name.
     */
    public Lion(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     * The Lion makes noise.
     */
    public void makeNoise()
    {
        System.out.println("roar...");
    }

    /**
     * The Lion eats.
     */
    public void eat()
    {
        System.out.println("rip with teeth...");
        setHungerLevel(getHungerLevel() - 2);
    }
}
