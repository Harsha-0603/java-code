public class Main 
{
    //This code is all about instance variables, how to access and set values which is done 
    //by creating object of that class
    public static void main(String args[])
    {
     // Create an object of the Car class
     Car myCar = new Car();

     // Access instance variables and set values
     myCar.year = 2008;
     myCar.make = "Audi";
     myCar.model = "Sport";
     myCar.price = 500000;

     // Access instance variables and print values
     System.out.println("Manufacture year: " + myCar.year);
     System.out.println("Manufactured by: " + myCar.make);
     System.out.println("Car Model: " + myCar.model);
     System.out.println("Price of the car: " + myCar.price);

    }
}
