//String and how to create a string 
public class Demostr
{
    public static void main(String[] args) 
    {
        String name = new String("Vineeth");
       // String name = "Vineeth" //This also works and mostly used format
       
        System.out.println(name);
        System.out.println(name.hashCode()); // name string ki hashcode return chestadi using hashCode method
        System.out.println(name + " is handsome"); //concatinating using + symbol
        System.out.println(name.charAt(6));// returns character at index 6
        System.out.println(name.concat(" Reddy")); //concatinating using concat method
    }
}