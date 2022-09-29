import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt(),d=v.nextInt();
        int a[] = new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=v.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%d!=0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}