import java.util.Scanner;
class samp
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
        int c=0;
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=v.nextInt();
            if(isprime(a[i]))
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}