import java.util.Scanner;
class pretty
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int d,c=0;
        for(int i=0;i<n;i++)
        {
            int a=v.nextInt();
            int b=v.nextInt();
            c=0;
            for(int j=a;j<=b;j++)
            {
               d=j%10;
               if(d==2 || d==3 || d==9)
                 c++;
            }
            System.out.println(c);
        }
        
    }
}