//using Runnable class

class A implements Runnable
{
    public void run() //for every thread it should have a run() method
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
    }
}

class B implements Runnable
{
    public void run() //for every thread it should have a run() method
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
    }
}

public class Rainbow
{
    public static void main(String[] args)
     {
        Runnable obj = new A();
        Runnable obj1 = new B();

        // obj.start(); // this start() will not work because runnable interface dont have start method. Start method cmesfrom thread class not runnable class

        //so creating threads
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}