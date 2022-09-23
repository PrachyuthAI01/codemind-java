import java.util.Scanner;
class jaba
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int s=0;
        int temp=n;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s>temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}