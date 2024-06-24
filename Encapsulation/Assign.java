//setting the values for variables using set method 
    class Man
{
   private int age;
   private String name; 

  public int getAge()
  {
    return age; 
  }

  public void setAge(int a)
  {
    age = a;
  }

 public String getName()
  {
    return name; 
}

public void setName(String n)
{
  name = n;
}
}

public class Assign 
{
    public static void main(String[] args) 
    {
       Man obj = new Man();
       obj.setAge(30);
       obj.setName("Vani"); 

       System.out.println(obj.getAge() + ":" + obj.getName());
    }
}

