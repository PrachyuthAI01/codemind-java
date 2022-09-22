import java.util.Scanner;
class div
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int d=v.nextInt(),c=0;
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=v.nextInt();
            if(a[i]%d==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}