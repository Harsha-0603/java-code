//enum with constructors 
enum Laptop
{
    Macbook(80000), Lenovo(70000), HP(65000), Dell; 
    // in the case of only parameterized constructor, we need to set price at any cost for all the variables (if we create parameterized constructor)
    //but I dont want to give price to dell while creating object so to overcome that we can define one default constructor

    private int price;

    private Laptop()  //default constructor with price 500 so dell takes 500, if u leave empty it takes 0
    {
     price = 500;
    }

    private Laptop(int price) 
    {
        this.price = price;
    }
    
    //to use private variables we should use getters and setters so we can use those in enum also
    
    public int getPrice() 
    {
        return price;
    }
}  
    
public class Hardware 
{
    public static void main(String[] args) 
    {
        //to get single value
        // Laptop system = Laptop.Macbook;
        // System.out.println(system + ":" + system.getPrice());

        //to get all values

        for(Laptop system : Laptop.values())   //.values() is method of enum it takes all values 
        {
            System.out.println(system + ":" + system.getPrice());
        }
    } 
}
 