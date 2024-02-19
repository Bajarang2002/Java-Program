public class Swapfunc {
    public static void main(String [] args)
    {
    
        int x=10;
        int y=20;
        swap(x,y);

    }
    public static void swap(int a,int b)
    { 
        System.out.println("Orignal value,a:" +a+" b:" +b);
        int c=a;
        a=b;
        b=c;
        System.out.println("Swapp value,a:"+a+ " b:"+b);
    }
    
}
