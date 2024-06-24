//What if the abstract class have 2 abstract methods 
//2nd example of abstract class and method and keyword

abstract class Car
{
    //u declared drive method but dont know what to implement inside for drive feauture
    public abstract void drive();

    public abstract void stop();

    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

}

//now Audi is only planning to override drive method and implement it but it does not have anything to do with stop method
//when extending abstract class we need to override and implement all abstract methods in that class if not we get error.
//If a class cannot implement all abstract methods, then that class should also be defined as abstract class
//so we cannot create object for Audi class also, so we create object for a concrete class which extends and implements all abstract methods

abstract class Audi extends Car
{
    public void drive() //defining abstract method and overriding
    {
        System.out.println("turn on to drive");
    }
}

class BMW extends Audi   //This is called a Concrete class
//when extending audi there will be only 1 abstract method "stop" left to implement
//if we extend from Car then both abstract methods should get implemented in this class
{
    public void stop()
    {
        System.out.println("Use break to Stop");
    }
}


public class Example 
{
    public static void main(String[] args) 
    {
        //cannot create object of abstract class but can create a reference of abstract class
        Car obj = new BMW();
        obj.drive(); 
        obj.playMusic();
        obj.stop();
    }
}






