import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int x=v.nextInt();
        double f=5*((double)(x-32)/9);
        System.out.format("%.2f",f);
    }
}