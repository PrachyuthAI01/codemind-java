import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int s=n*n;
        int r=0,d;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        int x=r*r,l=0;
        while(x!=0)
        {
            int c;
            c=x%10;
            l=l*10+c;
            x=x/10;
            
        }
        if(l==s)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}