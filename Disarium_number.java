import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int d,c=0,s=0,temp=n,x=n,r=0;
        while(x!=0)
        {
            int l=x%10;
            r=r*10+l;
            x=x/10;
        }
        while(r!=0)
        {
            ++c;
            d=r%10;
            s=s+(int)Math.pow(d,c);
            r=r/10;
        }
        if(temp==s)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}