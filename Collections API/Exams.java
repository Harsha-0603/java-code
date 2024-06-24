//Set Example with TreeSet (TreeSet is for sorted elements)
//And we are using iterator() method in this which comes from iterable interface. 

//Set example
//When we want collection with unique values, we use Set 
//we should import set package and the class which implements set is HashSet not ArrayList


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exams
{
    public static void main(String args[])
    {
        Set<Integer> nums = new TreeSet<Integer>(); 
        nums.add(36);  //add methods add this value to the collection either its a list or a set it's like assigning
        nums.add(8);
        nums.add(69);
        nums.add(24);
        nums.add(8); //will not allow duplicates in set so it will not show any error but it will not take this value and it will not store this duplicate in the set and when printing it will not show this

        //using iterator() method instead of for loop
        Iterator<Integer> values = nums.iterator(); 
        
        while(values.hasNext())
          System.out.println(values.next());   //hasNext is a while method which checks if there is any element next it will print till that



        // for(int n : nums) 
        // {
        //     System.out.println(n);
        // }
        
    }
}