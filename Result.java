import java.util.Scanner;
public class Result {
    public static void main(String [] args)
    {
        int marks;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the marks:");
        marks =obj.nextInt();
        if(marks<50)
        {
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60)
        {
            System.out.println("Student is pass below average");
        }
        else if(marks>=60 && marks<75)
        {
            System.out.println("Student is pass with  average class");
        }
        else if(marks>=75 && marks<90)
        {
            System.out.println("Student is pass first class");
        }
        else if(marks>=90 && marks<=100)
        {
            System.out.println("Student pass with first class with destingtion");
        }
        else
        {
            System.out.println("Invalid");
        }



    }
    
}
