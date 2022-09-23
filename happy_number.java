import java.util.Scanner;
class samp
{
    public static int ishapp(int n)
    {
        int r=0,s=0;
        while(n>0)
        {
            r=n%10;
            s=s+r*r;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int temp=n;
        while(temp!=1 && temp!=4)
        {
            temp=ishapp(temp);
        }
        if(temp==1)
        {
            System.out.println("True");
        }
        if(temp==4)
        {
            System.out.println("False");
        }
    }
}