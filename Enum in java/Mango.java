//Enum with switch statement
enum Message
{
Running, Failed, Pending, Success; //constants
}

public class Mango
{
    public static void main(String[] args) 
    {

        Message m = Message.Pending;

        switch(m)
        {
            case Running:
            System.out.println("All Good");
            break;

            case Failed:
            System.out.println("try Again");
            break;

            case Pending:
            System.out.println("Please wait");
            break;
        
            default:
            System.out.println("Done");
            break;
        }
    }
}


        // if(m==Status.Running)
        // System.out.println("Okay");
        // else if(m==Status.Failed)
        // System.out.println("Try Again");
        // else if(m==Status.Pending)
        // System.out.println("Please Wait");
        // else
        // System.out.println("Completed");
