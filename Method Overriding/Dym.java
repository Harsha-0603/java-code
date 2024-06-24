//Example of dynamic Method Dispatch 
// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Dym {
    public static void main(String[] args) {
        Animal myAnimal;  // Reference variable of type Animal

        myAnimal = new Dog();  // myAnimal refers to a Dog object
        myAnimal.sound();  // Calls the Dog's version of sound()

        myAnimal = new Cat();  // myAnimal refers to a Cat object
        myAnimal.sound();  // Calls the Cat's version of sound()
    }
}
