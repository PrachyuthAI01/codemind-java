import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner A = new Scanner(System.in);
        int n,N;
        n=A.nextInt();
        N=n*(n-1)/2;
        System.out.printf("%d",N);
    }
}