//implementing 2 interfaces at a time 
//class to class --> extends
// class to interface --> implements 
//interface to interface --> extends
interface Cricket 
{
    int year = 2024;
    String jersey ="white";  

    void play();  
    void batting();
    void bowling();
}

interface Olympics
{
    void running();
    void winner();
}

class Player implements Cricket, Olympics 

{
    public void play()
    {
        System.out.println("India is playing with Pakistan");
    }

    public void batting()
    {
        System.out.println("Kohli is batting");
    }

    public void bowling() 
    {
        System.out.println("Pakistan is bowling");
    }

    public void running()
    {
        System.out.println("12 Players are running");
    }

    public void winner()
    {
        System.out.println("harsha is winner");
    }
}


public class Sports
{
    public static void main(String[] args) 
    {
    // creating object 
    Player obj = new Player();
    obj.play();
    obj.batting();
    obj.bowling();
    obj.running();
    obj.winner();

    System.out.println(Cricket.jersey);
    System.out.println(Cricket.year);

    }
}

