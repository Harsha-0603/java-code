//User Input using BufferedReader and Scanner in Java
import java.util.Scanner;

import java.util.Scanner;

public class Consist 
{
    public static void main(String[] args) 
    {
        
        System.out.println("Enter a number"); //this is outputting line not to take input

        //For user input  //old option
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in); //we need to pass in the arguments, pass obj of InputStream class
 
        // int num = Integer.parseInt(br.readLine()); //it generally takes string so to change it to int, we use Integer.parseInt
        // System.out.println(num);

        // br.close();  //closing BufferedReader file after use

        Scanner sc = new Scanner(System.in); //new way //takes input
        int num = sc.nextInt(); //methods of scanner class
        System.out.println(num);
    }
}
