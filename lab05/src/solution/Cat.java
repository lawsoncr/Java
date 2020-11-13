package solution;

/**
 * The class for Cat.
 * 
 * @author Connor Lawson
 * @version 3.02158
 */
public class Cat extends Feline implements Pet
{
    /**
     * The constructor for Cat.
     * @param myZoo is my zoo.
     * @param name is my name.
     */
    public Cat(Zoo myZoo, String name)
    {
        super(myZoo, name);
    }

    /**
     * The cat makes noise.
     */
    public void makeNoise()
    {
        System.out.println("meow...");
    }

    /**
     * The cat eats
     */    
    public void eat()
    {
        System.out.println("pick...");
        setHungerLevel(getHungerLevel() - 3);
    }

    /**
     * The cat plays.
     */
    public void play()
    {
        System.out.println("frolic...");
    }

    /**
     * The cat is friendly.
     */
    public void beFriendly()
    {
        System.out.println("purr...");
    }
}