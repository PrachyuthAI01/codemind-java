import java.util.Scanner;
class sample
{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int j=2;j<=(int)Math.sqrt(n);j++)
        {
            if(n%j==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int a=v.nextInt();
        int b=v.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}