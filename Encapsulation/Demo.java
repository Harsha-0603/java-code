//encapsulation example
class Human
{
   private int age = 23; //This variable is accessible only in the same class
   private String name = "Harsha"; 
//every time you create a instance variable, make it private so that other classes can access using permission like using some methods

  public int getAge()
  {
    return age; //trying to access age from same class so there is no issue
  }

 public String getName()
  {
    return name; //trying to access name from same class so there is no issue and making it public
  }
}

public class Demo
{
    public static void main(String[] args) 
    {
       Human obj = new Human();
    //    obj.age = 23;
    //    obj.name ="Harsha"; // this wil not work

       System.out.println(obj.getAge() + ":" + obj.getName());
    }
}