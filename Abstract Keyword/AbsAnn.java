//Example of Abstract class and Anonymous inner class(using together)
// Important point: If we want to implement the interface or abstract class only once then we can use anonymous inner class!!
abstract class Annie
{
public abstract void show();
public abstract void copy();
}

//Instead of implementing an abstract class why to create a new class and wasting time and space 
//instead we can directly do it using anonymous inner class
//we can override abstract method while creating the object of that class

// class Bunny extends Annie
// {
// @Override
//  public void show()
//  {
//     System.out.println("Showing the book");
//  }
// }
    

public class AbsAnn 
{
    public static void main(String[] args) 
    {
        Annie obj = new Annie()  // we cannot create object of abstract class, but here we are creating object of the below anonymous inner class 
        {
            public void show()
            {
                System.out.println("I am showing the book, please copy");
            }
            public void copy()
            {
                System.out.println("Completed copying");
            }
        };
        obj.show();
        obj.copy();

    }
}
    

//In concepts of interfaces and abstract class, we use this anonymous inner class concept, only if we want to implement that only once. 
//And we can implement anonymous inner class for multipe methods as well
