import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int p=v.nextInt();
        int t=v.nextInt();
        int r=v.nextInt();
        int si= (p*t*r)/100;
        System.out.println(si);
    }
}