import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int r,V=0,l=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(V+" ");
            r=V+l;
            V=l;
            l=r;
        }
    }
}