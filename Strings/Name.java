//Every string in java is a constant, we cannot change it
public class Name 
{
    
    public static void main(String[] args) 
    {
       
      String name = "Vineeth";
      name = name + "Reddy";
       
        System.out.println(name);

        String s1 = "vineeth";
        String s2 = "vineeth";

        System.out.println(s1==s2);
}

}
