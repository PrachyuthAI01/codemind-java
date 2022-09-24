import java.util.Scanner;
class java
{
    public static boolean pal(int n)
    {
        int temp=n;
        int d,r=0;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(r==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int x=v.nextInt();
        for(int i=n;i<=x;i++)
        {
            if(pal(i))
            {
                System.out.print(i+" ");
            }
            else
            {
                continue;
            }
        }
    }
}