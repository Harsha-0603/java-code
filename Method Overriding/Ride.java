//Example of Method Overriding
class A
{
 public void show()
{
    System.out.println("In A Show");
}
public void config()
{
    System.out.println("In A config");
}
}

class B extends A
{
// when inheriting it inherits both show and config methods from class A but
//if you want to change the printing statement for show method in class B it should show "in B show" instead of "in A show"
//method name same undali but loapala marali so then you do overriding the method
public void show()  //overriding
{
    System.out.println("In B Show");
}
}

public class Ride
{
public static void main(String[] args) 
{
 B obj = new B();
obj.show();  // want to call show method from class B
//so this will call method of class B instead of A (frst priority will be B)
obj.config();//want to call config from class A
}
}

