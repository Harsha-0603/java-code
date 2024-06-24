//Map example

import java.util.HashMap;
import java.util.Map;

public class Morse
{
    public static void main(String args[])
    {
        
    Map<String, Integer> students = new HashMap<>(); //giving 2 types because we have 1 type for key and 1 type for value like string type for key and integer type fr value
    
    students.put("Harsha",86); //to assign in Maps we have method put. In ArrayList and set we have add method
    students.put("Vani",92);
    students.put("Deekshitha",88);
    students.put("Dharani",93);
    students.put("Hanisha",95);
    students.put("Harsha",99); //will this take another duplicate of Harsha or will it modify existing value of Harsha

//but if we run it we can get Harsha with marks 99, which means it modifies the value for key:Harsha. So, in Map, Keys should be unique.

    System.out.println(students); //to get complete map

    System.out.println(students.get("Deekshitha")); //to get value for one particular key instead of complete map

    System.out.println(students.keySet()); // to get all the keys (key set)
// to get one by one key value using enhanced for loop
    for(String name : students.keySet())
    {
        System.out.println(name + " : " + students.get(name)); // keySet ninchi each key "name" lo store ayi ikada Sysout lo name and get(name) means key and it's value using get method
    }
    }
}