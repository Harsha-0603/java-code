class Calci
{
 public int add(int n1, int n2)
{
    return n1+n2;
}
}

class AdvCalc extends Calci
{
// //method overriding (same method name same parameters)
public int add(int n1, int n2)
{
    return n1+n2+1;
}
}

public class Calculator
{
public static void main(String[] args) 
{
 AdvCalc obj = new AdvCalc();
int r1= obj.add(4,5);  // want to call show method from class B
//so this will call method of class B instead of A (frst priority will be B)
System.out.println(r1);
}
}

