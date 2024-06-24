//ducking exception using throws keyword
class A 
{
    public void show() throws Exception 
    {
        Class.forName("Calcu"); //There is no calc class here so this should show exception
    }
}
public class Next 
{
    static
    {
        System.out.println("Class Loaded");
    }

    public static void main(String args[])
    {
        A obj = new A();
    
        try {
            obj.show();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace(); //it prints entire stack, entire method calls
        }
//As we are calling show method and it has a class not fount exception, we have 2 ways we can directly put class.forName in try catch block as we cannot do this inside of method, so we need to use throw keyword
//so to use throw keyword, class A throws exception so that main class or any class which is using show method, should have try and catch block to catch the throwed exception. This process of as show method says I will not handle let other class which is using me should handle this type 
//of scenario is ducking the exception using throws keyword
    }
    
}
