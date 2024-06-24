//Example of Final method 
class ParentClass 
{
    public final void show() 
    {
        System.out.println("This is a final method in the parent class.");
    }
}
    
class ChildClass extends ParentClass {
// The following method declaration would cause a compile-time error
    // public void show() {
    //     System.out.println("Trying to override the final method.");
    // }
    }
    
public class FMExample 
{
    public static void main(String[] args) 
    {
        ChildClass child = new ChildClass();
        child.show(); // This will call the final method in ParentClass
    }
}
    
    
