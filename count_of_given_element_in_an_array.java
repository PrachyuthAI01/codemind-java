import java.util.Scanner;
class java
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
        int d=v.nextInt(),c=0;
        for(int i=0;i<n;i++)
        {
            if(d==a[i])
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}