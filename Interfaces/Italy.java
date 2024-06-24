//Example of Lambda expression with functional interface assigning value for method

@FunctionalInterface
//functional interface should only have one single abstract method 
interface A
{
  void show(int i); //accepting value
}

public class Italy 
{
    public static void main(String[] args) 
    {
        // A obj = new A()
        // {
        //     public void show(int i)
        //     {
        //       System.out.println("in show" + i);
        //     }
        // };

        //we used anonymous inner class above so instead of giving like that we can use lambda expression

        //A obj = (int i) ->  System.out.println("in show" + i);
        
        A obj =  i ->  System.out.println("in show" + i);
        
        //"i" we have only one integer and compiler already knows its type so no need to mention and no need for round bracket as well
        //An arrow is a lambda expression where we are removing new A() and public void show line because compiler knows that functional interface 
        //has only one method and A obj means it is refering to that class na so we can reduce code, no need for {} and semi colon as well

        obj.show(5);
    }
}
