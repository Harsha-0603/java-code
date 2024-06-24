//Example of encapsulation
public class Person 
{
    private int age;   // setting data to private 
    private String name;
public Person(int age, String name) // constructor
{
this.age = age;
this.name = name;
}

public int getAge()  //getter method for age
{
    return age;
}

public void setAge(int age)
{
    if (age>0)
    {
        this.age=age;
    }
        else
        {
            System.out.println("Enter a Valid age");
        }
}


public String getName()
{
   return name;
}

public void setName(String name)
{
    this.name = name;
}

public static void main(String args[])
{
    Person obj = new Person(23, "Harsha");  
//constructor gets called when creating an object and the values will be set to age and name of constructors using this keyword it sets to this current created object instance variables (ee object okka instance variables age name lo 23 and harsha ni save cheskuntadi using constructor method)

// Access and modify the private fields using getter and setter methods
System.out.println("Age:" + obj.getAge());
System.out.println("Name:" + obj.getName());

// Modify the private fields using setter methods
obj.setAge(25);
obj.setName("Sharishma");
  
// Access the updated fields
System.out.println("Age:" + obj.getAge());
System.out.println("Name:" + obj.getName());

obj.setAge(0);
}
}
