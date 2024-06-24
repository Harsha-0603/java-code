//Example 2 of Finally block

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Friend 
{
    public static void main(String[] args) throws IOException
     {
        
        int num=0;
        BufferedReader br = null; //declaring this outside and using it inside can help finally block to use it
        try{

            // InputStreamReader in = new InputStreamReader(System.in);
            // br = new BufferedReader(in); /instead of this we can write like below in one line

            br = new BufferedReader(new InputStreamReader(System.in));

            num = Integer.parseInt(br.readLine()); 
            System.out.println(num);
        }

        finally
        {
            br.close(); 

        }
            
    }
}
//finally block is used for this case also, this is mandatory to close the file so put it in finally block after try but how to handle exception in try block, we throw the eception
//br.readLine throws IOexception 
    

    
