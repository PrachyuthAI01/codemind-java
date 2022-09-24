import java.util.Scanner;
class vinnu
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int x=v.nextInt();
        double f=(x*((double)9/5))+32;
        System.out.format("%.2f",f);
    }
}