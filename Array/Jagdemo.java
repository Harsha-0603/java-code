//This is for jadded Array
public class Jagdemo 
{

    public static void main(String args[])
    {
        int nums[][]= new int[3][]; //jagged

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

    for (int i=0;i<nums.length;i++)
    {
        System.out.println(nums[i]);
    }
}
}