//example of Static Block
    public class Statblo 
    {

        // Static variable
        static int myStaticVar;
    
        // Static block
        static 
        {
            System.out.println("Static block is executed.");
            myStaticVar = 10;
        }
    
        // Constructor
        Statblo() 
        {
            System.out.println("Constructor is called.");
        }
    
        // Static method
        static void display() 
        {
            System.out.println("Value of myStaticVar: " + myStaticVar);
        }
    
        public static void main(String[] args) 
        {
            // The static block is executed before any objects are created
            System.out.println("Main method is executed.");
    
            // Create an object of MyClass to call constructor
            Statblo obj = new Statblo();
    
            // Call the static method using class name
            Statblo.display();
        }
    }
    

