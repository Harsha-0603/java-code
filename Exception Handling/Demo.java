//Exception handling using try and catch
public class Demo
{
    public static void main(String[] args) 
    {
        // int i =0;
        // int j =18/i;
        // System.out.println(j); //division by zero gives exceptin which is error at runtime
        
        
        int i=0;
        int j=0;
        //putting it in try and catch block if it's good it will print the result else it will skip and execute catch block
    
        try
        {
            j = 18/i;  //if this is not working it throws error so we need to catch that error using an exception object (exception class)
        }
        catch(Exception e) //e is object "we can use anything but mostly we use "e"''
        {
         System.out.println("something went wrong" + e);
        }

        System.out.println(j); 
        System.out.println("bye"); 
    }
}