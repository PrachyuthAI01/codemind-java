import java.util.Scanner;
class snc
{
    public static void main(String[]args)
    {
        Scanner v=new Scanner(System.in);
        int a=v.nextInt();
        double s=0;
        for(int i=1;i<=a;i++)
        {
            s=s+(1/(double)i);
        }
        System.out.format("%.2f",s);
    }
}