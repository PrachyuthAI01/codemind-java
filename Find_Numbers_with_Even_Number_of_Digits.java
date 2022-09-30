import java.util.Scanner;
class java
{
    public static int count(int n)
    {
        int d,c=0;
        while(n!=0)
        {
            d=n%10;
            c+=1;
            n=n/10;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int a[] = new int[100];
        int c,d=0,e;
        for(int i=0;i<n;i++)
        {
            a[i]=v.nextInt();
            c=count(a[i]);
            if(c%2==0)
            {
                d+=1;
            }
        }
        System.out.println(d);
    }
}