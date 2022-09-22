import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int m=v.nextInt();
        if(n%2==0 || m%2==0)
        {
            System.out.println("Player 1");
        }
        else
        {
            System.out.println("Player 2");
        }
    }
}