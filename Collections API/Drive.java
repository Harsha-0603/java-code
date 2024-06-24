//to get value based on index numbers instead of values
//ArrayList

import java.util.ArrayList;
import java.util.List;

public class Drive
{
    public static void main(String args[])
    {
        List<Integer> nums = new ArrayList<Integer>(); 
        nums.add(6); 
        nums.add(8);
        nums.add(9);
        nums.add(2);

        System.out.println(nums.get(2)); // to print index value of 2 using get() method in List

        //to find idex of a value
        System.out.println(nums.indexOf(9)); //to get index of value 9
        
    }
}
