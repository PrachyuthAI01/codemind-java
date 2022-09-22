import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int a=0,d;
        int temp=n;
        while(n>0)
        {
            d=n%10;
            a=a*10+d;
            n=n/10;
        }
        if(a==temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    
}