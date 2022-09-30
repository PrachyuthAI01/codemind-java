import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int a[] = new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=v.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for (int j=0;j<n;j++)
            {
                if (j!=i)
                {
                    if (a[j]<a[i])
                    {
                        c+=1;
                    }
                }
            }
            System.out.print(c+" ");
        }
        
    }
}