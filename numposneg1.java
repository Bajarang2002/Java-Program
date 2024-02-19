import java.util.Scanner;
public class numposneg1 {
    public static void main(String [] args)
    {
        int num;
        Scanner no =new Scanner(System.in);
        System.out.println("Enter the number:");
        num =no.nextInt();
        if(num>0)
        {
            System.out.println("Number is positive");
        }
        else if(num<0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
    
}
