import java.util.Scanner;
class vinnu
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int a[] = new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=v.nextInt();
        }
        int m=a[0];
        for(int i=0;i<n;i++)
        {
            if(m<a[i])
            {
                m=a[i];
            }
        }
        System.out.println(m);
    }
}