//Example of constructor
public class Const {
        int instanceVar; // Instance variable
    
        // Constructor
        Const(int value) 
        {
            // 'this' keyword is used to refer to the current object's instance variable
            this.instanceVar = value;
            System.out.println("Constructor is called. instanceVar is set to " + value);
        }
    
        public static void main(String[] args) 
        {
            // Creating an object of MyClass and passing 5 to the constructor
            Const obj = new Const(5);
        }
    }