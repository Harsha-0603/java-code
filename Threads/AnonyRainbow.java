//instead of soo many classes, using anonymous inner class as we are using class only once and runnable is a functional interface so we can do that
//using Runnable class

public class AnonyRainbow
{
    public static void main(String[] args)
     {
        Runnable obj = () ->
        {
            for(int i=1; i<=10; i++)
    {
        System.out.println("Hi");
        try
        {
            Thread.sleep(10);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
};
        Runnable obj1 =() ->
        {
        for(int i=1; i<=10; i++)
        {
        System.out.println("Hello");
        try
        {
            Thread.sleep(10);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        }
    };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}
