public class Car
{
    //This class has instance variables and instance method!!!
    //creating instance variables
    int year;
    double price;
    String make;
    String model;

//instance method to display the information
public void displayInfo()
{
    System.out.println("manufacture year:" + year);
    System.out.println("Car price:" + price);
    System.out.println("manufactured by:" + make);
    System.out.println("Car model:" + model);
}

//instance method to calculate the depreciation of the car
public double calculateDepreciation(int currentYear)
{
    int yearsOld = currentYear - year;
    double depreciationRate = 0.1; // Assuming 10% depreciation per year
    double depreciationAmount = price * depreciationRate * yearsOld;
    return price - depreciationAmount;
}
}

//so the above method is calculating the depreciation where currentYear (camelCase) is passed as argument
//variables should be written "camelCase" and class should be written in "PascelCase"