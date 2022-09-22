import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int a=v.nextInt(),b=v.nextInt();
        for(int i=1;i<=b;i++)
        {
            if(i%2!=0)
            {
                System.out.println(a+" x "+i+" = "+a*i);
            }
        }
    }
}