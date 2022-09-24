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
            if(a[i]==d)
            {
                c+=1;
            }
        }
        if(c>0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}