import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt();
        int d=n*(n-3)/2;
        System.out.println(d);
    }
}