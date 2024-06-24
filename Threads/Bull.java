//using sleep in threads 
//when giving time the thread will wait after one execution to let second thread to run
//Example3 of threads
//sleep means going into waiting stage

class A extends Thread
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

class B extends Thread
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

public class Bull
{
    public static void main(String[] args)
     {
        A obj = new A();
        B obj1 = new B();

        obj.start();
        try
        {
            Thread.sleep(3);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        obj1.start();

    }
}