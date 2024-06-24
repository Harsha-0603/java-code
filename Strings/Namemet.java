//different methods in String Buffer
public class Namemet 
{
    
    public static void main(String[] args) 
    {
       
      StringBuffer sb = new StringBuffer("Harsha");
      
        
       sb.append(" Vani");
       sb.setLength(20); // length is set upto 20
       sb.ensureCapacity(100); //min capacity will be 100

       System.out.println(sb);
}
}
