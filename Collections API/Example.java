//Set example
//When we want collection with unique values, we use Set 
//we should import set package and the class which implements set is HashSet not ArrayList

import java.util.HashSet;
import java.util.Set;

public class Example
{
    public static void main(String args[])
    {
        Set<Integer> nums = new HashSet<Integer>(); 
        nums.add(36);  //add methods add this value to the collection either its a list or a set it's like assigning
        nums.add(8);
        nums.add(69);
        nums.add(24);
        nums.add(8); //will not allow duplicates in set so it will not show any error but it will not take this value and it will not store this duplicate in the set and when printing it will not show this

        //while printing it will not print linely as u have given, it will give in jumble order because set do not have index values
        for(int n : nums) 
        {
            System.out.println(n);
        }
        
    }
}
