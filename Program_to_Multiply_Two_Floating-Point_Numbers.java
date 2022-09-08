import java.util.Scanner;
class mul
{
    public static void main(String args[])
    {
        Scanner C=new Scanner(System.in);
        double a,b,c;
        a=C.nextDouble();
        b=C.nextDouble();
        c=a*b;
        System.out.format("%.2f",c);
    }
}