import java.util.Scanner;
class Addition
{
    public static void main(String[] args) {
        int a,b,c;
        Scanner add =new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a =add.nextInt();
        System.out.println("Enter the value of b :");
        b =add.nextInt();

        c=a+b;
        System.out.println("Addition is :"+c);
        
        
    }
}