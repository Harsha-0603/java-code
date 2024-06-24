//try with "finally"

public class Machine 
{
    public static void main(String[] args) 
    {
        int i=0;
        int j=0;

        try   //if u want to do try and don't want to use catch and dont want to handle exception then u can use "finally"
        {
        j=18/i;
        System.out.println("Bye"); //it will not print this bcse the moment when exception comes it skips remaining part and go to catch block
        }
        catch(Exception e)
        {
            System.out.println("something Went Wrong");
        }
        finally  //we want bye statament, if there is exception in try then bye will not print, it will print from catch. so if u want to do some action whether irrespective of exception then we put those statments in finally block
        {
        System.out.println("Bye");
        }

    }
}
//whenever we want to close a resource then we use finally, instead of catch we can write finally for try block
//but we are not handling exception so we need to use catch to handle it or use throws keyword to handle it