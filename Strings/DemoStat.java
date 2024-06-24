//Example of Static Keyword
class Mobile
{
    String brand;
    int price;
    static String name;  // the name variable is set as static 

    public void show()
    {
        System.out.println(brand + ":" + price + ":" + name);
    }
}

public class DemoStat
{
    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 70000;
        Mobile.name = "Iphone"; //Static variable should be called with class names not object names

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 60000;
        Mobile.name = "XR"; ///Static variable should be called with class names not object names

obj1.show();
obj2.show();
}
}