package solution;

/**
 * The class for Dog.
 * 
 * @author Connor Lawson
 * @version 8.325
 *
 */
public class Dog extends Canine implements Pet
{
    /**
     * The constructor for Dog.
     * @param myZoo is my zoo.
     * @param name is the name.
     */
    public Dog(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     *The dog makes a noise.
     */
    public void makeNoise()
    {
        System.out.println("bark...");
    }

    /**
     * The dog eats.
     */
    @Override
    public void eat()
    {
        System.out.println("slop...");
        setHungerLevel(getHungerLevel() - 3);
    }

    /**
     * The dog plays.
     */
    public void play()
    {
        System.out.println("frolic...");
    }

    /**
     * The dog is friendly.
     */
    public void beFriendly()
    {
        System.out.println("bark...");
    }
}