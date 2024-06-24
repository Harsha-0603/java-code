//Example of interfaces

//when we have an abstract class with only abstract methods like below, then we can create an onterface instead!!
// abstract class Aero
// {
//     public abstract void fly();
//     public abstract void land();
// }

interface Aero  //interface is not a class
{
    //all the variables inside interface are by default final and static 
    int model = 300;
    String color ="white";  //we should assign

    void fly();  //By default every method in interface is public abstract so no need to mention
    void land();
}

class Plane implements Aero 
//we use word implements, to implement the methods inside an interface
//we need to implement all the empty methods inside interface (after implementing an interface)
{
    public void fly()
    {
        System.out.println("Raise the handle upwards to start flying");
    }

    @Override
    public void land() 
    {
        System.out.println("Press break to land slowly");
    }
}


public class Demo
{
    public static void main(String[] args) 
    {
    // creating object 

    Aero obj;
    obj = new Plane();
    obj.fly();
    obj.land();

    //Aero.model = 500; //final fields cannot be changed

    System.out.println(Aero.color); //static variables shld be called with class name or interface name
    System.out.println(Aero.model);
    }
}




