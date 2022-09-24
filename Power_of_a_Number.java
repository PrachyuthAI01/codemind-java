import java.util.Scanner;
class java
{
    public static void main(String arg[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int a=v.nextInt();
        int b=v.nextInt();
        double d=Math.pow(n,a);
        int Ans=((int)d)%b;
        System.out.println(Ans);
    }
}