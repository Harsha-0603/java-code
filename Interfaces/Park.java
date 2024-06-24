// Define an interface with default and static methods
interface Animal {
    void eat();
    void sleep();

    // Default method
    default void sound() {
        System.out.println("Animal makes sound");
    }

    // Static method
    static void info() {
        System.out.println("This is an Animal interface");
    }
}

// Implement the interface in a class
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to test the interface
public class Park {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.sound();

        // Call static method
        Animal.info();
    }
}
 
