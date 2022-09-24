import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=v.nextInt();
            double s=Math.sqrt(x);
            if(s-(int)s==0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}