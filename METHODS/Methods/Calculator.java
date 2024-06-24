//This program is an example of method overloading where in class "calculator", there are 2 methods with 
//same method names but different parameters or arguments. As we can see for the first one there are 3 parameters
//and second one there are only 2 parameters so they are different. If parameters are also same aong with method name 
//then it will throw error
// The files for this program is calculator.java and Loading.java (main class)
public class Calculator 
{
  public int add(int num1, int num2, int num3)
  {
    int sum = num1 + num2 + num3;
    return(sum);
  }
  public int add(int num1, int num2)
  {
    int div = num1/num2;
    return(div);
  }

}
