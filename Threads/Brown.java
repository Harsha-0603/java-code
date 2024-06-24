//Example2 of threads
//want one Hi and One Hello line by line so this can be done bh giving priority to threads 

class A extends Thread
{
    public void run() //for every thread it should have a run() method
    {
        for(int i=1; i<=10; i++)
    {
        System.out.println("Hi");
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
    }
    }
}

public class Brown
{
    public static void main(String[] args)
     {
        A obj = new A();
        B obj1 = new B();

        // System.out.println(obj1.getPriority());
        //or
        obj1.setPriority(Thread.MAX_PRIORITY); //setting priority

        obj.start();  //we should use start method to invoke thread, this start methods ivokes run method inside thread of class A
        obj1.start();
    }
}