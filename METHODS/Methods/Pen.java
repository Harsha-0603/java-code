public class Pen
{
    public void playMusic()
    {
        System.out.println("Playing Darling Songs...");
    }

    public String getMeAPen(int cost)
    {
        if(cost>10)
        {
            return "Blue pen";
        }
        else
        {
        return "Black Pen";
        }
    }
}