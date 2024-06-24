//Example of final class
final class First
{
    public void display() 
    {
        System.out.println("This is a final class.");
    }
}

// The following code would cause a compile-time error
// class Second extends First 
//{

// }

public class FCExample 
{
    public static void main(String[] args) 
    {
       First example = new First();
       example.display();
    }
}


    