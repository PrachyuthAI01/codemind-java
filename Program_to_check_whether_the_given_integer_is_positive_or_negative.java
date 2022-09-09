import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner c =new Scanner(System.in);
        int a;
        a=c.nextInt();
        if(a>0)
        {
            System.out.printf("Positive Number");
        }
        else
        {
            System.out.printf("Negative Number");
        }
    }
}