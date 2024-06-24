//Example of Upcasting and downcasting
class A
{
    public void show1()
    {
      System.out.println("in A show");
    }
}

class B extends A 
{
    public void show2()
    {
      System.out.println("in B show");
    }
}
public class UcDc 
{
    public static void main(String[] args) 
    {
        A obj = new B();  //Object B is refering to A type which is upcasting
        obj.show1();

        //obj.show2();//this is not possible as the reference is A and not B
//so we downcast it

        B obj1 = (B) obj; //downcasting obj object which refers to A previously so we are doncasting it to refer to B 
        obj1.show2(); 
    }

}
