//Example of Abstract keyword

//abstract methods should only be defined in abstract class
//If a class is extending this abstract class, it should definetely extend and define the abstract method and implement it, otherwise error will occur
 //cannot create object of abstract class but can create a reference of abstract class

 abstract class Car
{
    //u declared drive method but dont know what to implement inside for drive feauture
    public abstract void drive();

    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

}

//using that drive method after extending to implement features for drive method

class Audi extends Car
{
    public void drive() //defining abstract method and overriding
    {
        System.out.println("turn on to drive");
    }
}

public class Demo
{
    public static void main(String[] args) 
    {
        //cannot create object of abstract class but can create a reference of abstract class
        Car obj = new Audi();
        obj.drive(); 
        obj.playMusic();
    }
}





