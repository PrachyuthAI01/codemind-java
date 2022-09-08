import java.util.Scanner;
class triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double S,s,A;
        s=(a+b+c)/2;
        S=s*(s-a)*(s-b)*(s-c);
        A=Math.sqrt(S);
        System.out.format("%.2f",A);
        
    }
}