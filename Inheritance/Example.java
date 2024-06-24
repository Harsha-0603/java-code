//Chatgpt example
class Animal 
{
    // Field
    private String name;

    // Constructor
    public Animal(String name) 
    {
        this.name = name;
    }

    // Method
    public void makeSound() 
    {
        System.out.println("Some generic animal sound");
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

class Dog extends Animal 
{
    // Constructor
    public Dog(String name) 
    {
        super(name); // Call the constructor of the superclass (Animal)
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Additional method specific to Dog
    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }
}

public class Example 
{
        public static void main(String[] args) 
        {
            // Create an object of the subclass Dog
            Dog myDog = new Dog("Buddy");
    
            // Call methods on the Dog object
            System.out.println("Name: " + myDog.getName()); // Inherited method
            myDog.makeSound(); // Overridden method
            myDog.fetch(); // Subclass-specific method
        }
}
        
