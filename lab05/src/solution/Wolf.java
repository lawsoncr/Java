package solution;

/**
 * The class for wolf.
 * 
 * @author Connor Lawson
 * @version 1.025253
 */
public class Wolf extends Canine
{
    /**
     * This is the constructor for wolf.
     * @param myZoo is the Zoo.
     * @param name is the name of zoo.
     */
    public Wolf(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     * The wolf makes a noise.
     */
    public void makeNoise()
    {
        System.out.println("growl...");
    }

    /**
     * The wolf eats its food.
     */
    public void eat()
    {
        System.out.println("rip with teeth...");
        setHungerLevel(getHungerLevel() - 2);
    }
}