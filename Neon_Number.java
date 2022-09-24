import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int x=v.nextInt();
        int s=x*x;
        int d,r=0;
        while(s!=0)
        {
            d=s%10;
            r=r+d;
            s=s/10;
        }
    if(x==r)
    {
        System.out.println("Neon Number");
    }
    else
    {
        System.out.println("Not Neon Number");
    }
    }
}