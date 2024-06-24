//Example of Lambda expression with return type

@FunctionalInterface
//functional interface should only have one single abstract method 
interface A
{
    int add(int i, int j);
}

public class Summer 
{
    public static void main(String[] args) 
    {
        // A obj = new A()
        // {
        //     public int add(int i, int j)
        //     {
        //       return i+j;
        //     }
        // };

        // int result = obj.add(5,4);
        // System.out.println(result);


        //using lambda expression

        A obj = (i,j) -> i+j;  //we do not need to mention return keyword when using lambda expression

        int result = obj.add(5,4);
        System.out.println(result);
    }
}
