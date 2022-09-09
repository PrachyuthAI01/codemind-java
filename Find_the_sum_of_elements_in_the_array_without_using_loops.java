import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner C = new Scanner(System.in);
        int n=C.nextInt(),c=0;
        int [] a=new int [100];
        for(int i=0;i<n;i++)
        {
            a[i]=C.nextInt();
            c=c+a[i];
        }
        System.out.println(c);
    }
}