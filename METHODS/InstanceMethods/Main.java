public class Main 
{
    public static void main(String args[])
    {
    Car myCar = new Car();

    //setting values for instance variables
    myCar.year = 2009;
    myCar.price = 89000.75;
    myCar.model = "Premium";  
    myCar.make = "Audi";

    //calling instance methods!!
    myCar.displayInfo();
    double currentPrice = myCar.calculateDepreciation(2024);
    System.out.println("current price after depreciation: $" + currentPrice);
    }
}