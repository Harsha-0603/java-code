//example of enchanced for loop
public class Demo 
{
    public static void main(String[] args) 
    {
        int nums[]= new int[3]; 

        nums[0] = 3;
        nums[1] = 4;
        nums[2] = 6;

//     for (int i=0;i<nums.length;i++) // this is tradional for loop
//     {
//         System.out.println(nums[i]);
//     }
// }
// }

//enhanced for loop
for (int n : nums)
{
    System.out.println(n);
}
    }
}