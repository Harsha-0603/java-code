//example of inner class

class A
{
    int age;
    
    public void show()
    {
      System.out.println("In show");
    }

    class B // class B inside of class A
    {
      public void config()
      {
        System.out.println("In Config");
      }
    }
}

//How do we call method config ??

public class Inner 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.show();

        //B obj1 = new B();  this will not work as B belongs to A

        A.B obj1 = obj.new B();  //to create object of B we need object of A first
        //A.B means B belongs to A and obj.new means object of outer class giving reference to new object B
        obj1.config();

    }
}
