
public class Demo
{
    public static void main(String[] args) 
    {
       Pen obj = new Pen();
       obj.playMusic();
       String str = obj.getMeAPen(10);
       System.out.println("The colour of pen is " + str); 
    }
}
