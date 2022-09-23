import java.util.Scanner;
class java
{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        if(isprime(n))
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}