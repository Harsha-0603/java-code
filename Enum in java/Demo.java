//Enum with if condition
enum Status
{
Running, Failed, Pending, Success; //constants
}

public class Demo 
{
    public static void main(String[] args) 
    {

        Status s = Status.Pending;

        if(s==Status.Running)
        System.out.println("Okay");
        else if(s==Status.Failed)
        System.out.println("Try Again");
        else if(s==Status.Pending)
        System.out.println("Please Wait");
        else
        System.out.println("Completed");
}
}
