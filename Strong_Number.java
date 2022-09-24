import java.util.Scanner;
class java
{
    public static int fac(int n)
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
        int n=v.nextInt(),d,s=0,p=1,temp=n;
        while(n!=0)
        {
            d=n%10;
            p=fac(d);
            s=s+p;
            n=n/10;
        }
        if(temp==s)
        {
            System.out.printf("The number %d is a strong number",temp);
        }
        else
        {
         System.out.printf("The number %d is not a strong number",temp);   
        }
    }
    
}