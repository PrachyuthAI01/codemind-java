import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner A = new Scanner(System.in);
        int a,b,m;
        a=A.nextInt();
        b=A.nextInt();
        m=a%b;
        System.out.printf("%d",m);
    }
}