// Define an interface
interface Animal 
{
    void eat();
    void sleep();
}

// Implement the interface in a class
class Dog implements Animal 
{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

// Main class to test the interface
public class Zoo 
{
    public static void main(String[] args) 
    {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
} 
    
