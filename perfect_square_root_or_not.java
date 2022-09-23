import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        double s=Math.sqrt(n);
        if(s-(int)s==0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}