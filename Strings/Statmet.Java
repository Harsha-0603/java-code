//Example of Static method
class Mob
{
    String brand;
    int price;
    static String name;  // the name variable is set as static 

    public void show()
    {
        System.out.println(brand + ":" + price + ":" + name);
    }

    public static void show1(String brand, int price) 
   //show1() method is a static method with parameters
    {
        System.out.println(brand + ":" + price);
    }
}

public class Statmet
{
    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 70000;
        Mob.name = "Iphone"; //Static variable should be called with class names not object names

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 60000;
        Mob.name = "XR"; ///Static variable should be called with class names not object names

obj1.show(); //Accessing regular method using object/instance of that class
obj2.show();
Mob.show1(obj1.brand, obj1.price); // Accessing static method using class name 
}
}