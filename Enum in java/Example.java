enum Status
{
Running, Failed, Pending, Success; //constants
}

public class Example
{
    public static void main(String[] args) 
    {
        int i=5;

    //to print one status at a time
        Status s = Status.Running;
        System.out.println(s);

        //to get all status at a time instead of one
        //we use method .values()
        //as it has set of values we should give [] defining it as array and give different object name
        Status[] s1 = Status.values();

        System.out.println(s1[0]);  //to print 1st status

        //using enhanced for loop to print all

        for(Status s2 :s1)  //gives one status at a time which is "s2"(new reference) from set of values s1
        {
    
            //System.out.println(s2); or
            System.out.println(s2+ ":" + s2.ordinal());
        }
    }
}