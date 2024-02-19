public class Addfunc {
    public static void main(String[] args) {
    
    Addfunc obj = new Addfunc();

    int x =10;
    int y =20;

    int getresult = obj.add(x,y);
    System.out.println(getresult);


        
    }
    public static int add(int n1,int n2)
    {
        int result = n1+n2;
        return result;
    }
    
}
