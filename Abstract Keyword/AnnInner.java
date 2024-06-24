//Example of Anonymous inner class
class Ant
{
public void show()
{
    System.out.println("In A show");
}
}
    
// I want to override show method, I need output as "In new show" 
//generally to do that, we inherit the class and override method.
//That is a long process, instead we can do it directly 
//We can do it while creating an object
//while creating object u can give what should be the output 


public class AnnInner 
{
    public static void main(String[] args) 
    {
        Ant obj = new Ant()
        {
            public void show()   //like this we can do, this is called as Annonymous Inner class
            {
                System.out.println("In new show");  
            }
        };

        obj.show();

    }
}
