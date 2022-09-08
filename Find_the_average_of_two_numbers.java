import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        Scanner C= new Scanner(System.in);
        double n,m;
        double a;
        n=C.nextDouble();
        m=C.nextDouble();
        a=(n+m)/2;
        System.out.format("%.4f",a);
    }
}