//Example of Functional interfaces and Lambda  expression

@FunctionalInterface
//functional interface should only have one single abstract method 
interface A
{
  void show(); 
}

public class Family 
{
    public static void main(String[] args) 
    {
        // A obj = new A()
        // {
        //     public void show()
        //     {
        //       System.out.println("in show");
        //     }
        // };

        //we used anonymous inner class above so instead of giving like that we can use lambda expression

        A obj = () ->  System.out.println("in show");
        
        //An arrow is a lambda expression ehere we are removing new A() and public void show line because compiler knows that functional interface 
        //has only one method and A obj means it is refering to that class na so we can reduce code, no need for {} and semi colon as well

        obj.show();
    }
}
