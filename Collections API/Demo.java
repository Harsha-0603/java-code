//ArrayList

import java.util.ArrayList;
import java.util.Collection;

public class Demo
{
    public static void main(String args[])
    {
        Collection<Integer> nums = new ArrayList<Integer>(); //to give type we give inside <Integer> //this means storing integer values //<Angular brackets>
        nums.add(6); //these are not integers, these are objects that's why for loop cannot take nums directly so we should create type of collection using <type>
        nums.add(8);
        nums.add(9);
        nums.add(2);

        // System.out.println(nums); // to print complete array

        //to print one by one using enhanced for loop

        for(int n : nums) 
        {
            System.out.println(n);
        }
    }
}