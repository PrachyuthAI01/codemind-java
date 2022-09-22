import java.util.Scanner;
class snn
{
    public static void main(String args[])
    {
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            c=c+i;
        }
        System.out.println(c);
    }
    
}