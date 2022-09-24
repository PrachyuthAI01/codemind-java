import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int d,s=0,p=1;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
        if(s==p)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}