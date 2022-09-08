import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        double a,b,c;
        double s,S,A;
        Scanner C = new Scanner(System.in);
        a=C.nextDouble();
        b=C.nextDouble();
        c=C.nextDouble();
        s=(a+b+c)/2;
        S=s*(s-a)*(s-b)*(s-c);
        A=Math.sqrt(S);
        System.out.format("%.2f",A);
    }
}