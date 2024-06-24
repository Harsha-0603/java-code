//Example1 of threads
//things will be running in parallel using threads, it uses scheduler concept.

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

public class Basket
{
    public static void main(String[] args)
     {
        A obj = new A();
        B obj1 = new B();

        obj.start();  //we should use start method to invoke thread, this start methods ivokes run method inside thread of class A
        obj1.start();
    }
}