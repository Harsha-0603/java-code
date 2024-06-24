//This is an example of Array of objects(student)

class Student
{
    int rollno;
    String name;
    int marks;     //these are instance variables means the variables which belongs to class
}

public class Demoobj 
{
    public static void main(String[] args) 
    {
        Student s1= new Student(); //creating object of the class Student
        s1.rollno = 56;
        s1.name = "Hanisha";
        s1.marks = 89;

        Student s2= new Student(); //creating object of the class Student
        s2.rollno = 34;
        s2.name = "Praveen";
        s2.marks = 85;

        Student s3= new Student(); //creating object of the class Student
        s3.rollno = 21;
        s3.name = "Shiva";
        s3.marks = 98;

//creating array of students . similar to array syntax 
//int num[]= new int[];
Student students[]= new Student[3];  //students is a varaible name so as it is array of students we give square brackets 
students[0]=s1;
students[1]=s2;
students[2]=s3;  // this is not creating student objects
//we are creating an array which can hold student references
// We should manually create objects and assign to student 

for (int i=0;i<students.length;i++)
{
            System.out.println(students[i].name + ":" + students[i].marks );
}

// // //using enhanced for loop
// for(Student stud : students)
// {
//     System.out.println(students[i].name + ":" + students[i].marks ); // concatinating using +
// }

//         int nums[]= new int[3]; 

//         nums[0] = 3;
//         nums[1] = 4;
//         nums[2] = 6;

//     for (int i=0;i<nums.length;i++)
//     {
//         System.out.println(nums[i]);
//     }
}
}
        