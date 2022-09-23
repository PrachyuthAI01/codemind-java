import java.util.Scanner;
class samp
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int d=0;
        while(n!=0)
        {
            int c=n%10;
            if(d<c)
            {
                d=c;
            }
            n=n/10;
        }
        System.out.println(d);
    }
}