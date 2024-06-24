//Example of String Buffer
//String Buffer has a lot of methods to work on strings and we can make a string mutable(we can change the string)
public class NameBuff 
{
    
    public static void main(String[] args) 
    {
       
      StringBuffer sb = new StringBuffer("Harsha");
      
        System.out.println(sb.length());
        System.out.println(sb.append(" Vani"));
        System.out.println(sb.charAt(4));
        System.out.println(sb.deleteCharAt(6));
        System.out.println(sb.insert(0, "Hello "));
        

    // converting StringBuffer to string using .toString method
    String str = sb.toString();
    System.out.println(str);

}
}
