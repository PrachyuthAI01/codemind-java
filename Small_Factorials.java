import java.util.Scanner;
class java
{
    public static int fact(int n)
    {
        int d=1;
        for(int i=1;i<=n;i++)
        {
            d=d*i;
        }
        return d;
    }
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=v.nextInt();
            int res=fact(x);
            System.out.println(res);
        }
    }
}