//example of inheritence 
class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}

class AdvCalc extends Calc 
{
    public int mul(int n1, int n2)
    {
        return n1*n2;
    }

    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}
public class Demo
{
    public static void main(String args[])
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(10,3);
        int r3 = obj.mul(4,5);
        int r4 = obj.div(10,3);

    System.out.println(r1 + "," + r2 + "," + r3 + "," + r4);
    }
}