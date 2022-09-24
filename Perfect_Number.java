import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int d,c=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c=c+i;
            }
        }
        if(c==n)
        {
            System.out.println("True");   
        }
        else
        {
            System.out.println("False");
        }
    }
}