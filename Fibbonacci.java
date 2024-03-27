import java.util.Scanner;
public class Fibbonacci {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int f=0,s=1;
        int fibb_sum=0;

        for(int i =0;i<=num;i++)
        {
           
            f= s;
            s= fibb_sum;
            fibb_sum=f+s;
            System.out.println(fibb_sum);
        }
    }

}

    

