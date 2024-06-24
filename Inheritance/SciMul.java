//Example of Multilevel inheritance 

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

class SciCalc extends AdvCalc//scientific calculator should extend both calc and AdvCalc
//As AdvCalc already extending Calc we give "extends Advcalc" to extend both Calc and AdvCalc methods. 
//This is multi-level inheritance
{
public double power(int n1, int n2)
{
    return Math.pow(n1,n2);
}
}

public class SciMul 
{
    public static void main(String args[])
    {
        SciCalc obj = new SciCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(10,3);
        int r3 = obj.mul(4,5);
        int r4 = obj.div(10,3);
        double r5 = obj.power(4,2);

    System.out.println(r1 + "," + r2 + "," + r3 + "," + r4 + "," + r5);
    }
}


