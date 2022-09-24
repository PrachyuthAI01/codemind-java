import java.util.Scanner;
class vinnu
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int p=v.nextInt();
        int r=v.nextInt();
        int t=v.nextInt();
        double ci=p*(Math.pow(1+(r/100),t));
        System.out.format("%.2f",ci);
    }
}