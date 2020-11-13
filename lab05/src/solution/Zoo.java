package solution;

import java.util.ArrayList;

/**
 * The class for Zoo.
 * 
 * @author Connor Lawson
 * @version 2.0214
 *
 */
public class Zoo implements AnimalLocation
{
    private String name;
    private double latitude;
    private double longitude;
    private ArrayList<Animal> zooAnimals;
    
    /**
     * @param name is the name.
     * @param latitude is the latitude.
     * @param longitude is the longitude.
     */
    public Zoo(String name, double latitude, double longitude)
    {
        setName(name);
        this.latitude = latitude;
        this.longitude = longitude;
        this.zooAnimals = new ArrayList<Animal>();
    }
    
    /**
     * @param animal is the animal
     */
    public void addAnimal(Animal animal)
    {
        zooAnimals.add(animal);
    }
    
    /**
     * Method that tests the Animals.
     */
    public void testAnimals()
    {
        System.out.println(name);
        System.out.println(latitude);
        System.out.println(longitude);
        
        for (Animal animal : zooAnimals)
        {
            animal.sleep();
            animal.makeNoise();
            animal.eat();
            animal.roam();
            
            if (animal instanceof Pet)
            {
                ((Pet) animal).play();
                ((Pet) animal).beFriendly();
            }
        }
    }

    /**
     * Get method for name.
     * @return name is the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set method for name.
     * @param name is the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Get method for latitude.
     * @return latitude is the latitude
     */
    public double getLatitude()
    {
        return latitude;
    }

    /**
     * Get method for longitude.
     * @return longitude is the longitude
     */
    public double getLongitude()
    {
        return longitude;
    }

    /**
     * Get method for number of animals.
     * @return size returns the number of animals.
     */
    @Override
    public int getNumOfAnimals()
    {
        return zooAnimals.size();
    }
    
    /**
     * The main method.
     * @param args is an array of args.
     */
    public static void main(String[] args)
    {
        Zoo zoo = new Zoo("Zoo test", 0, 0);

        zoo.addAnimal(new Lion(zoo, "Leo the Lion"));
        zoo.addAnimal(new Cat(zoo, "Currin the Cat"));
        zoo.addAnimal(new FeralCat(zoo, "Fisher the Feral Cat"));
        zoo.addAnimal(new Coyote(zoo, "Connor the Coyote"));
        zoo.addAnimal(new Hippo(zoo, "Moto Moto the Hippo"));
        zoo.addAnimal(new WildDog(zoo, "Will the Wild Dog"));
        zoo.addAnimal(new Wolf(zoo, "Walace the Wolf"));
        zoo.addAnimal(new Dog(zoo, "Dylan the Dog"));
        
        zoo.testAnimals();
    }
}
