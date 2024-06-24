public class Example
{
    public static void main(String[] args) 
    {
    
        int i=0;
        int j=0;
        
        try
        {
            j = 18/i;  
            if(j==0)
                throw new ArithmeticException();
        }
        catch(ArithmeticException e) //e is object "we can use anything but mostly we use "e"''
        {
         j =18/1;
         System.out.println("Default output");
        }

        catch(Exception e) //Exception parent class which checks for all the exceptions, this exception catch block should be written at end 
        {
         System.out.println("something went wrong" + e);
        }


        System.out.println(j); 
        System.out.println("bye"); 

}
}